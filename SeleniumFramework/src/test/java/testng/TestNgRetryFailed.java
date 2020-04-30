package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryFailed {
	
	// test cases which are not passed, just refresh the project--> go to test-output--> testng-failed.xml report should be generated
	
	@Test
	public void test1(){
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test 2");
		//int i = 1/0;
	}

	@Test
	public void test3(){
		System.out.println("I am inside test 3");
		Assert.assertTrue(false);
	}
}
