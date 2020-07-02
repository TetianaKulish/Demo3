package org.academy.utils.api.methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import lombok.extern.slf4j.Slf4j;
import org.academy.TestConfigurations;
import org.academy.utils.api.waiters.ApiWaiter;
import org.academy.utils.api.waiters.ValidateResponseWaiter;

import java.io.File;

import static io.restassured.RestAssured.given;

@Slf4j
public class PostIssues {
    private ApiWaiter apiWaiter = new ApiWaiter();
    File file = new File("src/main/resources/reactionOnIssue.json");

    public Response withToken(String token, int responseCode, String resources) {
        ValidateResponseWaiter responseWaiter = () -> {
            RestAssured.baseURI = TestConfigurations.getApiUri();
            return given()
                    .relaxedHTTPSValidation()
                    .auth().oauth2(token)
                    .contentType(ContentType.JSON)
                    .header("Accept", "application/vnd.github.squirrel-girl-preview+json")
                    .body(file)
                    .when()
                    .post(resources)
                    .then();
        };
        ValidatableResponse validatableResponse = apiWaiter.waitForResponse(responseWaiter, responseCode);
        Response resp = validatableResponse.contentType(ContentType.JSON).extract().response();
        return resp;
    }
}
