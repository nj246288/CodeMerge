package resources;


import pojo.Request;

public class TestDataBuild1 {
	
	public Request signInRequestPayload(String phoneNumber, String password) {
		
		Request sin = new Request();
		//sin.setPhoneNumber(phoneNumber);
	//	sin.setPhoneNumberRegion(phoneNumberRegion);
		sin.setPhoneNumber(phoneNumber);
		sin.setPassword(password);
	
		return sin;
	}



}
