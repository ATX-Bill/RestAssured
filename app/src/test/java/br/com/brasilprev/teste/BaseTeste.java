package br.com.brasilprev.teste;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.*;

public class BaseTeste {
    @BeforeClass
    public  static void setup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "https://reqres.in";
        basePath = "/api";
        RestAssured.requestSpecification = new RequestSpecBuilder()
        .setContentType(ContentType.JSON)
                .build();
    }
}
