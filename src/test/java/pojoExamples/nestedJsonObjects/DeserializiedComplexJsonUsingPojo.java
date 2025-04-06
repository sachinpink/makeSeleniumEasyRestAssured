
package pojoExamples.nestedJsonObjects;
import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
public class DeserializiedComplexJsonUsingPojo {

	// This complex example of deserilization using pojo classes 
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException 
	{
		Response res= given()
			.baseUri("https://run.mocky.io/v3/370b12fc-3825-4279-93d7-418e09680381")
		.when()
			.get()
		.then()
			.assertThat().statusCode(200).extract().response();
		
		complexPojo complexResponse = res.as(complexPojo.class);
//		
//		ObjectMapper mapper = new ObjectMapper();
//		//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//	    complexPojo complexResponse = mapper.readValue(res.asString(), complexPojo.class);
//		
		 System.out.println(" glossary Title :" + complexResponse.getGlossary().getTitle());
		 
		 System.out.println(" GlossDiv Title :" + complexResponse.getGlossary().getGlossDiv().getTitle());
		 
		 System.out.println(" GlossEntry ID :" + complexResponse.getGlossary().getGlossDiv().getGlossList().getGlossEntry().getID());
		 
		 System.out.println(" GlossEntry SortAs :" + complexResponse.getGlossary().getGlossDiv().getGlossList().getGlossEntry().getSortAs());
		 
		 System.out.println(" GlossEntry GlossTerm :" + complexResponse.getGlossary().getGlossDiv().getGlossList().getGlossEntry().getGlossTerm());
		 
		 System.out.println(" GlossEntry GlossDef GlossSeeAlso :" + complexResponse.getGlossary().getGlossDiv().getGlossList().getGlossEntry().getGlossDef().getGlossSeeAlso());
		 
		 System.out.println(" GlossEntry GlossSee :" + complexResponse.getGlossary().getGlossDiv().getGlossList().getGlossEntry().getGlossSee());
		

	}

}
