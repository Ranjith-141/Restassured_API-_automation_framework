package DemoCertificateProxy;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class StepDefinitions {
   
    @Test
    public void i_make_a_GET_request() {
    	 RestAssured.given().baseUri("https://jsonplaceholder.typicode.com/posts")
    	 .header("Content-Type", "application/json").when().request(Method.GET, "/1").then().log().all();
 		System.out.println("The Response Code");
    }
}
