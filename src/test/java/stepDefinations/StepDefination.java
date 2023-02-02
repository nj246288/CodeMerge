package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Access;
import pojo.Refresh;
import pojo.SignInResponse;
import pojo.Request;
import resources.APIResources;
import resources.TestDataBuild1;
import resources.TestDataRequest;
import resources.TestDatabuild;
import resources.TestResponsebuild;
import resources.Utils;


public class StepDefination extends Utils {
	RequestSpecification req;
	RequestSpecification res;
	ResponseSpecification resspec;
	TestDatabuild data = new TestDatabuild();
	TestDataBuild1 data1 = new TestDataBuild1();
	//emailBuild eb= new emailBuild();
	TestResponsebuild data3 = new TestResponsebuild();
	TestDataRequest data4=new TestDataRequest();
	Response response;
	 static String email;
	
	//TestDataBuild2 data2= new TestDataBuild2();
	 @Given("Add signIn payload with {string} {string}")
	 public void add_signIn_payload_with(String phoneNumber, String password) throws IOException {
		 RestAssured.baseURI = "https://prod.api.tutorbin.com";
			// resspec = new ResponseSpecBuilder().expectStatusCode(200)
				//	.expectContentType(ContentType.JSON).build();
			 res = given().spec(requestSpecification()).body(data1.signInRequestPayload(phoneNumber, password));
	 }
	
	
	
	

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
	APIResources resourceAPI=	APIResources.valueOf(resource);
	System.out.println(resourceAPI.getResource());
	
	
	resspec = new ResponseSpecBuilder().expectStatusCode(200)
			.expectContentType(ContentType.JSON).build();
	
	
	if(method.equalsIgnoreCase("POST"))
	response = res.when().log().all().post(resourceAPI.getResource());
	else if(method.equalsIgnoreCase("GET"))
		response = res.when().log().all().post(resourceAPI.getResource());
	//.then().spec(resspec).assertThat()
		//		.statusCode(200).extract().response();
	    
	}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
	    assertEquals(response.getStatusCode(),200);
		
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
	  String resp = response.asString();
	 JsonPath  js = new JsonPath(resp);
	// email= getJsonPath(response,"email");
	// assertEquals(js.get(keyValue).toString(),Expectedvalue);
	// email= getJsonPath(response,"email");
		
	}
	@Given("Add email payload with password {string} {string}")
	public void add_email_payload_with_password(String email, String password) throws IOException {
	  
		 RestAssured.baseURI = "https://prod.api.tutorbin.com";
		res = given().spec(requestSpecification()).body(data4.emailRequestPayload(email, password));
	}
}

	



