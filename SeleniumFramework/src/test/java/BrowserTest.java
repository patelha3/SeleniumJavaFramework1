import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		String path = System.getProperty("user.dir");
		//System.out.println(path);
		//System.setProperty("webdriver.gecko.driver", path + "\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", path +  "\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		

		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
		Thread.sleep(3000);
	}
}
