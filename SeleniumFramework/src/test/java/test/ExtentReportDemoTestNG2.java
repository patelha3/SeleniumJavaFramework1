package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemoTestNG2 {
	WebDriver driver;
	ExtentReports extent;

	@BeforeSuite
	public void setUp(){
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeTest
	public void beforeTest(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void test1(){
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://google.com");
		test.pass("Validated to google.com");
		test.log(Status.INFO, "Th");

	}

	@Test
	public void test2(){
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://google.com");
		test.pass("Validated to google.com");
		test.log(Status.INFO, "Th");

	}

	@AfterTest
	public void tearDownTest(){
		driver.close();
		
	}
	
	@AfterSuite
	public void tearDown1(){
		extent.flush();
	}
}
