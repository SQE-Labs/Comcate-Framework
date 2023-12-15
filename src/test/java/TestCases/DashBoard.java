package TestCases;
import BrowsersBase.BrowsersInvoked;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import ExtentReport.ExtentReportClass;
import POM.DashBoardUtility;

public class DashBoard extends BrowsersInvoked{
	
	protected WebDriver driver;
	DashBoardUtility obj ;
	ExtentReportClass extentClass;
	ITestResult result;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		obj = new DashBoardUtility(driver);
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
	

	
	
	@Test(priority = 0)
	public void LoginTest() throws InterruptedException {
		obj.LoginAgency();
	}
	
	
	
	  @Test(priority = 1)
	 public  void TC_Dashboard_ViewAllStaffDashboard() throws InterruptedException {
	        
		  obj.TC_Dashboard_ViewAllStaffDashboard();
	      

	    }

	  @Test(priority = 2)
	    public  void TC_Dashboard_ViewMeDashboard() throws InterruptedException {
	        
	       obj.TC_Dashboard_ViewMeDashboard();

	    }

	   
	  @Test(priority = 3)
	    public  void TC_Dashboard_OpenCasesAssignedToMeLink() throws  InterruptedException{
	       
	       obj.TC_Dashboard_OpenCasesAssignedToMeLink();
	    }

	    @Test(priority = 4)
	    public  void TC_Dashboard_OpenCasesForMyAgencyLink() {
	        
	        obj.TC_Dashboard_OpenCasesForMyAgencyLink();
	    }

	   
	    @Test(priority = 5)
	    public  void TC_Dashboard_OverdueInspectionsLink() {
	       obj.TC_Dashboard_OverdueInspectionsLink();
	       
	    }

	  
	    @Test(priority = 6)
	    public  void TC_Dashboard_InspectionsDueTodayLink() {
	      obj.TC_Dashboard_InspectionsDueTodayLink();
	       
	    }

	   
	    @Test(priority = 7)
	    public  void TC_Dashboard_TotalInspectionsLink() {
	      obj.TC_Dashboard_TotalInspectionsLink();
	   
	    }

	   
	    @Test(priority = 8)
	    public  void TC_Dashboard_AllStaff_OpenCasesForMyAgency() throws InterruptedException {
	        obj.TC_Dashboard_AllStaff_OpenCasesForMyAgency();
	    }

	    
	    @Test(priority = 9)
	    public  void TC_Dashboard_TotalcasesForMyAgencyLink() {
	       
	      obj.TC_Dashboard_TotalcasesForMyAgencyLink();
	    }

	   
	    @Test(priority = 10)
	    public  void TC_Dashboard_AllStaff_OverdueInspections() {
	        
	        obj.TC_Dashboard_AllStaff_OverdueInspections();
	    }

	    @Test(priority = 11)
	    public void TC_Dashboard_AllStaff_InspectionsDueToday() {
	       obj.TC_Dashboard_AllStaff_InspectionsDueToday();
	        
	    }

	   
	    @Test(priority = 12)
	    public  void TC_Dashboard_AllStaff_TotalInspectionsLink() {
	       
	       obj.TC_Dashboard_AllStaff_TotalInspectionsLink();
	    }

	  
	    @Test(priority = 13)
	    public  void TC_Dashboard_OpenTotalInspectionPopup() {
	       
	        obj.TC_Dashboard_OpenTotalInspectionPopup();
	      
	    }

	   
	    @Test(priority = 14)
	    public  void TC_Dashboard_CompareCountOfCasesWithCLP() throws InterruptedException {
	        
	       obj.TC_Dashboard_CompareCountOfCasesWithCLP();
	    }

	   
	    @Test(priority = 15)
	    public void TC_Dashboard_OpenPrintQueuePopup() throws InterruptedException {
	       
	    	obj.TC_Dashboard_OpenPrintQueuePopup();
	        
	      

	    }
	
	
	
}
