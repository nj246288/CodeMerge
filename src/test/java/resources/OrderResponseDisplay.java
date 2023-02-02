package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Marketingdata;
import pojo.OrderResponse;

public class OrderResponseDisplay {
	
	
	public OrderResponse orderResponsePayload() {
		
	OrderResponse osp = new OrderResponse();
	osp.setId("634e6d90a674ad195e43f3b6");
	osp.setIsDeleted("false");
	osp.setIncrementalId("160680");
	osp.setStatus("created");
	//osp.setStudent(null);
	//osp.setCompleteJourney(null);
	osp.setDescription("testing");
	osp.setCreatedAt("2022-10-18T09:10:40.228Z");
	osp.setUpdatedAt("2022-10-18T09:10:40.228Z");
	
	List<String> myList = new ArrayList<String>();
	myList.add("id");
	myList.add("alias");
	osp.setStudent(myList);
	
	Marketingdata md= new Marketingdata();
	md.setIsActive(null);
	md.setType(null);
	
	
	
	
		
		
		return osp;
		
		
		
	}
	
	
	

}
