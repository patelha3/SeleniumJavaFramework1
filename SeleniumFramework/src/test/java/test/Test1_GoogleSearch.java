package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() throws InterruptedException{

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);		
	}
	
	@Test
	public void tearDown(){
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}
