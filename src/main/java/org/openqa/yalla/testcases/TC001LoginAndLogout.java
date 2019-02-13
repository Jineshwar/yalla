package org.openqa.yalla.testcases;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.http.auth.AUTH;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.selenium.pages.LoginPage;

public class TC001LoginAndLogout extends Annotations {
	
	
	@BeforeTest
	public void SetData() {
		
		testcaseName="TC001LoginAndLogout";
		
		testDec ="LoginPositive";
		author="Jinesh";
		category="Smoke";
	        fileName="excel";
}
	@Test(dataProvider="exceldata")
	public void loginPositive(String username,String password) {
	
	
	new LoginPage()
	
	.enterUsername(username)
	.enterPassword(password)
	.clickLogin();
	
	}
	
	
	
}