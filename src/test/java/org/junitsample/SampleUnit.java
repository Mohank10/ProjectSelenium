package org.junitsample;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.fbpojo.FacebookPojoClass;

public class SampleUnit extends BaseClass {
	 


	@BeforeClass
	public static void beforefClass() {

		System.out.println("BeforClass");
		System.out.println("LaunchBrowser");

	}

	@Before
	public void bfmehtod() {

		System.out.println("BeforMethod");
		
		System.out.println("Every test befor Start");
	}

	@Test
	
	public void tc1() {
		System.out.println("test case1");
		
		
	}
	
	@After
	
public void afMethod() {

		System.out.println("AfterMethod");
		
		System.out.println("every test after end");
		
		
}
	
	@AfterClass
	
	public  static void afClass() {

		
		System.out.println("After Class");
		
		System.out.println("close the browser");
	}
	
}
