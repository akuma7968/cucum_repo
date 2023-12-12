package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.*;

public class fBSignIn {
	
	
	@Given("User logins to facebook website")
	public void user_logins_to_facebook_website() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logins to facebook website");
	}

	@When("User validates homepage title")
	public void user_validates_homepage_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User validates homepage title");
	}

	@Then("User enters firstname and lastname")
	public void user_enters_firstname_and_lastname(DataTable dataTable) {
		List<List<String>> data= dataTable.asLists();
		System.out.println("First row first name and last name "+ data.get(0).get(0));
		
		for(List<String> l : data)
		{
			System.out.println(l);
		}
//		 List<Map<String, String>> lt=dataTable.asMaps(String.class, String.class);
//		 
//		 for(Map<String, String> data :lt)
//		 {
//			 System.out.println(data.get("firstName"));
//		 }
	}

	@Then("clicks on signin button")
	public void clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clicks on signin button");
	}

}
