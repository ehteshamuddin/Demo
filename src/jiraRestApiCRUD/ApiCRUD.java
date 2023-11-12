package jiraRestApiCRUD;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import Files.ReUsableCode;
import Files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class ApiCRUD {
	
	@Test(dataProvider="BooksData")
	
	
	 void AddBook(String isbn, String aisle)
	{
		
		RestAssured.baseURI= "http://216.10.245.166";
		
	String response =	given().log().all().header("Content-Type", "application/json").body(payload.AddBookBody(isbn, aisle))
		.when().post("Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = ReUsableCode.rawToJson(response);
		
		String id = js.get("ID");
		System.out.println(id);
		
	}
	
	@Test(dataProvider="BooksData")
	void deleteBook(String isbn, String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		String response2 = given().header("Content-Type", "application/json").body(payload.getID(isbn, aisle)).when().delete("/Library/DeleteBook.php").then().assertThat().statusCode(200)
				.extract().response().asString();
		
		JsonPath js= ReUsableCode.rawToJson(response2);
		
		System.out.println(js.getString("msg").toString());
	}

	@DataProvider (name="BooksData")
	
	Object[][] getData()
	{
		return new Object[][] { {"afaf", "45435"}, {"dfds", "56778"}, {"dfsd", "1098"} };
	}
	
}
