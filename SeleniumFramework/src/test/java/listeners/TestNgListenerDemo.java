package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listeners.TestNGListeners.class)
public class TestNgListenerDemo {
	
		@Test
		public void test1(){
			System.out.println("I am inside test 1");
		}
		
		@Test
		public void test2(){
			System.out.println("I am inside test 2");
			//Assert.assertTrue(false);
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("abcd");
			driver.findElement(By.name("qqqq")).sendKeys("abcd");
			driver.close();
		}
		
		@Test
		public void test3(){
			System.out.println("I am inside test 3");
			throw new SkipException("This is a skipper");
		}
	
}
