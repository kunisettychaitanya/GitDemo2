package resources;

public enum APIResources {

	// writing methods and all methods are separated by commas and end is defined
	// with; b/z enum is a special class in java which has collection of mehods or
	// constants
	AddPlaceAPI("maps/api/place/add/json"), 
	getPlaceAPI("maps/api/place/get/json"),
	deletePlaceAPI("maps/api/place/delete/json");
	
	private String resource;

	APIResources(String resource) {
		this.resource=resource;

	}
	
	public String getResource() {
		
		return resource;
	}

}
