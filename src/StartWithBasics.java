import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import Files.ReUsableCode;


public class StartWithBasics {

	public static void main(String[] args) throws IOException {
				
		/* Add a Place using 
		Request URI: https://rahulshettyacademy.com/maps/api/place/add/json?key=qaclick123 */

		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response = 
		given().log().all()
				.queryParam("key", "qaclick123")
				.header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("E:\\AddPlace.json"))))
		.when().log().all()
				.post("maps/api/place/add/json")
		.then().log().all()
				.assertThat().statusCode(200)
				.body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.52 (Ubuntu)")
				.extract().response().asString();
		
		JsonPath js = ReUsableCode.rawToJson(response);
		
		String placeid = js.getString("place_id");
		// place_id is key name of POST API Response
		
		System.out.println(placeid);
		System.out.println(response);
		System.out.println(js);
		
		// Update Place
		
		String newAddress = "70 Summer walk, India";
		
		given().log().all()
			.queryParam("key", "qaclick123")
			.header("Content-Type", "application/json")
			.body("{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().log().all()
			.put("maps/api/place/update/json")
		.then().log().all()
			.assertThat().statusCode(200)
			.body("msg", equalTo("Address successfully updated"));
		
		// Get Place
		
	String getPlaceResponse = given().log().all()
			.queryParam("key", "qaclick123")
			.queryParam("place_id", placeid)
		.when().log().all()
			.put("maps/api/place/get/json")
		.then().log().all()
			.assertThat().statusCode(200)
			.extract().response().asString();

		JsonPath jsa= ReUsableCode.rawToJson(getPlaceResponse);
		
		String actualAddress = jsa.getString("address"); 
		
		// address is key name of Get API Response
		
		System.out.println(actualAddress);
		
		Assert.assertEquals(actualAddress, newAddress);
		
	}
	
	
}
