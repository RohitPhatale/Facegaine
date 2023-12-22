package com.facegenie.TC;

import org.testng.annotations.Test;

import com.facegenie.POM.HomePage;
import com.facegenie.POM.LoginPage;

public class VerifyLoginFun extends TestBaseClass {
	@Test 
	public void loginFun() {
		LoginPage  l= new LoginPage(driver);
		l.interEmailID();
		log.info("inter email id");
		l.interPassword();
		log.info("inter password");
		l.loginButton();
		log.info("clicked on login button");
		
	}
	
	
//	@Test(priority=1)
//	
//	public void logoutFun() throws InterruptedException {
//		LoginPage aa= new LoginPage(driver);
//		aa.interEmailID();
//		log.info("inter email id");
//		aa.interPassword();
//		log.info("inter password");
//		aa.loginButton();
//		log.info("clicked on login button");
//		Thread.sleep(30000);
//		
//		HomePage home = new HomePage(driver);
//		home.logOut();
//		log.info("clicked on logout button");
//	}
	

}
