package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import ExtentReport.ExtentReportClass;
import POM.CDP_Utility;
import POM.CSLPUtility;
import POM.NoticesUtility;

public class CDP extends BrowsersInvoked{
	
	public WebDriver driver;
	ExtentReportClass extentClass;
	ITestResult result;
	CDP_Utility cdp;
	CSLPUtility cslp;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		extentClass = new ExtentReportClass(driver);
		cdp = new CDP_Utility(driver);
	}
	
//	@AfterClass
//	public void closeDriver() {
//		BrowsersInvoked.tearDown(driver);
//	}
	
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
	public void LoginTest() throws InterruptedException {
		cdp.LoginAgency();
	}
	 @Test(priority = 1)
	    public void CDP_CaseDetailPagePreRequisite() throws InterruptedException{
	        
	        
	        
	        cdp.CDP_CaseDetailPagePreRequisite();
	        

	    }

	    @Test(priority = 2)
	    public void CDP_UserAbleToChangeAssignee() throws InterruptedException{
	       
	        cdp.CDP_UserAbleToChangeAssignee();
	        

	    }


	    @Test(priority = 3)
	    public void CDP_VerifyUserDirectedToTimeTracking() throws InterruptedException{
	        cdp.CDP_VerifyUserDirectedToTimeTracking();
	        

	    }


	    @Test(priority = 4)
	    public void CDP_VerifyUserAbleToAddTimeLogOnTimeTracking() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbleToAddTimeLogOnTimeTracking();
	       

	    }

	    @Test(priority = 5)
	    public void CDP_VerifyUserAbleToDeleteAddedLogTime() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbleToDeleteAddedLogTime();
	        

	    }

	    @Test(priority = 6)
	    public void CDP_VerifyAbatementActivityTile() throws InterruptedException{
	    	cdp.CDP_VerifyAbatementActivityTile();
	        

	    }

	    @Test(priority = 7)
	    public void CDP_VerifyUserAbletoEditContact() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoEditContact();
	      

	    }

	    @Test(priority = 8)
	    public void CDP_VerifyUserAbletoDeleteContact() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoDeleteContact();
	       

	    }


	    @Test(priority = 9)
	    public void CDP_VerifyUserAbletoAddNewContact() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoAddNewContact();
	        
	    }


//	    @Test(priority = 10)
//	    public void CDP_VerifyUserAbletoSelectetheContactAsBilltoContact() throws InterruptedException{
//	    	cdp.CDP_VerifyUserAbletoSelectetheContactAsBilltoContact();
//	    }
//
//	    @Test(priority = 11)
//	    public void CDP_VerifyUserAbletoUpdateCustomeTileFields() throws InterruptedException{
//	    	cdp.CDP_VerifyUserAbletoUpdateCustomeTileFields();
//	       
//
//	    }


	    @Test(priority = 12)
	    public void CDP_VerifyUserAbletoAddMultipleAttachment() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoAddMultipleAttachment();

	    }

	    @Test(priority = 13)
	    public void CDP_VerifyUserAbletoDeleteAttachment() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoDeleteAttachment();

	    }


	    @Test(priority = 14)
	    public void CDP_VerifyUserAblePrintSelectedAttatchment() throws InterruptedException{
	    	cdp.CDP_VerifyUserAblePrintSelectedAttatchment();

	    }

	    @Test(priority = 15)
	    public void CDP_VerifyUserAbleDownloadSelectedAttatchment() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbleDownloadSelectedAttatchment();

	    }

	    @Test(priority = 16)
	    public void CDP_VerifyUserAbleGenerateNoticeOutsideofInspection() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbleGenerateNoticeOutsideofInspection();

	    }

	    @Test(priority = 17)
	    public void CDP_VerifyUserAbleToDeleteNotice() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbleToDeleteNotice();

	    }


	    @Test(priority = 18)
	    public void CDP_VerifyUserAbleToDeleteAndReissueNotice() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbleToDeleteAndReissueNotice();

	    }

	    @Test(priority = 19)
	    public void CDP_VerifyUserAbleApplyNoticeOutsideofInspection() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbleApplyNoticeOutsideofInspection();

	    }

	    @Test(priority = 20)
	    public void CDP_VerifyCaseHistory() throws InterruptedException{
	    	cdp.CDP_VerifyCaseHistory();
	        

	    }

	    @Test(priority = 21)
	    public void CDP_VerifyPrintCaseDetailsPage() throws InterruptedException{
	    	cdp.CDP_VerifyPrintCaseDetailsPage();
	       
	    }

	    @Test(priority = 22)
	    public void CDP_VerifyUserAbletoEditviolationsonCDP() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoEditviolationsonCDP();
	       
	    }


	    @Test(priority = 23)
	    public void CDP_VerifyAddPaymentFromFineAndPaymentDetalis() throws InterruptedException{
	    	cdp.CDP_VerifyAddPaymentFromFineAndPaymentDetalis();
	        
	    }

	    @Test(priority = 24)
	    public void CDP_VerifyOverdueFinePayment() throws InterruptedException{
	    	cdp.CDP_VerifyOverdueFinePayment();
	       
	    }


	    @Test(priority = 25)
	    public void CDP_VerifyUserAbletoMakeFineAsVoid() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoMakeFineAsVoid();
	      
	    }

	    @Test(priority = 26)
	    public void CDP_VerifyUserAbletoMakeFineAsWaive() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoMakeFineAsWaive();
	       
	    }

	    @Test(priority = 27)
	    public void CDP_VerifyUserAbletoMakePaymentAsVoid() throws InterruptedException{
	    	cdp.CDP_VerifyUserAbletoMakePaymentAsVoid();
	        
	    }


	    @Test(priority = 28)
	    public void CDP_VerifyOustandingBalWithCLP() throws InterruptedException{
	    	cdp.CDP_VerifyOustandingBalWithCLP();
	    }
	
	

}
