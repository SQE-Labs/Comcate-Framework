package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentTest;

import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import POM.CaseAssignmentUtility;
import POM.LoginUtility;
import ExtentReport.ExtentReportClass;

public class CaseAssignment extends BrowsersInvoked{
	
	protected WebDriver driver;
	CaseAssignmentUtility obj ;
	ExtentReportClass extentClass;
	ITestResult result;
		
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		driver = BrowsersInvoked.Setup();
		obj = new CaseAssignmentUtility(driver);
		extentClass = new ExtentReportClass(driver);	 
	}
	
	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
	
	@AfterMethod
	public void flushReport(Method method ,ITestResult result) {
		Test test = method.getAnnotation(Test.class);
		ExtentReportClass.extentTest = ExtentReportClass.extent.startTest(method.getName());
		ExtentReportClass.extentTest.setDescription(test.description());
		try {
			extentClass.tearDown(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test(priority = 0,description="Login Test Case")
	public void LoginTest() throws InterruptedException {
		obj.LoginAgency();
	}

	
	@Test(priority = 1,description="")
	public void CaseAssignment_OpenEditAssignmentPopup() throws InterruptedException, IOException {
		obj.CaseAssignment_OpenEditAssignmentPopup();
	}

	
	@Test(priority = 2)
	public void CaseAssignment_EditFieldsOnEditAssignmentPopup() throws InterruptedException {
	       obj.CaseAssignment_EditFieldsOnEditAssignmentPopup();
		
	}

	
	@Test(priority = 3)
	public void CaseAssignment_NotAbleToUpdateWithoutRule() throws InterruptedException {
		obj.CaseAssignment_NotAbleToUpdateWithoutRule();
		
	}

	
	@Test(priority = 4)
	public void CaseAssignment_OpenCreateRulepopup() {
//	        extentTest = extent.startTest(" CaseAssignment_OpenCreateRulepopup ");
//	        extentTest.setDescription(" Verify that 'Create Rule' popup opens up, when user clicks the 'Add Rule' button, on 'Edit Assignment' popup. ");
//	   
		obj.CaseAssignment_OpenCreateRulepopup();
		
	}

	
	@Test(priority = 5)
	public void CaseAssignment_CreateRuleWithMultipleCriterias() throws InterruptedException {
//	        extentTest = extent.startTest(" CaseAssignment_CreateRuleWithMultipleCriterias ");
//	        extentTest.setDescription(" Verify that the created rule with one or multiple criterias, gets added under 'Rules Set' tile, on 'Edit Assignment' popup. ");

		obj.CaseAssignment_CreateRuleWithMultipleCriterias();

	}

	
	@Test(priority = 6)
	public void CaseAssignment_EditAddedRule() throws InterruptedException {
//	        extentTest = extent.startTest(" CaseAssignment_EditAddedRule ");
//	        extentTest.setDescription(" Verify that user is able to edit the added Rules under 'Rules Set' tile, on 'Edit Assignment' popup. ");

		obj.CaseAssignment_EditAddedRule();
	}

	
	@Test(priority = 7)
	public void CaseAssignment_DeleteAddedRule() {
//	        extentTest = extent.startTest(" CaseAssignment_DeleteAddedRule ");
//	        extentTest.setDescription(" Verify that user is able to delete that added Rules under 'Rules Set' tile, on 'Edit Assignment' popup. ");

		obj.CaseAssignment_DeleteAddedRule();

	}

	
	@Test(priority = 8)
	public void CaseAssignment_AssignmentRuleUnderInactiveSection() throws InterruptedException {
//	        extentTest = extent.startTest(" CaseAssignment_AssignmentRuleUnderInactiveSection ");
//	        extentTest.setDescription(" Verify that Assignment Rule appears under 'Inactive' section, when user sets 'Status' toggle button as Inactive, on 'Edit Assignment' popup. ");

		obj.CaseAssignment_AssignmentRuleUnderInactiveSection();

	}

	
	

}
