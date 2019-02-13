
	package org.openqa.yalla.testcases;

	import org.testng.annotations.Test;

	public class Deletelead extends Annotations{

		@Test(dependsOnMethods="org.openqa.yalla.testcases.Editlead.edit")
		public void delete() {
			/*startApp("chrome", "http://leaftaps.com/opentaps/");
			WebElement eleUsername = locateElement("id", "username");
			clearAndType(eleUsername, "DemoSalesManager");
			WebElement elePassword = locateElement("id", "password");
	        clearAndType(locateElement("id", "password"), "crmsfa");       
	        click(locateElement("class", "decorativeSubmit"));
	        click(locateElement("linktext","CRM/SFA"));*/
			
	        click(locateElement("linktext","Leads"));
	        click(locateElement("xpath","//a[text()='Find Leads']"));
	        clearAndType(locateElement("xpath","(//input[@name='firstName'])[3]"),"Jinesh");
	        click(locateElement("xpath","//button[text()='Find Leads']"));
	        click(locateElement("linktext","Jinesh"));
	       // click(locateElement("xpath","//a[text()='Jinesh']"));
	        click(locateElement("linktext","Delete"));
	        

}
	}
