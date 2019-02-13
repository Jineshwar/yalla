
package org.openqa.yalla.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.yalla.base.SeleniumBase;
import org.testng.annotations.Test;

public class Createlead1 extends SeleniumBase{

	@Test(invocationCount=2)
	public void create() {
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUsername = locateElement("id", "username");
		clearAndType(eleUsername, "DemoSalesManager");
		//WebElement elePassword = locateElement("id", "password");
        clearAndType(locateElement("id", "password"), "crmsfa");       
        click(locateElement("class", "decorativeSubmit"));
        click(locateElement("linktext","CRM/SFA"));
        WebElement lead = locateElement("linktext","Create Lead");		
        click(lead);		
        WebElement companyname = locateElement("createLeadForm_companyName");		
        clearAndType(companyname, "cn");		
        WebElement firstname = locateElement("createLeadForm_firstName");		
        clearAndType(firstname, "Jinesh");			
        WebElement lastname = locateElement("createLeadForm_lastName");
        clearAndType(lastname, "war");
        WebElement firstlocal = locateElement("createLeadForm_firstNameLocal");
        clearAndType(firstlocal, "JJ");		
        WebElement lastlocal = locateElement("createLeadForm_lastName");		
        clearAndType(lastlocal, "J");
        WebElement  generalCountry= locateElement("createLeadForm_generalCountryGeoId");
        selectDropDownUsingIndex(generalCountry,2);
        WebElement submit = locateElement("class","smallSubmit");
        submit.click();
        WebElement firstName = locateElement("viewLead_firstName_sp");
        verifyExactText(firstName,"Jinesh");

        
        		
        				
        		
        		
        	
        
        
	}
	
}