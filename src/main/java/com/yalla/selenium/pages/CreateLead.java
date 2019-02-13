package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.yalla.testcases.Annotations;

public class CreateLead extends Annotations {
	
public CreateLead() {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(how=How.ID,using="createLeadForm_companyName") WebElement eleCompanyName;

@FindBy(how=How.ID,using="createLeadForm_firstName") WebElement eleFirstName;

@FindBy(how=How.ID,using="createLeadForm_lastName") WebElement eleLastName;
	
@FindBy(how=How.CLASS_NAME,using="smallSubmit") WebElement eleClickcreateButtonName;

public CreateLead enterCompanyName() {
	
	clearAndType( eleCompanyName,"Cts");
	
	return this;
	
}

public CreateLead enterFirstName() {
	
	clearAndType(eleFirstName,"Jinesh");
	
	return this;
	
}
public CreateLead enterLastName() {
	
	clearAndType(eleLastName,"J");
	
	return this;
	
}


public ViewLeadPage clickcreateleadButton() {

click( eleClickcreateButtonName);

return new ViewLeadPage();

}
}
