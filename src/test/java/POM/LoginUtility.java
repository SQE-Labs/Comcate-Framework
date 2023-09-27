package POM;
import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import TestCases.CaseAssignment;
import BrowsersBase.BrowsersInvoked;


public class LoginUtility extends Helper{
	
	
  
	public WebDriver driver ;
	
	
	 static String Username = "okta-signin-username";
	 static String Password = "okta-signin-password";
	 static String Button = "okta-signin-submit";
	 static String agencyLoggedInUsername = "//div[@class='app-header__user-name']/label";
	 static String adminUsername = "//input[@placeholder='Enter Email']";
	 static String adminPassword = "//input[@placeholder='Enter Password']";
	 static String adminButton = "//button[text()='Login']";
	 static String searchAgency = "//span[@class='agencies-listing__search']/input";
	 static String enterAgencyIcon = "//div[@class='agencies-listing__agency-actions']/button[1]";
	 static String plusIconToCECRM = "//*[@class='app-header__new']";
	
	
	
	 By UsernameField = By.id(LoginUtility.Username);
     By NextButton = By.id("idp-discovery-submit");
     By OKTAUsernameField = By.id("idp-discovery-username");
     By OKTAPasswordField = By.id("okta-signin-password");
     By OKTASubmitButton = By.id("okta-signin-submit");
     By PasswordField = By.id(LoginUtility.Password);
     By SubmitButton = By.id(LoginUtility.Button);
     By AdminUsername = By.xpath(LoginUtility.adminUsername);
     By AdminPassword = By.xpath(LoginUtility.adminPassword);
     By AdminButton = By.xpath(LoginUtility.adminButton);
     By SearchAgency = By.xpath(LoginUtility.searchAgency);
     By EnterAgencyIcon = By.xpath(LoginUtility.enterAgencyIcon);
     By AgencyLoggedInUsername = By.xpath(LoginUtility.agencyLoggedInUsername);
     By PlusIconToCECRM = By.xpath(LoginUtility.plusIconToCECRM);
    

    static String AgencyLoggedInUserName;
     public BrowsersInvoked browsersInvoked ;
	
	public LoginUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		browsersInvoked = new BrowsersInvoked();
		
		
	}
	
	 public void LoginAgency() throws InterruptedException {
		 try {
	            driver.navigate().to(BrowsersInvoked.AgencyURL);
	            WaitForPageLoadTime(4);
	            if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("STAGE")) {
	                WaitUntilVisible(OKTAUsernameField);
	                WaitForElementInteractable(OKTAUsernameField);
	                SendKeys(OKTAUsernameField, BrowsersInvoked.AgencyUsername);
	                ClickOn(NextButton);
	                SendKeys(OKTAPasswordField, BrowsersInvoked.AgencyPassword);
	                WaitUntilVisible(OKTASubmitButton);
	                ClickOn(OKTASubmitButton);
	            } else {
	                WaitUntilVisible(UsernameField);
	                WaitForElementInteractable(UsernameField);
	                SendKeys(UsernameField, BrowsersInvoked.AgencyUsername);
	                SendKeys(PasswordField, BrowsersInvoked.AgencyPassword);
	                WaitUntilVisible(SubmitButton);
	                ClickOn(SubmitButton);
	            }
	            WaitForCurserRunning(12);
	            int checkele =  driver.findElements(By.xpath("//h1[contains(text(),'Wait while we redirect you to your agency')]")).size();
	            if(checkele > 0){
	                WebElement ele = driver.findElement(By.xpath("//h1[contains(text(),'Wait while we redirect you to your agency')]"));
	                WaitForElementInvisiblilty(ele);
	                WaitForElementInvisiblilty(ele);
	            }
	            WaitUntilVisible(PlusIconToCECRM);
	            WaitForElementInteractable(PlusIconToCECRM);
	            WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
	            if (CPPBtn.isDisplayed() == false) {
	            	SoftAssert Assert = new SoftAssert();
	                Assert.assertEquals(false, true);
	            }
	            AgencyLoggedInUserName = GetText(AgencyLoggedInUsername);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	    }

	    
	    public  void LoginAdmin() {
	        try {
	            driver.navigate().to(BrowsersInvoked.AdminURL);

	            SendKeys(AdminUsername, BrowsersInvoked.AdminUsername);

	            SendKeys(AdminPassword, BrowsersInvoked.AdminPassword);
	            ClickOn(AdminButton);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

}
