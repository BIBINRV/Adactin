package com.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search extends BaseClass1 {
	@Test
	public void searchphone() {
		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])"));
		inputText(search,"samsung");
		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(btn);
		System.out.println("search success");
		
}
}