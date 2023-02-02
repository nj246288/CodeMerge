package resources;

public enum APIResources {
	
	signInAPI("/v1/auth/sign-in");
	
	
	private String resource;

	APIResources(String resource){
		
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}
	
	
	
	

}
