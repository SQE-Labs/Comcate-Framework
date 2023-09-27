package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.lang.reflect.Method;

import CommonMethods.PropertiesUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BrowsersBase.BrowsersInvoked;

public class ExtentReportClass {

    public static ExtentReports extent;
    public static ExtentTest extentTest;
    public WebDriver driver;
    

    public ExtentReportClass(WebDriver driver) {
		this.driver = driver;
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReportResult.html", false);
        extent.addSystemInfo("Environment", PropertiesUtils.getPropertyValue("RunEnvironment"));
        extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
	}
 
    @AfterSuite
    public void endReport() {
        extent.flush();
        extent.close();
    }
    
   
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
            extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
            String screenshotPath = ExtentReportClass.getScreenshot(driver, result.getName());
            extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
        }
        extent.endTest(extentTest);
        extent.flush();
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        Long l = Calendar.getInstance().getTimeInMillis();
        String screenshotId = l.toString();
        String Path = System.getProperty("user.dir") + "/ExtentReports/";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String imgPath = Path + screenshotId + ".png";
        File dest = new File(imgPath);
        try {
            FileUtils.copyFile(screenshot, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String ImagePath = "../ExtentReports/" + screenshotId + ".png";
        return ImagePath;
    }

	
}
