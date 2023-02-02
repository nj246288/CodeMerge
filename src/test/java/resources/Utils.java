package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
public static	RequestSpecification req;
	
	
	public RequestSpecification requestSpecification() throws IOException {
		
		if(req==null) {
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).addHeader("user-role", "student").addHeader("Authorization", " Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2MzJlOGYyOWQyNWRlNjJiYmI5ZWFjZGUiLCJpYXQiOjE2NzIwNzMwMTgsImV4cCI6MTY3MjE1OTQxOCwidHlwZSI6ImFjY2VzcyIsInVzZXJSb2xlIjoic3R1ZGVudCJ9.mt8eXw9cIKuHl9t1Jo7_Lr6lIFrQ3jHq0IFkcpVUE3c").build();
		return req;
	}
		return req;
	}
	
	public static String getGlobalValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Tutorbin\\eclipse-workspace\\APITutorbin\\src\\test\\java\\resources\\globals.properties");
		prop.load(fis);
		return prop.getProperty(key);

}
	
}
