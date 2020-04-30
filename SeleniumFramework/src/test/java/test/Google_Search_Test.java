package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class Google_Search_Test extends GoogleSearchPage{
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GoogleSearchPage.textBox_Search(driver).sendKeys("Automation");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		
	}
	
	
}
