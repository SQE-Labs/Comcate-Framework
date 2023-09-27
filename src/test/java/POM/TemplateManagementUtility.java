package POM;

import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class TemplateManagementUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public TemplateManagementUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	
	 public static String loggedUserName = "//div[@class='app-header__user-name']//label";
	    public static String templateManagementSideBarTab = "//label[text()='Template Management']";
	    public static String textTemplatesTab = "//div[@class='tab-name ']";
	    public static String createTemplateBtn = "//h2[contains(text(),'Active')]//parent::div//button";
	    public static String emailTemplatesTab = "//div[@class='tab-name ']//preceding-sibling::div";
	    public static String createTemplatePopupHeader = "//div[@class='modal-header']//h1";

	    public static String inactiveTemplate = "//h2[contains(text(),'Inactive')]";

	    public static String cancelCrtTemplate = "//button[text()='Cancel']";
	    public static String saveCrtTemplate = "//button[text()='Save']";
	    public static String templateNameTxt = "//input[@name='name']";
	    public static By TemplateNameTxt = By.xpath(templateNameTxt);
	    public static By MessageBody = By.xpath("//body[@class='mce-content-body ']");
	    public static By IncludeMagicLinkchk = By.xpath("//input[@name='MagicLinkToggle'][@type='checkbox']");
	    public static By PreviewTemplateBtn = By.xpath("//button[text()='Preview']");
	    public static By PreviewTempHeader = By.xpath("(//div[@class='modal-header'])[2]");
	    public static By PreviewTemplateBdyMesg = By.xpath("(//div[@class='modal-header'])[2]//following-sibling::div//p");
	    public static By ClosePreview = By.xpath("//button[text()='Close']");
	    public static By IframeBody = By.xpath("//iframe[@id='editor_ifr']");
	    public static String activeTooglebtn = "//button[text()='Active']";
	    public static String inactiveTooglebtn = "//button[text()='Inactive']";

	    public static String ExistingErrorTemplate = "//div[contains(text(),'Error while creating config email template')]";


	    public static By ActiveTogglebtn = By.xpath(activeTooglebtn);
	    public static By InactiveTooglebtn = By.xpath(inactiveTooglebtn);

	    public static By EmailTemplatesTab = By.xpath(emailTemplatesTab);
	    public static By CreateTemplateBtn = By.xpath(createTemplateBtn);
	    public static By TextTemplatesTab = By.xpath(textTemplatesTab);
	    public static By TemplateManagementSideBarTab = By.xpath(templateManagementSideBarTab);
	    public static By CreateTemplatePopupHeader = By.xpath(createTemplatePopupHeader);
	    public static By CancelCrtTemplate = By.xpath(cancelCrtTemplate);
	    public static By SaveCrtTemplate = By.xpath(saveCrtTemplate);
	    public static By LoggedUserName = By.xpath(loggedUserName);
	    public static By InactiveTemplate = By.xpath(inactiveTemplate);


	    public static String nameValidMsg = "";
	    public static String emailSubLineValidMsg = "";
	    public static String emailBdyValidMsg = "//label[@class='html-editor__error']";
	    public static String emailSubLineInput = "//input[@name='subject']";


	    public static By EmailBdyValidMsg = By.xpath(emailBdyValidMsg);
	    public static By EmailSubLineInput = By.xpath(emailSubLineInput);
	    
	    
	    
	    
	    public static String GetCustomXPath(int index) {
	        String xpath = "(//span[@class='field__error'])[" + index + "]";
	        return xpath;
	    }
	    
	    
	    public static By ActiveTemplates = By.xpath("//h2[contains(text(),'Active')]");

	    public static String GetInactiveTemplateXPath(int index) {
	        String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])[" + index + "]";
	        return xPath;
	    }


	    public static String GetCustomTemplateGridXPath(int index) {
	        String xPath = "(//div[@class='sortable-table__body__tr']/div)[" + index + "]";
	        return xPath;
	    }


	    public static String GetInactiveEditIconXPath(int index) {
	        String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])[" + index + "]//button";
	        return xPath;
	    }

	    public static String GetTemplateEditButtonXPath(int index) {
	        String xPath = "(//div[@class='sortable-table__body__tr']/div)[" + index + "]//button";
	        return xPath;
	    }


	    public static String GetCustomTemplateMoreLinlXPath(int index) {

	        String xPathMore = "(//div[@class='sortable-table__body__tr']/div)[" + index + "]//span//following-sibling::a[text()='more']";
	        return xPathMore;
	    }


	    public static String GetCustomTemplateLessLinlXPath(int index) {

	        String xPathLess = "(//div[@class='sortable-table__body__tr']/div)[" + index + "]//span//following-sibling::a[text()=' less']";
	        return xPathLess;
	    }


	    public static String LastUpdatedGridXPath(int index) {
	        String xPathLastUpdateBy = "(//div[@class='sortable-table__body__tr']/div)[" + index + "]//span";
	        return xPathLastUpdateBy;
	    }

	    public static String AddDocument = "//label[text()='Add Related Documents']";
	    public static String addedFiles = "//div[@class='chip__body']";
	    public static String removeFiles = "//button[@class='chip__close-button']";
	    public static By AddedFiles = By.xpath(addedFiles);
	    public static By RemoveFiles = By.xpath(removeFiles);
	    public static By EditTemplatePopHeader = By.xpath(createTemplatePopupHeader);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public static String existingTemplateName;
	    public static String expectedMsg;
	    public static String actualMsg = "Error while creating config email template";
	    public static String InactivatedTemplate;
	    public static String ActivatedTemplate;
	    public static String InactiveTemplatecount;
	    public static String InactiveTemplatecountBefore;
	    public static String InactiveTemplatecountAfter;
	    public static int actualCount;
	    public static int expectedCount;
	    public static int actualCountActive;
	    public static int expectedCountActive;
	    public static Boolean TemplateNameStatus;
	    public static String EditTemplateHeader;
	    public static String actualTemplateName;
	    public static int filescount;
	    public static String TemplateGridNameLbl;
	    public static String TemplateGridSubLine;
	    public static String TemplateGridRelatedDoc;
	    public static String TemplateGridLastUpdated;
	    public static String ActiveTemplatecount;
	    public static Boolean filesCountCheck;
	    public static String DocumentJellyFish = "Jellyfish_11zon.jpg";
	    public static String DocumentPanda = "Panda_11zon.jpg";
	    public static Boolean filesAfterCountCheck;
	    public static int filescountAf;
	    public static String emailTemplatesLabel;
	    public static String TextMessageTemplateLabel;
	    public static String CrtTemplateHeader;
	    public static Boolean ClosedCrtTemplatePopup;
	    public static String ActualNameValidMsg;
	    public static String ActualEmailSubLineValidMsg;
	    public static String ActualEmailBdyValidMsg;
	    public static String EmailSubLnMsg;
	    public static String templateName;
	    public static String rndSubLine;
	    public static String TemplateMessgae;
	    public static String ActualpreviewTempData;
	    public static String ExpectedpreviewTemplateData;
	    public static String ActualpreviewTempHeader;
	    public static String LoggedUser;


	    public static String ExpectedpreviewTemplateHeader = "Preview Email Template";
	    public static String ExpectedNameValidMsg = "The Name is required.";
	    public static String ExpectedEmailSubLineValidMsg = "Min 1 and Max 150 characters limit.";
	    public static String ExpectedEmailBdyValidMsg = "The Email Body is required.";
	    public static String ExpectedemailTemplatesLabel = "Email Templates";
	    public static String ExpectedTextMessageTemplateLabel = "Text Message Templates";
	    public static String ExpectedCrtTemplateHeader = "Create Template";
}
