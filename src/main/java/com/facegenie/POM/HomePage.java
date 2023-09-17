package com.facegenie.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath = "//span[normalize-space()='Log Out']")private WebElement LogOut;
	@FindBy(xpath = "@FindBy(xpath = \"//span[normalize-space()='Log Out']\")private WebElement LogOut;")private WebElement LogOutPopUp;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	public void logOut() {
		
		LogOut.click();
		
	}
	
public void logOutPopup() {
	
	driver.switchTo().alert().accept();	
	LogOutPopUp.click();
		
	}
	
}
