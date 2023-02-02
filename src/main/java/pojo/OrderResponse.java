package pojo;

import java.util.List;

public class OrderResponse {
	
private String id;
private String isDeleted;
private List<String> student;
private String status;
private String description;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
private String createdAt;
private String updatedAt;
private String incrementalId;
private List<String> completeJourney;



public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getIsDeleted() {
	return isDeleted;
}
public void setIsDeleted(String isDeleted) {
	this.isDeleted = isDeleted;
}
public List<String> getStudent() {
	return student;
}
public void setStudent(List<String> student) {
	student = student;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
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
public String getIncrementalId() {
	return incrementalId;
}
public void setIncrementalId(String incrementalId) {
	this.incrementalId = incrementalId;
}
public List<String> getCompleteJourney() {
	return completeJourney;
}
public void setCompleteJourney(List<String> completeJourney) {
	this.completeJourney = completeJourney;
}







}
