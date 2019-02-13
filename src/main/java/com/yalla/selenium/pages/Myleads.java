package com.yalla.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.yalla.testcases.Annotations;

public class Myleads extends Annotations{
	
public Myleads() {
		
		PageFactory.initElements(driver, this);
	}
@FindBy(how=How.LINK_TEXT,using="Create Lead") WebElement eleCreatelead;
@FindBy(how=How.LINK_TEXT,using="Find Lead") WebElement eleFindlead;
@FindBy(how=How.LINK_TEXT,using="Merge Lead") WebElement eleMergelead;


public CreateLead clickCreateLead() {
	
	
	click(eleCreatelead);
	
	return new CreateLead();	
	
}

public FindLead clickFindLead() {
	
	
	click(eleFindlead);
	
	return new FindLead();	
	
}
public MergeLead clickMergeLead() {
	
	
	click(eleMergelead);
	
	return new MergeLead();	
	
}


	
	

}
