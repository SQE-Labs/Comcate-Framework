package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import ExtentReport.ExtentReportClass;
import POM.NoticesUtility;

public class Notices extends BrowsersInvoked{
	
	private WebDriver driver;
	ExtentReportClass extentClass;
	ITestResult result;
	NoticesUtility notice;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		extentClass = new ExtentReportClass(driver);
		notice = new NoticesUtility(driver);
	}
	
	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
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
		notice.LoginAgency();

	}
	
	@Test(priority = 1)
    public void Notices_OpenCreateNonHtmlNoticePopup() throws InterruptedException {
    	notice.Notices_PreRequisite();
    	notice.Notices_OpenCreateNonHtmlNoticePopup(); 
    }
	
	@Test(priority = 2)
	public void Notices_CreateNonHTMLNotice() throws InterruptedException {
    	notice.Notices_CreateNonHTMLNotice();
    }
	
	@Test(priority = 3)
	public void Notices_OpenCreateHtmlNoticePopup() throws InterruptedException {
    	notice.Notices_OpenCreateHtmlNoticePopup();
    }
	
	@Test(priority = 4)
	public void Notices_OpenAddMergeFieldsPopup() throws InterruptedException {
    	notice.Notices_OpenAddMergeFieldsPopup();
    }
    
	@Test(priority = 5)
	public void Notices_ApplyCategoryOnMergeFields() throws InterruptedException {
    	notice.Notices_ApplyCategoryOnMergeFields();
    }
	
	@Test(priority = 6)
	public void Notices_VerifyMergeFieldsOnHtmleditor() throws InterruptedException {
    	notice.Notices_VerifyMergeFieldsOnHtmleditor();
    }
	
	@Test(priority = 7)
	public void Notices_VerifyPreviewPopup() throws InterruptedException {
    	notice.Notices_VerifyPreviewPopup();
    }

	@Test(priority = 8)
	public void Notices_CreateHtmlCaseNotice() throws InterruptedException {
    	notice.Notices_CreateHtmlCaseNotice();
    }
	
	@Test(priority = 9)
	public void Notices_CreateFADocumentHtmlNotice() throws InterruptedException {
    	notice.Notices_CreateFADocumentHtmlNotice();
    }
    
	@Test(priority = 10)
	public void Notices_VerifyEditNotices() throws InterruptedException {
    	notice.Notices_VerifyEditNotices();
    }
	
	@Test(priority = 11)
	public void Notices_VerifyCountOfNotices() throws InterruptedException {
    	notice.Notices_VerifyCountOfNotices();
    }
	
	@Test(priority = 12)
	public void Notices_VerifyAutoPopulationOfNotices() throws InterruptedException {
    	notice.Notices_VerifyAutoPopulationOfNotices();
    }
	

}
