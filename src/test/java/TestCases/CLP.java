package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import CommonMethods.CheckDownloadedFile;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import ExtentReport.ExtentReportClass;
import POM.CCPUtility;
import POM.CLPUtility;
import POM.CaseAssignmentUtility;

public class CLP extends BrowsersInvoked{
	
	protected WebDriver driver;
	CLPUtility obj ;
	ExtentReportClass extentClass;
	ITestResult result;
	
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		obj = new CLPUtility(driver);
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
	
	
	
	
	@Test(priority = 0)
	public void LoginTest() throws InterruptedException {
		obj.LoginAgency();
	}
	

	@Test(priority = 1)
	public  void CLP_VerifyCLPOpensUp() throws InterruptedException {
		
		obj.CLP_VerifyCLPOpensUp();
	}

	@Test(priority = 2)
	public  void CLP_VerifyDefaultColumns() throws InterruptedException {
		obj.CLP_VerifyDefaultColumns();

	}

	@Test(priority = 3)
	public  void CLP_VerifyNavigationToNextPage() throws InterruptedException {
		
	
		obj.CLP_VerifyNavigationToNextPage();

	}

	@Test(priority = 4)
	public  void CLP_VerifynavigationToSpecificPage() throws InterruptedException {
		
		obj.CLP_VerifynavigationToSpecificPage();

	}

	public  ArrayList<Integer> IDArray = new ArrayList<Integer>();

	@Test(priority = 5)
	public  void CLP_VerifyDescendingOrderOfCases() throws InterruptedException {
		
		obj.CLP_VerifyDescendingOrderOfCases();
	}

	@Test(priority = 6)
	public  void CLP_VerifyAscendingOrderOfCases() throws InterruptedException {
		
		obj.CLP_VerifyAscendingOrderOfCases();

	}

	@Test(priority = 7)
	public  void CLP_OpenDeleteCasePopup() throws InterruptedException {
		
		obj.CLP_OpenDeleteCasePopup();

	}

	@Test(priority = 8)
	public  void CLP_ValidationMsgForDeleteCase() throws InterruptedException {
		
		obj.CLP_ValidationMsgForDeleteCase();

	}

	@Test(priority = 9)
	public  void CLP_VerifyDeletedcase() throws InterruptedException {
		
		obj.CLP_VerifyDeletedcase();

	}

	@Test(priority = 10)
	public  void CLP_VerifyCasesForDoNotDeleteOption() {
		
		obj.CLP_VerifyCasesForDoNotDeleteOption();

	}

	@Test(priority = 11)
	public  void CLP_VerifyTotalCountOfCases() throws InterruptedException {
		
		obj.CLP_VerifyTotalCountOfCases();

	}

	@Test(priority = 12)
	public  void CLP_VerifyPrimaryFilters() throws InterruptedException {
		
		obj.CLP_VerifyPrimaryFilters();

	}

	@Test(priority = 13)
	public  void CLP_VerifyApplicationOfPrimaryFilters() throws InterruptedException {
		
		obj.CLP_VerifyApplicationOfPrimaryFilters();
		
	}

	@Test(priority = 14)
	public  void CLP_VerifyClearAllFiltersLinkText() throws InterruptedException {
		
		obj.CLP_VerifyClearAllFiltersLinkText();

	}

	@Test(priority = 15)
	public  void CLP_VerifyClearAllFiltersLinkNotPresent() throws InterruptedException {

		
		obj.CLP_VerifyClearAllFiltersLinkNotPresent();

	}

	@Test(priority = 16)
	public  void CLP_VerifySelectionOfSecondaryFilters() throws InterruptedException {
		
		obj.CLP_VerifySelectionOfSecondaryFilters();

	}

	@Test(priority = 17)
	public  void CLP_VerifyPresenceOfSecondaryFiltersUnderPrimaryFilters() throws InterruptedException {
		
		obj.CLP_VerifyPresenceOfSecondaryFiltersUnderPrimaryFilters();

	}

	@Test(priority = 18)
	public  void CLP_VerifyApplicationOfsecondaryFilters() throws InterruptedException {
		
		obj.CLP_VerifyApplicationOfsecondaryFilters();

	}

	@Test(priority = 19)
	public  void CLP_VerifyRemovalOfSecondaryFilters() throws InterruptedException {
		
		obj.CLP_VerifyRemovalOfSecondaryFilters();

	}

	@Test(priority = 20)
	public  void CLP_VerifySearchField() throws InterruptedException {
		
		obj.CLP_VerifySearchField();

	}

	@Test(priority = 21)
	public  void CLP_VerifyInfoMsgForNoSearchResults() throws InterruptedException {
		
		obj.CLP_VerifyInfoMsgForNoSearchResults();

	}

	@Test(priority = 22)
	public  void CLP_VerifyAdditionOfColumns() throws InterruptedException {
		
		obj.CLP_VerifyAdditionOfColumns();
	}

	@Test(priority = 23)
	public  void CLP_VerifyRestorationOfCheckedBoxes() throws InterruptedException {
		
		obj.CLP_VerifyRestorationOfCheckedBoxes();

	}

	@Test(priority = 24)
	public  void CLP_VerifyAddedColumnsAfterRestoreDefaultsLink() throws InterruptedException {
		
		obj.CLP_VerifyAddedColumnsAfterRestoreDefaultsLink();

	}

	@Test(priority = 25)
	public  void CLP_OpenSaveAsPopup() throws InterruptedException {
		
		obj.CLP_OpenSaveAsPopup();

	}

	@Test(priority = 26)
	public  void CLP_VerifyValidationMessageForSaveBtn() throws InterruptedException {
		
		obj.CLP_VerifyValidationMessageForSaveBtn();

	}

	@Test(priority = 27)
	public  void CLP_VerifySavedFilter() throws InterruptedException {
		
		obj.CLP_VerifySavedFilter();

	}

	@Test(priority = 28)
	public  void CLP_VerifyDeletionOfSavedFilter() throws InterruptedException {
		
		obj.CLP_VerifyDeletionOfSavedFilter();

	}

	@Test(priority = 29)
	public  void CLP_OpenCCPFromCreateCaseBtn() throws InterruptedException {
		obj.CLP_OpenCCPFromCreateCaseBtn();

	}

	@Test(priority = 30)
	public  void CLP_VerifyCSVFileDownloaded() throws InterruptedException {
		obj.CLP_VerifyCSVFileDownloaded();

	}

	@Test(priority = 31)
	public  void CLP_VerifyDirectionToCDP() throws InterruptedException {
		obj.CLP_VerifyDirectionToCDP();

	}

	@Test(priority = 32)
	public  void CLP_VerifyDirectionToCLPPreview() throws InterruptedException {
		obj.CLP_VerifyDirectionToCLPPreview();
		
	}

	@Test(priority = 33)
	public void CLP_VerifyMineButtonApplication() throws InterruptedException {

		obj.CLP_VerifyMineButtonApplication();

	}
	
	
}
