package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	static WebDriver driver;
	
	public static void main(String[] args) {
		googleSearchtext();
	}
	
	public static void googleSearchtext(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		GoogleSearchPageObjects g = new GoogleSearchPageObjects(driver);
		g.setTextInSearchBox("Automation Test");
		g.clickSearchButton();
		
	}

}
