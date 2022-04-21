package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertClass {

	@Test
	public void testcase1() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		//		boolean contains = currentUrl.contains("instagram");
		System.out.println(contains);
		Assert.assertTrue(contains);
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("BIBIN");
		String attribute = user.getAttribute("value");
		//		Assert.assertEquals("bibin","BIBIN");
		
		Assert.assertEquals("BIBIN",attribute);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("5264411");

















	}

}
