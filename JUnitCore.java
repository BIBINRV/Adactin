package com.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JUnitCore extends BaseClass1{

	@Before
	public void Beforeclass() {
		browserconfigchrome();
		openurl("https://www.flipkart.com/");
		maximizewindow();
		implicitywait();
	}
	//	@After
	//	public void afterclass() {
	//		closewindow();
	//	}

	@Test
	public void login() {
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		inputText(user,"7708741966");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		inputText(pass, "Password@01");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(login);
		System.out.println("login success");
		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])"));
		inputText(search,"samsung");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		click(btn);
		System.out.println("search success");

	}
	//    @Ignore
	//	@Test
	//	public void login1() {
	//		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	//		inputText(user,"7708196");
	//		String attribute = user.getAttribute("value");
	//		Assert.assertEquals("7708741966", attribute);
	//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	//		inputText(pass, "Pass@01");
	//		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	//		click(login);
	//		System.out.println("login not success");
	//
	//	}
	//    @Ignore
	//	@Test
	//	public void login2() {
	//		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	//		inputText(user,"41966");
	//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	//		inputText(pass, "Pas01");
	//		String attribute = pass.getAttribute("value");
	//		Assert.assertEquals("Password@01", attribute);
	//		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	//		click(login);
	//		System.out.println("login not success");

	//	}
	//    @Test
	//	public void searchphone() {
	//		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])"));
	//		inputText(search,"samsung");
	//		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	//		click(btn);
	//		System.out.println("search success");

	//}

}



















