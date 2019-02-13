package org.openqa.yalla.testcases;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports {
	
	public static void main(String[]args) throws IOException {
  ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
  
  ExtentReports extent = new ExtentReports();
  
  extent.attachReporter(html);
  
  ExtentTest test = extent.createTest("login", "login testcase");
  
  test.assignAuthor("Jinesh");
  
  test.assignCategory("smoke");
  
  test.pass("Username Entered", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
  
  test.pass("Password Entered");
  
  extent.flush();
  
  
  
	
	}
	
	
	
	

}
