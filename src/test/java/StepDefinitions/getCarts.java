package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

import static org.junit.Assert.assertEquals;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class getCarts {

    public String baseURI = "https://fakestoreapi.com";
    public Response response;
    public RequestSpecification request;
    public int responseCode;

    @Given("user had made api endpoint for all cards")
    public void user_had_made_api_endpoint_for_all_cards() {
       request = RestAssured.given().baseUri(baseURI);
    }

    @When("User retrieves the carts")
    public void user_retrieves_the_carts() {
        response= request.get("/carts");
    }

    @Then("Status code is {int}")
    public Integer status_code_is(Integer int1) {
       responseCode = response.getStatusCode();
       assertEquals(responseCode, 200);
       return int1;
    }


}
