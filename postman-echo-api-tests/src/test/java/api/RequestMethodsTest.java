package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RequestMethodsTest {

    private static final String BASE_URL = "https://postman-echo.com";

    // ========== GET ==========
    @Test
    public void testGetRequest() {
        Response response = RestAssured
                .given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get(BASE_URL + "/get");

        Assert.assertEquals(response.statusCode(), 200);

        Map<String, String> args = response.jsonPath().get("args");
        Assert.assertEquals(args.get("foo1"), "bar1");
        Assert.assertEquals(args.get("foo2"), "bar2");
    }

    // ========== POST ==========
    @Test
    public void testPostRequest() {
        Map<String, String> body = new HashMap<>();
        body.put("foo1", "bar1");
        body.put("foo2", "bar2");

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(BASE_URL + "/post");

        Assert.assertEquals(response.statusCode(), 200);

        Map<String, String> json = response.jsonPath().get("json");
        Assert.assertEquals(json.get("foo1"), "bar1");
        Assert.assertEquals(json.get("foo2"), "bar2");
    }

    // ========== PUT ==========
    @Test
    public void testPutRequest() {
        Map<String, String> body = new HashMap<>();
        body.put("foo1", "bar1");
        body.put("foo2", "bar2");

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put(BASE_URL + "/put");

        Assert.assertEquals(response.statusCode(), 200);

        Map<String, String> json = response.jsonPath().get("json");
        Assert.assertEquals(json.get("foo1"), "bar1");
        Assert.assertEquals(json.get("foo2"), "bar2");
    }

    // ========== PATCH ==========
    @Test
    public void testPatchRequest() {
        Map<String, String> body = new HashMap<>();
        body.put("foo1", "bar1");
        body.put("foo2", "bar2");

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .patch(BASE_URL + "/patch");

        Assert.assertEquals(response.statusCode(), 200);

        Map<String, String> json = response.jsonPath().get("json");
        Assert.assertEquals(json.get("foo1"), "bar1");
        Assert.assertEquals(json.get("foo2"), "bar2");
    }

    // ========== DELETE ==========
    @Test
    public void testDeleteRequest() {
        Map<String, String> body = new HashMap<>();
        body.put("foo1", "bar1");
        body.put("foo2", "bar2");

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .delete(BASE_URL + "/delete");

        Assert.assertEquals(response.statusCode(), 200);

        Map<String, String> json = response.jsonPath().get("json");
        Assert.assertEquals(json.get("foo1"), "bar1");
        Assert.assertEquals(json.get("foo2"), "bar2");
    }
}