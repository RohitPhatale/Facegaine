package com.facegenie.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")private WebElement Email;
	@FindBy(xpath = "//input[@id='password']")private WebElement Password;
	@FindBy(xpath = "//button[normalize-space()='Log In']")private WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
		public void interEmailID() {
			
			Email.sendKeys("testbams@gmail.com");
			
		}
		
		public void interPassword() {
			
			Password.sendKeys("facegenie");
			
		}
		
		public void loginButton() {
			
			LoginButton.click();
			
		}
	

}


		
	
