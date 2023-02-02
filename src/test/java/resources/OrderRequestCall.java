package resources;

import pojo.OrderRequest;
import pojo.emailRequest;

public class OrderRequestCall {

	
	public OrderRequest orderRequestPayload(String description, String type) {
		
		OrderRequest or = new OrderRequest();
		
		or.setDescription(description);
		or.setType(type);
		
		return or;
		
		
		
		
	}

}


