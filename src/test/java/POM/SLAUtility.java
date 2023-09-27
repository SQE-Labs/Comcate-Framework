package POM;

import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class SLAUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public SLAUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	
	 public static String sLASideBar = "//label[text()='SLA']";
	    public static String sLAName = "//input[@name='label']";
	    public static String sLADescription = "//input[@name='description']";
	    public static String sLaHeaderLabel = "//div[text()='SLA']";
	    public static String createSLABtn = "//button[text()='Create SLA']";
	    public static String crtSLAHeaderPopup = "//div[@class='modal-header']//h1[text()='Create SLA']";
	    public static String crtSLACancel = "//div[@class='modal-header']//button[text()='Cancel']";
	    public static String crtSLACreateSLA = "//div[@class='modal-header']//button[text()='Create SLA']";
	    public static String editSLASave = "//div[@class='modal-header']//button[text()='Save']";
	    public static String crtSLANameValid = "(//span[@class='field__error'])[1]";
	    public static String crtSLAGlobalValid = "(//div[@class='modal-body']/div)[1]";
	    public static String crtSLAddRuleBtn = "//button[text()='Add Rule']";
	    public static String crtSLACrtRuleHeader = "//h1[text()='Create Rule']";
	    public static String crtRuleCncel = "//h1[text()='Create Rule']//parent::div//button[text()='Cancel']";
	    public static String crtRuleCreateRule = "//h1[text()='Create Rule']//parent::div//button[text()='Create Rule']";
	    public static String crtRuleSpecifyActValid = "//h2[text()='Specify Action']//ancestor::div[@class='fields-container tile']//span[@class='field__error']";
	    public static String closeCriteria = "(//div[@class='close-icon'])[2]";
	    public static String esclateToSelectArrow = "//label[@title='Escalate To']//parent::div//parent::div//span[@class='Select-arrow']";
	    public static String selectEsclateValue = "(//li[@class='multi']//input[@type='checkbox'])[1]";

	    public static String freqSendingArrow = "//label[@title='Frequency of Sending Notifications']//parent::div//parent::div//span[@class='Select-arrow']";
	    public static String freqSendingValue = "//div[@class='Select-menu-outer']//div[@aria-label='Daily']";
	    public static String editRule = "(//h2[text()='Rules Set']//ancestor::div[@class='fields-container tile']//button)[2]";
	    public static String editSaveRule = "//h1[text()='Edit Rule']//ancestor::div[@class='modal-header']//button[text()='Save']";
	    public static String activeSLADet = "//h2[contains(text(),'Active')]";
	    public static String existingErrorTemplate = "//div[contains(text(),'Duplicate name. Please use a different name.')]";
	    public static String inactiveToggle = "//button[text()='Inactive']";
	    public static String inActiveSLADet = "//h2[contains(text(),'Inactive')]";
	    public static String activeToggle = "//button[text()='Active']";


	    public static By SLASideBar = By.xpath(sLASideBar);
	    public static By InActiveSLADet = By.xpath(inActiveSLADet);
	    public static By InactiveToggle = By.xpath(inactiveToggle);
	    public static By ActiveToggle = By.xpath(activeToggle);
	    public static By ExistingErrorTemplate = By.xpath(existingErrorTemplate);
	    public static By EditSLASave = By.xpath(editSLASave);
	    public static By ActiveSLADet = By.xpath(activeSLADet);
	    public static By EditSaveRule = By.xpath(editSaveRule);
	    public static By SLADescription = By.xpath(sLADescription);
	    public static By SLAName = By.xpath(sLAName);
	    public static By SLaHeaderLabel = By.xpath(sLaHeaderLabel);
	    public static By CreateSLABtn = By.xpath(createSLABtn);
	    public static By CrtSLAHeaderPopup = By.xpath(crtSLAHeaderPopup);
	    public static By CrtSLACancel = By.xpath(crtSLACancel);
	    public static By CrtSLACreateSLA = By.xpath(crtSLACreateSLA);
	    public static By CrtSLANameValid = By.xpath(crtSLANameValid);
	    public static By CrtSLAGlobalValid = By.xpath(crtSLAGlobalValid);
	    public static By CrtSLAddRuleBtn = By.xpath(crtSLAddRuleBtn);
	    public static By CrtSLACrtRuleHeader = By.xpath(crtSLACrtRuleHeader);
	    public static By CrtRuleCncel = By.xpath(crtRuleCncel);
	    public static By CrtRuleCreateRule = By.xpath(crtRuleCreateRule);
	    public static By CrtRuleSpecifyActValid = By.xpath(crtRuleSpecifyActValid);
	    public static By CloseCriteria = By.xpath(closeCriteria);
	    public static By EsclateToSelectArrow = By.xpath(esclateToSelectArrow);
	    public static By SelectEsclateValue = By.xpath(selectEsclateValue);
	    public static By FreqSendingArrow = By.xpath(freqSendingArrow);
	    public static By FreqSendingValue = By.xpath(freqSendingValue);
	    public static By EditRule = By.xpath(editRule);
	    

	    public static String GetActiveSLAGridData(int index) {
	        String xPath = "(//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])[" + index + "]";
	        return xPath;
	    }
	    
	    
	    
	    public static String GetActiveSLAEditIcon(int index) {

	        String xPath = "(//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td']//button)[" + index + "]";
	        return xPath;

	    }

	    
	    
	    public static String GetInactiveSLAGridData(int index) {
	        String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td'])[" + index + "]";
	        return xPath;
	    }

	    public static String GetInactiveSLAEditIcon(int index) {
	        String xPath = "(//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-td']//button)[" + index + "]";
	        return xPath;
	    }


	    
	    
	    
	    public static String inactiveSLAName;
	    public static String ActivateSLA;
	    public static int activeSLACountBefore;
	    public static String activeSLAName;
	    public static String inactivateSLA;
	    public static int activeSLACount;
	    public static int inactiveSLACount;
	    public static int inactiveSLACountBefore;
	    
	    
	    public static String existingSLAName;
	    public static String existingsLADesription;
	    public static String expectedduplicatErrorMessage = "Duplicate name. Please use a different name.";
	    public static String actualErrorMsg;

	    public static String newEditSLA;
	    public static String EditsLADesription;
	    public static String sLALableName;
	    public static String actualSLAName;
	    public static String sLADesription;
	    public static String actuaalsLADesription;
	    public static int AfteractiveSLACount;
	    public static int BeforeactiveSLACount;
	    public static String newAddedSLA;
	    public static String actualAddRuleAttributValidation;
	    public static String actualAddRuleOperatorValidation;
	    public static String actualAddRuleValueValidation;
	    public static String actualEsclatToValidation;
	    public static String UseTemplateValidation;
	    public static String actualFreqSendingValidation;
	    public static String expectedAddRuleAttributValidation = "The Attribute is required.";
	    public static String expectedAddRuleOperatorValidation = "The Operator is required.";
	    public static String expectedAddRuleValueValidation = "The Value is required.";
	    public static String expectedEsclatToValidation = "The Escalate To is required.";
	    public static String expectedUseTemplateValidation = "The Template is required.";
	    public static String expectedFreqSendingValidation = "The Frequency is required.";
	    public static String ActualSLAHeader;
	    public static String expectedSLAHeader = "SLA";
	    public static String actualSLApopHeader;
	    public static String expectedSLApopHeader = "Create SLA";
	    public static int SLApopHeader;
	    public static int actualcrtRuleHeader1;
	    public static String selectedAttriVal;
	    public static String selectedCatVal;
	    public static String AddedRuleDesc;
	    public static String EdditedRuleDesc;


	    public static String actualGlobalValidSLA;
	    public static String expectedGlobalValidSLA = "At least one rule should be present.";

	    public static String actualNameValidSLA;
	    public static String expectedNameValidSLA = "The Name is required.";

	    public static String actualcrtRuleHeader;
	    public static String expectedCrtRuleHeader = "Create Rule";
}
