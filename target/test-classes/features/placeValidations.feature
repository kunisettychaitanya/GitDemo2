Feature: Validating Place API's

@AddPlace @Regression
Scenario Outline: Verify if place is being succesfully added using AddPlace API
	Given Add Place payload with "<name>" "<language>" "<address>"
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call is success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_id created maps to "<name>" using "getPlaceAPI"

Examples:
	|name	    |language	|address	|
	|LotusLegend|Telugu     |Andhra     |
	|chaitanya  |English    |Telangana  |
	

@DeletePlace @Regression
Scenario: Verify if Delete place functionality is working
	Given DeletePlace Payload
	When user calls "deletePlaceAPI" with "POST" http request
	Then the API call is success with status code 200
	And "status" in response body is "OK"
	