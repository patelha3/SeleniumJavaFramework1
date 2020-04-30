package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password) throws InterruptedException{
		System.out.println(username + " | " + password);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.close();
		Thread.sleep(2000);		
	}	
	
	@DataProvider(name = "test1data")
	public Object[][] getData(){		
		String excelPath = "E:\\SeleniumFramework\\excel\\data.xlsx";
		String sheetName = "Sheet1";
		Object data[][] = testData(excelPath, sheetName);
		return data;
	}
	
	public static Object[][] testData(String excelPath, String sheetName){  //add parameters here		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object [rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++){
			for(int j=0 ; j<colCount; j++){
				
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData + " | ");
				data[i-1][j]= cellData;				
			}
			//System.out.println();
		}
		return data;
	}
}
