package pojoExamples.nestedJsonObjects;
import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import pojoExamples.Student;
public class DesrializeJsonArrayUsingPojo {

	public static void main(String[] args) 
	{
		/*[
		    {
		        "accountNo": 123456789,
		        "balance": 12.45,
		        "first_name": "Sachin",
		        "last_name": "Zagade",
		        "email": "sz60@ntrs.com",
		        "gender": "Male"
		    },
		    {
		        "accountNo": 987654323,
		        "balance": 10.45,
		        "first_name": "Priyanka",
		        "last_name": "Zagade",
		        "email": "pinky@gmail.com",
		        "gender": "Female"
		    }
		]
		*/
		
		Response response = given()
			.baseUri("https://run.mocky.io/v3/0cb1f41b-296e-425c-b885-964b878eebbe")
		.when()
		.get()
		.then()
			.assertThat().statusCode(200).extract().response();
		
		 Student[] studentDetails = response.as(Student[].class); //1
		 
		for(Student stud:studentDetails)
		{
			 System.out.println("Account No: " + stud.getAccountNo());
	            System.out.println("Balance: " + stud.getBalance());
	            System.out.println("First Name: " + stud.getFirst_name());
	            System.out.println("Email: " + stud.getEmail());
	            System.out.println("Gender: " + stud.getGender());
	            System.out.println();
		}
		 List<Student> studentDetls= response.as(new TypeRef<List<Student>>() {});//2 

		for(Student s:studentDetls)
		{
			 System.out.println("Account No: " + s.getAccountNo());
	            System.out.println("Balance: " + s.getBalance());
	            System.out.println("First Name: " + s.getFirst_name());
	            System.out.println("Email: " + s.getEmail());
	            System.out.println("Gender: " + s.getGender());
	            System.out.println();
		}
		
	}

}
