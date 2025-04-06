package JsonPathExamples;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.specification.RequestSpecification;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;


public class myExample
{
	public static void main(String[] args)
	{
	ValidatableResponse respnse =given().contentType(ContentType.JSON)
			.config(config.logConfig(LogConfig.logConfig().blacklistHeader("Content-Type")))
		.baseUri("https://run.mocky.io/v3/")
		.pathParam("path", "1238d331-8040-4773-b08e-cfbe5c511579")
		.log().all()
	.when()
		.get("{path}")
	.then()
		.assertThat().statusCode(200)
		.log().all()
		.body("firstName", equalTo("Amod"));
		
		
	JsonPath jpath =new JsonPath(respnse.extract().asString());
	jpath.get("firstName");
	//Map<String,String>  address1 =jpath.getMap("address[0]");
	//address1= jpath.get("address[0]");
	
	System.out.println(""+jpath.getString("address[1].type"));
	
	List<LinkedHashMap<String,String>> addresslist =jpath.getList("address");
	for(Map<String,String> addressmap:addresslist)
	{
		for(Map.Entry<String, String> entry:addressmap.entrySet())
		{
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
		}
	}
	
	List<Object> city =jpath.getList("address.city");
	System.out.println(" all city "+city);
	
	String tempcity=jpath.getString("address.find{it.type =='temp'}.city");
	
	System.out.println("city of temp address "+tempcity);
	
	System.out.println(" size" +jpath.getInt("address.size()"));
	
	
	
	}

	
}
