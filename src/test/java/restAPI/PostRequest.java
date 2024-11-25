package restAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	@Test
	public void test1()
	{
		RestAssured.baseURI = "http://localhost:3000/apiTestingJsonFile";
		RequestSpecification request = RestAssured.given();
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body("{\r\n"
											+ "        \"id\": \"3\",\r\n"
											+ "        \"name\": \"User6\",\r\n"
											+ "        \"job\": \"Tester21\"\r\n"
											+ "    }")
									.post();
		
		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);
		
}
}