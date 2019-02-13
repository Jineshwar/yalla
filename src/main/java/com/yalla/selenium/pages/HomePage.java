package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.yalla.testcases.Annotations;

public class HomePage extends Annotations {
	
public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") private WebElement elelogoutbutton;

@FindBy(how=How.LINK_TEXT,using="CRM/SFA") private WebElement elecrmsfa;
	
  public   LoginPage clickLogout() {
	
   click(elelogoutbutton);

   return new LoginPage();
	
}
  public MyHome clickCrmsfa() {
	  
	  click(elecrmsfa);
	  
	  return new MyHome();
	  
	  
  } 
	  
	  
  }


