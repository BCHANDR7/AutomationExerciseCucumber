package pageObjects;

import java.io.IOException;
import java.nio.channels.SelectableChannel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;

import factory.BaseClass;

import utitlities.ReportManager;

public class SignUpDetailsPage extends BasePage{

	public SignUpDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "input[id='id_gender1']")
	private WebElement genderSelect;
	@FindBy(css = "input[id='password']")
	private WebElement passwordEnter;
	@FindBy(css = "select[id='days']")
	private WebElement daySelect;
	@FindBy(css = "select[id='months']")
	private WebElement monthSelect;
	@FindBy(css = "select[id='years']")
	private WebElement yearSelect;
	@FindBy(css = "input[id='newsletter']")
	private WebElement letter;
	
	@FindBy(css = "input[id='first_name']")
	private WebElement firstNameInput;
	@FindBy(css = "input[id='last_name']")
	private WebElement lastNameInput;
	@FindBy(css = "input[id='company']")
	private WebElement companyInput;
	@FindBy(css = "input[id='address1']")
	private WebElement address1Input;
	@FindBy(css = "input[id='address2']")
	private WebElement address2Input;
	@FindBy(css = "select[id='country']")
	private WebElement countrySelect;
	@FindBy(css = "input[id='state']")
	private WebElement stateInput;
	@FindBy(css = "input[id='city']")
	private WebElement cityInput;
	@FindBy(css = "input[id='zipcode']")
	private WebElement zipCodeInput;
	@FindBy(css = "input[id='mobile_number']")
	private WebElement mobileInput;
	@FindBy(css = "button[data-qa='create-account']")
	private WebElement create;
	@FindBy(xpath = "//b[text()='Account Created!']")
	private WebElement verify;

	public void title() throws IOException {
		try {
			genderSelect.click();
			ReportManager.test.pass("Gender Selected", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Gender not Selected", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void password(String pwd) throws IOException {
		try {
			passwordEnter.sendKeys(pwd);
			BaseClass.getLogs().info("Password Entered");
			ReportManager.test.pass("Password Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			BaseClass.getLogs().error("Incorrect Password");
			ReportManager.test.fail("Password not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void dob(String day, String month, String year) throws IOException {
		try {
			Select se=new Select(daySelect);
			Select se1=new Select(monthSelect);
			Select se2=new Select(yearSelect);
			se.selectByValue(day);
			se1.selectByVisibleText(month);
			se2.selectByVisibleText(year);
			ReportManager.test.pass("DOB is Selected", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("DOB not Selected", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void selectOffer() throws IOException {
		try {
			letter.click();
			ReportManager.test.pass("Offer is Clicked", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Offer is not Clicked", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void firstName(String fname) throws IOException {
		try {
			firstNameInput.sendKeys(fname);
			ReportManager.test.pass("FirstName is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("FirstName is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void lastName(String lname) throws IOException {
		try {
			lastNameInput.sendKeys(lname);
			ReportManager.test.pass("LastName is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("LastName is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void company(String comp) throws IOException {
		try {
			companyInput.sendKeys(comp);
			ReportManager.test.pass("Company is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Company is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void address1(String add1) throws IOException {
		try {
			address1Input.sendKeys(add1);
			ReportManager.test.pass("Address1 is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Address1 is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void address2(String add2) throws IOException {
		try {
			address2Input.sendKeys(add2);
			ReportManager.test.pass("Address2 is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Address1 is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void country(String coun) throws IOException {
		try {
			Select se=new Select(countrySelect);
			se.selectByVisibleText(coun);
			ReportManager.test.pass("Country is Selected", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Country is not Selected", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void state(String sta) throws IOException {
		try {
			stateInput.sendKeys(sta);
			ReportManager.test.pass("State is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("State is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void city(String cit) throws IOException {
		try {
			cityInput.sendKeys(cit);
			ReportManager.test.pass("City is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("City is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void zipcode(String zip) throws IOException {
		try {
			zipCodeInput.sendKeys(zip);
			ReportManager.test.pass("Zipcode is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Zipcode is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void mobile(String mob) throws IOException {
		try {
			mobileInput.sendKeys(mob);
			ReportManager.test.pass("Mobile is Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Mobile is not Entered", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
			
	}

	public void accountCreate() throws IOException {
		try {
			create.click();
			ReportManager.test.pass("Created button is Clicked",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Created button is not Clicked",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
	}

	public void verifyAccount() throws IOException {
		try {
			String text=verify.getText();
			System.out.println(text);
			Assert.assertEquals(text, "ACCOUNT CREATED!");
			ReportManager.test.pass("Account Verified",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Account not verified",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
	}
	
	

}
