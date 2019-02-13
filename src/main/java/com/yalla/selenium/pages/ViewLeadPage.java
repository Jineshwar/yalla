package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.yalla.testcases.Annotations;

public class ViewLeadPage extends Annotations {
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id ="viewLead_firstName_sp") WebElement verifyEle;

	public ViewLeadPage verifyFirstName(String expText) {


		verifyExactText(verifyEle, expText);
		return this;
	}
	


}
