package utitlities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManager {
	
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static void openReport()
	{
		ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\Run_"+System.currentTimeMillis()+"\\ExtentReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Exercise");
		spark.config().setReportName("Automation Testing");
		report=new ExtentReports();
		report.attachReporter(spark);
		test=report.createTest("Sanity").assignAuthor("Balaji");
	}
	
	public static void closeReport()
	{
		report.flush();
	}

}
