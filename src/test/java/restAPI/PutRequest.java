package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	@Test
	public void test1()
	{
		RestAssured.baseURI = "http://localhost:3000/apiTestingJsonFile/da4e";
		RequestSpecification request = RestAssured.given();
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body("{\r\n"
											+ "        \"id\": \"da4e\",\r\n"
											+ "        \"name\": \"User200000\",\r\n"
											+ "        \"job\": \"Tester2\"\r\n"
											+ "    }")
									.put();
		
		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);
		
}
}
