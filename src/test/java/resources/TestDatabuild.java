package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Access;
import pojo.Refresh;
import pojo.SignInResponse;
import pojo.SignInResponse;

public class TestDatabuild {
	
public SignInResponse signInPayload() {
	
SignInResponse user = new SignInResponse();
user.setId("63353d38d264792f0b95b8f1");
user.setIsEmailVerified("false");
user.setIsPhoneVerified("true");
user.setPhoneNumber("+447591195685");
user.setAlias("Jaden.Turcotte89");
//user.setPhoneNumberRegion("IN");
user.setCreatedAt("2022-09-29T06:37:44.536Z");
user.setUpdatedAt("2022-09-29T06:37:52.177Z");
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
