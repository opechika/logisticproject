package co.uk.next.stepdefinitions;

import co.uk.next.pages.HomePage;
import co.uk.next.pages.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NextSearchSteps {
	HomePage homePage= new HomePage();
	ResultPage resultPage = new ResultPage();
	
	@Given("^I am Next homepage$")
	public void i_am_Next_homepage() throws Throwable {
		homePage.isLogoDisplayed();
	    
	}

	@When("^I enter \"([^\"]*)\" into the search bar$")
	public void i_enter_into_the_search_bar(String item) throws Throwable {
		homePage.enterAnItemIntoSearchBar(item);
	   
	}

	@When("^I click on the search button$")
	public void i_click_on_the_search_button() throws Throwable {
	   resultPage = homePage.clickOnButton(); 
	}

	@Then("^the result of \"([^\"]*)\" is displayed$")
	public void the_result_of_is_displayed(String result) throws Throwable {
		resultPage.isResultTitleDisplayed(result);
		resultPage.isResultDisplayed(result);
	   
	}



}
