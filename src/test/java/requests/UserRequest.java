package requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserRequest extends BaseRequest {

    private final static String USER_PATH = "/api/auth/";

    public Response createUser(User user) {
        Response response =
                given()
                        .spec(requestSpecification)
                        .header("Content-type", "application/json")
                        .and()
                        .body(user)
                        .when()
                        .post(USER_PATH + "register");
        return response;
    }

    public void deleteUser(String accessToken) {
        try {
            given()
                    .spec(requestSpecification)
                    .header("Authorization", accessToken)
                    .when()
                    .delete(USER_PATH + "user");
        } catch (IllegalArgumentException e) {
            System.out.println("accessToken = null");
        }
    }

    public Response loginUser(User user) {
        Response response =
                given()
                        .spec(requestSpecification)
                        .header("Content-type", "application/json")
                        .and()
                        .body(user)
                        .when()
                        .post(USER_PATH + "login");
        return response;
    }
}
