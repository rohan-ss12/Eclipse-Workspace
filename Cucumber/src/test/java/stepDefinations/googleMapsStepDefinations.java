package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleMapsStepDefinations {
	
	@Given("^Add place payload$")
	public void add_place_payload() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("1");
	}

	@When("^User calls \"([^\"]*)\" with Post http request method$")
	public void user_calls_with_Post_http_request_method(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("2");
	}

	@Then("^API call success method with statuc code (\\d+)$")
	public void api_call_success_method_with_statuc_code(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("3");
	}

	@Then("^\"([^\"]*)\" is Response Body is \"([^\"]*)\"$")
	public void is_Response_Body_is(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("4");
	}

	@Then("^\"([^\"]*)\" in Response Body is \"([^\"]*)\"$")
	public void in_Response_Body_is(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("5");
	}

}
