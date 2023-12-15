package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import CommonMethods.CECommonMethods;
import CommonMethods.CheckDownloadedFile;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import TestCases.CCP;
import TestCases.CLP;
import TestCases.ForcedAbatement;

public class CDP_Utility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	PerformInspectionUtility PI;
	CCPUtility ccp;
	ForcedAbatementUtility FA;
	CECommonMethods CEcommonMethod;
	CLPUtility clp;
	OnlinePaymentUtility op;

	public CDP_Utility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		PI = new PerformInspectionUtility(driver);
		ccp = new CCPUtility(driver);
		FA = new ForcedAbatementUtility(driver);
		CEcommonMethod = new CECommonMethods(driver);
		clp = new CLPUtility(driver);
		op = new OnlinePaymentUtility(driver);
	}

	SoftAssert softAssert = new SoftAssert();

	public By Assignee = By
			.xpath("//label[text()='Assigned to']//parent::div//div[@class='dropdown__selector__selected']//label");
	public By AssineeArrow = By
			.xpath("//label[text()='Assigned to']//parent::div//div[@class='dropdown__selector__selected']//span");
	public By AssingeeNotSelOpt = By.xpath("(//div[@id='caseAssignee']//li[@class='option'])[3]");
	public By serachAssingee = By.xpath("//input[@placeholder='Search...'][@name='query']");
	public By searchedAssingee = By.xpath("//div[@id='caseAssignee']//li[@class='option']//b");
	public By timeTackinglnk = By.cssSelector("a.time-tracking");
	public By timeTackingModel = By.xpath("(//div[@class='modal-header'])[2]");
	public By timeLogDatePicker = By.xpath("//input[@name='date']//following-sibling::span");
	public By timeLogDueDatePicker = By.xpath("//input[@placeholder='Due Time']//following-sibling::span");
	public By timeLogStartDatePicker = By.xpath("//input[@placeholder='Start Time']//following-sibling::span");
	public By dateNextPick = By.xpath("(//td[@class='rdtDay rdtActive rdtToday']//following-sibling::td)[1]");
	public By timeLogHour = By.xpath("//input[@name='hours']");
	public By timeLogNote = By.xpath("//textarea[@name='note']");
	public By addTimeLoggBtn = By.xpath("//div[@class='add-time-log']//button");
	public By deleteYesTimeLog = By.xpath("//div[@class='flex-row--middle']//button[contains(text(),'Yes, Delete')]");
	public By closeTimeTracking = By.xpath("//div[@class='modal-footer']//button[contains(text(),'Close')]");
	public By abatementActivityTile = By.cssSelector("div.abatement-activities__title-wrapper h2");
	public By caseActivity = By.cssSelector("h4.case-activity__label");
	public By nextInspection = By.cssSelector("div.abatement-activities__next-details h4");
	public By addContact = By.cssSelector(
			"input[autocomplete='new-password'][placeholder='Find contact by name, email or phone number or start typing to create a new contact']");
	public By editContact = By
			.xpath("(//div[@class='contact__actions']//button[@class='edit-btn  btn btn-primary'])[2]");
	public By contactName = By.xpath("(//div[@class='contact__name-role']//label//b)[2]");
	public By contactNameList = By.xpath("//div[@class='contact__name-role']//label//b");
	public By deleteContact = By.xpath("(//div[@class='contact__actions']//button[@class='delete-btn  btn btn-primary'])[2]");
	public By contactTileCount = By.xpath("//h2[contains(text(),'Contact')]");
	public By createNewContact = By.xpath("//div[@class='react-autosuggest__function']//span[text()='Create a  new contact']");
	public By createContactButton = By.xpath("//div[@class='full-page-modal__header']//button[2]");
	public By editCustomTilebtn = By.xpath("//h2[text()='Custom Tile']//following-sibling::button");
	public By editCustomTilePop = By.xpath("//div[text()='Edit Custom Tile']");
	public By saveCustomUpdate = By.xpath("//button[text()='Save Changes']");
	public By addAttachmentCDP = By.xpath("//span[contains(text(),'Attachments')]//parent::h2//button[@class='attach-btn btn btn-primary']");
	public By attachemntTileCDP = By.xpath("//span[contains(text(),'Attachments')]");
	public By attachemntImg = By.xpath("//div[@class='attachments-tile__photo-container']//img");
	public By YesDeleteButton = By.xpath("//button[text()='Yes, Delete']");
	public By updateAttachments = By.xpath("//button[text()='Update']");
	public By selectPhotobtn = By.xpath("//button[text()='Select Photos']");
	public By deSelectPhotos = By.xpath("//button[text()='Delete Selected']");
	public By printSelectedPhotos = By.xpath("//button[text()='Print Selected']");
	public By downloadSelectedPhotos = By.xpath("//button[text()='Download Selected']");
	public By tickPhoto = By.xpath("(//div[@class='tick--not-selected'])[1]");
	public By PhotoTickSelected = By.xpath("//div[@class='tick--selected']");
	public By selectPhotsDetails = By.xpath("(//div[@class='tick--selected']//following-sibling::div[@class='file-details']//span)[1]");
	public By printViewPage = By.xpath("//h4[contains(text(),'Print Images')]");
	public By printedPhotoDetail = By.xpath("(//div[@class='view-print-images__image-info']//p)[2]");
	public By generateNotice = By.xpath("//button[text()='Generate Notice']");
	public By generateNoticePopUp = By.xpath("//div[@class='perform-inspection__title-text']//b");
	public By continueButton = By.xpath("(//button[text()='Continue'])[1]");
	public By continueButton2 = By.xpath("(//button[text()='Continue'])[2]");
	public By continueButton3 = By.xpath("(//button[text()='Continue'])[3]");
	public By htmlNoticeTooglebtn = By.xpath("(//button[contains(text(),'HTML')])[1]");
	public By noticeindependent = By
			.xpath("//h4[contains(text(),'Notice created independent of Follow-up inspection')]");
	public By applyNoticesbtn = By.xpath("//button[text()='Apply Notice']");
	public By manageNotice = By.xpath("//a[text()='Manage Notice']");
	public By deleteNotice = By.xpath("//a[text()='Delete']");
	public By deleteAndReissueNotice = By.xpath("//a[text()='Delete and Reissue']");
	public By independentNotice = By.cssSelector("div.abatement-activities__draft-notice div h4");
	public By caseHistory = By.xpath("//a[@class='view-history']");
	public By closebtn = By.xpath("//button[text()='Close']");
	public By editViolation = By.cssSelector("div.edit-entity__button-wrapper button");
	public By closeCrosEditViolation = By.cssSelector("div[class='modal-header'] button[aria-label='Close']");
	public By editVioNotes = By.xpath("//textarea[@name='Note']");
	public By editEntityAge = By.xpath("//input[@placeholder='Enter Number'][@type='NUMBER']");
	public By editVioSavebtn = By.xpath("//div[@class='entity-modal__footer']//button[text()='Save']");
	public By entityAge = By.xpath("//div[@class='entity-info']//div[contains(text(),'Age')]//following-sibling::div");
	public By entityNotesDetails = By
			.xpath("//div[@class='entity-info']//following-sibling::label//span[@class='clipped-text']");
	public By caseInitiation = By
			.xpath("//label[text()='Case Initiation']//parent::div//div[@class='dropdown__selector__selected']//label");

	public String assingeeBefore;
	public String assingeeAfter;
	public String timeTackingHeader;

	public boolean timeLoggedAssingee;
	public boolean timeLoggedhour;
	public boolean timeLoggedNote;
	public int timeLogDeleted;
	public boolean AbatementActivityTile;
	public boolean CaseActvityTile;
	public boolean NextInspectiontile;
	public boolean caseActivityTileTxt;
	public boolean NextInspectiontileTxt;
	public boolean EditedContactName;
	public boolean ContactEdited;
	public int deletedContact;
	public int contactCountAfter;
	public int contactCountBefore;
	public int contactTile;

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	public String deleteTimeLogBtn(String note) {
		return "//span[text()='" + note + "']//ancestor::div[@role='gridcell']//following-sibling::div//button";

	}

	public String editCustomefields(int index) {
		return "(//div[@class='custom-field-form__wrapper']//input)[" + index + "]";
	}

	public String actualCaseInitation;

	public void CDP_CaseDetailPagePreRequisite() throws InterruptedException {

		PI.PerformInspection_VerifyCreatAndPerformInspection();
		WaitUntilVisible(caseInitiation);
		actualCaseInitation = GetText(caseInitiation);

	}

	public void CDP_UserAbleToChangeAssignee() throws InterruptedException {
		WaitUntilVisible(Assignee);
		assingeeBefore = GetText(Assignee);
		System.out.println(assingeeBefore);
		ClickOn(AssineeArrow);
		WaitUntilVisible(AssingeeNotSelOpt);
		ClickOn(AssingeeNotSelOpt);
		WaitForCurserRunning(2);
		WaitUntilVisible(Assignee);
		WaitUntilVisible(AssineeArrow);
		WaitForElementInteractable(AssineeArrow);
		// ClickByJsExecuter(AssineeArrow);
		// WaitUntilPresent(serachAssingee);
		// WaitForElementInteractable(serachAssingee);
		// SendKeys(serachAssingee, assingeeBefore);
		// WaitUntilVisible(searchedAssingee);
		// ClickByJsExecuter(searchedAssingee);
		WaitForCurserRunning(2);
		WaitUntilVisible(Assignee);
		assingeeAfter = GetText(Assignee);
		System.out.println(assingeeAfter);
		softAssert.assertNotEquals(assingeeBefore, assingeeAfter, "Both Assignee are Same.");
		softAssert.assertAll();

	}

	public void CDP_VerifyUserDirectedToTimeTracking() throws InterruptedException {
		WaitUntilPresent(timeTackinglnk);
		ClickOn(timeTackinglnk);
		WaitForCurserRunning(2);
		WaitUntilVisible(timeTackingModel);
		timeTackingHeader = GetText(timeTackingModel);
		softAssert.assertEquals(timeTackingHeader, "Time Tracking");
		softAssert.assertAll();

	}

	public void CDP_VerifyUserAbleToAddTimeLogOnTimeTracking() throws InterruptedException {
		WaitUntilVisible(timeLogDatePicker);
		// ClickOn(timeLogDatePicker);
		// WaitUntilVisible(By.cssSelector("td.rdtDay"));
		String assingee = GetText(By.xpath("(//div[@class='multi-choice-buttons']//button)[1]"));
		// WaitUntilVisible(dateNextPick);
		// ClickOn(dateNextPick);
		SendKeys(timeLogHour, "1.00");
		SendKeys(timeLogNote, "Time Log Added For Case");
		ClickOn(addTimeLoggBtn);
		WaitForCurserRunning(5);
		WaitUntilVisible(By.xpath("//div[@role='grid']//div[@role='gridcell']"));
		String AddedTimeNote = GetText(By.xpath("(//div[@role='grid']//div[@role='gridcell'])[5]"));
		String AddedHour = GetText(By.xpath("(//div[@role='grid']//div[@role='gridcell'])[4]"));
		String Addedassingee = GetText(By.xpath("(//div[@role='gridcell'][2])"));
		timeLoggedAssingee = assingee.equalsIgnoreCase(Addedassingee);
		timeLoggedhour = AddedHour.equalsIgnoreCase("1.00");
		timeLoggedNote = AddedTimeNote.equalsIgnoreCase("Time Log Added For Case");

		softAssert.assertTrue(timeLoggedAssingee);
		softAssert.assertTrue(timeLoggedhour);
		softAssert.assertTrue(timeLoggedNote);
		softAssert.assertAll();

	}

	public void CDP_VerifyUserAbleToDeleteAddedLogTime() throws InterruptedException {
		WaitUntilVisible(By.xpath(deleteTimeLogBtn("Time Log Added For Case")));
		ClickOn(By.xpath(deleteTimeLogBtn("Time Log Added For Case")));
		WaitUntilVisible(deleteYesTimeLog);
		WaitForElementInteractable(deleteYesTimeLog);
		ClickOn(deleteYesTimeLog);
		WaitForCurserRunning(5);
		timeLogDeleted = fineElementsSize(By.xpath(deleteTimeLogBtn("Time Log Added For Case")));
		WaitUntilVisible(closeTimeTracking);
		ClickOn(closeTimeTracking);
		WaitUntilElementInvisible(closeTimeTracking);
		softAssert.assertTrue(timeLogDeleted == 0);
		softAssert.assertAll();

	}

	public void CDP_VerifyAbatementActivityTile() throws InterruptedException {
		WaitUntilVisible(abatementActivityTile);
		AbatementActivityTile = findElement(abatementActivityTile).isDisplayed();
		CaseActvityTile = findElement(caseActivity).isDisplayed();
		String caseActivityTxt = GetText(caseActivity);
		NextInspectiontile = findElement(nextInspection).isDisplayed();
		String nextInsepectionTxt = GetText(nextInspection);
		caseActivityTileTxt = caseActivityTxt.equalsIgnoreCase("Case Created");
		NextInspectiontileTxt = nextInsepectionTxt.contains("Follow-up Inspection");
		softAssert.assertTrue(AbatementActivityTile);
		softAssert.assertTrue(CaseActvityTile);
		softAssert.assertTrue(NextInspectiontile);
		softAssert.assertTrue(caseActivityTileTxt);
		softAssert.assertTrue(NextInspectiontileTxt);
		softAssert.assertAll();

	}

	public void CDP_VerifyUserAbletoEditContact() throws InterruptedException {
		WaitUntilVisible(addContact);
		ScrollIntoView(addContact);
		WaitForElementInteractable(editContact);
		ClickOn(editContact);
		WaitForCurserRunning(2);
		WaitUntilVisible(By.xpath(ccp.nameField));
		String contactBeforEdit = GetValueAttribute(By.xpath(ccp.nameField));
		String newContactName = RandomStrings.RequiredCharacters(8);
		Clear(By.xpath(ccp.nameField));
		SendKeys(By.xpath(ccp.nameField), newContactName);
		WaitForElementInteractable(By.xpath(clp.saveButton));
		ClickOn(By.xpath(clp.saveButton));
		WaitUntilElementInvisible(By.xpath(clp.saveButton));
		WaitForCurserRunning(3);
		WaitUntilVisible(contactName);
		String contactAfterEdit = GetText(contactName);
		EditedContactName = newContactName.equalsIgnoreCase(contactAfterEdit);
		ContactEdited = !(contactBeforEdit.equalsIgnoreCase(newContactName));
		WaitUntilVisible(deleteContact);
		softAssert.assertTrue(EditedContactName);
		softAssert.assertTrue(ContactEdited);
		softAssert.assertAll();

	}

	public void CDP_VerifyUserAbletoDeleteContact() throws InterruptedException {
		WaitUntilVisible(deleteContact);
		contactCountBefore = fineElementsSize(contactNameList);
		WaitForElementInteractable(deleteContact);
		ClickOn(deleteContact);
		WaitForCurserRunning(5);
		WaitUntilVisible(addContact);
		deletedContact = fineElementsSize(deleteContact);
		contactCountAfter = fineElementsSize(contactNameList);
		contactTile = Integer
				.parseInt(GetText(contactTileCount).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		softAssert.assertTrue(deletedContact == 0);
		softAssert.assertEquals(contactCountAfter, contactCountBefore - 1);
		softAssert.assertEquals(contactTile, contactCountAfter);
		softAssert.assertAll();

	}

	public String LegalContactCustome = "label[title='LegalContact']";
	public String IndiviualContactCustome = "label[title='IndiviualContact']";
	public boolean IndiviualContCustField;

	public int BeforeAddingContact;
	public boolean LegalContCustField;
	public int AfterAddingContact;

	public void AddNewContactCDP(String contactType, String customeFieldval, int contactCount)
			throws InterruptedException {
		BeforeAddingContact = Integer
				.parseInt(GetText(contactTileCount).split(" ")[1].replace("(", " ").replace(")", " ").trim());

		for (int z = 0; z < contactCount; z++) {
			String RandomName = RandomStrings.RequiredCharacters(8);
			String RandomMail = RandomName + "@yopmail.com";
			String RandomContact = RandomStrings.RequiredDigits(10);
			WaitUntilVisible(addContact);
			ClickOn(addContact);
			ClickOn(createNewContact);
			SendKeys(ccp.NameField, RandomName);
			SendKeys(ccp.EmailField, RandomMail);
			SendKeys(ccp.WorkPhoneField, RandomContact);

			if (contactType.equalsIgnoreCase("Legal Entity")) {
				ClickOn(By.xpath("//button[text()='" + contactType + "']"));
				WaitUntilVisible(By.cssSelector(LegalContactCustome));
				LegalContCustField = findElement(By.cssSelector(LegalContactCustome)).isDisplayed();
				if (customeFieldval.equalsIgnoreCase("Yes")) {
					WebElement element = findElement(By.xpath(
							"//label[@title='LegalContact']//parent::div//following-sibling::div/input[@placeholder='Enter Text']"));
					element.sendKeys("Legal" + RandomStrings.RequiredString(4));
				}
			} else {
				ClickOn(By.xpath("//button[text()='" + contactType + "']"));
				WaitUntilVisible(By.cssSelector(IndiviualContactCustome));
				WaitUntilVisible(By.cssSelector(IndiviualContactCustome));
				IndiviualContCustField = findElement(By.cssSelector(IndiviualContactCustome)).isDisplayed();
				if (customeFieldval.equalsIgnoreCase("Yes")) {
					WebElement element = findElement(By.xpath(
							"//label[@title='IndiviualContact']//parent::div//following-sibling::div/input[@placeholder='Enter Text']"));
					element.sendKeys("Legal" + RandomStrings.RequiredString(4));
				}
			}

			WaitForElementInteractable(createContactButton);
			ClickOn(createContactButton);

			WaitForElementInteractable(ccp.PropertyOwnerOption);
			ClickOn(ccp.PropertyOwnerOption);
			ClickOn(ccp.ApplyButton);
		}
		WaitForCurserRunning(2);
		WaitUntilVisible(contactTileCount);
		AfterAddingContact = Integer
				.parseInt(GetText(contactTileCount).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		softAssert.assertEquals(AfterAddingContact, BeforeAddingContact + 1);
		softAssert.assertAll();

	}

	public void CDP_VerifyUserAbletoAddNewContact() throws InterruptedException {
		AddNewContactCDP("Individual", "No", 1);
	}

	public boolean billToContact;

	public void CDP_VerifyUserAbletoSelectetheContactAsBilltoContact() throws InterruptedException {
		WaitUntilVisible(FA.billtoContact2);
		ScrollIntoView(FA.billtoContact2);
		ClickByJsExecuter(FA.billtoContact2);
		WaitForCurserRunning(2);
		WaitUntilVisible(FA.billtoContact2);
		billToContact = ElementIsSelected(FA.billtoContact2);
		Assert.assertTrue(billToContact);
	}

	public boolean editCustomeTile;
	public boolean field1;
	public boolean field2;
	public boolean field3;

	public void CDP_VerifyUserAbletoUpdateCustomeTileFields() throws InterruptedException {
		WaitUntilVisible(editCustomTilebtn);
		ScrollIntoView(editCustomTilebtn);
		ClickOn(editCustomTilebtn);
		WaitUntilVisible(editCustomTilePop);
		editCustomeTile = ElementIsDisplayed(editCustomTilePop);
		String field1Before = GetValueAttribute(By.xpath(editCustomefields(1)));
		String field2Before = GetValueAttribute(By.xpath(editCustomefields(2)));
		String field3Before = GetValueAttribute(By.xpath(editCustomefields(3)));
		Clear(By.xpath(editCustomefields(1)));
		Clear(By.xpath(editCustomefields(2)));
		Clear(By.xpath(editCustomefields(3)));

		SendKeys(By.xpath(editCustomefields(1)), RandomStrings.RequiredString(6));
		SendKeys(By.xpath(editCustomefields(2)), RandomStrings.RequiredString(6));
		SendKeys(By.xpath(editCustomefields(3)), RandomStrings.RequiredString(6));

		WaitUntilVisible(saveCustomUpdate);
		ClickOn(saveCustomUpdate);
		WaitForCurserRunning(3);

		WaitUntilVisible(editCustomTilebtn);
		ScrollIntoView(editCustomTilebtn);
		ClickByJsExecuter(editCustomTilebtn);
		WaitUntilVisible(editCustomTilePop);

		String field1after = GetValueAttribute(By.xpath(editCustomefields(1)));
		String field2after = GetValueAttribute(By.xpath(editCustomefields(2)));
		String field3after = GetValueAttribute(By.xpath(editCustomefields(3)));

		field1 = (field1after.length() > 0) && !(field1after.equalsIgnoreCase(field1Before));
		field2 = (field2after.length() > 0) && !(field2after.equalsIgnoreCase(field2Before));
		field3 = (field3after.length() > 0) && !(field3after.equalsIgnoreCase(field3Before));

		WaitUntilPresent(By.xpath("//button[text()='Cancel']"));
		ClickOn(By.xpath("//button[text()='Cancel']"));
		Assert.assertTrue(editCustomeTile);
		Assert.assertTrue(field1);
		Assert.assertTrue(field2);
		Assert.assertTrue(field3);

	}

	public boolean attachemntCount;

	public void CDP_VerifyUserAbletoAddMultipleAttachment() throws InterruptedException {
		int BeforeAttachmentCount = Integer
				.parseInt(GetText(attachemntTileCDP).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		System.out.println(BeforeAttachmentCount);
		CEcommonMethod.CE_AddAttachmentCDP(CEcommonMethod.SetTestDataFilePath("Panda_11zon.jpg"));
		WaitForCurserRunning(4);
		WaitUntilVisible(attachemntTileCDP);
		forcedWaitTime(2);
		CEcommonMethod.CE_AddAttachmentCDP(CEcommonMethod.SetTestDataFilePath("Jellyfish_11zon.jpg"));
		WaitForCurserRunning(4);
		WaitUntilVisible(attachemntTileCDP);
		int AfterAttachmentCount = Integer
				.parseInt(GetText(attachemntTileCDP).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		attachemntCount = (BeforeAttachmentCount + 2) == (AfterAttachmentCount);
		Assert.assertTrue(attachemntCount);

	}

	public boolean DeleteattachemntCount;

	public void CDP_VerifyUserAbletoDeleteAttachment() throws InterruptedException {
		int BeforeAttachmentCount = Integer
				.parseInt(GetText(attachemntTileCDP).split(" ")[1].replace("(", " ").replace(")", " ").trim());

		WaitUntilVisible(attachemntImg);
		List<WebElement> Attachemnts = findElementsByXPath(attachemntImg);
		int LastIndex = Attachemnts.size() - 1;
		(Attachemnts.get(LastIndex)).click();
		WaitUntilVisible(By.xpath("//div[text()='Attachments Details']"));
		WaitUntilVisible(By.xpath(
				"(//div[@class='attachments-edit__saved-summary']//button[@class='delete-btn  btn btn-primary'])[4]"));
		ScrollIntoView(By.xpath(
				"(//div[@class='attachments-edit__saved-summary']//button[@class='delete-btn  btn btn-primary'])[4]"));
		ClickOn(By.xpath(
				"(//div[@class='attachments-edit__saved-summary']//button[@class='delete-btn  btn btn-primary'])[4]"));
		WaitUntilVisible(YesDeleteButton);
		WaitForElementInteractable(YesDeleteButton);
		ClickOn(YesDeleteButton);
		WaitForCurserRunning(5);
		WaitUntilVisible(updateAttachments);
		WaitForElementInteractable(updateAttachments);
		ClickOn(updateAttachments);
		WaitForCurserRunning(3);
		WaitUntilVisible(attachemntImg);
		int AfterAttachmentCount = Integer
				.parseInt(GetText(attachemntTileCDP).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		DeleteattachemntCount = (BeforeAttachmentCount - AfterAttachmentCount) == 1;

		Assert.assertTrue(DeleteattachemntCount);

	}

	public boolean PrintedPhoto;

	public void CDP_VerifyUserAblePrintSelectedAttatchment() throws InterruptedException {
		WaitUntilVisible(selectPhotobtn);
		ClickOn(selectPhotobtn);
		WaitUntilVisible(deSelectPhotos);
		WaitUntilVisible(printSelectedPhotos);
		WaitUntilVisible(downloadSelectedPhotos);
		WaitUntilVisible(tickPhoto);
		ClickOn(tickPhoto);
		WaitUntilVisible(PhotoTickSelected);
		String photoDetails = GetText(selectPhotsDetails);
		ClickOn(printSelectedPhotos);
		forcedWaitTime(2);
		WaitForCurserRunning(4);
		String currentWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		WaitForPageLoadTime(3);
		WaitUntilVisible(printViewPage);
		String actualPhoto = GetText(printedPhotoDetail);
		PrintedPhoto = photoDetails.equalsIgnoreCase(actualPhoto);
		driver.switchTo().window(currentWindow);
		Assert.assertTrue(PrintedPhoto);

	}

	public String attachmentDownloaded;

	public void CDP_VerifyUserAbleDownloadSelectedAttatchment() throws InterruptedException {
		WaitUntilVisible(selectPhotobtn);
		ClickOn(selectPhotobtn);
		WaitUntilVisible(deSelectPhotos);
		WaitUntilVisible(printSelectedPhotos);
		WaitUntilVisible(downloadSelectedPhotos);
		WaitUntilVisible(tickPhoto);
		ClickOn(tickPhoto);
		WaitUntilVisible(PhotoTickSelected);
		String photoDetails = GetText(selectPhotsDetails);
		ClickOn(downloadSelectedPhotos);
		forcedWaitTime(4);
		System.out.println(attachmentDownloaded);
		WaitUntilVisible(By.xpath("//button[text()='Cancel']"));
		ClickOn(By.xpath("//button[text()='Cancel']"));
		WaitUntilElementInvisible(By.xpath("//button[text()='Cancel']"));
		attachmentDownloaded = CheckDownloadedFile.isFileDownloaded(photoDetails);
		Assert.assertEquals(attachmentDownloaded, "File Present");

	}

	public boolean NoticeAppear;
	public By queueToPrint = By.xpath("//div[@class='case-inspection__print-notice']//button[text()='Queue To Print']");

	public void CDP_VerifyUserAbleGenerateNoticeOutsideofInspection() throws InterruptedException {
		WaitUntilVisible(generateNotice);
		ScrollIntoView(generateNotice);
		WaitForElementInteractable(generateNotice);
		Thread.sleep(5000);
		ClickOn(generateNotice);
		WaitUntilVisible(generateNoticePopUp);
		WaitUntilVisible(continueButton);
		ScrollIntoView(continueButton);
		ClickByJsExecuter(continueButton);
		WaitUntilVisible(htmlNoticeTooglebtn);
		ClickOn(htmlNoticeTooglebtn);
		WaitUntilVisible(continueButton2);
		ScrollIntoView(continueButton2);
		ClickByJsExecuter(continueButton2);
		WaitUntilVisible(By.cssSelector("a.view-photos"));
		WaitUntilVisible(continueButton3);
		ScrollIntoView(continueButton3);
		ClickByJsExecuter(continueButton3);
		WaitUntilVisible(By.cssSelector("#skip-inspection"));
		ClickByJsExecuter(By.cssSelector("#skip-inspection"));
		CEcommonMethod.selectUserScheduleFollowUpInspection("Amandeep");
		WaitUntilVisible(By.xpath("(//button[text()='Generate Notice'])[2]"));
		ScrollIntoView(By.xpath("(//button[text()='Generate Notice'])[2]"));
		ClickOn(By.xpath("(//button[text()='Generate Notice'])[2]"));
		WaitForCurserRunning(4);
		Thread.sleep(5000);
		WaitForElementInteractable(queueToPrint);
		ClickByJsExecuter(queueToPrint);
		WaitUntilVisible(By.xpath("(//button[text()='Generate Notice'])[3]"));
		ScrollIntoView(By.xpath("(//button[text()='Generate Notice'])[3]"));
		ClickOn(By.xpath("(//button[text()='Generate Notice'])[3]"));
		WaitForCurserRunning(5);
		WaitUntilVisible(noticeindependent);
		NoticeAppear = ElementIsDisplayed(noticeindependent);
		Assert.assertTrue(NoticeAppear);

	}

	public boolean NoticeDeletedAppear;

	public void CDP_VerifyUserAbleToDeleteNotice() throws InterruptedException {
		WaitUntilVisible(manageNotice);
		ScrollIntoView(manageNotice);
		ClickOn(manageNotice);
		WaitForCurserRunning(2);
		WaitUntilVisible(deleteNotice);
		WaitUntilVisible(deleteAndReissueNotice);
		ClickOn(deleteNotice);
		WaitUntilVisible(By.xpath("//button[text()='Yes']"));
		ClickOn(By.xpath("//button[text()='Yes']"));
		WaitForCurserRunning(5);
		NoticeDeletedAppear = ElementIsDisplayed(noticeindependent);
		Assert.assertFalse(NoticeDeletedAppear);

	}

	public boolean reissuedNotice;

	public void CDP_VerifyUserAbleToDeleteAndReissueNotice() throws InterruptedException {
		refreshPage();
		WaitForCurserRunning(4);
		CDP_VerifyUserAbleGenerateNoticeOutsideofInspection();
		String previousNotice = GetText(independentNotice);
		System.out.println("prev notice "+previousNotice);
		Thread.sleep(5000);
		WaitUntilVisible(manageNotice);
		ScrollIntoView(manageNotice);
		ClickOn(manageNotice);
		WaitForCurserRunning(2);
		WaitUntilVisible(deleteNotice);
		WaitUntilVisible(deleteAndReissueNotice);
		WaitForElementInteractable(deleteAndReissueNotice);
		ClickOn(deleteAndReissueNotice);
		WaitUntilVisible(By.xpath("//button[text()='Yes']"));
		ClickOn(By.xpath("//button[text()='Yes']"));
		WaitForCurserRunning(5);
		WaitUntilVisible(generateNoticePopUp);
		WaitUntilVisible(continueButton);
		ScrollIntoView(continueButton);
		ClickByJsExecuter(continueButton);
		WaitUntilVisible(By.xpath("(//button[contains(text(),'HTML')])[2]"));
		ClickOn(By.xpath("(//button[contains(text(),'HTML')])[2]"));
		WaitUntilVisible(continueButton2);
		ScrollIntoView(continueButton2);
		ClickByJsExecuter(continueButton2);
		WaitUntilVisible(By.cssSelector("a.view-photos"));
		WaitUntilVisible(continueButton3);
		ScrollIntoView(continueButton3);
		ClickByJsExecuter(continueButton3);
		WaitUntilVisible(By.cssSelector("#skip-inspection"));
		ClickByJsExecuter(By.cssSelector("#skip-inspection"));
		CEcommonMethod.selectUserScheduleFollowUpInspection("Amandeep");
		WaitUntilVisible(By.xpath("(//button[text()='Generate Notice'])[2]"));
		ScrollIntoView(By.xpath("(//button[text()='Generate Notice'])[2]"));
		ClickOn(By.xpath("(//button[text()='Generate Notice'])[2]"));
		WaitForCurserRunning(4);
		WaitForElementInteractable(queueToPrint);
		ClickOn(queueToPrint);
		WaitUntilVisible(By.xpath("(//button[text()='Generate Notice'])[3]"));
		ScrollIntoView(By.xpath("(//button[text()='Generate Notice'])[3]"));
		ClickOn(By.xpath("(//button[text()='Generate Notice'])[3]"));
		WaitForCurserRunning(5);
		WaitUntilVisible(noticeindependent);
		NoticeAppear = ElementIsDisplayed(noticeindependent);
		String NewNotice = GetText(independentNotice);
		System.out.println("new notice "+ NewNotice);
		reissuedNotice = !(NewNotice.equalsIgnoreCase(previousNotice));

		Assert.assertTrue(reissuedNotice);

	}

	public String noticeApplied;

	public void CDP_VerifyUserAbleApplyNoticeOutsideofInspection() throws InterruptedException {
		Thread.sleep(5000);
		WaitUntilVisible(applyNoticesbtn);
		ScrollIntoView(applyNoticesbtn);
		
		ClickOn(applyNoticesbtn);
		WaitUntilVisible(By.cssSelector("#skip-inspection"));
		ClickByJsExecuter(By.cssSelector("#skip-inspection"));
		WaitUntilVisible(continueButton);
		ScrollIntoView(continueButton);
		ClickByJsExecuter(continueButton);
		WaitUntilVisible(By.xpath("//button[text()='Yes']"));
		ClickOn(By.xpath("//button[text()='Yes']"));
		WaitForCurserRunning(5);
		WaitUntilVisible(By.xpath("(//label[@class='completed-summary']//b)[1]"));
		noticeApplied = GetText(By.xpath("(//label[@class='completed-summary']//b)[1]"));
		Assert.assertTrue(noticeApplied.equalsIgnoreCase("Notice Applied"));

	}

	public boolean historyView;
	public boolean caseHistoryButton;
	public boolean contactHistory;
	public boolean noticehistory;

	public void CDP_VerifyCaseHistory() throws InterruptedException {
		WaitUntilVisible(caseHistory);
		List<WebElement> recentNoticeAdded = findElementsByXPath(By.xpath("//h4[@class='inspection-notice__name']"));
		String recentAddedNotice = (recentNoticeAdded.get(recentNoticeAdded.size() - 1)).getText();
		WaitUntilVisible(By.xpath("//button[text()='Print']"));
		ScrollIntoView(By.xpath("//button[text()='Print']"));
		String CaseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
		ScrollIntoView(caseHistory);
		WaitForElementInteractable(caseHistory);
		ClickByJsExecuter(caseHistory);
		WaitForCurserRunning(2);
		WaitUntilVisible(By.xpath(
				"//div[@class='modal-header'][contains(text(),'" + CaseId + "') and contains(text(),'History Case')]"));
		historyView = ElementIsDisplayed(By.xpath(
				"//div[@class='modal-header'][contains(text(),'" + CaseId + "') and contains(text(),'History Case')]"));
		caseHistoryButton = ElementIsDisplayed(By.xpath("//button[text()='Case History']"));
		contactHistory = ElementIsDisplayed(By.xpath("//button[text()='Contact History']"));
		WaitUntilVisible(By.xpath("//span[@class='clipped-text'][contains(text(),'" + recentAddedNotice + "')]"));
		noticehistory = fineElementsSize(
				By.xpath("//span[@class='clipped-text'][contains(text(),'" + recentAddedNotice + "')]")) > 0;
		WaitUntilVisible(closebtn);
		ClickOn(closebtn);
		WaitUntilElementInvisible(closebtn);
		Assert.assertTrue(historyView);
		Assert.assertTrue(caseHistoryButton);
		Assert.assertTrue(contactHistory);
		Assert.assertTrue(noticehistory);

	}

	public boolean CaseId;
	public boolean abatmnetStatus;
	public boolean locationDetails;
	public boolean Contact;
	public boolean AttachmentCount;
	public boolean violationCount;
	public boolean followupInspectionCount;

	public void CDP_VerifyPrintCaseDetailsPage() throws InterruptedException {
		String CaseIdCDP = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
		String abatmnetStatusCDP = GetText(By.xpath("//span[@class='abatement-status']"));
		String locationCDP = GetText(By.xpath("//span[@class='space-left']"));
		int ContactCDP = Integer
				.parseInt(GetText(contactTileCount).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		int AttachmentCountCDP = Integer
				.parseInt(GetText(attachemntTileCDP).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		int violationCountCDP = Integer
				.parseInt(GetText(By.xpath("//span[@class='violation-tile-headline__count']")).split(" ")[1]
						.replace("(", " ").replace(")", " ").trim());
		int followupInspectionCountCDP = Integer
				.parseInt(GetText(By.cssSelector(" div.abatement-activities__next-details h4")).split(" ")[2].trim());
		WaitUntilVisible(By.xpath("//button[text()='Print']"));
		ScrollIntoView(By.xpath("//button[text()='Print']"));
		ClickOn(By.xpath("//button[text()='Print']"));
		WaitUntilVisible(By.xpath("//div[text()='Print Settings']"));
		WaitUntilVisible(By.xpath("(//button[text()='Print'])[2]"));
		ClickOn(By.xpath("(//button[text()='Print'])[2]"));
		forcedWaitTime(4);
		String currentWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		WaitForPageLoadTime(3);
		WaitUntilVisible(By.xpath("//h2[@class='case-details__case-number']"));
		String PrintViewCaseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
		String PrintViewabatmnetStatus = GetText(By.xpath("//span[@class='abatement-status']"));
		String PrintViewlocation = GetText(By.xpath("//h2[text()='Location']//following-sibling::span"));
		int PrintViewContact = Integer
				.parseInt(GetText(contactTileCount).split(" ")[1].replace("(", " ").replace(")", " ").trim());
		WaitUntilVisible(By.cssSelector("div.attachment-count"));
		ScrollIntoView(By.cssSelector("div.attachment-count"));
		int PrintViewAttachmentCount = Integer.parseInt(GetText(By.cssSelector("div.attachment-count")));
		int PrintViewFollowupInspectionCount = Integer
				.parseInt(GetText(By.cssSelector("div.abatement-activities__next-details h4")).split(" ")[2].trim());
		CaseId = PrintViewCaseId.equalsIgnoreCase(CaseIdCDP);
		abatmnetStatus = PrintViewabatmnetStatus.equalsIgnoreCase(abatmnetStatusCDP);
		locationDetails = PrintViewlocation.equalsIgnoreCase(locationCDP);
		Contact = PrintViewContact == ContactCDP;
		AttachmentCount = PrintViewAttachmentCount == (AttachmentCountCDP);
		followupInspectionCount = PrintViewFollowupInspectionCount == (followupInspectionCountCDP);
		driver.switchTo().window(currentWindow);
		Assert.assertTrue(CaseId);
		Assert.assertTrue(abatmnetStatus);
		Assert.assertTrue(locationDetails);
		Assert.assertTrue(Contact);
		Assert.assertTrue(AttachmentCount);
		Assert.assertTrue(followupInspectionCount);
	}

	public boolean violationNo1;
	public boolean violationNo2;
	public boolean NoteEdited;
	public boolean AgeEdited;

	public void CDP_VerifyUserAbletoEditviolationsonCDP() throws InterruptedException {
		if (driver.findElements(ccp.CloseCDP).size() > 0) {
			CEcommonMethod.CloseCaseDetailPage();
		}

		CEcommonMethod.NavigateToCCP();
		WaitUntilVisible(ccp.CCPTitle);
		WaitForElementInteractable(ccp.CCButton);
		CEcommonMethod.CE_AddLocation();
		CEcommonMethod.CE_AddViolationParam("Wa");
		CEcommonMethod.CE_AddViolationWithEntity("Animal", "Black");
		CEcommonMethod.CE_AddContact();
		CEcommonMethod.CE_AddAttachmentCrtCasePage(CEcommonMethod.SetTestDataFilePath("pexels-mike-b-170811.jpg"));
		WaitUntilVisible(ccp.CreateCaseButton);
		ScrollIntoView(ccp.CreateCaseButton);
		WaitForElementInteractable(ccp.CreateCaseButton);
		ClickOn(ccp.CreateCaseButton);
		WaitForCurserRunning(5);
		WaitUntilVisible(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
		WaitUntilPresent(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
		WaitUntilVisible(ccp.performInspectionToogel);
		WaitUntilVisible(ccp.AssignCaseTo);
		WaitForElementInteractable(ccp.AssignCaseTo);
		ClickOn(ccp.AssignCaseTo);
		WaitForElementInteractable(ccp.InspectionAssigneeTo);
		ClickOn(ccp.InspectionAssigneeTo);
		WaitForElementInteractable(ccp.CreateScheduleInspectionButton);
		ClickOn(ccp.CreateScheduleInspectionButton);
		WaitForCurserRunning(10);
		WaitUntilVisible(By.xpath("//h2[@class='case-details__case-number']"));
		WaitUntilVisible(caseInitiation);
		actualCaseInitation = GetText(caseInitiation);
		WaitUntilVisible(By.xpath("(//span[@class='violation-label'])[1]"));
		ScrollIntoView(By.xpath("(//span[@class='violation-label'])[1]"));
		String violationName = GetText(By.xpath("(//span[@class='violation-label'])[1]"));
		ScrollIntoView(By.xpath("(//span[@class='violation-label'])[1]"));
		String violationName2 = GetText(By.xpath("(//span[@class='violation-label'])[2]"));
		violationNo1 = violationName.contains("Water");
		violationNo2 = violationName2.contains("Animal");

		WaitUntilVisible(editViolation);
		ClickOn(editViolation);
		WaitUntilVisible(closeCrosEditViolation);

		WaitUntilVisible(editVioNotes);
		WaitUntilVisible(editEntityAge);
		SendKeys(editEntityAge, "3");
		SendKeys(editVioNotes, "ViolationUpdated");
		WaitUntilVisible(editVioSavebtn);
		ClickOn(editVioSavebtn);
		WaitForCurserRunning(4);
		WaitUntilVisible(entityNotesDetails);
		String updatedNote = GetText(entityNotesDetails);
		WaitUntilVisible(entityAge);
		String updatedAge = GetText(entityAge);

		NoteEdited = updatedNote.equalsIgnoreCase("ViolationUpdated");
		AgeEdited = updatedAge.equalsIgnoreCase("3");
		Assert.assertTrue(violationNo1);
		Assert.assertTrue(violationNo2);
		Assert.assertTrue(NoteEdited);
		Assert.assertTrue(AgeEdited);
	}

	public int UnPaidFinePayment;
	public boolean finetypeAndAmout;
	public boolean fineAddedOn;
	public boolean cashPaymentAdded;
	public boolean partialPaymentLabel;

	public By outstandingBalDetails = By
			.xpath("//label[text()='Outstanding Balance']//parent::div//a[@class='view-details']");
	public By finePaymentDetailsPopup = By.xpath("//div[contains(text(),'Fines & Payments Details')])");

	public By selectFineDropdownArrow = By
			.xpath("//label[@title='Select Fine']//parent::div//parent::div//span[@class='Select-arrow']");
	public By selectFineOptions = By.xpath("//div[@class='Select-menu-outer']//div[@role='option'])[1]");
	public By addNewFine = By.xpath("//div[@class='add-transaction']//button[text()='Add Fine']");
	public By closeFinePaymentDetailsPop = By
			.xpath("//div[contains(text(),'Fines & Payments Details')]//parent::div//button[text()='Close'])");
	public By voidIconFinePaymentList = By.xpath("(//img[@class='void-icon'])[1]");
	public By unpaidButton = By.xpath("//button[text()='Unpaid']");

	public By paymentSideBar = By.xpath("//label[text()='Payments']");
	public By citizenPaymentProtal = By.xpath("(//label[text()='Citizen Payment Portal']");
	public By paymentPortallinkText = By.xpath("//div[@class='payment-portal-form__url-section__url']//h5");
	public By copyPaymentPortalLink = By.xpath("//div[@class='payment-portal-form__url-section__url']//button");
	public By defaultPaymentPortaltitle = By.xpath("//input[@placeholder='Enter Payment Portal Title'][@name='title']");
	public By savePaymentPorrtalSettings = By.xpath("//button[text()='Save Changes']");
	public By AddedfineDetails = By.xpath("//div[@role='rowgroup']//div[@role='gridcell']//span");
	public static By AddPayment = By.xpath("//button[text()='Add Payment']");
	public static By AddPaymentAmnt = By.xpath("//input[@name='amount']");
	public static By SelectPayor = By.xpath("//div[text()='Payor']");

	public void CDP_VerifyAddPaymentFromFineAndPaymentDetalis() throws InterruptedException {
		WaitUntilVisible(outstandingBalDetails);
		WaitUntilVisible(By.xpath("//button[text()='Print']"));
		ScrollIntoView(By.xpath("//button[text()='Print']"));
		WaitForElementInteractable(outstandingBalDetails);
		ClickOn(outstandingBalDetails);
		WaitForCurserRunning(3);
		WaitUntilVisible(finePaymentDetailsPopup);
		WaitUntilVisible(addNewFine);
		WaitUntilPresent(finePaymentDetailsPopup);
		WaitForElementInteractable(selectFineDropdownArrow);
		ClickOn(selectFineDropdownArrow);
		WaitUntilVisible(selectFineOptions);
		ClickOn(selectFineOptions);
		WaitForElementInteractable(addNewFine);
		ClickOn(addNewFine);
		WaitForCurserRunning(3);
		WaitUntilVisible(closeFinePaymentDetailsPop);
		WaitUntilPresent(closeFinePaymentDetailsPop);
		WaitUntilVisible(unpaidButton);
		WaitUntilVisible(AddedfineDetails);
		UnPaidFinePayment = findElementsByXPath(unpaidButton).size();
		List<WebElement> fineTypeAmout = findElementsByXPath(AddedfineDetails);
		for (int i = 0; i < fineTypeAmout.size(); i++) {
			String textRetrived = fineTypeAmout.get(i).getText();
			finetypeAndAmout = !(textRetrived.isEmpty());
		}
		fineAddedOn = !(GetText(By.xpath("(//div[@role='rowgroup']//div[@role='gridcell'])[3]"))).isEmpty();

		WaitUntilVisible(AddPayment);
		ClickOn(AddPayment);
		WaitUntilVisible(AddPaymentAmnt);
		SendKeys(AddPaymentAmnt, "1500");
		WaitUntilVisible(SelectPayor);
		ClickOn(SelectPayor);
		WaitUntilVisible(op.SelectPayorOpt);
		ClickOn(op.SelectPayorOpt);
		WaitUntilVisible(op.AddPaymentbtn);
		ClickOn(op.AddPaymentbtn);
		WaitForCurserRunning(5);
		WaitUntilVisible(By.xpath("(//div[@role='rowgroup']//div[@role='gridcell']//span)[1]"));
		String cashPayment = GetText(By.xpath("(//div[@role='rowgroup']//div[@role='gridcell']//span)[1]"));
		cashPaymentAdded = cashPayment.contains("Cash");
		WaitUntilVisible(By.xpath("//button[text()='Partially Paid']"));
		partialPaymentLabel = ElementIsDisplayed(By.xpath("//button[text()='Partially Paid']"));

		Assert.assertTrue(UnPaidFinePayment == 1);
		Assert.assertTrue(finetypeAndAmout);
		Assert.assertTrue(fineAddedOn);
		Assert.assertTrue(cashPaymentAdded);
		Assert.assertTrue(partialPaymentLabel);
		Assert.assertEquals(actualCaseInitation, "Reactive");
	}

	public String Actuallabel;
	public String CaseIdCDP;
	public boolean overdueLabel;
	public By overdueLbl = By.xpath("//span[@class='is-overdue']");

	public void CDP_VerifyOverdueFinePayment() throws InterruptedException {
		WaitUntilVisible(op.AddFineToggle);
		ClickOn(op.AddFineToggle);
		WaitUntilVisible(op.AddNewFine);
		WaitForElementInteractable(op.SelectFineDropdownArrow);
		ClickOn(op.SelectFineDropdownArrow);
		WaitUntilVisible(op.SelectFineOptions);
		ClickOn(op.SelectFineOptions);
		WaitForElementInteractable(op.AddNewFine);
		WaitUntilVisible(op.DueDatePicker);
		ClickOn(op.DueDatePicker);
		WaitUntilVisible(By.xpath("//div[@class='rdt rdtOpen']"));
		WaitUntilVisible(op.PrevDateArrow);
		ClickOn(op.PrevDateArrow);
		WaitUntilVisible(op.PrevDateArrow);
		ClickOn(op.PrevDateArrow);
		WaitUntilVisible(op.SelectDate10);
		ClickByJsExecuter(op.SelectDate10);
		WaitUntilVisible(op.AddNewFine);
		ClickOn(op.AddNewFine);
		WaitForCurserRunning(3);
		WaitUntilVisible(op.CloseFinePaymentDetailsPop);
		WaitUntilPresent(op.CloseFinePaymentDetailsPop);
		WaitUntilVisible(op.OverdueFineLbl);
		Actuallabel = GetText(op.OverdueFineLbl);

		ClickOn(op.CloseFinePaymentDetailsPop);
		WaitForCurserRunning(4);
		WaitUntilVisible(By.xpath("//h2[@class='case-details__case-number']"));
		CaseIdCDP = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
		CEcommonMethod.CloseCaseDetailPage();
		CEcommonMethod.SearchCaseOnCLP(CaseIdCDP);

		WaitForElementInteractable(clp.ColumnControlWidget);
		ClickOn(clp.ColumnControlWidget);
		WaitForElementInteractable(clp.ColumnOutstandingBalance);
		ClickOn(clp.ColumnOutstandingBalance);
		WaitForElementInteractable(clp.CloseColumnControl);
		ClickOn(clp.CloseColumnControl);
		WaitUntilVisible(clp.ColumnOutstandingBalanceCLP);
		ScrollIntoView(clp.ColumnOutstandingBalanceCLP);
		WaitUntilVisible(overdueLbl);
		overdueLabel = ElementIsDisplayed(overdueLbl);
		Assert.assertTrue(Actuallabel.equalsIgnoreCase("Overdue"));
		Assert.assertTrue(overdueLabel);
	}

	public Boolean voidLableIcon;
	public String voidLableButton;
	public Boolean paymentNullifiedPresent;

	public void CDP_VerifyUserAbletoMakeFineAsVoid() throws InterruptedException {
		WaitUntilVisible(By.xpath("//a[text()='" + CaseIdCDP + "']"));
		WaitForElementInteractable(By.xpath("//a[text()='" + CaseIdCDP + "']"));
		ClickByJsExecuter(By.xpath("//a[text()='" + CaseIdCDP + "']"));
		WaitForCurserRunning(10);
		WaitUntilVisible(By.xpath("//h2[@class='case-details__case-number']"));
		WaitForElementInteractable(op.OutstandingBalDetails);
		ClickOn(op.OutstandingBalDetails);
		WaitForCurserRunning(3);
		WaitUntilVisible(op.FinePaymentDetailsPopup);
		WaitUntilVisible(op.AddNewFine);
		WaitUntilPresent(op.FinePaymentDetailsPopup);
		WaitForElementInteractable(op.SelectFineDropdownArrow);
		WaitUntilVisible(op.VoidIconFinePaymentList);
		WaitForElementInteractable(op.VoidIconFinePaymentList);
		ClickByJsExecuter(op.VoidIconFinePaymentList);
		SendKeys(op.ReasonForVoid, RandomStrings.RequiredString(4));
		WaitForElementInteractable(op.VoidfineBtn);
		ClickByJsExecuter(op.VoidfineBtn);
		WaitForCurserRunning(4);
		WaitUntilVisible(op.VoidLable);
		WaitUntilPresent(op.VoidLable);
		voidLableIcon = findElement(op.VoidLable).isDisplayed();
		voidLableButton = GetText(op.VoidLable);
		paymentNullifiedPresent = findElement(op.FineNullified).isDisplayed();
		Assert.assertEquals(voidLableIcon, Boolean.TRUE);
		Assert.assertEquals(paymentNullifiedPresent, Boolean.TRUE);
		Assert.assertEquals(voidLableButton, "Void");
	}

	public void CDP_VerifyUserAbletoMakeFineAsWaive() throws InterruptedException {
		WaitUntilVisible(op.AddNewFine);
		WaitUntilPresent(op.FinePaymentDetailsPopup);
		WaitForElementInteractable(op.SelectFineDropdownArrow);
		ClickOn(op.SelectFineDropdownArrow);
		WaitUntilVisible(op.SelectFineOptions);
		ClickOn(op.SelectFineOptions);
		WaitForElementInteractable(op.AddNewFine);
		WaitUntilVisible(op.AddNewFine);
		ClickOn(op.AddNewFine);
		WaitForCurserRunning(3);
		WaitUntilVisible(op.CloseFinePaymentDetailsPop);
		WaitUntilPresent(op.CloseFinePaymentDetailsPop);
		WaitUntilVisible(op.VoidIconFinePaymentList);
		WaitForElementInteractable(op.VoidIconFinePaymentList);
		ClickByJsExecuter(op.VoidIconFinePaymentList);
		WaitUntilVisible(By.xpath("//button[text()='Waive']"));
		ClickOn(By.xpath("//button[text()='Waive']"));
		SendKeys(op.ReasonForVoid, RandomStrings.RequiredString(4));
		WaitForElementInteractable(op.WaivefineBtn);
		ClickByJsExecuter(op.WaivefineBtn);
		WaitForCurserRunning(4);
		WaitUntilVisible(op.VoidLable);
		WaitUntilPresent(op.VoidLable);
		voidLableIcon = findElement(op.VoidLable).isDisplayed();
		voidLableButton = GetText(op.VoidLable);
		paymentNullifiedPresent = findElement(op.FineNullified).isDisplayed();
		Assert.assertEquals(voidLableIcon, Boolean.TRUE);
		Assert.assertEquals(paymentNullifiedPresent, Boolean.TRUE);
		Assert.assertEquals(voidLableButton, "Waived");
	}

	public boolean PaymentvoidLableIcon;
	public String PaymentvoidLableBtn;
	public String oustandingBal;
	public String oustandingBalCLP;
	public boolean PaymentNullified;

	public void CDP_VerifyUserAbletoMakePaymentAsVoid() throws InterruptedException {
		WaitUntilVisible(op.PaymentVoidSymbol);
		WaitForElementInteractable(op.PaymentVoidSymbol);
		ClickByJsExecuter(op.PaymentVoidSymbol);
		SendKeys(op.ReasonForVoid, RandomStrings.RequiredString(4));
		WaitForElementInteractable(op.VoidPaymentbutton);
		ClickByJsExecuter(op.VoidPaymentbutton);
		WaitForCurserRunning(4);
		WaitUntilVisible(op.PaymentVoid);
		PaymentvoidLableIcon = findElement(op.PaymentVoid).isDisplayed();
		PaymentvoidLableBtn = GetText(op.PaymentVoid);
		PaymentNullified = findElement(op.PaymentCashNullified).isDisplayed();
		Assert.assertEquals(PaymentvoidLableIcon, Boolean.TRUE);
		Assert.assertEquals(op.PaymentNullified, Boolean.TRUE);
		Assert.assertEquals(PaymentvoidLableBtn, "Void");
	}

	public void CDP_VerifyOustandingBalWithCLP() throws InterruptedException {
		ClickOn(op.CloseFinePaymentDetailsPop);
		WaitForCurserRunning(4);
		WaitUntilVisible(By.xpath(
				"//label[text()='Outstanding Balance']//parent::div//label[@class='field__label-data-field']//span"));
		oustandingBal = GetText(By.xpath(
				"//label[text()='Outstanding Balance']//parent::div//label[@class='field__label-data-field']//span"));
		CEcommonMethod.CloseCaseDetailPage();
		WaitForElementInteractable(clp.ColumnControlWidget);
		ClickOn(clp.ColumnControlWidget);
		WaitForElementInteractable(clp.ColumnOutstandingBalance);
		ClickOn(clp.ColumnOutstandingBalance);
		WaitForElementInteractable(clp.CloseColumnControl);
		ClickOn(clp.CloseColumnControl);
		WaitUntilVisible(clp.ColumnOutstandingBalanceCLP);
		ScrollIntoView(clp.ColumnOutstandingBalanceCLP);
		WaitUntilVisible(By.xpath("(//div[@role='gridcell']//div)[14]"));
		oustandingBalCLP = GetText(By.xpath("(//div[@role='gridcell']//div)[14]"));

		Assert.assertEquals(oustandingBalCLP, oustandingBal);
	}
}
