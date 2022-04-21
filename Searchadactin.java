package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchadactin extends BaseClass1 {

	
	public Searchadactin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement selectlocation;
    @FindBy(id="hotels")
	private WebElement gethotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
	@FindBy(id="Submit")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getGethotel() {
		return gethotel;
	}
	
	public WebElement getSelectlocation() {
		return selectlocation;
	}

	
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}

	
}
