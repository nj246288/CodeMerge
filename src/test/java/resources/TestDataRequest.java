package resources;

import pojo.emailRequest;

public class TestDataRequest {
	
	public emailRequest emailRequestPayload(String email, String password) {
		
	emailRequest er= new emailRequest();
	 er.setEmail(email);
	 er.setPassword(password);
	  return er;
		
		
		
		
		
		
	}

}
