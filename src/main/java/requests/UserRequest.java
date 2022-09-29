package requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserRequest extends BaseRequest {

    private final static String USER_PATH = "/api/auth/user";
    private final static String REGISTER_PATH = "/api/auth/register";
    private final static String LOGIN_PATH = "/api/auth/login";

    public Response createUser(User user) {
        Response response =
                given()
                        .spec(requestSpecification)
                        .and()
                        .body(user)
                        .when()
                        .post(REGISTER_PATH);
        return response;
    }

    public void deleteUser(String accessToken) {
        try {
            given()
                    .spec(requestSpecification)
                    .header("Authorization", accessToken)
                    .when()
                    .delete(USER_PATH);
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
                        .post(LOGIN_PATH);
        return response;
    }
}
