package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test1 = extent.createTest("Google search test one", "This is test to validate google search functionality");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting test case");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("hello");
		test1.pass("Entered text in searchbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		driver.close();
		test1.info("test completed");
		
		extent.flush();
		
	}
}
