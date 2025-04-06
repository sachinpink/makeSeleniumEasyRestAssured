package JsonPathExamples;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MyExample2 
{
	
	public static void main(String[] args)
	{
		Response  response =given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.config(config.logConfig(LogConfig.logConfig().blacklistHeader("Content-Type")))
			.baseUri("https://run.mocky.io/v3/")
			.pathParam("path", "1238d331-8040-4773-b08e-cfbe5c511579")
			.log().all()
		.when()
			.get("{path}")
		.then().log().all().contentType(ContentType.JSON)
			.assertThat().statusCode(200).extract().response();
		
		System.out.println(response.contentType());
		
		JsonPath jp =new JsonPath(response.asString());
		System.out.println(jp.getList("address.type"));
		int size= jp.getInt("address.size()");
		
		for(int i=0;i<size;i++)
		{
			System.out.println("" +jp.get("address["+i+"].city"));
		}
		
	}

}
