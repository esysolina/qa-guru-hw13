package sysolina.e.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.CoreMatchers.is;

public class ApiTests {
    @Test
    void showPopularTest() {
        given()
                .contentType("application/json")
                .when()
                .get("https://api.litres.ru/foundation/api/arts/4236675/reviews?limit=5&o=popular")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", is("(756174)"));
    }

    @Test
    void addLikeTest() {
        given()
                .contentType("application/json")
                .when()
                .put("https://api.litres.ru/foundation/api/reviews/2743186/likes")
                .then()
                .log().all()
                .statusCode(404)
                .body("detail", is("Could not find review with 2743186 as an identifier"));
    }

    @Test
    void markAsReadTest() {
        String data = "{ \"action\": \"finish_art\", " +
                "\"finish\": 1, \"art\": 67303161, " +
                "\"csrf\": \"340705:1652896927:9eaafbc99e6895cb890f63ffd8a2b8b997532046577e459b98e2980a0da7beba\", " +
                "\"gu_ajax\": true }";

        given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://www.litres.ru/pages/ajax_empty2/")
                .then()
                .log().all()
                .statusCode(200);
                //.body("status", is("ok"));
    }

    @Test
    void sendLinkOnEmailTest() {
        String data = "{ \"action\": \"ajax_send_otpin\", \"art\": 50300712, \"school\": 0, " +
                "\"email_or_phone\": \"evelina.01@list.ru\", " +
                "\"csrf\": \"290481:1652897338:41b8c0b70a48dee650b3f255a2b305203bc09d907ca1c1baa37b98a93e2007cc\", " +
                "\"gu_ajax\": true }";

        given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://www.litres.ru/pages/ajax_empty2/")
                .then()
                .log().all()
                .statusCode(200)
                .body("type", is("email"));
    }

    @Test
    void updateNicknameTest() {
        String data = "{ \"action\": \"update_my_data_ajax\", \"nickname\": \"test\", " +
                "\"csrf\": \"551607:1652898309:eeb2bff85cbe42b426fc4deea2da87c4046a7303db19306338a2eefd3452ea0f\", " +
                "\"gu_ajax\": true }";

        given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://www.litres.ru/pages/ajax_empty2/")
                .then()
                .log().all()
                .statusCode(200);
                //.body("status", is("ok"));
    }
}
