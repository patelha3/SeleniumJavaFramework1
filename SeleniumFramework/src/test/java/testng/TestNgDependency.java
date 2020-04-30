package testng;

import org.testng.annotations.Test;

public class TestNgDependency {

	@Test(dependsOnGroups={"sanity.*"})
	public void test1(){
		System.out.println("I am inside test 1");
	}
	
	@Test(groups={"sanity1"})
	public void test2(){
		System.out.println("I am inside test 2");
	}
	
	@Test(groups={"sanity2"})
	public void test3(){
		System.out.println("I am inside test 3");
	}
}
