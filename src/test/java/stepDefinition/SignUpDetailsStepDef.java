package stepDefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.SignUpDetailsPage;
import utitlities.DataManager;

public class SignUpDetailsStepDef {
	
	List<HashMap<String, String>> dataMap;
	
	
	@Then("select title")
	public void select_title() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		spd.title();
	   
	}

	@Then("enter password")
	public void enter_password() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		BaseClass.getLogs().info("Entering PassWord");
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AccountInfo");
		spd.password(dataMap.get(0).get("Password"));
	}

	@Then("select Date of Birth")
	public void select_date_of_birth() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AccountInfo");
		spd.dob(dataMap.get(0).get("Day"),dataMap.get(0).get("Month"),dataMap.get(0).get("Year"));
	}

	@Then("click offers and preference")
	public void click_offers_and_preference() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AccountInfo");
		spd.selectOffer();
	}

	@Then("enter First name")
	public void enter_first_name() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.firstName(dataMap.get(0).get("FirstName"));
	}

	@Then("enter Last name")
	public void enter_last_name() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.lastName(dataMap.get(0).get("Lastname"));
	}

	@Then("enter company")
	public void enter_company() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.company(dataMap.get(0).get("Company"));
	}

	@Then("enter Address1")
	public void enter_address1() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.address1(dataMap.get(0).get("Address"));
	}

	@Then("enter Address2")
	public void enter_address2() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.address2(dataMap.get(0).get("Address2"));
	}

	@Then("select country")
	public void select_country() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.country(dataMap.get(0).get("Country"));
	}

	@Then("enter state")
	public void enter_state() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.state(dataMap.get(0).get("State"));
	}

	@Then("enter city")
	public void enter_city() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.city(dataMap.get(0).get("City"));
	}

	@Then("enter zipcode")
	public void enter_zipcode() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.zipcode(dataMap.get(0).get("Zipcode"));
	}

	@Then("enter mobileNumber")
	public void enter_mobile_number() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		dataMap=DataManager.getData(BaseClass.takeProperty().getProperty("path"), "AddressInfo");
		spd.mobile(dataMap.get(0).get("MobileNumber"));
	}

	@Then("clicks create account")
	public void clicks_create_account() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		spd.accountCreate();
		
	}

	@Then("verify the account is created")
	public void verify_the_account_is_created() throws IOException {
		SignUpDetailsPage spd=new SignUpDetailsPage(BaseClass.driver);
		spd.verifyAccount();
		
	}


}
