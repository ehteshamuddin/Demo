package jiraRestApiCRUD;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Files.ReUsableCode;

public class LogintoAccount {

	@Test
	void LogintoJIRA() throws IOException {
	
		
		
		SessionFilter session =new SessionFilter();
		
		RestAssured.baseURI = "http://localhost:8080/";
		
	 	String response = given().log().all().header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("E:\\JiraRestApi\\loginCredentials.json"))))
		.filter(session).when().post("rest/auth/1/session").then().log().all().extract().response().asString();
				
		JsonPath js = ReUsableCode.rawToJson(response);
		
		System.out.println(js.getString("session.value"));
		
		given().log().all().pathParam("id", "10100").header("Content-Type","application/json").body("{\r\n"
				+ "    \"body\": \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}")
		.filter(session)
		.when().post("/rest/api/2/issue/{id}/comment")
		.then().log().all().assertThat().statusCode(201);
		
		
		 given().header("X-Atlassian-Token", "no-check").pathParam("id", "10100")
		.filter(session)
		.header("Content-Type", "multipart/form-data")
		.multiPart("file", new File("C:\\Users\\Dell\\eclipse-workspace\\Demo\\jira.txt"))
		.when().post("/rest/api/2/issue/{id}/attachments").then().log().all().assertThat().statusCode(200);
	}
	
	
	
}
