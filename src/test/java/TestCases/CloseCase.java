package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import ExtentReport.ExtentReportClass;
import POM.CCPUtility;
import POM.CLPUtility;
import POM.CaseAssignmentUtility;
import POM.CloseCaseUtility;
import POM.ForcedAbatementUtility;
import POM.PerformInspectionUtility;
import POM.ReopenCasesUtility;

public class CloseCase extends BrowsersInvoked{
	
	protected WebDriver driver;
	CloseCaseUtility obj ;
	ExtentReportClass extentClass;
	ITestResult result;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		obj = new CloseCaseUtility(driver);
		extentClass = new ExtentReportClass(driver);
		
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
	
	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
	
	
	@Test(priority =0)
	public void LoginAgency() throws InterruptedException {
		obj.LoginAgency();

	}
	
	
	@Test(priority =1)
	public void CloseCase_PreRequisite() throws InterruptedException {
		obj.CloseCase_PreRequisite();

	}

	
	
	@Test(priority =2)
	public void CloseCase_OpenCloseCasePopup() throws InterruptedException {

		obj.CloseCase_OpenCloseCasePopup();

	}

	
	
	@Test(priority =3)
	public void CloseCase_CloseCloseCasePopup() throws InterruptedException {

		obj.CloseCase_CloseCloseCasePopup();

	}

	
	@Test(priority =4)
	public void CloseCase_VerifyVoluntaryToggleBtnState() throws InterruptedException {

		obj.CloseCase_VerifyVoluntaryToggleBtnState();

	}
	
	
	@Test(priority =5)
	public void CloseCase_SelectForcedToggleBtn() throws InterruptedException {
		obj.CloseCase_SelectForcedToggleBtn();
	}

	
	
	@Test(priority =6)
	public void CloseCase_VerifyClosedStatus() throws InterruptedException {

		obj.CloseCase_VerifyClosedStatus();

	}
	
	
	@Test(priority =7)
	public void CloseCase_PreRequisiteCaseCreationForCloseCase() throws InterruptedException {
		obj.CloseCase_PreRequisiteCaseCreationForCloseCase();
	}

	

	@Test(priority =8)
	public void CloseCase_ConfirmationPopupForCloseCaseInvalidViolations() throws InterruptedException {

		obj.CloseCase_ConfirmationPopupForCloseCaseInvalidViolations();

	}

	
	@Test(priority =9)
	public void CloseCase_CloseConfirmationPopupForCloseCase() throws InterruptedException {

		obj.CloseCase_CloseConfirmationPopupForCloseCase();

	}

	@Test(priority =10)
	public void CloseCase_VerifyClosedStatusViaPerformInspection() throws InterruptedException {

		obj.CloseCase_VerifyClosedStatusViaPerformInspection();
	}

		
	@Test(priority = 11)
	public void CloseCase_CloseCasewithValidViolations() throws InterruptedException {

		obj.CloseCase_CloseCasewithValidViolations();

	}
	

}
