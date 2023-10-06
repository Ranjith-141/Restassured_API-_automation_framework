package com.karateSample;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class ApiUser {
	
	@Test
	public void GetUserFromJsonFile() {

		given().baseUri("https://reqres.in/api").when().get("/users").prettyPrint();
		
	}
	@Test
	public void CreateUserFromJsonFile() throws Exception {
      File file= new File("postData.json");
      FileInputStream fis = new FileInputStream(file);
		given().baseUri("https://reqres.in/api").header("Content-Type", "application/json").body(fis).when().post("/users").prettyPrint();	
	}
	@Test
	public void UpdateUserFromJsonFile() throws Exception {
      File file= new File("postData.json");
      FileInputStream fis = new FileInputStream(file);
		given().baseUri("https://reqres.in/api").header("Content-Type", "application/json").body(fis).when().delete("/users").prettyPrint();	
	}

}
