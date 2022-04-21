package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass1 {

	public Login() {
		PageFactory.initElements(driver, this);
	}


	//       @FindAll({
	//	@FindBy(id="username"),
	//	@FindBy(name="name")
	//       })
	//	private WebElement txtuser;
	@CacheLookup
	@FindBys({
		@FindBy(id="username"),
		@FindBy(xpath="//input[@type='text']")

	})
	private WebElement txtuser;
	@CacheLookup
	@FindAll({
		@FindBy(id="password"),
		@FindBy(xpath="//input[@type='pasord']")
	})
	private WebElement txtpass;
	@CacheLookup
	@FindBy(id="login")
	private WebElement btnlogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}




























}
