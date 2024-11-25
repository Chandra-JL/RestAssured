package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestWithQueryParams {

@Test
	public void test1()
	{
		
		
		
RestAssured.baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
		
		RequestSpecification  request = RestAssured.given();
		
		Response response = request.queryParam("CUSTOMER_ID", "68195")
									.queryParam("CUSTOMER_ID", "1234!")
									.queryParam("Account_no", "1")
									.get();
		
		System.out.println("The response code is " + response.getStatusCode());
		
		System.out.println("The response body is " + response.body().asString());
		
	}
}
