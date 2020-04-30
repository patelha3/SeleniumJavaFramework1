package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.ExtentReportDemoTestNG;

public class PropertiesFile {
	
	static Properties prop;
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
		
	}
	
	public static void getProperties(){
		try{
		prop = new Properties();
		InputStream fis = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		ExtentReportDemoTestNG.browserName = browserName;
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
	}
	
	public static void setProperties(){
		
		try{
			OutputStream output = new FileOutputStream(projectPath + "/src/test/java/config/config.properties");
			prop.setProperty("result", "Pass");
			prop.store(output, null);
		}
		catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
			
		}
		
		
	}
		
}
