package responseServices;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class OMDBServices {
    public static Response searchByTitleAndType(String title,String type) {
        return given()
                .queryParam("apikey","b2e6bdb2")
                .queryParam("s",title)
                .queryParam("type",type)
                .when()
                .get()
                .then()
                .extract()
                .response();
    }
    public static Response searchByID(String ID) {
        return given()
                .queryParam("apikey","b2e6bdb2")
                .queryParam("i", ID)
                .when()
                .get()
                .then()
                .extract()
                .response();
    }

}
