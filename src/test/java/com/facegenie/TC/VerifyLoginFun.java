package com.facegenie.TC;

import org.testng.annotations.Test;

import com.facegenie.POM.LoginPage;

public class VerifyLoginFun extends TestBaseClass {
	@Test
	public void loginFun() {
		LoginPage  l= new LoginPage(driver);
		l.interEmailID();
		l.interPassword();
		l.loginButton();
		
		
	}

}
