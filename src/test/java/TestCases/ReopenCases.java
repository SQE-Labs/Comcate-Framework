package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import ExtentReport.ExtentReportClass;
import POM.ReopenCasesUtility;

public class ReopenCases extends BrowsersInvoked{
	
	public WebDriver driver;
	ExtentReportClass extentClass;
	ITestResult result;
	ReopenCasesUtility reopenCase;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		extentClass = new ExtentReportClass(driver);
		reopenCase = new ReopenCasesUtility(driver);
	}
	
//	@AfterClass
//	public void closeDriver() {
//		BrowsersInvoked.tearDown(driver);
//	}
//	
	@AfterMethod
	public void flushReport(Method method, ITestResult result) {
		Test test = method.getAnnotation(Test.class);
		ExtentReportClass.extentTest = ExtentReportClass.extent.startTest(method.getName());
		ExtentReportClass.extentTest.setDescription(test.description());
		try {
			extentClass.tearDown(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		reopenCase.LoginAgency();

	}
	
	@Test(priority = 1)
	public void ReopenCase_OpenReopenCasePopup() throws InterruptedException {
		reopenCase.ReopenCase_PreRequisite();
		reopenCase.ReopenCase_OpenReopenCasePopup();
	}
	
	@Test(priority = 2)
	public void ReopenCase_VerifyViolationsFromCDP() throws InterruptedException{
		reopenCase.ReopenCase_VerifyViolationsFromCDP();
	}
	
	@Test(priority = 3)
	public void ReopenCase_NonCompliantViolationIsRequired() throws InterruptedException{
		reopenCase.ReopenCase_NonCompliantViolationIsRequired();
	}
	
	@Test(priority = 4)
	public void ReopenCase_CaseDoesNotReopenOnCancel() throws InterruptedException{
		reopenCase.ReopenCase_CaseDoesNotReopenOnCancel();
	}
	
	@Test(priority = 5)
	public void ReopenCase_VerifyCaseReopened() throws InterruptedException{
		reopenCase.ReopenCase_VerifyCaseReopened();
	}
	
	@Test(priority = 6)
	public void ReopenCase_VerifyCaseReopenedDetails() throws InterruptedException{
		reopenCase.ReopenCase_VerifyCaseReopenedDetails();
	}
}
