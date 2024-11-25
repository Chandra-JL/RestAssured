package restAPI;

import java.util.List;

import org.codehaus.groovy.ast.builder.AstStringCompiler;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	@Test
	public void test1()
	{
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String resBody = response.getBody().asString();
		int resCode = response.statusCode();
		System.out.println(resBody);
		System.out.println(resCode);
		
		JsonPath json = response.jsonPath();
		List<String> firstName = json.get("data.first_name");
		
		for (String fname : firstName)
		{
			System.out.println(fname);
		}
		
		System.out.println("second name is : " + firstName.get(1));
	}
}