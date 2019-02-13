package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.yalla.testcases.Annotations;

public class LoginPage extends Annotations{
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="username") private WebElement eleuname;
	@FindBy(how=How.ID,using="password") private WebElement elepassword;
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") private WebElement eleloginbutton;
	
	public LoginPage enterUsername(String username) {
		
		
		clearAndType(eleuname, username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		
		
		clearAndType(eleuname, password);
		return this;
	}
	
public HomePage clickLogin() {
		
		
		click(eleloginbutton);
		return new HomePage() ;
		
	}
	
	
	
 
	
	
	
	
	

}
