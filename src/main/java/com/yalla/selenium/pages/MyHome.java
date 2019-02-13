package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.yalla.testcases.Annotations;

public class MyHome extends Annotations {
	
public MyHome() {
		
		PageFactory.initElements(driver, this);
	}


@FindBy(how=How.LINK_TEXT,using="Leads") WebElement eleleads;


public Myleads clickLeads() {
	
	
	click(eleleads);
	return new Myleads();
	
	
	
	
}
	

}
