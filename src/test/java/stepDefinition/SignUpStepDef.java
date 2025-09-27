package stepDefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SignUpPage;
import utitlities.DataManager;

public class SignUpStepDef {

List<HashMap<String, String>> dataMap;


	
	@Given("enter name")
	public void enter_name() throws IOException {
		SignUpPage sp=new SignUpPage(BaseClass.driver);
	    dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "SignUp");
	    sp.enterName(dataMap.get(0).get("Name"));
	    
	}

	@Given("enter email address")
	public void enter_email_address() throws IOException {
		SignUpPage sp=new SignUpPage(BaseClass.driver);
		dataMap= DataManager.getData(BaseClass.takeProperty().getProperty("path"), "SignUp");
		sp.enterEmail(dataMap.get(0).get("Email"));
	   
	}

	@Given("click signup")
	public void click_signup() throws IOException {
		SignUpPage sp=new SignUpPage(BaseClass.driver);
		sp.clickSignup();
	}
	
	@Then("validate it entered to signup page")
	public void validate_it_entered_to_signup_page() throws IOException{
		SignUpPage sp=new SignUpPage(BaseClass.driver);
		sp.validatePage();
	}
}
