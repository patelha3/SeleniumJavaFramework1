package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore  ============== this will ignore all the test cases in this particular class===========================
public class TestNgIgnoreDemo {

	@Ignore
	@Test
	public void test1(){
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside test 2");
	}
	
	@Test
	public void test3(){
		System.out.println("I am inside test 3");
	}
}
