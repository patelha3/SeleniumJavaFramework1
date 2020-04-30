package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}

	public static void test() throws IOException, InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tinyupload.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("E:\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		driver.close();
	}
}
