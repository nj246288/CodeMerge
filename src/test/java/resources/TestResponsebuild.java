package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Access;
import pojo.Refresh;
import pojo.SignInResponse;

public class TestResponsebuild {
	
	public SignInResponse emailPayload() {
		
	SignInResponse user = new SignInResponse();
	user.setId("632e8f29d25de62bbb9eacde");
	user.setIsEmailVerified("true");
//	user.setIsPhoneVerified("true");
	//user.setPhoneNumber("+447591195685");
	user.setEmail("nitinjain9205868138@tutorbin.com");
	user.setAlias("Junius.Smitham");
	//user.setPhoneNumberRegion("IN");
	user.setCreatedAt("2022-09-24T05:01:29.267Z");
	user.setUpdatedAt("2022-09-27T13:10:35.723Z");
	List<String> myList = new ArrayList<String>();
	myList.add("access");
	myList.add("refresh");
	user.setToken(myList);
	Access ac= new Access();
	ac.setToken(null);
	ac.setExpiresAt(null);
	Refresh rf = new Refresh();
	rf.setToken(null);
	rf.setExpiresAt(null);

	return user;
		
	}
	
	
}
