package pojo;

import java.util.List;

public class SignInResponse {

	private String id ;
	private String phoneNumber;
//	private String phoneNumberRegion;
	private String isEmailVerified;
	private String alias;
	
	private String isPhoneVerified;
	private String email;
	
	private String createdAt;
	private String updatedAt;
	private List<String> token;

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getIsEmailVerified() {
		return isEmailVerified;
	}
	public void setIsEmailVerified(String isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}
	public String getIsPhoneVerified() {
		return isPhoneVerified;
	}
	public void setIsPhoneVerified(String isPhoneVerified) {
		this.isPhoneVerified = isPhoneVerified;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<String> getToken() {
		return token;
	}
	public void setToken(List<String> token) {
		this.token = token;
	}
	
	
	
}
