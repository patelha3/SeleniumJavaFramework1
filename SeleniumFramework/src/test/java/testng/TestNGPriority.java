package testng;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority= 1)
	public void one(){
		System.out.println("I am inside test 1 ");
	}
	
	@Test(priority = 1)
	public void two(){
		System.out.println("I am inside test 2 ");
	}
	
	@Test
	public void three(){
		System.out.println("I am inside test 3 ");
	}
	
	
}
