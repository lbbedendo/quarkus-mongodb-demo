package br.com.platosedu;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when()
                .get("/hello")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

    @Test
    public void testGreetingEndpoint() {
        String name = "leonardo";
        given()
                .when().get("/hello/greeting/" + name)
                .then()
                .statusCode(200)
                .body(is("hello, " + name));
    }

}