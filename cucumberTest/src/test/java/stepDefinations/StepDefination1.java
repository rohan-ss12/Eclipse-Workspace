package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination1 {
	
	@Given("UserId is {string} and Password is {string}")
	public void user_id_is_and_password_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This are the credentials");
	}

	@When("User enters above credetials")
	public void user_enters_above_credetials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User has entered the given credentials");
	}

	@Then("User will be able to login")
	public void user_will_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is able to login");
	}
	
	
	@Given("Username is (.+) and passkey is (.+)$")
	public void username_is_user1_and_passkey_is_pass1(String Username,String Password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The Username is :"+Username);
	    System.out.println("The password is :"+Password);
	}
	@When("customer enters the above values")
	public void customer_enters_the_above_values() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("This is scenario 2 When Statement");
	}
	@Then("customer is able to login to the application")
	public void customer_is_able_to_login_to_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("This is scenario 2 Then Statement");
	}


}
