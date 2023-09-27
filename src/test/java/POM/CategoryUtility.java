package POM;

import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class CategoryUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CategoryUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	
	public static String categoriesTab = "//div[@class='tab-name tab-name--active']";
    public static String otherDefaultCategory = "//div[@class='sortable-table__body__td' and text()='Other']";
    public static String editDefaultLink = "//a[text()='Edit Default']";
    public static String resolutionTimePopup = "//div[@class='modal-header']";
    public static String resolutionTimeField = "//input[@name='resolveByDays']";
    public static String saveButton = "//button[text()='Save']";
    public static String cancelButton = "//button[text()='Cancel']";
    public static String defaultResolutionTime = "//span[@class='default-resolve-by-days']";
    public static String editCategoryIcon = "//button[@class='edit-btn space-right btn btn-primary']";
    public static String editOtherPopup = "//div[@class='full-page-modal__header']/h1";
    public static String validationMsgResolutionTime = "//span[@class='field__error']";
    public static String createCategoryButton = "//button[text()='Create Category']";
    public static String createACategoryPopup = "//div[@class='full-page-modal__header']/h1";
    public static String resolutionTime = "//span[@class='default-resolve-by-days']";
    public static String createCategoryPopupBtn = "//div[@class='full-page-modal__header']//following::button[text()='Create Category']";
    public static String validationMsgNameField = "(//span[@class='field__error'])[1]";
    public static String resolutionTimeOnCategoryPopup = "//input[@name='resolveByDays']";
    public static String keywordsField = "//input[@name='tags-input']";
    public static String addedKeywords = "//div[@class='chip__body']";
    public static String deleteIconKeyword = "//button[@class='chip__close-button']";
    public static String addFieldLink = "//a[text()='Add Field']";
    public static String addedFields = "//div[@class='category-modal__custom-fields']//li";
    public static String labelValidationMsg = "//div[@class='category-modal__custom-field']//span";
    public static String labelField = "//input[@name='label']";
    public static String dropdownLinkEmail = "//span[@class='dropdown__arrow']";
    public static String emailTemplatesOptions = "//div[@id='templateIds']//label";
    public static String templatesCancelButton = "//div[@class='flex-row--center dropdown__actions']/button[1]";
    public static String templatesSaveButton = "//div[@class='flex-row--center dropdown__actions']/button[2]";
    public static String labelSelect = "//div[@class='dropdown__selector__selected']/label";
    public static String selectedTemplates = "//div[@class='dropdown__selector__selected']/label";
    public static String nameField = "//input[@name='name']";
    public static String categoriesCountHeader = "//div[@class='agency-setup-tab__section__header']/h2";
    public static String addedCategories = "//li[@class='sortable__element']";
    public static String notificationMsg = "//div[@class='notification-message']";
    public static String editCategoryIcon2 = "(//button[@class='edit-btn space-right btn btn-primary'])[2]";
    public static String inactiveToggle = "//button[text()='Inactive']";
    public static String inactiveCategoriesCount = "(//div[@class='agency-setup-tab__section__header']/h2)[2]";
    public static String inactiveAddedCategories = "//div[@class='rt-tr-group']";
    public static String actualCategoriesCount = "//div[@class='sortable-table__body__tr']";
    public static String locationRequiredCheckbox = "//label[text()='Location Required']";
    public static String noLocationToggle = "//button[text()='No']";

    public static By CategoriesTab = By.xpath(categoriesTab);
    public static By OtherDefaultCategory = By.xpath(otherDefaultCategory);
    public static By EditDefaultLink = By.xpath(editDefaultLink);
    public static By ResolutionTimePopup = By.xpath(resolutionTimePopup);
    public static By ResolutionTimeField = By.xpath(resolutionTimeField);
    public static By SaveButton = By.xpath(saveButton);
    public static By CancelButton = By.xpath(cancelButton);
    public static By DefaultResolutionTime = By.xpath(defaultResolutionTime);
    public static By EditCategoryIcon = By.xpath(editCategoryIcon);
    public static By EditOtherPopup = By.xpath(editOtherPopup);
    public static By ValidationMsgResolutionTime = By.xpath(validationMsgResolutionTime);
    public static By ResolutionTime = By.xpath(resolutionTime);
    public static By CreateCategoryButton = By.xpath(createCategoryButton);
    public static By CreateACategoryPopup = By.xpath(createACategoryPopup);
    public static By CreateCategoryPopupBtn = By.xpath(createCategoryPopupBtn);
    public static By ValidationMsgNameField = By.xpath(validationMsgNameField);
    public static By ResolutionTimeOnCategoryPopup = By.xpath(resolutionTimeOnCategoryPopup);
    public static By KeywordsField = By.xpath(keywordsField);
    public static By AddedKeywords = By.xpath(addedKeywords);
    public static By DeleteIconKeyword = By.xpath(deleteIconKeyword);
    public static By AddFieldLink = By.xpath(addFieldLink);
    public static By AddedFields = By.xpath(addedFields);
    public static By LabelValidationMsg = By.xpath(labelValidationMsg);
    public static By LabelField = By.xpath(labelField);
    public static By DropdownLinkEmail = By.xpath(dropdownLinkEmail);
    public static By EmailTemplatesOptions = By.xpath(emailTemplatesOptions);
    public static By TemplatesCancelButton = By.xpath(templatesCancelButton);
    public static By TemplatesSaveButton = By.xpath(templatesSaveButton);
    public static By LabelSelect = By.xpath(labelSelect);
    public static By SelectedTemplates = By.xpath(selectedTemplates);
    public static By NameField = By.xpath(nameField);
    public static By CategoriesCountHeader = By.xpath(categoriesCountHeader);
    public static By AddedCategories = By.xpath(addedCategories);
    public static By NotificationMsg = By.xpath(notificationMsg);
    public static By EditCategoryIcon2 = By.xpath(editCategoryIcon2);
    public static By InactiveToggle = By.xpath(inactiveToggle);
    public static By InactiveCategoriesCount = By.xpath(inactiveCategoriesCount);
    public static By ActualCategoriesCount = By.xpath(actualCategoriesCount);
    public static By LocationRequiredCheckbox = By.xpath(locationRequiredCheckbox);
    public static By NoLocationToggle = By.xpath(noLocationToggle);

    public static String RandomCategoryname = null;
    public static String NewResoTime;
    public static int CategoriesCountBefore;
    public static String TabTitle;
    public static String OtherTabTitle;
    public static String EditOtherPopupTitle;
    public static String EditResolutionPopupTitle;
    public static String ResolutionTimeValidationMsg;
    public static String[] ResoTextAfter;
    public static String CreateCategoryPopupTitle;
    public static String NameFieldValidationMsg;
    public static String ResoTimeOnPopup;
    public static int KeywordsSizeBefore;
    public static int KeywordsSizeAfter;
    public static int FieldsCount;
    public static String LabelFieldValidationMsg;
    public static String LabelText;
    public static String CheckedTemplate;
    public static String SelectedTemplate;
    public static int CategoriesCountAfter1;
    public static int CategoriesCountAfter2;
    public static int CategoriesCountAfter3;
    public static String NotificationText;
    public static int InactiveCountAfter;
    public static int InactiveCountBefore;
    public static int CategoriesCountHeader1;
    public static int CountCategoriesActual;

}
