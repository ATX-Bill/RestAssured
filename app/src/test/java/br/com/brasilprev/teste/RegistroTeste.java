package br.com.brasilprev.teste;

import br.com.brasilprev.dominio.Usuario;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class RegistroTeste extends BaseTeste{

    @Test public void naoDeveFazerRegistroQuandoNaoTemSenha(){
        Usuario usuario = new Usuario();
        usuario.setEmail("test@tes.com");
        given()
                .body(usuario)
                .when()
                .post("/register")
                .then()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body("error", is("Missing password"));

    }
}
