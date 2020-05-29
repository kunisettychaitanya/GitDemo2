package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	
	public void beforeScenario() throws IOException {
		// write a code that will give you place_id
		//execute this code only when place_id is null
		
		StepDefinitions m = new StepDefinitions();
		
		if(StepDefinitions.place_id==null)
		{
		m.add_Place_payload_with("kvk", "Sanskrit", "OOty");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_id_created_maps_to_using("kvk", "getPlaceAPI");
		}
		
		
		
		
	}

}
