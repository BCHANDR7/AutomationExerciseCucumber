package hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utitlities.ReportManager;

public class Hooks {

	WebDriver driver;
	
	@BeforeAll
	public static void reportOpen()
	{
		ReportManager.openReport();
	}
	
	
	@Before
	public void openURL() throws IOException
	{
		driver=BaseClass.openBrowser();
		driver.get(BaseClass.takeProperty().getProperty("url"));
		ReportManager.test.info("URL Opened");
		
	}
	
	@After
	public void close() throws IOException
	{
		driver=BaseClass.openBrowser();
		if(driver!=null)
		{
			driver.quit();
		}
	}
	

	@AfterAll
	public static void reportClose()
	{
		ReportManager.closeReport();
	}
}
