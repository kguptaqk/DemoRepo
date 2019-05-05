package com.qa.Automation_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class DemoTest1 {
	
	@Test
	public void sum()
	{
		int a=10,b=20;
		System.out.println("SUM");
		Assert.assertEquals(30,a+b);
	}
	
	@Test
	public void sub()
	{
		SoftAssert sassert= new SoftAssert();
		int a=10,b=20;
		System.out.println("SUB");
		sassert.assertEquals(1,b-a);		
		System.out.println("h1");
		System.out.println("h2");
		System.out.println("h3");
		System.out.println("h4");
		sassert.assertAll();
	}
	
	@Test
	public void mul()
	{
		int a=10,b=20;
		System.out.println("MUL");
		Assert.assertEquals(200,a*b);
	}
	
	@Test
	public void div()
	{
		int a=10,b=20;
		System.out.println("DIV");
		Assert.assertEquals(2,b/a);
	}
	

}
