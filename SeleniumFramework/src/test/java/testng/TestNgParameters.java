package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//========================================refer testng4.xml==============================================
public class TestNgParameters {
	
	@Test
	@Parameters({"MyName"})
	public void test1(@Optional("Default value") String name){
		System.out.println("Name is :" + name);
	}
}
