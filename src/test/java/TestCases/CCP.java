package TestCases;
import BrowsersBase.BrowsersInvoked;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class CCP extends BrowsersInvoked{
	
	private WebDriver driver;
	
	@BeforeClass
	public WebDriver setUp() {
		driver = BrowsersInvoked.Setup();
		System.out.print("CaseAssignment Running-----");
		return driver;
	}
	
	
	
	@Test
	public void TestCase1() throws InterruptedException {
		driver.get("https://app-stage.comcate.com/agencies/181/dashboard");
		Thread.sleep(5000);
	}
	
	
	@Test
	public void TestCase2() throws InterruptedException {
	   System.out.println("CaseAssignment Running-----   "+ driver.getCurrentUrl());
	}
	
	@Test
	public void TestCase3() throws InterruptedException {
	   System.out.println("CaseAssignment Running-----  " + driver.getTitle());
	}
	
	
	
	@AfterClass
	public void closeDriver() {
		System.out.print("CaseAssignment Close Driver-----");
		BrowsersInvoked.tearDown(driver);
	}

}
