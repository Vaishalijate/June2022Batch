package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login 
{
	
	@Given ("^user provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
	public void bLaunch(String name,String location)
	{
		Object[]intput=new Object[2];
		 intput[0]=name;
		 intput[1]=location;
		 SeleniumOperations.browserLaunch(intput);
	}
	
	@Given("^user enter url as \"([^\"]*)\"$")
	public void user_enter_url_as(String arg1) throws Throwable 
	{
		 Object[]intput1=new Object[1];
		 intput1[0]="https://www.flipkart.com/";
		 SeleniumOperations.openApplication(intput1);
		 
	   
	}

	@Given("^user cancel initial login window$")
	public void user_cancel_initial_login_window() throws Throwable 
	{
		 Object[]intput2=new Object[1];
		 intput2[0]="//*[@class='_2KpZ6l _2doB4z']";
		 SeleniumOperations.clickOnElement(intput2);
		 
	}

	@When("^user navigate on Login tab$")
	public void user_navigate_on_Login_tab() throws Throwable 
	{
		 Object[]intput3=new Object[1];
		 intput3[0]="//*[@class='_1_3w1N']";
		 SeleniumOperations. mouseOverAction(intput3);
		 
	   
	}

	@When("^user click on MyProfile$")
	public void user_click_on_MyProfile() throws Throwable 
	{
		 Object[]intput4=new Object[1];
		 intput4[0]="(//*[@class='_2kxeIr _1pY_1Z'])[1]";
		 SeleniumOperations.clickOnElement(intput4);
	    
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable 
	{
		 Object[]intput5=new Object[2];
		 intput5[0]="(//*[@type='text'])[2]";
		 intput5[1]="9503152766";
		 SeleniumOperations.sendText(intput5);
		 
	    
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable 
	{
		 Object[]intput5=new Object[2];
		 intput5[0]="(//*[@type='text'])[2]";
		 intput5[1]="9503152766";
		 SeleniumOperations.sendText(intput5);
		 
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		 Object[]intput7=new Object[1];
		 intput7[0]="(//*[@type='submit'])[2]";
		 SeleniumOperations.clickOnElement(intput7);
		 
	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable 
	{
		Object[]intput8=new Object[2];
		 intput8[0]="Ravindra Dhulgand";
		 intput8[1]="//*[text()='Ravindra  Dhulgand']";
		 SeleniumOperations.validation(intput8);
	    
	}

	
	
	
	
}
