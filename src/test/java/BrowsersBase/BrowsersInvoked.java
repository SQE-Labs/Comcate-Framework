package BrowsersBase;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import CommonMethods.PropertiesUtils;


    public class BrowsersInvoked {
    	
    	public static ExtentReports extent;
        public static ExtentTest extentTest;
    	public static String browser = PropertiesUtils.getPropertyValue("browserMain");
        public static String RunEnvironment = PropertiesUtils.getPropertyValue("RunEnvironment");
        public static String AgencyName = PropertiesUtils.getPropertyValue("AgencyName");
        public static String agencyConfig = PropertiesUtils.getPropertyValue("agencyConfig");
        public static String agencyConfigEnterprise = PropertiesUtils.getPropertyValue("agencyConfigEnterprise");
        public static String agencyConfigGisDirect1o = PropertiesUtils.getPropertyValue("agencyConfigGisDirect1o");
        public static String agencyConfigGisDirect2o = PropertiesUtils.getPropertyValue("agencyConfigGisDirect2o");
        public static String agencyConfigGisLite = PropertiesUtils.getPropertyValue("agencyConfigGisLite");
        public static int AgencyID;
        public static String Instance;
        public static String AgencyUsername;
        public static String AgencyPassword;
        public static String AdminURL;
        public static String AdminUsername;
        public static String AdminPassword;

        public static String StreetAddress;
        public static String City;
        public static String Zip;
        public static String mailReset;

        public static String CCPStreetAddress1;
        public static String CCPStreetAddress2;
        public static String CCPCity1;
        public static String CCPZip1;
        public static String CCPmailReset1;


        public static String AgencyURL;

        public static String URLCreateCase;
        public static String URLCases;
        public static String URLDashboard;
        public static String URLCasesManagement;
        public static String URLAssignmentRules;
        public static String URLUserManagement;
        public static String URLNotices;
        public static String URLCreateCustomerSubmission;
        public static String URLCategories;
        public static String URLSubmissionSettings;
        public static String URLViolations;
        public static String URLReports;
   
    
    public static WebDriver Setup()
    {    
    	 RunEnvironmentSetup();
    	 ChromeOptions options = new ChromeOptions();
         options.setBrowserVersion(PropertiesUtils.getPropertyValue("ChromeVersion"));
         options.addArguments("--remote-allow-origins=*");
         options.setPageLoadStrategy(PageLoadStrategy.NONE);
         //options.addArguments("--headless");

         WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();
//         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//         driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
//         driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);


    	 return driver;
        
            
    }
    
   
    
    public static  void RunEnvironmentSetup() {
        switch (RunEnvironment.toUpperCase()) {
            case "QA": {

                if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
                	AgencyID = 000;
                    Instance = "";
                    AgencyUsername = "";
                    AgencyPassword = "";
                    StreetAddress = "";
                    City = "";
                    Zip = "";
                    mailReset = "";

                } else if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect1o)) {

                    AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyID_QAGisDirect1O"));
                    Instance = PropertiesUtils.getPropertyValue("InstanceQA");
                    AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsername_QaGisDirect1O");
                    AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPassword_QAGisDirect1O");

                    StreetAddress = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
                    City = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
                    Zip = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
                    mailReset = PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

                    CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddressQAGISDirect1O");
                    CCPCity1 = PropertiesUtils.getPropertyValue("CityQAGISDirect1O");
                    CCPZip1 = PropertiesUtils.getPropertyValue("ZipQAGISDirect1O");
                    CCPmailReset1 = PropertiesUtils.getPropertyValue("mailResetQAGISDirect1O");
                } else if (agencyConfig.equalsIgnoreCase(agencyConfigGisLite)) {

                    AgencyID = 000;
                    Instance = "";
                    AgencyUsername = "";
                    AgencyPassword = "";
                    StreetAddress = "";
                    City = "";
                    Zip = "";
                    mailReset = "";
                } else {
                    AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyIDQA"));
                    Instance = PropertiesUtils.getPropertyValue("NewInstanceQA");
                    AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsernameQA");
                    AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPasswordQA");

                    StreetAddress = PropertiesUtils.getPropertyValue("StreetAddressQAEnterPrise");
                    City = PropertiesUtils.getPropertyValue("CityQAEnterPrise");
                    Zip = PropertiesUtils.getPropertyValue("ZipQAEnterPrise");
                    mailReset = PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");

                    CCPStreetAddress1 = PropertiesUtils.getPropertyValue("CCPStreetAddress1");
                    CCPCity1 = PropertiesUtils.getPropertyValue("CCPCity1");
                    CCPZip1 = PropertiesUtils.getPropertyValue("CCPZip1");
                    CCPmailReset1 = PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");


                }
                AdminURL = PropertiesUtils.getPropertyValue("NewAdminQA");
                AdminUsername = PropertiesUtils.getPropertyValue("AdminUsername");
                AdminPassword = PropertiesUtils.getPropertyValue("AdminPassword");
                break;
            }


            case "CI": {
                AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyIDCI"));
                Instance = PropertiesUtils.getPropertyValue("InstanceCI");
                AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsernameCI");
                AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPasswordCI");
                AdminURL = PropertiesUtils.getPropertyValue("AdminURLCI");
                AdminUsername = PropertiesUtils.getPropertyValue("AdminUsernameCI");
                AdminPassword = PropertiesUtils.getPropertyValue("AdminPasswordCI");
                break;
            }


            case "STAGE": {

                if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {

                    AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyID_StageGisDirect2O"));
                    Instance = PropertiesUtils.getPropertyValue("InstanceStage");
                    AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsername_StageGisDirect2O");
                    AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPassword_StageGisDirect2O");

                    StreetAddress = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
                    City = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
                    Zip = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
                    mailReset = PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

                    CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
                    CCPCity1 = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
                    CCPZip1 = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
                    CCPmailReset1 = PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");
                    CCPStreetAddress2 = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect_1O");
                } else if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect1o)) {


                    AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyID_StageGisDirect1O"));
                    Instance = PropertiesUtils.getPropertyValue("InstanceStage");
                    AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsername_StageGisDirect1O");
                    AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPassword_StageGisDirect1O");

                    StreetAddress = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
                    City = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
                    Zip = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
                    mailReset = PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

                    CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddress_QAGISDirect1O");
                    CCPCity1 = PropertiesUtils.getPropertyValue("City_QAGISDirect1O");
                    CCPZip1 = PropertiesUtils.getPropertyValue("Zip_QAGISDirect1O");
                    CCPmailReset1 = PropertiesUtils.getPropertyValue("mailReset_QAGISDirect1O");

                } else if (agencyConfig.equalsIgnoreCase(agencyConfigGisLite)) {

                    AgencyID = 00;
                    Instance = PropertiesUtils.getPropertyValue("InstanceStage");
                    AgencyUsername = "";
                    AgencyPassword = "";

                } else {
                    AgencyID = Integer.parseInt(PropertiesUtils.getPropertyValue("AgencyIDStage"));
                    Instance = PropertiesUtils.getPropertyValue("InstanceStage");
                    AgencyUsername = PropertiesUtils.getPropertyValue("AgencyUsernameStage");
                    AgencyPassword = PropertiesUtils.getPropertyValue("AgencyPasswordStage");

                    StreetAddress = PropertiesUtils.getPropertyValue("StreetAddressQAEnterPrise");
                    City = PropertiesUtils.getPropertyValue("CityQAEnterPrise");
                    Zip = PropertiesUtils.getPropertyValue("ZipQAEnterPrise");
                    mailReset = PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");

                    CCPStreetAddress1 = PropertiesUtils.getPropertyValue("StreetAddressQAEnterPrise");
                    CCPCity1 = PropertiesUtils.getPropertyValue("CityQAEnterPrise");
                    CCPZip1 = PropertiesUtils.getPropertyValue("ZipQAEnterPrise");
                    CCPmailReset1 = PropertiesUtils.getPropertyValue("mailResetQAEnterPrise");
                }

                AdminURL = PropertiesUtils.getPropertyValue("AdminURLStage");
                AdminUsername = PropertiesUtils.getPropertyValue("AdminUsernameStage");
                AdminPassword = PropertiesUtils.getPropertyValue("AdminPasswordStage");

                break;


            }

        }
        AgencyURL = Instance + (AgencyID) + "/login";
        URLCreateCase = Instance + (AgencyID) + "/products/cases/create";
        URLCases = Instance + (AgencyID) + "/products/cases";
        URLDashboard = Instance + (AgencyID) + "/dashboard";
        URLCasesManagement = Instance + (AgencyID) + "/setup/products/case-management";
        URLAssignmentRules = Instance + (AgencyID) + "/setup/agency/assignment-rules";
        URLUserManagement = Instance + (AgencyID) + "/setup/agency/users-management";
        URLNotices = Instance + (AgencyID) + "/setup/agency/products/notices";
        URLCreateCustomerSubmission = Instance + (AgencyID) + "/products/customer-submission/create";
        URLCategories = Instance + (AgencyID) + "/setup/products/categories";
        URLSubmissionSettings = Instance + (AgencyID) + "/setup/products/submission-settings";
        URLViolations = Instance + (AgencyID) + "/setup/products/violations";
        URLReports = Instance + (AgencyID) + "/reports";
    }
    
    
    
    
    public static void tearDown(WebDriver driver) {
    	driver.quit();
    }
    
   
   
//    @AfterSuite
//    public void endReport() {
//        extent.flush();
//        extent.close();
//    }
    
   
  
    @BeforeSuite
    public void deleteExistingReport() {
        String filePath = System.getProperty("user.dir") + "/test-output/ExtentReportResult.html";
        File fileToDelete = new File(filePath);
        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.err.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
    
    }

