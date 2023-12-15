package POM;

import BrowsersBase.BrowsersInvoked;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;

import CommonMethods.CECommonMethods;
import CommonMethods.Helper;
import CommonMethods.PropertiesUtils;
import CommonMethods.RandomStrings;



public class ForcedAbatementUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	CECommonMethods CECommonMethodS;

	public ForcedAbatementUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		CECommonMethodS = new CECommonMethods(driver);
	}

	public static String RunEnvironment = PropertiesUtils.getPropertyValue("RunEnvironment");
	public static String moreBtn = "//button[contains(text(),'More...')]";
	public static String initiateFABtn = "//li[text()='Initiate Forced Abatement']";
	public static String popupTitleFA = "//div[text()='Initiate Forced Abatement']";
	public static String iFAPopupBtn = "//div[@class='modal-footer']//button[2]";
	public static String errorMsgNote = "//*[@class='field-section field-section--error field-section--required  col-md-12 col-12']//span";
	public static String noteField = "//textarea[@placeholder='Enter Note']";
	public static String errorNoteLimit = "//span[text()='500 character limit.']";
	public static String forcedBadge = "//span[text()='Forced']";
	public static String abatementInfo = "//div[@class='abatement-activities__fa-details']//h4";
	public static String editFANoteLink = "//label[@class='fa-note__label']/a[text()='Edit']";
	public static String editNotePopup = "//div[text()='Edit FA Note']";
	public static String saveBtn = "//button[text()='Save']";
	public static String editedNote = "//label[@class='fa-note__label']/following::p";
	public static String addActivityBtn = "//button[text()='Add Activity']";
	public static String addAttachment = "(//div[contains(text(),'Attachments')]//parent::h2//div//button)";
	public static String activityType2 = "(//div[@class='multi-choice-buttons']//button)[2]";
	public static String activityType3 = "(//div[@class='multi-choice-buttons']//button)[3]";
	public static String fAActivityPopup = "//div[text()='Add Forced Abatement Activity']";
	public static String fAactivityPopup = "//h1[text()='Add Forced Abatement Activity']";
	public static String fAToggleBtn = "//div[@class='multi-choice-buttons']/button[1]";//
	public static String fAActivityBtn = "//button[text()='Add Forced Abatement Activity']";
	public static String selectDocument = "//label[text()='Select Document']/following::div[1]//div";
	//label[text()='Select Document']/following::div[1]//div
	public static String selectHTML = "//div[text()='HTML FA Document']";
	public static String errorMsgFA1 = "(//span[@class='field__error'])[1]";
	public static String errorMsgFA2 = "(//span[@class='field__error'])[2]";
	public static String docNoteTitle = "//label[text()='Document Note']";
	public static String validMsgDocNote = "//label[@title='Document Note']/following::span";
	public static String labelForText1 = "//input[@placeholder='Enter Text']";
	public static String labelForNumber2 = "//input[@placeholder='Enter Number']";
	public static String labelForSelect3 = "//div[@class='Select-placeholder']";
	public static String documentNoteField = "//textarea[@placeholder='Enter Note']";
	public static String firstOption = "//div[text()='Yes']";
	public static String generateDocBtn = "//button[text()='Generate Document']";
	public static String continueToGenDoc = "//button[text()='Continue to Generate Document']";
	public static String SelectFAADocArrow = "//label[text()='More...']//following-sibling::span";
	public static String selectFAADoc =
			"(//label[@title='Select an FAA Document']//ancestor::div[@class='abatement-activities__documents']//div[@class='dropdown__list']//ul//li[@class='option']/span)[1]";
	public static String genFAADoc = "//button[text()='Generate FAA Document']";
	public static String generateDocAddFABtn = "//div[@class='case-inspection__notice-action-buttons']/button[2]";
	public static String addedActivity = "//div[@class='abatement-activities__fa-activity__header']";
	public static String editActivityIcon = "//div[@class='abatement-activities__fa-activity__actions']/button[1]";
	public static String editActivityPopup = "(//div[@class='modal-header'])[2]";
	public static String editFAAPopup = "(//div[@class='modal-header'])[2]//div[@class='abatement-activities__title-text']//h1";
	public static String cancelBtnEditFA = "//div[@class='certified-mail-number__footer']/button[1]";
	public static String saveBtnEditFA = "//div[@class='certified-mail-number__footer']/button[2]";
	public static String editedLabelText1 = "(//label[@class='field__value'])[2]";
	public static String deleteActivityIcon = "//div[@class='abatement-activities__fa-activity__actions']/button[2]";
	public static String generateDocumentBtn = "//button[text()='Generate Document']";
	public static String editSaveFAA = "//button[text()='Save']";
	public static String ViolationLable = "//span[@class='violation-label']";
	public static String Contactfirst = "(//div[@class='contact__name-role']//b)[1]";
	public static String Contact2 = "(//div[@class='contact__name-role']//b)[2]"; 
	public static String fAAAttachement = "(//label[@class='attachments-tile__photo-name'])[3]";
	public static String SelectImgFAA1 = "(//div[@class='tick--not-selected']//following-sibling::img)[1]";
	public static String SelectImgFAA2 = "(//div[@class='tick--not-selected']//following-sibling::img)[2]";
	public static String SelectedImagFAA1 = "(//div[@class='tick--selected']//following-sibling::img)[1]//parent::div//div//a";
	public static String SelectedImahFAA2 = "(//div[@class='tick--selected']//following-sibling::img)[2]//parent::div//div//a";
	public static String PrintPreviewFrame = "editor_ifr";
	public static String ImagedetTabTitle1 = "(//tbody//td//p)[2]"; 
	public static String ImagedetTabTitle2 = "(//tbody//td//p)[6]";
	public static String DonotPrint = "//button[text()='Do Not Print']";
	public static String ExitAddActivity = "//button[text()='Exit']";
	public static String ExitConfirmYesBtn = "//button[text()='Yes']"; 
	public static String AddContactCDP = "//label[text()='Add contact']//parent::div//input";
	public static String CrtNewContactCDP = "//span[text()='Create a  new contact']";
	public static String ContactName = "//input[@name='name']";
	public static String CreateAnywayContact = "//button[text()='Create Anyway']";
	public static String BilltoContact2 = "(//input[@name='billableContact'])[2]";
	public static String BilltoContact3 = "(//input[@name='billableContact'])[3]";
	public static String PhotoSection = "//div[@class='case__attachment__title']//h5"; 
	public static String SelectAllCheckBox = "//input[@name='selectAll'][@type='checkbox']"; 
	public static String PhotosAttached = "//div[@class='case__attachment']//a[@class='attachments-tile__photo-title']";
	public static String Viewphotos= "//a[@class='view-photos']";
    public static String PhotoDetailsHeader = "(//div[@class='modal-header'])[3]";
    public static String CloseBtn = "//button[text()='Close']"; 
    public static String ChooseFAHtmlDoc = "//div[@class='multi-choice-buttons']//button[text()='HTML FA Document']";
	public static String ActivityProgress = "//h2[text()='Abatement Activity']//parent::div//label";
	public static String AbatementDetailsPopUp = "//div[text()='2']//following-sibling::h2";
	public static String ProgressDetails ="//div[text()='2']//following-sibling::label";
	public static String AbatementActivitySec = "//h2[text()='Abatement Activity']";
	public static String FineSection = "//div[@class='tile fine-section']//h5"; 
	public static String ViolationFileSec = "(//div[@class=''])[7]"; 
	public static String IssueFaaDate = "//label[@title='FAA Document Issue Date']"; 
	public static String fAAcontact1 = "(//div[text()='Recipients']//parent::div//span[@class='contact-name'])[1]";
	public static String fAAcontact2 = "(//div[text()='Recipients']//parent::div//span[@class='contact-name'])[2]";
	public static String fAAResPosiblecontact1 = "(//div[text()='Responsible Party']//parent::div//span[@class='contact-name'])[1]";
	public static String fAAResPosiblecontact2 = "(//div[text()='Responsible Party']//parent::div//span[@class='contact-name'])[2]";	
	public static String fAASelectfaaDoc = "//label[@title='Select an FAA Document']";
	public static String selectedcontact1 = "(//input[@name='billableContact'])[2]//ancestor::div[@class='contact__bill-to-contact']//preceding-sibling::div[@class='contact__name']";
	public static String selectedcontact2 = "(//input[@name='billableContact'])[3]//ancestor::div[@class='contact__bill-to-contact']//preceding-sibling::div[@class='contact__name']";
	public static String fAADonotIsuueFine = "//input[@name='isFineIssued'][@type='checkbox']"; 
	public static String fAAAddAnotherFine = "//span[@class='fine-section__fine-add-icon']//parent::a"; 
	public static String performInsButton = "//button[text()='Perform Inspection']";
	public static String modalHeaders = "//div[@class='modal-header']";
	public static String confirmationPopup = "//div[@class='disclaimer-modal__disclaimer-img']";
	public static String yesDelete = "//div[@class='flex-row--middle']/button[2]";
	
	public static By YesDelete = By.xpath(yesDelete);
	public static By ConfirmationPopup = By.xpath(confirmationPopup);
	public static By ModalHeaders = By.xpath(modalHeaders);
	public static By PerformInsButton = By.xpath(performInsButton);
	public static By MoreBtn = By.xpath(moreBtn);
    public static By InitiateFABtn = By.xpath(initiateFABtn);
    public static By PopupTitleFA = By.xpath(popupTitleFA);
    public static By IFAPopupBtn = By.xpath(iFAPopupBtn);
    public static By ErrorMsgNote = By.xpath(errorMsgNote);
    public static By NoteField = By.xpath(noteField);
    public static By ErrorNoteLimit = By.xpath(errorNoteLimit);
    public static By ForcedBadge = By.xpath(forcedBadge);
    public static By AbatementInfo = By.xpath(abatementInfo);
    public static By EditFANoteLink = By.xpath(editFANoteLink);
    public static By EditNotePopup = By.xpath(editNotePopup);
    public static By SaveBtn = By.xpath(saveBtn);
    public static By EditedNote = By.xpath(editedNote);
    public static By AddActivityBtn = By.xpath(addActivityBtn);
    public static By AddAttachment = By.xpath(addAttachment);
    public static By ActivityType2 = By.xpath(activityType2);
    public static By ActivityType3 = By.xpath(activityType3);
    public static By FAActivityPopup = By.xpath(fAActivityPopup);
    public static By FAactivityPopup = By.xpath(fAactivityPopup);
    public static By FAToggleBtn = By.xpath(fAToggleBtn);
    public static By FAActivityBtn = By.xpath(fAActivityBtn);
    public static By AddedActivity = By.xpath(addedActivity);
    public static By SelectDocument = By.xpath(selectDocument);
    public static By SelectHTML = By.xpath(selectHTML);
    public static By ErrorMsgFA1 = By.xpath(errorMsgFA1);
    public static By ErrorMsgFA2 = By.xpath(errorMsgFA2);
    public static By DocNoteTitle = By.xpath(docNoteTitle);
    public static By ValidMsgDocNote = By.xpath(validMsgDocNote);
    public static By LabelForText1 = By.xpath(labelForText1);
    public static By LabelForNumber2 = By.xpath(labelForNumber2);
    public static By LabelForSelect3 = By.xpath(labelForSelect3);
    public static By DocumentNoteField = By.xpath(documentNoteField);
    public static By FirstOption = By.xpath(firstOption);
    public static By GenerateDocBtn = By.xpath(generateDocBtn);
    public static By ContinueToGenDoc = By.xpath(continueToGenDoc);
    public static By GenerateDocAddFABtn = By.xpath(generateDocAddFABtn);
    public static By EditActivityIcon = By.xpath(editActivityIcon);
    public static By EditActivityPopup = By.xpath(editActivityPopup);
    public static By CancelBtnEditFA = By.xpath(cancelBtnEditFA);
    public static By SaveBtnEditFA = By.xpath(saveBtnEditFA);
    public static By EditedLabelText1 = By.xpath(editedLabelText1);
    public static By DeleteActivityIcon = By.xpath(deleteActivityIcon);
    public static By GenerateDocumentBtn = By.xpath(generateDocumentBtn);
    public static By selectFAADocArrow = By.xpath(SelectFAADocArrow);
    public static By SelectFAADoc = By.xpath(selectFAADoc);
    public static By GenFAADoc = By.xpath(genFAADoc);
    public static By EditFAAPopup = By.xpath(editFAAPopup);
    public static By EditSaveFAA = By.xpath(editSaveFAA);


    public static By violationLable = By.xpath(ViolationLable);
    public static By contactfirst = By.xpath(Contactfirst);
    public static By contact2 = By.xpath(Contact2);
    public static By FAAAttachement = By.xpath(fAAAttachement);


    public static By selectImgFAA1 = By.xpath(SelectImgFAA1);
    public static By selectImgFAA2 = By.xpath(SelectImgFAA2);
    public static By selectedImagFAA1 = By.xpath(SelectedImagFAA1);
    public static By selectedImahFAA2 = By.xpath(SelectedImahFAA2);
    public static By printPreviewFrame = By.id(PrintPreviewFrame);
    public static By imagedetTabTitle1 = By.xpath(ImagedetTabTitle1);
    public static By imagedetTabTitle2 = By.xpath(ImagedetTabTitle2);
    public static By donotPrint = By.xpath(DonotPrint);

    public static By exitAddActivity = By.xpath(ExitAddActivity);
    public static By exitConfirmYesBtn = By.xpath(ExitConfirmYesBtn);
    public static By addContactCDP = By.xpath(AddContactCDP);
    public static By crtNewContactCDP = By.xpath(CrtNewContactCDP);
    public static By contactName = By.xpath(ContactName);

    public static By createAnywayContact = By.xpath(CreateAnywayContact);
    public static By billtoContact2 = By.xpath(BilltoContact2);
    public static By billtoContact3 = By.xpath(BilltoContact3);


    public static By photoSection = By.xpath(PhotoSection);
    public static By selectAllCheckBox = By.xpath(SelectAllCheckBox);
    public static By photosAttached = By.xpath(PhotosAttached);

    public static By viewphotos = By.xpath(Viewphotos);

    public static By photoDetailsHeader = By.xpath(PhotoDetailsHeader);
    public static By closeBtn = By.xpath(CloseBtn);
    public static By chooseFAHtmlDoc = By.xpath(ChooseFAHtmlDoc);
    public static By activityProgress = By.xpath(ActivityProgress);
    public static By abatementDetailsPopup = By.xpath(AbatementDetailsPopUp);
    public static By progressDetails = By.xpath(ProgressDetails);
    public static By abatementActivitySec = By.xpath(AbatementActivitySec);

    public static By fineSection = By.xpath(FineSection);
    public static By violationFileSec = By.xpath(ViolationFileSec);
    public static By issueFAADate = By.xpath(IssueFaaDate);
    public static By FAAcontact1 = By.xpath(fAAcontact1);
    public static By FAAcontact2 = By.xpath(fAAcontact2);

    public static By FAAResPosiblecontact1 = By.xpath(fAAResPosiblecontact1);
    public static By FAAResPosiblecontact2 = By.xpath(fAAResPosiblecontact2);
    public static By FAASelectfaaDoc = By.xpath(fAASelectfaaDoc);
    public static By Selectedcontact1 = By.xpath(selectedcontact1);
    public static By Selectedcontact2 = By.xpath(selectedcontact2);

    public static By FAADonotIsuueFine = By.xpath(fAADonotIsuueFine);
    public static By FAAAddAnotherFine = By.xpath(fAAAddAnotherFine);


    public static String IssueFAADate;
    public static String fineSectionHeader;
    public static String addedViolation;
    public static String addedRecipent1;
    public static String addedRecipent2;
    public static String addedRisponsoible1;
    public static String addedRisponsoible2;
    public static String FAASelectfaaDocLabel;
    public static int FAADonotIsuueFineChkbox;
    public static Boolean FAAAddAnotherFineLinktxt;
    public static String stageexpectFineSectionHeader = "There is an associated fine with the document you selected, please set the due date and assign a fine amount below.";

    public static String expectFineSectionHeader = "There is an associated fine with the document you selected, please set the due date and assign a fine amount for each open violation on the case below.";
    public static int photocount;
    public static int selectCheckBox;
    public static String viewPhotoDetails;
    public static String SelectedImag1;
    public static String SelectedImag2;
    public static String actualImag1;
    public static String actualImag2;
    public static Boolean activity2Field;
    public static Boolean activity3Field;
    public static String waterViolation;
    public static String contact1;
    public static String contact22;

    public static String Attachment1 = "pexels-mike-b-170811.jpg";
    public static String Attachment2 = "pexels-mike-b-810357.jpg";
    public static String Attachment3 = "pexels-torsten-dettlaff-70912.jpg";
    public static String expectedprogressActivity = "Complete";
    public static String actualprogressActivity;
    public static String expectedprogressAbDetail = "Incomplete";
    public static String actualprogressAbDetails;
    public static Boolean AbatementDetailsPopup;

    public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

    
    public void ForcedAbatement_OpenInitiateForcedAbabtementPopup() throws InterruptedException {
        

        driver.navigate().to(BrowsersInvoked.URLDashboard);
        WaitForCurserRunning(10);
        Thread.sleep(5000);
        CECommonMethodS.CE_CreateACase();

        WaitUntilVisible(MoreBtn);
        WaitUntilPresent(MoreBtn);
        WaitForElementInteractable(MoreBtn);
        ClickByJsExecuter(MoreBtn);
        WaitForElementInteractable(InitiateFABtn);
        ClickOn(InitiateFABtn);
        WaitUntilVisible(PopupTitleFA);
        String FATitle = GetText(PopupTitleFA);
        Assert.assertEquals(FATitle, "Initiate Forced Abatement");

    }

    public void ForcedAbatement_ValidationMsgForEmptyNote() {

        WaitForElementInteractable(IFAPopupBtn);
        ClickByJsExecuter(IFAPopupBtn);
        WaitUntilVisible(ErrorMsgNote);
        String ValidMsg = GetText(ErrorMsgNote);
        String ExpValidMag = "The Forced Abatement Note is required.";
        SoftAssert s116 = new SoftAssert();
        s116.assertEquals(ValidMsg, ExpValidMag);
        s116.assertAll();

    }

    public void ForcedAbatement_ValidationMsgForCharactersOver500InNote() {

        String LargeNote = RandomStrings.RequiredString(505);
        SendKeys(NoteField, LargeNote);
        WaitForElementInteractable(IFAPopupBtn);
        ClickOn(IFAPopupBtn);
        String LimitError = GetText(ErrorNoteLimit);
        SoftAssert s117 = new SoftAssert();
        s117.assertEquals(LimitError, "500 character limit.");
        s117.assertAll();

    }

    public void ForcedAbatement_InitiateForcedAbatement() throws InterruptedException {

        WebElement NoteFld = WaitUntilVisibleWE(NoteField);
        NoteFld.clear();
        SendKeys(NoteField, "Notes for FA");
        WaitForElementInteractable(IFAPopupBtn);
        ClickOn(IFAPopupBtn);
        WaitForCurserRunning(5);
        WaitUntilVisible(AbatementInfo);
        WebElement FAInfo = driver.findElement(AbatementInfo);
        if ((FAInfo.isDisplayed()) == false) {
            SoftAssert s118 = new SoftAssert();
            s118.assertEquals(false, true);
            s118.assertAll();
        }

    }

    public void ForcedAbatement_VerifyForcedStageBadge() {

        WebElement Forced = WaitUntilVisibleWE(ForcedBadge);
        if ((Forced.isDisplayed()) == false) {
            SoftAssert s119 = new SoftAssert();
            s119.assertEquals(false, true);
            s119.assertAll();

        }

    }

    public void ForcedAbatement_OpenEditFaNotePopup() throws InterruptedException {

        ScrollIntoView(EditFANoteLink);
        WaitForElementInteractable(EditFANoteLink);
        ClickByJsExecuter(EditFANoteLink);
        WaitForCurserRunning(4);
        WaitUntilVisible(EditNotePopup);
        String EditFAPopup = GetText(EditNotePopup);
        SoftAssert s119 = new SoftAssert();
        s119.assertEquals(EditFAPopup, "Edit FA Note");
        s119.assertAll();


    }

    public void ForcedAbatement_EditNoteInEditFaNoteField() {

        WaitForElementInteractable(NoteField);
        SendKeys(NoteField, " Edited*");

        String EditedFANote = GetText(NoteField);
        SoftAssert s120 = new SoftAssert();
        s120.assertEquals(EditedFANote, "Notes for FA Edited*");
        s120.assertAll();

    }

    public void ForcedAbatement_VerifyTheUpdatedNote() throws InterruptedException {

        WaitUntilVisible(SaveBtn);
        WaitForElementInteractable(SaveBtn);
        ClickOn(SaveBtn);
        WaitForCurserRunning(10);

        WaitUntilVisible(EditedNote);
        ScrollIntoView(EditedNote);
        String EditedFANote = driver.findElement(EditedNote).getText();
        SoftAssert s121 = new SoftAssert();
        s121.assertEquals(EditedFANote, "Notes for FA Edited*");
        s121.assertAll();

    }

    public void ForcedAbatement_VerifyAddActivityBtn() throws InterruptedException {
        WaitUntilVisible(AddActivityBtn);
        ScrollIntoView(AddActivityBtn);
        String ActivityBtn = GetText(AddActivityBtn);
        SoftAssert s122 = new SoftAssert();
        s122.assertEquals(ActivityBtn, "Add Activity");
        s122.assertAll();

    }

    public void ForcedAbatement_OpenAddForcedAbatementActivityPopup() throws InterruptedException {

        WaitForElementInteractable(PerformInsButton);
        ScrollIntoView(PerformInsButton);
        WaitForElementInteractable(AddActivityBtn);
        ClickByJsExecuter(AddActivityBtn);
        WaitForCurserRunning(3);
        WaitUntilVisible(FAactivityPopup);
        String AddFAActivity = GetText(FAactivityPopup);
        SoftAssert s123 = new SoftAssert();
        s123.assertEquals(AddFAActivity, "Add Forced Abatement Activity");
        s123.assertAll();

    }

    public void ForcedAbatement_VerifyFirstActivityBtnState() {
        WebElement FirstActivity = WaitUntilVisibleWE(FAToggleBtn);
        if (!(FirstActivity.isEnabled())) {
            Assert.assertFalse(true);
        }

    }

    public void ForcedAbatement_ValidationMsgForNoDataOfActivity() throws InterruptedException {
       try {
    	WaitForElementInteractable(FAToggleBtn, 2);
        ClickByJsExecuter(FAToggleBtn);
        WaitForElementInteractable(FAActivityBtn);
        ScrollIntoView(FAActivityBtn);
        WaitForElementInteractable(FAActivityBtn);
        ClickOn(FAActivityBtn);
       }
       catch(Exception e)
       {
    	   Thread.sleep(10000);
           ClickOn(FAActivityBtn);

       }
        WaitUntilVisible(ErrorMsgFA1);
        WebElement ErrorMsg1 = WaitUntilVisibleWE(ErrorMsgFA1);
        WebElement ErrorMsg2 = WaitUntilVisibleWE(ErrorMsgFA2);
        if (!(ErrorMsg1.isDisplayed()) && !ErrorMsg2.isDisplayed()) {

            SoftAssert s125 = new SoftAssert();
            s125.assertEquals(false, true);
            s125.assertAll();
        }
    }

    public void ForcedAbatement_VerifyDocumentNoteFieldPresence() {
        WaitForElementInteractable(SelectDocument);
        ClickOn(SelectDocument);
        WaitForElementInteractable(SelectHTML);
        ClickOn(SelectHTML);
        WebElement DocumentNote = WaitUntilVisibleWE(DocNoteTitle);
        if (!(DocumentNote.isDisplayed())) {
            SoftAssert s126 = new SoftAssert();
            s126.assertEquals(false, true);
            s126.assertAll();
        }

    }

    public void ForcedAbatement_ValidationMsgForEmptyDocumentNote() throws InterruptedException {
        WaitForElementInteractable(GenerateDocumentBtn);
        ClickOn(GenerateDocumentBtn);
        WaitUntilVisible(ValidMsgDocNote);
        WebElement ValidationDocNote = WaitUntilVisibleWE(ValidMsgDocNote);
        if (!(ValidationDocNote.isDisplayed())) {
            SoftAssert s127 = new SoftAssert();
            s127.assertEquals(false, true);
            s127.assertAll();
        }

    }

    public void ForcedAbatement_AddForcedAbatementActivity() throws InterruptedException {

        WaitForElementInteractable(LabelForText1);
        SendKeys(LabelForText1, "C123C456");
        SendKeys(LabelForNumber2, "12345");
        ClickOn(LabelForSelect3);
        WaitForElementInteractable(FirstOption);
        ClickOn(FirstOption);
        ScrollIntoView(ContinueToGenDoc);
        WaitForElementInteractable(ContinueToGenDoc);
        ClickOn(ContinueToGenDoc);
        WaitForCurserRunning(4);
        WaitForElementInteractable(selectFAADocArrow);
        ClickOn(selectFAADocArrow);
        WaitForElementInteractable(SelectFAADoc);
        ClickOn(SelectFAADoc);
        WaitForElementInteractable(GenFAADoc);
        ClickOn(GenFAADoc);
        WaitForCurserRunning(5);
        WaitForElementInteractable(By.xpath("//button[text()='Do Not Print']"));
        ClickOn(By.xpath("//button[text()='Do Not Print']"));
        ClickOn(GenerateDocAddFABtn);
        WaitForCurserRunning(5);
        WaitUntilVisible(AddedActivity);
        WebElement AddedActivities = driver.findElement(AddedActivity);
        if (!(AddedActivities.isDisplayed())) {
            SoftAssert s128 = new SoftAssert();
            s128.assertEquals(false, true);
            s128.assertAll();
        }

    }


    public static String actualEditFAApop;

    public void ForcedAbatement_OpenEditForcedAbatementActivityPopup() throws InterruptedException {


        WaitUntilVisible(EditActivityIcon);
        ScrollIntoView(EditActivityIcon);
        WaitForElementInteractable(EditActivityIcon);
        ClickByJsExecuter(EditActivityIcon);
        WaitForCurserRunning(4);

        WaitUntilVisible(EditFAAPopup);
        actualEditFAApop = GetText(EditFAAPopup);
        String ExpectedEditFATitle = "Edit Forced Abatement - Forced Abatement Activity";
        SoftAssert s129 = new SoftAssert();
        s129.assertEquals(actualEditFAApop, ExpectedEditFATitle);
        s129.assertAll();

    }

    public void ForcedAbatement_CloseEditForcedAbatementActivityPopup() throws InterruptedException {

        WaitForElementInteractable(LabelForText1);
        driver.findElement(LabelForText1).clear();
        SendKeys(LabelForText1, "Edited C123C456");
        WaitForElementInteractable(CancelBtnEditFA);
        ClickOn(CancelBtnEditFA);
        WaitForCurserRunning(10);

        WaitUntilVisible(ModalHeaders);
        List<WebElement> ModalHeadersFA = driver.findElements(ModalHeaders);
        if ((ModalHeadersFA.size() <= 1) == false) {

            SoftAssert s130 = new SoftAssert();
            s130.assertEquals(false, true);
            s130.assertAll();
        }

    }

    public void ForcedAbatement_EditAddedActivity() throws InterruptedException {


        WaitUntilVisible(LabelForText1);
        WaitForElementInteractable(LabelForText1);
        WebElement Label1 = driver.findElement(LabelForText1);
        Label1.clear();
        Label1.sendKeys("Edited C123C456");
        ScrollIntoView(EditSaveFAA);
        WaitForElementInteractable(EditSaveFAA);
        ClickOn(EditSaveFAA);
        WaitForCurserRunning(10);

        WaitUntilVisible(EditedLabelText1);
        String EditedLabelText = GetText(EditedLabelText1);
        SoftAssert s131 = new SoftAssert();
        s131.assertEquals(EditedLabelText, "Edited C123C456");
        s131.assertAll();

    }

    public void ForcedAbatement_ConfirmationPopupForDeletingActivity() throws InterruptedException {

        ScrollIntoView(DeleteActivityIcon);
        WaitForElementInteractable(DeleteActivityIcon);
        ClickByJsExecuter(DeleteActivityIcon);
        WaitForCurserRunning(7);
        WaitUntilVisible(ConfirmationPopup);
        WebElement ConfirmationIconFA = driver.findElement(ConfirmationPopup);
        if ((ConfirmationIconFA.isDisplayed()) == false) {

            SoftAssert s132 = new SoftAssert();
            s132.assertEquals(false, true);
            s132.assertAll();
        }
    }

    public void ForcedAbatement_DeleteAddedActivity() throws InterruptedException {

        WaitUntilVisible(YesDelete);
        WaitForElementInteractable(YesDelete);
        ClickOn(YesDelete);
//            
        WaitForCurserRunning(10);
        WaitUntilVisible(AddedActivity);
        List<WebElement> ActivityCount = driver.findElements(AddedActivity);
        if ((ActivityCount.size() <= 0) == false) {

            SoftAssert s133 = new SoftAssert();
            s133.assertEquals(false, true);
            s133.assertAll();
        }

    }


    public void ForcedAbatement_VerifyAbleToSelectActivityType() throws InterruptedException {


        CECommonMethodS.CE_AddAttachment("//TestData//" + Attachment1);
        forcedWaitTime(4);
        CECommonMethodS.CE_AddAttachmentBottom("//TestData//" + Attachment2);
        WaitForCurserRunning(5);
        WaitUntilVisible(violationLable);
        waterViolation = GetText(violationLable);
        contact1 = GetText(contactfirst);
        contact22 = GetText(contact2);
        ClickOn(AddActivityBtn);
        WaitForElementInteractable(ActivityType2);
        ClickOn(ActivityType2);
        WaitUntilVisible(By.xpath("//label[@title='Label']"));
        activity2Field = driver.findElement(By.xpath("//label[@title='Label']")).isDisplayed();
        WaitForElementInteractable(ActivityType3);
        ClickOn(ActivityType3);
        WaitUntilVisible(By.xpath("//label[@title='Response']"));
        activity3Field = driver.findElement(By.xpath("//label[@title='Response']")).isDisplayed();
        WaitForElementInteractable(FAToggleBtn);
        ClickOn(FAToggleBtn);

        SoftAssert s = new SoftAssert();
        s.assertEquals(activity2Field, Boolean.TRUE);
        s.assertEquals(activity3Field, Boolean.TRUE);
        s.assertAll();

        CECommonMethodS.CE_AddAttachmentAddActivityPage("//TestData//" + Attachment3);
        WaitForCurserRunning(10);

    }


    public void ForceAbatement_AbatementDetailsPopupopen() throws InterruptedException {

        WaitForElementInteractable(LabelForText1);
        SendKeys(LabelForText1, "C123C456");
        WaitForElementInteractable(LabelForNumber2);
        SendKeys(LabelForNumber2, "12345");
        ClickOn(LabelForSelect3);
        WaitForElementInteractable(FirstOption);
        ClickOn(FirstOption);
        ScrollIntoView(ContinueToGenDoc);
        WaitForElementInteractable(ContinueToGenDoc);
        ClickOn(ContinueToGenDoc);
        WaitForCurserRunning(5);
        WaitUntilVisible(abatementActivitySec);
        ScrollIntoView(abatementActivitySec);
        actualprogressActivity = GetText(activityProgress);
        AbatementDetailsPopup = driver.findElement(abatementDetailsPopup).isDisplayed();
        actualprogressAbDetails = GetText(progressDetails);

        SoftAssert s = new SoftAssert();
        s.assertEquals(actualprogressActivity, expectedprogressActivity);
        s.assertEquals(actualprogressAbDetails, expectedprogressAbDetail);
        s.assertEquals(AbatementDetailsPopup, Boolean.TRUE);
        s.assertAll();

    }


    public void ForceAbatement_AbatementDetailsDetails() throws InterruptedException {

        WaitUntilVisible(issueFAADate);
        IssueFAADate = GetText(issueFAADate);
        SendKeys(DocumentNoteField, "Document Note");
        fineSectionHeader = GetText(fineSection);
        //addedViolation = GetText(violationFileSec);
        addedRecipent1 = GetText(FAAcontact1);
        addedRecipent2 = GetText(FAAcontact2);
        addedRisponsoible1 = GetText(FAAResPosiblecontact1);
        addedRisponsoible2 = GetText(FAAResPosiblecontact2);
        FAASelectfaaDocLabel = GetText(FAASelectfaaDoc);
        FAADonotIsuueFineChkbox = driver.findElements(FAADonotIsuueFine).size();
        FAAAddAnotherFineLinktxt = driver.findElement(FAAAddAnotherFine).isDisplayed();
        SoftAssert s = new SoftAssert();
        s.assertEquals(FAADonotIsuueFineChkbox > 0, true);
        s.assertEquals(FAAAddAnotherFineLinktxt, Boolean.TRUE);
        s.assertEquals(IssueFAADate, "FAA Document Issue Date");
        if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("stage") || RunEnvironment.equalsIgnoreCase("production")) {
            s.assertEquals(fineSectionHeader, expectFineSectionHeader);
        } else {
            s.assertEquals(fineSectionHeader, expectFineSectionHeader);
        }
        //s.assertEquals(addedViolation, waterViolation);
        s.assertEquals(addedRecipent1, contact1);
        s.assertEquals(addedRecipent2, contact22);
        s.assertEquals(addedRisponsoible1, contact1);
        s.assertEquals(addedRisponsoible2, contact22);
        s.assertEquals(FAASelectfaaDocLabel, "Select an FAA Document");
        s.assertAll();


    }


    public void ForceAbatement_AttachmentSectionAppearFAADocSelected() throws InterruptedException {

        WaitUntilVisible(chooseFAHtmlDoc);
        ScrollIntoView(chooseFAHtmlDoc);
        WaitForElementInteractable(chooseFAHtmlDoc);
        ClickOn(chooseFAHtmlDoc);
        WaitUntilVisible(photoSection);
        ScrollIntoView(photoSection);
        String photocounts[] = driver.findElement(photoSection).getText().split(" ")[1].replace("(", " ").replace(")", " ").split("\\r?\\n");
        selectCheckBox = driver.findElements(selectAllCheckBox).size();
        photocount = Integer.parseInt((photocounts)[0].trim());
        List<String> Images = new ArrayList<>();
        System.out.println(Images.size());
        driver.findElements(photosAttached).stream().forEach(img -> Images.add(img.getText()));
        System.out.println(Images.size());

        ClickOn(viewphotos);
        WaitUntilVisible(photoDetailsHeader);
        viewPhotoDetails = GetText(photoDetailsHeader);
        ClickOn(closeBtn);
        WaitUntilElementInvisible(closeBtn);
        WaitForCurserRunning(4);
        System.out.println(Images.size());

        String images1 = Images.get(0);
        String images2 = Images.get(1);
        String images3 = Images.get(2);
        SoftAssert s = new SoftAssert();
        s.assertEquals(photocount, 3);
        s.assertEquals(viewPhotoDetails, "View Photo Details");
        s.assertEquals(selectCheckBox > 0, true);
        s.assertEquals(images1.contains(Attachment1.replace(".jpg", "")), true);
        s.assertEquals(images2.contains(Attachment2.replace(".jpg", "")), true);
        s.assertEquals(images3.contains(Attachment3.replace(".jpg", "")), true);
        s.assertAll();

    }


    public void ForceAbatement_ContactAppearUnderResponsibleParty() throws InterruptedException {

        scrolltoUp();
        WaitUntilVisible(exitAddActivity);
        ScrollIntoView(exitAddActivity);
        WaitUntilVisible(exitAddActivity);
        ClickOn(exitAddActivity);
        WaitUntilVisible(exitConfirmYesBtn);
        ClickOn(exitConfirmYesBtn);
        WaitUntilVisible(addContactCDP);
         ScrollIntoView(addContactCDP);
        WaitForElementInteractable(addContactCDP);
        ClickOn(addContactCDP);
        WaitUntilVisible(crtNewContactCDP);
        ScrollIntoView(crtNewContactCDP);
        WaitForElementInteractable(crtNewContactCDP);
        ClickOn(crtNewContactCDP);
        WaitUntilVisible(contactName);
        WaitForElementInteractable(contactName);
        String rnname = RandomStrings.RequiredCharacters(3);
        String name = rnname + "Name";
        SendKeys(contactName, name);
        ScrollIntoView(CCPUtility.CreateContactBtn2);
        WaitForElementInteractable(CCPUtility.CreateContactBtn2);
        ClickOn(CCPUtility.CreateContactBtn2);

        int Checkbtn = driver.findElements(createAnywayContact).size();
        if (Checkbtn > 0) {

            ClickOn(createAnywayContact);


        }
        WaitUntilVisible(CCPUtility.PropertyOwnerOption);
        ClickOn(CCPUtility.PropertyOwnerOption);
        WaitUntilVisible(CCPUtility.ApplyButton);
        ClickOn(CCPUtility.ApplyButton);
        WaitUntilElementInvisible(CCPUtility.ApplyButton);
        ClickByJsExecuter(billtoContact2);
        WaitForCurserRunning(2);
        WaitUntilPresent(billtoContact3);
        ClickByJsExecuter(billtoContact3);
        WaitForCurserRunning(2);
        WaitUntilVisible(Selectedcontact1);
        addedRisponsoible1 = GetText(Selectedcontact1);
        addedRisponsoible2 = GetText(Selectedcontact2);

        ScrollIntoView(AddActivityBtn);
        WaitUntilPresent(AddActivityBtn);
        WaitForElementInteractable(AddActivityBtn);
        ClickByJsExecuter(AddActivityBtn);
        WaitUntilElementInvisible(AddActivityBtn);
        WaitForElementInteractable(LabelForText1);
        SendKeys(LabelForText1, "C123C456");
        SendKeys(LabelForNumber2, "12345");
        ClickOn(LabelForSelect3);
        WaitForElementInteractable(FirstOption);
        ClickOn(FirstOption);
        ScrollIntoView(ContinueToGenDoc);
        WaitForElementInteractable(ContinueToGenDoc);
        ClickOn(ContinueToGenDoc);

        CECommonMethodS.CE_AddAttachmentAddActivityPage("//TestData//" + Attachment3);

        contact1 = GetText(FAAResPosiblecontact1);
        contact22 = GetText(FAAResPosiblecontact2);

        SoftAssert s = new SoftAssert();
        s.assertEquals(addedRisponsoible1.split("\\r?\\n")[0], contact1);
        s.assertEquals(addedRisponsoible2.split("\\r?\\n")[0], contact22);

        s.assertAll();


    }


    public void ForceAbatement_SelectedAttachmentPopulatedonPrintPreview() throws InterruptedException {



        ScrollIntoView(selectImgFAA1);

        ClickByJsExecuter(selectImgFAA1);

        ClickByJsExecuter(selectImgFAA2);

        SelectedImag1 = driver.findElement(selectedImagFAA1).getText();
        SelectedImag2 = driver.findElement(selectedImahFAA2).getText();
        ScrollIntoView(GenFAADoc);

        ClickOn(GenFAADoc);


        driver.switchTo().frame(driver.findElement(printPreviewFrame));

        actualImag1 = driver.findElement(imagedetTabTitle1).getText().split(":")[1].trim();
        actualImag2 = driver.findElement(imagedetTabTitle2).getText().split(":")[1].trim();

        SoftAssert s = new SoftAssert();
        s.assertEquals(actualImag1, SelectedImag1);
        s.assertEquals(actualImag2, SelectedImag2);
        s.assertAll();

        driver.switchTo().defaultContent();

        ClickOn(donotPrint);
        ClickOn(GenerateDocAddFABtn);

        ForcedAbatement_ConfirmationPopupForDeletingActivity();
        ForcedAbatement_DeleteAddedActivity();


    }
}
