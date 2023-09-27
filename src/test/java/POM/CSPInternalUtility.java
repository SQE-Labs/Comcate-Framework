package POM;

import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class CSPInternalUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CSPInternalUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	
	public static String plusIconToCRM = "//*[@class='app-header__new']";
    public static String customerSubmissionOption = "//label[text()='Customer submission']";
    public static String cancelCreateCase = "//h1[text()='Create A Case']//parent::div//button[text()='Cancel']";
    public static String cSPPopupTitle = "//div[@class='full-page-modal__header']/h1";
    public static String createSubmissionButton = "//button[text()='Create Submission']";
    public static String globalErrorMessageCSP = "//div[@class='create-submission__global-error']/h2";
    public static String postAnonymouslyCheckbox = "//label[text()='Post anonymously']";
    public static String addExistingCustomerField = "//label[@class='contact-tile__searchbox-label']/following::input[1]";
    public static String nameField = "//input[@name='name']";
    public static String emailField = "//input[@name='email']";
    public static String workPhoneField = "//input[@name='workPhone']";
    public static String cellPhoneField = "//input[@name='phoneNumber']";
    public static String selectedAnonymousToggle = "//div[@class='post-anonymous-section']//button[@class='square-btn btn btn-primary']";
    public static String yesToggleAnonymous = "//div[@class='post-anonymous-section']//button[2]";
    public static String saveChangesButton = "//button[text()='Save Changes']";
    public static String contactSearchResults = "(//div[@class='react-autosuggest__suggestion-element']/div)[3]";
    public static String categoryDropdown = "//label[@for='selectedCategory']/following::span[1]";
    public static String searchCategory = "//input[@name='query']";
    public static String selectedCategory = "//label[@for='selectedCategory']/following::label[1]";
    public static String searchResultsCategory = "//ul[@class='dropdown__options--single']//li//b";
    public static String locationValidationMsg = "//div[@class='tile--error-msg']";
    public static String locationField = "//div[@class='location-tile__inputs-container']//input";
    public static String locationSearchResult = "//li[@id='react-autowhatever-1-section-0-item-0']";

    public static String EditLocation = "//div[@class='edit-address__header']/button";
    public static String issueDescriptionField = "//textarea[@name='issueDescription']";
    public static String tagsField = "//div[@class='tags-input__chips']/input";
    public static String attachmentIcon = "//div[text()='Attachments ']/following::button";
    public static String cameraButton = "//span[text()='Camera']";
    public static String addButton = "//button[text()='Add']";
    public static String imageThumb = "//img[@class='attachments-tile__saved-thumb']";
    public static String submisionStatus = "//h2[@class='customer-submission-details__status']";
    public static String closeSubmissionIcon = "//div[@class='customer-submission-details__close-icon']/img";
    public static String cancelButton = "//button[text()='Cancel']";
    public static String toggleChecked = "//div[@class='react-toggle react-toggle--checked bs-toggle danger']";
    public static String flagToggle = "(//div[@class='react-toggle-thumb'])[1]";
    public static String postAnonymouslyCheckboxbtn = "//input[@name='isAnonymous'][@type='checkbox']";


    public static By PostAnonymouslyCheckboxbtn = By.xpath(postAnonymouslyCheckboxbtn);
    public static By PlusIconToCRM = By.xpath(plusIconToCRM);
    public static By CancelCreateCase = By.xpath(cancelCreateCase);
    public static By CustomerSubmissionOption = By.xpath(customerSubmissionOption);
    public static By CSPPopupTitle = By.xpath(cSPPopupTitle);
    public static By CreateSubmissionButton = By.xpath(createSubmissionButton);
    public static By GlobalErrorMessageCSP = By.xpath(globalErrorMessageCSP);
    public static By PostAnonymouslyCheckbox = By.xpath(postAnonymouslyCheckbox);
    public static By AddExistingCustomerField = By.xpath(addExistingCustomerField);
    public static By NameField = By.xpath(nameField);
    public static By EmailField = By.xpath(emailField);
    public static By WorkPhoneField = By.xpath(workPhoneField);
    public static By CellPhoneField = By.xpath(cellPhoneField);
    public static By SelectedAnonymousToggle = By.xpath(selectedAnonymousToggle);
    public static By YesToggleAnonymous = By.xpath(yesToggleAnonymous);
    public static By SaveChangesButton = By.xpath(saveChangesButton);
    public static By ContactSearchResults = By.xpath(contactSearchResults);
    public static By CategoryDropdown = By.xpath(categoryDropdown);
    public static By SearchCategory = By.xpath(searchCategory);
    public static By SelectedCategory = By.xpath(selectedCategory);
    public static By SearchResultsCategory = By.xpath(searchResultsCategory);
    public static By LocationValidationMsg = By.xpath(locationValidationMsg);
    public static By LocationSearchResult = By.xpath(locationSearchResult);
    public static By ToggleChecked = By.xpath(toggleChecked);
    public static By FlagToggle = By.xpath(flagToggle);
    public static By LocationField = By.xpath(locationField);
    public static By IssueDescriptionField = By.xpath(issueDescriptionField);
    public static By TagsField = By.xpath(tagsField);
    public static By AttachmentIcon = By.xpath(attachmentIcon);
    public static By CameraButton = By.xpath(cameraButton);
    public static By AddButton = By.xpath(addButton);
    public static By ImageThumb = By.xpath(imageThumb);
    public static By SubmisionStatus = By.xpath(submisionStatus);
    public static By CloseSubmissionIcon = By.xpath(closeSubmissionIcon);
    public static By CancelButton = By.xpath(cancelButton);

    public static String SelectedToggleForAnonymous;
    public static String SelectedToggleNow;
    public static String ErrMessageActual;
    public static String ErrMessageExpected;
    public static String CSPTitleActual;
    public static String CSPTitleExpected;
    public static boolean PostAnonymouslyState;
    public static boolean ContactsTileState;
    public static String EmailValue;
    public static String ActualCategorySel;
    public static String ActualCategorySel2;
    public static String LocValidMsg;
    public static boolean LocationPresence;
    public static boolean CheckImgSize;
    public static String StatusOfSubmission;
    public static String CreatedCategory1;
    public static String CreatedCategory2;
    public static String CreatedCategory3;

}
