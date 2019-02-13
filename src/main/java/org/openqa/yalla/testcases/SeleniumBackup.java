package org.openqa.yalla.testcases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.framework.api.Browser;
import org.openqa.framework.api.Element;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.yalla.utils.AdvanceReports;

public class SeleniumBackup extends AdvanceReports implements Browser, Element {

	RemoteWebDriver driver = null;
	int i =1;
	Select dropdown;
	@Override
	public void click(WebElement ele) {
		ele.click();
		System.out.println("The element "+ele+" clicked successfully");

	}

	@Override
	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear(WebElement ele) {
		// TODO Auto-generated method stub
   ele.clear();
	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
        System.out.println("The data "+data+" entered successfully");
        takeSnap();

	}

	@Override
	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			String text = ele.getText();
			System.out.println("The text of the element " + text + " is displayed Successfully" );
			return text;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is occurred in getText method");
			//e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(value);
   System.out.println("The dropdown selected using VisibleText "+value); 
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		try {
			 dropdown = new Select(ele);
			 
			 dropdown.selectByIndex(index);
			System.out.println("Dropdown" + ele + "with" + index + "is selected successfully");
		} 
		
		catch (IndexOutOfBoundsException e)
	{
			System.out.println("IndexOutOfBoundsException has Occured in "
					+ "selectDropDownUsingIndex method ");
		}
		
		
		catch (Exception e) {
			System.out.println("Exception is occurred in selectDropDownUsingIndex method");
			
			//e.printStackTrace();
		}
		takeSnap();

	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try {
			if ((ele.getText()).equals(expectedText)) {
				System.out.println("Text value is exactly correct");
				// value=true;
			}

			else {

				System.out.println("Text value is not exactly correct");
			}

			System.out.println("Exact text value of " + ele + "is verified successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is occurred in verifyExactText method");
			//e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		try {
			if ((ele.getAttribute(attribute)).equals(value)) {
				System.out.println("Attribute value is exactly correct");
			}

			else {

				System.out.println("Attribute value is not exactly correct");
			}

			System.out.println("Attribute" + attribute + " exact value is " + value + "is verified successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Exception is occurred in verifyExactAttribute method" +e);
			//e.printStackTrace();
		}
		return false;
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
		try {
			if ((ele.getAttribute(attribute)).contains(value)) {
				System.out.println("Attribute partial value is correct");
			}

			else {

				System.out.println("Attribute partial value is not correct");
			}

			System.out.println("Attribute" + attribute + " partial value is " + value + "is verified successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Exception is occurred in verifyPartialAttribute method " +e);
			//e.printStackTrace();
		}

	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyDisappeared(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void startApp(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startApp(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		driver.manage().window().maximize();
		driver.get(url); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The browser "+browser+" launched successfully");
		takeSnap();

	}

	@Override
	public WebElement locateElement(String locatorType, String value) {
		switch (locatorType) {
		case "id": return driver.findElementById(value);
		case "class": return driver.findElementByClassName(value);
		case "xpath": return driver.findElementByXPath(value);
		case "name":return driver.findElementByName(value);
		case "tagname":return driver.findElementByTagName(value);
		case "partiallinktext":return driver.findElementByPartialLinkText(value);
		case "linktext": return driver.findElementByLinkText(value);
		}
		System.out.println("The element with "+value+" located successfully");
		return null;
	}

	@Override
	public WebElement locateElement(String value) {
		
		try {
			System.out.println("The locator " + value + " is located Successfully");
			return driver.findElementById(value);
		}

		catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException is occurred in locateElement method ");
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is occurred in locateElement method ");
			//throw new RuntimeException();
			// e.printStackTrace();
		}
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public List<WebElement> locateElements(String type, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void switchToAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert();

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try
		{
				Alert obj = driver.switchTo().alert();
				obj.accept();
				System.out.println("Alert is accepted successfully");
		}
		catch (NoAlertPresentException e)
		{
			System.err.println("NoAlertPresentException is occurred in acceptAlert method " +e);
		}	

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			Alert obj1 = driver.switchTo().alert();
			obj1.dismiss();
			System.out.println("Alert is dismissed successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("NoAlertPresentException is occurred in dismissAlert method " +e);
		}


	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText;
		
		Alert obj2 = driver.switchTo().alert();
		alertText = obj2.getText();

		System.out.println("Alert text value is viewed successfully");
		return alertText;

	}

	@Override
	public void typeAlert(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allWindowsCount = new ArrayList<String>();

			allWindowsCount.addAll(allWindows);

			driver.switchTo().window(allWindowsCount.get(index));

			System.out.println("window with index " + index + "is loaded successfully");
		} catch (Exception e) {
			System.err.println("Exception is occurred in switchToWindow method " +e);
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		takeSnap();
	}

	@Override
	public void switchToWindow(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allWindowsCount = new ArrayList<String>();

			allWindowsCount.addAll(allWindows);

			driver.switchTo().window(allWindowsCount.get(index));

			System.out.println("window with index " + index + "is loaded successfully");
		} catch (Exception e) {
			System.err.println("Exception is occurred in switchToWindow method " +e);
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		takeSnap();

	}

	@Override
	public void switchToFrame(WebElement ele) {
		
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(ele);
			System.out.println("Frame with value " + ele + "is loaded successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Exception is occurred in switchToFrame method " +e);
			
		}
		takeSnap();

	}

	@Override
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultContent() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img" + i + ".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
     driver.close();
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
    driver.quit();
	}

}
