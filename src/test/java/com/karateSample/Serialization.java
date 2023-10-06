package com.karateSample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import io.restassured.http.Method;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Serialization {

	@Test
	public void Serialization() {
     Map<String, Object> jsonBody= new HashMap<String, Object>();
     List<String> skills= new ArrayList<String>();
     skills.add("java");
     skills.add("selenium");
     
     jsonBody.put("first_name", "josaph");
     jsonBody.put("last_name", "vijay");
     jsonBody.put("email", "josaphvijay@gmail.com");
     jsonBody.put("skills", skills);
     System.out.println(jsonBody);
     
     given().baseUri("https://reqres.in/api")
     .header("Content-Type", "application/json").body(jsonBody).when().post("/users").then().log().all();
     assertEquals(jsonBody,"vijay");
     
	}
	@Test
	public void Response() {
		
		int statusCode = given().baseUri("https://reqres.in/api")
	     .header("Content-Type", "application/json").when().request(Method.GET, "/users").statusCode();
		System.out.println("The Response Code is " + statusCode);
	}
}

