package DemoCertificateProxy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.specification.ProxySpecification;

public class MyRestAssuredTest {

    @BeforeAll
    public static void setupProxy() {
        String proxyHost = "your.proxy.host";
        int proxyPort = 8080;
        ProxySpecification proxySpec = new ProxySpecification(proxyHost, proxyPort, "http");
        RestAssured.proxy(proxySpec);
    }

    @Test
    public void testWithProxy() {
        RestAssured.given()
                .proxy("127.0.0.1", 8888)
                .get("https://reqres.in/api/users?")
                .then().log().all()
                .statusCode(200);
    }
}