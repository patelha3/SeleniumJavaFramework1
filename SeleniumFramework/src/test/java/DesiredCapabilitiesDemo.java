import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {
	static WebDriver driver;
	
	public static void main(String[] args) {
				
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
	}

}
