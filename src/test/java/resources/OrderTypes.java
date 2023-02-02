package resources;

public enum OrderTypes {
    
	orderTypeAPI("/v1/orders"), 
	ordersubTypeAPI("/v1/orders");

	private String resource;
	
	
	OrderTypes(String resource)
	{
		this.resource = resource;
	}
	public String getResource()
	{
		return resource;
	}
}
