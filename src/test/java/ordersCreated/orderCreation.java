package ordersCreated;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.OrderRequestCall;
import resources.OrderResponseDisplay;
import resources.OrderTypes;
import resources.Utils;



public class orderCreation extends Utils {
	
	
	OrderRequestCall orc= new OrderRequestCall();
	OrderResponseDisplay ord= new OrderResponseDisplay();
	RequestSpecification req;
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	
	
	@Given("Add Orders payload with {string} and {string}")
	public void add_Orders_payload_with_and(String description, String type) throws IOException {
	    
		 RestAssured.baseURI = "https://prod.api.tutorbin.com";
			
			 res = given().spec(requestSpecification()).body(orc.orderRequestPayload(description, type));
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
	    
		OrderTypes typesOrder = OrderTypes.valueOf(resource);
        System.out.println(typesOrder.getResource());
        resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        if (method.equalsIgnoreCase("POST"))
            response = res.when().log().all().post(typesOrder.getResource());
            else if (method.equalsIgnoreCase("GET"))
            response = res.when().log().all().post(typesOrder.getResource());
	}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(),201);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
	    // Write code here that turns the phrase above into concrete actions
		String resp = response.asString();
		 JsonPath  js = new JsonPath(resp);
	}

}
