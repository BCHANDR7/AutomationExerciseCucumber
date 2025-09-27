package factory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	public static Properties takeProperty() throws IOException 
	{
		FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(file);
		return prop;
	}
	
	public static WebDriver openBrowser() throws IOException
	{
		prop=takeProperty();
		String os=prop.getProperty("os").toLowerCase();
		String browser=prop.getProperty("browser").toLowerCase();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		if(os.equalsIgnoreCase("windows"))
		{
			switch (browser) {
			case "chrome": {
				System.setProperty("Webdriver.chrome.driver", "D:\\Automation library\\Browser\\chromedriver-win64\\chromedriver.exe");
				driver=new ChromeDriver(options);
				break;
			}
			case "edge":{
				System.setProperty("Webdriver.edge.driver", "D:\\Automation library\\Browser\\edgedriver_win64\\msedgedriver.exe");
				driver=new EdgeDriver();
				break;
			}
			case "firefox":{
				System.setProperty("Webdirver.gecko.driver", "D:\\Automation library\\Browser\\geckodriver-v0.36.0-win64\\geckodriver.exe");
				driver= new FirefoxDriver();
				break;
			}
			default:
				driver=null;
				System.out.println("No matching browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		else
		{
			System.out.println("No matching os");
		}
		return driver;
				
		
}
	
	public static Logger getLogs()
	{
		logger=LogManager.getLogger();
		return logger;
	}
	
	
	public static String capture() throws IOException
	{
		File srcPath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destPath= new File(System.getProperty("user.dir")+"\\Reports\\Images\\Screenshot"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(srcPath, destPath);
		String path=destPath.getAbsolutePath();
		return path;
	}
	

}