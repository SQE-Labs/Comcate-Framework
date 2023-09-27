package POM;

import BrowsersBase.BrowsersInvoked;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import CommonMethods.PropertiesUtils;
import TestCases.Login;

public class CSPExternalUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CSPExternalUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	  public static String reportAnIssuePage = "//nav[@class='crm-submission__navigation-bar']/h1";
	    public static String issueDescriptionField = "//textarea[@name='description']";
	    public static String validationMsgDescription = "//span[@class='field__error']";
	    public static String nextButton = "(//button[text()='Next'])[1]";
	    public static String nextButtonSec2 = "(//button[text()='Next'])[2]";
	    public static String nextButtonSec3 = "(//button[text()='Next'])[3]";
	    public static String selectedCategory = "//div[@class='chip__wrapper active clickable']";
	    public static String otherCategories = "//div[@class='category-list-section']//div";
	    public static String showMoreLinktext = "//a[@class='show-more']";
	    public static String showMoreOnlyLinktext = "//a[@class='show-more' and text()='More']";
	    public static String submissionUpdatesCheckbox = "//input[@name='hasSubscribed']";
	    public static String noButton = "//button[text()='No']";
	    public static String yesButton = "//button[text()='Yes']";
	    public static String firstNameField = "//input[@name='firstName']";
	    public static String lastNameField = "//input[@name='lastName']";
	    public static String emailField = "//input[@name='email']";
	    public static String emailPreferenceButton = "//button[text()='Email']";
	    public static String otherField = "//input[@name='notificationNote']";
	    public static String backButton = "//button[text()='Back']";
	    public static String submitButton = "//button[text()='Submit']";
	    public static String firstNameValidation = "//input[@name='firstName']/following::span[1]";
	    public static String lastNameValidation = "//input[@name='firstName']/following::span[2]";
	    public static String successMessage = "//section[@class='crm__success-message-section']//h5";
	    public static String agencySearchField = "//span[@class='agencies-listing__search']/input";
	    public static String editAgencyIcon = "//div[@class='agencies-listing__agency-actions']/button[2]";
	    public static String cSPExternalURL = "//div[@class='agency-form__product-config']/a";
	    public static String categoryExpandedSection = "//div[@class='crm-location-section']";
	    public static String issueDescriptionTitle = "//h2[text()='Issue Description']";
	    public static String attachmentThumbnail = "//img[@class='photos-tile__saved-thumb']";
	    public static String deleteIconAttachment = "//img[@class='delete-button']";
	    public static String locationSection = "//h2[text()='Location']";
	    public static String locationSearchField = "//input[@type='text']";
	    public static String changeLocationValue = "//button[contains(text(),'Change')]";
	    public static String locationValidationMsg = "//div[@class='crm-location-field error']/following::span";
	    //public static String locationSearchResult = "//div[@class='list-label']";
	    public static String locationSearchResult = "//div[@class='list-label']//b";
	    public static String selectCategoryTitle = "//h2[text()='Select Category']";
	    public static String changeLocButton = "//button[text()='Change']";
	    public static String submitSubmissionPage = "//div[@class='crm__anonymous-toggle col']/h5";
	    //public static String emailValidationMsg = "//span[text()='Enter the details.']";
	    public static String emailValidationMsg = "//*[@name='email']/../../span";

	    public static By ReportAnIssuePage = By.xpath(reportAnIssuePage);
	    public static By IssueDescriptionField = By.xpath(issueDescriptionField);
	    public static By ValidationMsgDescription = By.xpath(validationMsgDescription);
	    public static By NextButton = By.xpath(nextButton);
	    public static By NextButtonSec2 = By.xpath(nextButtonSec2);
	    public static By NextButtonSec3 = By.xpath(nextButtonSec3);
	    public static By SelectedCategory = By.xpath(selectedCategory);
	    public static By OtherCategories = By.xpath(otherCategories);
	    public static By ShowMoreLinktext = By.xpath(showMoreLinktext);
	    public static By ShowMoreOnlyLinktext = By.xpath(showMoreOnlyLinktext);


	    public static By SubmissionUpdatesCheckbox = By.xpath(submissionUpdatesCheckbox);
	    public static By NoButton = By.xpath(noButton);
	    public static By YesButton = By.xpath(yesButton);
	    public static By FirstNameField = By.xpath(firstNameField);
	    public static By LastNameField = By.xpath(lastNameField);
	    public static By EmailField = By.xpath(emailField);
	    public static By EmailPreferenceButton = By.xpath(emailPreferenceButton);
	    public static By OtherField = By.xpath(otherField);
	    public static By BackButton = By.xpath(backButton);
	    public static By SubmitButton = By.xpath(submitButton);
	    public static By FirstNameValidation = By.xpath(firstNameValidation);
	    public static By LastNameValidation = By.xpath(lastNameValidation);
	    public static By SuccessMessage = By.xpath(successMessage);
	    public static By AgencySearchField = By.xpath(agencySearchField);
	    public static By EditAgencyIcon = By.xpath(editAgencyIcon);
	    public static By CSPExternalURL = By.xpath(cSPExternalURL);
	    public static By CategoryExpandedSection = By.xpath(categoryExpandedSection);
	    public static By IssueDescriptionTitle = By.xpath(issueDescriptionTitle);
	    public static By AttachmentThumbnail = By.xpath(attachmentThumbnail);
	    public static By DeleteIconAttachment = By.xpath(deleteIconAttachment);
	    public static By LocationSection = By.xpath(locationSection);
	    public static By LocationSearchField = By.xpath(locationSearchField);
	    public static By ChangeLoactionValue = By.xpath(changeLocationValue);
	    public static By LocationValidationMsg = By.xpath(locationValidationMsg);
	    public static By LocationSearchResult = By.xpath(locationSearchResult);
	    public static By SelectCategoryTitle = By.xpath(selectCategoryTitle);
	    public static By ChangeLocButton = By.xpath(changeLocButton);
	    public static By SubmitSubmissionPage = By.xpath(submitSubmissionPage);
	    public static By EmailValidationMsg = By.xpath(emailValidationMsg);
	    public static By TextMsgPreferenceButton = By.xpath("//button[text()='Text Message']");
	    public static By MobileNumberField = By.xpath("//input[@name='phoneNumber']");

	    public static String RASPageTitle;
	    public static String DescriptionValidation;
	    public static String ExpectedDescriptionMsg;
	    public static String Validation2000;
	    public static String Expected2000Msg;
	    public static boolean CategorySectionState;
	    public static boolean CountAttachments;
	    public static boolean CountAttachmentsAfter;
	    public static String CategorySelected;
	    public static boolean CountAllCategories;
	    public static boolean NoLocationSection;
	    public static String PageTitleSubmitSubmission;
	    public static String ExpectedTitleSubmitSubmission;
	    public static String ValidationMsgLocation;
	    public static String ExpectedMsgLoc;
	    public static String SubmitPageTitle;
	    public static String ValidMsgFirstName;
	    public static String ExpectedMsgName1;
	    public static String ValidMsgLastName;
	    public static String ExpectedMsgName2;
	    public static String LimitMsgFirstName;
	    public static String LimitMsgLastName;
	    public static String CharLimitValidation;
	    public static String EmailValidationMessage;
	    public static String ExpectedEmailMsg;
	    public static String InvalidMailMsg;
	    public static String ExpectedInvalidMsg;
	    public static String SubmissionSuccessMsg;
	    public static String ExpectedSuccessMsg;
	    public static String SubmissionSuccessMsgNA;
	    public static Boolean categoryContains = false;



	    public static String searchLocationKey1O = PropertiesUtils.getPropertyValue("searchLocationKey1O");
	    public static String searchLocationKey = PropertiesUtils.getPropertyValue("searchLocationKey");
	    
	    
	    
	    public static String AgencyNameGrid(String name) {
	        String xPath = "//div[text()='" + name + "']";
	        return xPath;
	    }
	    
	    
	    
	    
	    public  void CSPExternal_PreRequisite_OpenReportAnIssuePage() throws InterruptedException {
	       CloseOtherTabs();
	        driver.navigate().to(BrowsersInvoked.AdminURL);
	       WaitForCurserRunning(5);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        int lginCheck = driver.findElements(By.xpath("//input[@placeholder='Enter Email'][@name='email']")).size();
	        if( lginCheck > 0){
	            log.LoginAdmin();
	           WaitUntilVisible(AgencySearchField);
	        }
	        String AgencyID = Integer.toString(BrowsersInvoked.AgencyID);
	       WaitUntilVisible(AgencySearchField);
	       ScrollIntoView(AgencySearchField);
	       WaitForElementInteractable(AgencySearchField);
	       SendKeys(AgencySearchField, AgencyID);
	       WaitUntilVisible(By.xpath(AgencyNameGrid(AgencyID)));
	       ClickOn(EditAgencyIcon);
	       WaitUntilVisible(CSPExternalURL);
	       WaitForElementInteractable(CSPExternalURL);
	       ClickOn(CSPExternalURL);
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	        driver.switchTo().window((String) tabs.get(1));
	       WaitUntilVisible(ReportAnIssuePage);
	        RASPageTitle =GetText(ReportAnIssuePage);
	    }

	    
	    
	    
	    public void CSPExternal_PreRequisite_OpenReportAnIssuePageNOLogin() throws InterruptedException {
	        CloseOtherTabs();
	        WaitforCustometime(3);
	        refreshPage();
	        WaitForCurserRunning(4);
	        String AgencyID = Integer.toString(BrowsersInvoked.AgencyID);
	        WaitUntilVisible(AgencySearchField);
	        ScrollIntoView(AgencySearchField);
	        WaitForElementInteractable(AgencySearchField);
	        SendKeys(AgencySearchField, AgencyID);
	        WaitUntilVisible(By.xpath(AgencyNameGrid(AgencyID)));
	        ClickOn(EditAgencyIcon);
	        WaitUntilVisible(CSPExternalURL);
	        WaitForElementInteractable(CSPExternalURL);
	        ClickOn(CSPExternalURL);
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	        driver.switchTo().window((String) tabs.get(1));
	        WaitUntilVisible(ReportAnIssuePage);
	        RASPageTitle = GetText(ReportAnIssuePage);
	    }

}
