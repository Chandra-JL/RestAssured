package restAPI;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequestwithHash {

	@Test
	public void test1() {
		
		HashMap<String,String> obj = new HashMap<String,String>();
		
		obj.put("id", "da4e");
		obj.put("name", "kiran");
		obj.put("job", "15000");
		
		RestAssured.baseURI = "http://localhost:3000/apiTestingJsonFile/";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body(obj)
									.put("/da4e");
		
		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);
}
}
