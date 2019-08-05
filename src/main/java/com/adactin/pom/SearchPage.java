package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id ="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement noofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement inDate;
	
	@FindBy(id="datepick_out")
	private WebElement outDate;
	
	@FindBy(id ="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childRoom;
	
	@FindBy(id ="Submit")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutbtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoofRooms() {
		return noofRooms;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getLogOutbtn() {
		return logOutbtn;
	}
}
