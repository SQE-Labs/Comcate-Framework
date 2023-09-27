package POM;

import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class CSDPUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CSDPUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	
	 public static String changeLinkDueDate = "//a[text()='Change']";
	    public static String changeDueByPopup = "//div[text()='Change Due By']";
	    public static String reasonField = "//textarea[@name='reason']";
	    public static String saveButton = "//button[text()='Save']";
	    public static String cancelButton = "//button[text()='Cancel']";
	    public static String validationMsgReason = "//textarea[@name='reason']/following::span";
	    public static String dueByDatepicker = "//input[@name='dueBy']";
	    public static String updateDueDate = "//td[@class='rdtDay rdtActive']/following::td[1]";
	    public static String updateDueDates = "//td[@class='rdtDay rdtActive rdtToday']/following::td[1]";
	    public static String changedDueDate = "//label[text()='Due By']/following::label[1]";
	    public static String internalNotesContent = "//div[@class='internal-note-tile-content__content']";
	    public static String internalNotesContent2 = "(//div[@class='internal-note-tile-content__content'])[2]";
	    public static String escalateIssueToggle = "//div[@class='react-toggle-thumb']";
	    public static String customerNameLink = "//label[text()='Customer Name']/following::a[1]";
	    public static String coDPHeader = "//div[@class='contact-details__header__main']/h2[1]";
	    public static String closeIconCoDP = "//div[@class='contact-details__header__close-icon']/img";
	    public static String tagsLink = "//span[@class='clipped-text']/a";
	    public static String cSLPHeader = "(//label[@class='dropdown__selector__label'])[1]";
	    public static String imageIconCSDP = "//div[@id='cs-attachments']//button";
	    public static String internalNotesIcon = "//div[@id='cs-notes']//button[@class='compose-note-icon btn btn-primary']";
	    public static String addInternalNotePopup = "//div[text()='Add Internal Note']";
	    public static String createNoteButton = "//button[text()='Create Note']";
	    public static String internalNoteValidation = "//div[@class='notes']//span";
	    public static String internalNoteField = "//textarea[@name='caseNote']";
	    public static String editNoteIcon = "//button[@class='edit-btn internal-note-tile-content__actions__edit btn btn-primary']";
	    public static String editInternalNotePopup = "//div[text()='Edit Internal Note']";

	    public static By ChangeLinkDueDate = By.xpath(changeLinkDueDate);
	    public static By ChangeDueByPopup = By.xpath(changeDueByPopup);
	    public static By ReasonField = By.xpath(reasonField);
	    public static By SaveButton = By.xpath(saveButton);
	    public static By ValidationMsgReason = By.xpath(validationMsgReason);
	    public static By DueByDatepicker = By.xpath(dueByDatepicker);
	    public static By UpdateDueDate = By.xpath(updateDueDate);
	    public static By UpdateDueDates = By.xpath(updateDueDates);
	    public static By ChangedDueDate = By.xpath(changedDueDate);
	    public static By InternalNotesContent = By.xpath(internalNotesContent);
	    public static By InternalNotesContent2 = By.xpath(internalNotesContent2);
	    public static By EscalateIssueToggle = By.xpath(escalateIssueToggle);
	    public static By CustomerNameLink = By.xpath(customerNameLink);
	    public static By CoDPHeader = By.xpath(coDPHeader);
	    public static By CloseIconCoDP = By.xpath(closeIconCoDP);
	    public static By TagsLink = By.xpath(tagsLink);
	    public static By CSLPHeader = By.xpath(cSLPHeader);
	    public static By ImageIconCSDP = By.xpath(imageIconCSDP);
	    public static By InternalNotesIcon = By.xpath(internalNotesIcon);
	    public static By AddInternalNotePopup = By.xpath(addInternalNotePopup);
	    public static By CreateNoteButton = By.xpath(createNoteButton);
	    public static By InternalNoteValidation = By.xpath(internalNoteValidation);
	    public static By InternalNoteField = By.xpath(internalNoteField);
	    public static By EditNoteIcon = By.xpath(editNoteIcon);
	    public static By EditInternalNotePopup = By.xpath(editInternalNotePopup);

	    public static By AddedCustomerName = By.xpath("//label[text()='Customer Name']/following-sibling::label");
	    public static By PrintButton = By.xpath("//button[text()='Print']");
	    public static By PrintSettingsPopup = By.xpath("//div[text()='Print Settings']");
	    public static By PrintButtonPSP = By.xpath("//div[text()='Print Settings']/following::button[text()='Print']");
	    public static By PrintPageSubmissionID = By.xpath("//h2[@class='customer-submission-print-details__number']");
	    public static By CSDPSubmissionID = By.xpath("//h2[@class='customer-submission-details__number']");
	    public static By ManageTagsButton = By.xpath("//button[text()='Manage Tags']");
	    public static By ManageTagsPopup = By.xpath("//div[text()='Manage Tags']");
	    public static By EnterTagsField = By.xpath("//input[@name='tags-input']");
	    public static By SaveButtonTags = By.xpath("//input[@name='tags-input']/following::button[2]");
	    public static By TagsSuccessMessage = By.xpath("//div[@class='success-custom-message']/span");
	    public static By TasksIcon = By.xpath("//p[text()='Tasks']/..//button");
	    public static By AddATaskPopup = By.xpath("//div[text()='Add a Task']");
	    public static By TaskNameField = By.xpath("//input[@name='name']");
	    public static By TaskAssigneeDropdown = By.xpath("//label[@for='assigneeId']/following::span[1]");
	    public static By TaskAssigneeOption = By.xpath("//label[@for='assigneeId']/following::ul/li[1]");
	    public static By AddTaskButton = By.xpath("//button[text()='Add Task']");
	    public static By AddedTaskName = By.xpath("//div[@class='tasks-table']//div[@class='rt-td'][2]/div");
	    public static By EditTaskIcon = By.xpath("//button[@class='edit-btn edit-task-content__actions__edit space-right btn btn-primary']");
	    public static By EditATaskPopup = By.xpath("//div[text()='Edit a Task']");
	    public static By SaveButtonTask = By.xpath("//div[text()='Edit a Task']/following::button[2]");
	    public static By TaskSectionIcon = By.xpath("//div[@class='cs-tasks__header']//button");
	    public static By DeleteTaskIcon = By.xpath("//button[@class='delete-btn space-right btn btn-primary']");
	    public static By TasksCountAtHeader = By.xpath("//div[@class='cs-tasks__header']/h2");
	    public static By TaskCoulumns = By.xpath("//div[@class='rt-tr -odd']");
	    public static By MoreButtonCSDP = By.xpath("//button[text()='More...']");
	    public static By CloseSubmissionOption = By.xpath("//li[text()='Close Submission']");
	    public static By YesCloseButton = By.xpath("//button[text()='Yes, Close']");
	    public static By SubmissionStatus = By.xpath("//h2[@class='customer-submission-details__status']");
	    public static By ReopenSubmissionOption = By.xpath("//li[text()='Reopen Submission']");
	    public static By YesReopenButton = By.xpath("//button[text()='Yes, Reopen']");
	    public static By YesDeleteButton = By.xpath("//button[text()='Yes, Delete']");
	    public static By PossibleDuplicateSubmissionsPopup = By.xpath("//h2[text()='Possible Duplicate Submissions']");
	    public static By SubmitAnywayButton = By.xpath("//button[text()='Submit Anyway']");


	    public static String RandomReason;
	    public static String Characters500;
	    public static String RandomReason2;
	    public static String RandomTaskName;
	    public static String StatusOfSubmission;
	    public static String PopupTitleChangeDueBy;
	    public static String ReasonValidationMsg;
	    public static String ValidationMsgMaxChar;
	    public static String InternalNotes;
	    public static String ValidationMsgCharLimit;
	    public static boolean EscalateToggleStatus;
	    public static String InternalNotes2;
	    public static String CustomerName;
	    public static String CustomerDetailHeader;
	    public static boolean CheckImageSize;
	    public static String InternalNotePopupTitle;
	    public static String EditNotePopupTitle;
	    public static String EditedNotes;
	    public static String PrintSettingsPopupTitle;
	    public static String PrintPageSubmissionHeader;
	    public static String CSDPSubmissionHeader;
	    public static String ManageTagsPopupTitle;
	    public static String SuccessMessageTags;
	    public static String ExpectedSuccessMsg;
	    public static String AddTaskPopupTitle;
	    public static String AddedTaskText;
	    public static String EditTaskPopupTitle;
	    public static String AddedTaskText2;
	    public static boolean TasksCount;
	    public static String ClosedStatusOfSubmission;
	    public static String OpenedStatusOfSubmission;
	    public static String RandomEditedNote;


}
