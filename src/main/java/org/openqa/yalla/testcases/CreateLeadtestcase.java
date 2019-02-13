

package org.openqa.yalla.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadtestcase extends Annotations{

	@Test(dataProvider="Createleaddata")
	public void create(String cname,String name,String lname) {
		click(locateElement("linktext", "Leads")); 
		click(locateElement("linktext", "Create Lead")); 
		clearAndType(locateElement("id", "createLeadForm_companyName"), cname);
		clearAndType(locateElement("id", "createLeadForm_firstName"), name);
		clearAndType(locateElement("id", "createLeadForm_lastName"), lname);
		click(locateElement("class", "smallSubmit"));
	}
	
	@DataProvider(name="Createleaddata")
	
	public Object[][] senddata() {
		
		 Object[][] data = new Object[2][3];
		 
		 data[0][0] = "TCS";
		 data[0][1] = "Jinesh";
		 data[0][2] = "J";
		 
		 data[1][0] = "TCS";
		 data[1][1] = "Bharathi";
		 data[1][2] = "J";
		 
		return data;
		
	}
}