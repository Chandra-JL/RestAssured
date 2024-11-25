package restAPIBDD;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest {

	
	@Test
	public void Test1()
	{
		RestAssured.given()
		.baseUri("https://reqres.in/api/users")
		.when()
		.get()
		.then()
		.log()
		.all();	

		
	}
	@Test
	public void TestWithPathParams() {
		
		RestAssured.given()
				.baseUri("https://reqres.in/api/users")
				.when()
				.get("/2")
				.then()
				.log()
				.all()
				.statusCode(200);
	}
	@Test
	public void TestWithQueryParams() {
		
		HashMap<String,String> params = new HashMap<String,String>();
		params.put("CUSTOMER_ID", "68195");
		params.put("Account_No", "1");
		params.put("PASSWORD", "1234!");	
		
		RestAssured.given()
				.baseUri("http://demo.guru99.com/V4/sinkministatement.php")
				.queryParams(params)
				.when()
				.get("/2")
				.then()
				.log()
				.all()
				.statusCode(200);				
	}
	@Test
	public void TestWithBasicAuth() {
			
		RestAssured.given()
				.baseUri("http://httpbin.org/basic-auth/user/passwd")
				.auth()
				.basic("user", "passwd")
				.when()
				.get()
				.then()
				.log()
				.all()
				.statusCode(200);				
	}





}
