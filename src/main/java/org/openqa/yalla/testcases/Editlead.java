
	
	package org.openqa.yalla.testcases;

	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	public class Editlead extends Annotations{

		@Test(dependsOnMethods="org.openqa.yalla.testcases.CreateLeadtestcase.create")
		public void edit() {
			/*startApp("chrome", "http://leaftaps.com/opentaps/");
			WebElement eleUsername = locateElement("id", "username");
			clearAndType(eleUsername, "DemoSalesManager");
	        clearAndType(locateElement("id", "password"), "crmsfa");       
	        click(locateElement("class", "decorativeSubmit"));
	        click(locateElement("linktext","CRM/SFA"));
	        click(locateElement("linktext","Find Leads"));
	        click(locateElement("xpath","//a[text()='10129']"));*/
	        
	        click(locateElement("linktext","Leads"));
	        click(locateElement("xpath","//a[text()='Find Leads']"));
	        clearAndType(locateElement("xpath","(//input[@name='firstName'])[3]"),"Jinesh");
	        click(locateElement("xpath","//button[text()='Find Leads']"));
	        click(locateElement("linktext","Jinesh"));
	        click(locateElement("xpath","//a[text()='Edit']"));
	        WebElement companyNameChange=locateElement("xpath","//input[@id='updateLeadForm_companyName']");
			companyNameChange.clear();
		    clearAndType(companyNameChange,"CTS");
            WebElement updateClick  = locateElement("xpath","//input[@value='Update']");
            click(updateClick);
		    WebElement confirmChangedCompName  = locateElement("xpath","//span[@id='viewLead_companyName_sp']");
			getElementText(confirmChangedCompName);
			verifyPartialText(confirmChangedCompName,"CTS");
      
	        
	
		}

}
