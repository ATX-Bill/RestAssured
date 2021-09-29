package br.com.brasilprev.teste;


import br.com.brasilprev.dominio.Usuario;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;



public class UsuarioTeste extends BaseTeste{

    @Test
    public void validacaoTotalPage(){

        when()
                .get("/users?page=2")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("page", is(2), "total", is(12));
    }

    @Test
    public void criaUsuario(){
        Usuario usuario = new Usuario("severino", "analista", "teste@test.com");
        given()
                .body(usuario)
                .when().post("/users")
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body("name", is("severino"));
    }

}