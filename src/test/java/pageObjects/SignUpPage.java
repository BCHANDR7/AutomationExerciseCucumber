package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.MediaEntityBuilder;

import factory.BaseClass;
import hooks.Hooks;
import io.cucumber.messages.types.Hook;
import utitlities.ReportManager;

public class SignUpPage extends BasePage{

	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "input[data-qa='signup-name']")
	private WebElement signupName;
	@FindBy(css = "input[data-qa='signup-email']")
	private WebElement signupEmail;
	@FindBy(css = "button[data-qa='signup-button']")
	private WebElement submit;
	@FindBy(xpath =  "//b[text()='Enter Account Information']")
	private WebElement validate;

	public void enterName(String name) throws IOException {
		try {
			signupName.sendKeys(name);
			ReportManager.test.pass("Name Entered",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Name not Entered",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void enterEmail(String email) throws IOException {
		try {
			signupEmail.sendKeys(email);
			ReportManager.test.pass("Email Entered",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Email not Entered",MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

	public void clickSignup() throws IOException {
		try {
			submit.click();
			ReportManager.test.pass("SignUp Clicked", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("SignUp not Clicked", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
	}

	public void validatePage() throws IOException {
		
		try {
			String text=validate.getText();
			Assert.assertEquals(text, "ENTER ACCOUNT INFORMATION");
			System.out.println(text);
			ReportManager.test.pass("Page validated", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		} catch (Exception e) {
			ReportManager.test.fail("Page not validated", MediaEntityBuilder.createScreenCaptureFromPath(BaseClass.capture()).build());
		}
		
		
	}

}
