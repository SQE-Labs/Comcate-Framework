package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;

import CommonMethods.CECommonMethods;
import CommonMethods.Helper;
import CommonMethods.PropertiesUtils;
import CommonMethods.RandomStrings;
import junit.framework.Assert;

public class CCPUtility extends Helper {

	public WebDriver driver;
	CECommonMethods CECommonMethodS;
	LoginUtility log;

	public CCPUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		CECommonMethodS = new CECommonMethods(driver);
		log = new LoginUtility(driver);
	}

	public static String agencyConfig = BrowsersInvoked.agencyConfig;
	public static String agencyConfigGisLite = BrowsersInvoked.agencyConfigGisLite;
	public static String agencyConfigGisDirect2o = BrowsersInvoked.agencyConfigGisDirect2o;
	public static String agencyConfigGisDirect1o = BrowsersInvoked.agencyConfigGisDirect1o;
	public static String CCPStreetAddress1 = BrowsersInvoked.CCPStreetAddress1;
	public static String CCPStreetAddress2=BrowsersInvoked.CCPStreetAddress2;
	public static String CCPZip1=BrowsersInvoked.CCPZip1;
	public static String StreetAddress =BrowsersInvoked.StreetAddress;
	public static String City=BrowsersInvoked.City;
	public static String Zip=BrowsersInvoked.Zip;
	
	
	public static String cEOption = "//label[text()='Code Enforcement Case']";
	public static String closeCDP = "div.case-details__close-icon img";
	public static String cCPOption = "//label[text()='Code Enforcement Case']";
	public static String createCaseButton = "//div/button[text()='Create Case']";
	public static String assignCaseTo = "//h5[text()='Assign Case To']//parent::div//button";
	public static String inspectionAssigneeTo = "//h5[text()='Assign Inspection To']//parent::div//button";
	public static String createScheduleInspectionButton = "//div[@class='modal-footer']//button[2]";
	public static String AddButton20 = "//div[@class='attachments-modal__footer']/button[2]";
	public static String AddAttachmenttop = "//p[text()='Attachments']//preceding-sibling::button";
	public static String AddAttachmentCCP = "//span[contains(text(),'Attachments')]//following-sibling::button";
	public static String AddAttachmentbottom = "(//span[contains(text(),'Attachments')]//parent::h2//div//button)[2]";
	public static String locationSearchField = "//div[@class='location-tile__inputs-container']//input";
	public static String locationSearchResult = "//li[@id='react-autowhatever-1-section-0-item-0']";
	public static String cRMOption = "//label[text()='Customer submission']";
	public static String cCPTitle = "//h1[text()='Create A Case']";
	public static String plusIconToCECRM = "//*[@class='app-header__new']";
	public static String globalValidMsg = "//div[@class='create-case__global-error']";
	public static String infoMsg = "//div[@class='location-tile__display-data-empty-message tile-empty-msg']";
	public static String CCbutton = "//div/button[text()='Create Case']";
	public static String Location = "//div[@class='location-tile__inputs-container']//input";
	public static String Map = "//li[@id='react-autowhatever-1-section-0-item-0']";
	public static String mapGis2 = "//div[@class='react-autosuggest-sections']//li//b";
	public static String EditLocation = "//div[@class='edit-address__actions']/button";
	public static String editStreetAddress = "//input[@name='streetAddress']";
	public static String editCity = "//input[@name='city']";
	public static String editZip = "//input[@name='zip']";
	public static String saveButton = "//div[@class='edit-address__header']/child::div/button[2]";
	public static String cancelButton = "//div[@class='edit-address__header']/child::div/button[1]";
	public static String ToggleChecked = "//div[@class='react-toggle react-toggle--checked bs-toggle danger']";
	public static String addLocManually = "//div[@class='react-autosuggest__function']";
	public static String streetAdd = "//div[@class='manual-address-modal__body']//input[@name='streetAddress']";
	public static String cityAdd = "//div[@class='manual-address-modal__body']//input[@name='city']";
	public static String zipAdd = "//div[@class='manual-address-modal__body']//input[@name='zip']";
	public static String saveButton2 = "//div[@class='manual-address-modal__footer']/button[2]";
	public static String manualLocPopup = "(//div[@class='modal-header'])[2]";
	public static String validationMsg3 = "//span[text()='The Address is required.']";
	public static String apnAdd = "//div/input[@name='apn']";
	public static String outAgencyMsg = "//div[contains(@class,'display-data--out-of-bounds')]//span";
	public static String flagToggle = "(//div[@class='react-toggle-thumb'])[1]";
	public static String cancelBtnLoc = "//div[@class='manual-address-modal__footer']/button[1]";

	public static String streetLabel = "(//label[@class='field__label-data-field'])[1]";
	public static String cityLabel = "(//label[@class='field__label-data-field'])[2]";
	public static String zipLabel = "(//label[@class='field__label-data-field'])[4]";

	public static String ZipLabel20 = "(//label[@class='field__label-data-field'])[5]";
	public static String popupTitle = "(//div[@class='modal-header'])[2]";
	public static String reasonToFlag = "//textarea[@name='reasonForFlagging']";
	public static String flagAddressBtn = "//button[text()='Flag address']";
	public static String crossIconFlag = "(//button[@class='square-btn btn btn-default'])[2]";
	public static String flaggedLabel = "(//label[@class='field__label-data-field field__label-data-field--toggle'])[1]";
	public static String violationsTile = "//div[@id='violation-tile']//h2/span";
	public static String violationSearchBox = "//div/input[@placeholder=\"Start typing name of violation, article number or issue description\"]";
	public static String violationList = "//div[@class=\"react-autosuggest__suggestion-element\"]/div";
	public static String ViolationList20 = "//div[@class='icon-chooser']//preceding-sibling::div";
	public static String violationPopup = "(//div[@class='modal-header'])[2]";
	public static String entityField1 = "//div/input[@name='Animal Colour']";
	public static String addButton = "//button[text()='Add']";
	public static String validationMsg2 = "//p[@class='tile--error-msg']";
	public static String infoMsg2 = "//div[@class='tile-empty-msg' and text()='You have not added any violations or issues yet.']";
	public static String customIssue = "(//div[@class='react-autosuggest__function'])[2]";
	public static String infoMsgNoSearch = "//div[@class='react-autosuggest__empty-message']";
	public static String customIssueIcon = "(//div/i[@class='react-autosuggest__add-icon'])[2]";
	public static String customIssueFeild = "//label[@class='field__label-label']";
	public static String customIssueDesc = "//textarea[@name='issueDescription']/parent::div";
	public static String validMsgCustom = "//span[@class='field__error']";
	public static String waterViolation = "//label[@class='violation-tile__item-info-name']";
	public static String validMsgVioPopup = "//div[@class='entity-modal__edit-error entity-modal__edit-error--show']";
	public static String crossIconVio = "//div[@class='violation-tile__item-info']/following::button[1]";
	public static String editIconVio = "(//button[@class='edit-btn  btn btn-primary'])[2]";
	public static String uploadLink = "//label[@class='file-upload__label']";
	public static String uploadLink2 = "//div[@class='file-upload__actions']//label[text()='Replace']";
	public static String uploadedImg = "//div[@class='file-upload']/div/img";
	public static String customIssueDlt = "//div[@id='violation-tile']/div[2]/div/div[2]/button";
	public static String dltUploadedImg = "//div[@class='file-upload__actions']/button";
	public static String entityAddBtn = "//div[@class='entity-modal__footer']/button[2]";
	public static String entityCancelBtn = "//div[@class='entity-modal__footer']/button[1]";
	public static String uploadedImgThumb = "//div[@class='entity-display-wrapper']/img";
	public static String closePopup = "//button[text()='Close']";
	public static String entitySearchBox = "//div[@class='searchbox-container']//input";
	public static String entitySearchList = "//div[@class='list-label']";
	public static String EntitySeachListCss = "ul li div.list-label";
	public static String EntitySearchListB = "//div[@class='list-label']//b";
	public static String EntitySearchList20 = "//ul[@class='react-autosuggest__suggestions-list']//div[@class='list-label']";
	public static String addedVioList = "//label[@class='violation-tile__entity-info-label']";
	public static String addAnotherVio = "//div[@class='violation-tile__entity-disclaimer']/a";
	public static String countViolations = "//div[@id='violation-tile']/div/div/h2/span";
	public static String countEachVio = "//div[@id='violation-tile']/div/div/h2/a[1]";
	public static String addedImgThumb = "//div[@class='file-upload']//img";
	public static String addContactFld = "//div[@class='contact-tile tile']//input";
	public static String crtNewContact = "//div[@class='contact-tile tile']//div[@class='react-autosuggest__function']";
	public static String contactPopup = "//div[@class='full-page-modal__header']/h1[text()='Create a Contact']";
	public static String crtContactBtn = "(//div[@class='full-page-modal__header']//button[2])[2]";
	public static String contactErrMsg = "(//span[@class='field__error'])[1]";
	public static String nameField = "//input[@name='name']";
	public static String violationsList = "//div[@class='react-autosuggest__suggestion-element']/div";
	public static String addContactField = "//div[@class='contact-tile tile']//input";
	public static String createNewContact = "//div[@class='contact-tile tile']//div[@class='react-autosuggest__function']";
	public static String createContactBtn = "(//div[@class='full-page-modal__header']//button[2])[2]";
	public static String createContactBtn2 = "(//div[@class='full-page-modal__header']//button[2])";
	public static String countContact = "//div[@class='contact flex-row--center']";
	public static String cancelContactBtn = "(//div[@class='full-page-modal__header']//button)[3]";
	public static String editContact = "//div[@class='contact__actions']/button[1]";
	public static String editContactPopup = "//div[@class='full-page-modal__header']/h1[text()='Edit Contact']";
	public static String cancelEditPopup = "(//div[@class='full-page-modal__header']//button)[3]";
	public static String deleteContact = "//div[@class='contact__actions']/button[2]";
	public static String countContactTile = "//div[@class='contact-tile tile']//h2";
	public static String createAnyway = "//div[@class='duplicate-contacts__footer']/button[2]";
	public static String propertyOwnerOption = "//span/label[text()='Property Owner']";
	public static String applyButton = "//button[text()='Apply']";
	public static String emailField = "//input[@name='email']";
	public static String workPhoneField = "//input[@name='workPhone']";
	public static String imageIcon = "//span[text()='Attachments ']/following-sibling::button";
	public static String attachmentTitle = "//div[@class='modal-header' and text()='Add Attachments']";
	public static String cameraButton = "//label[@class='content-placeholder']";
	public static String addButton2 = "//div[@class='attachments-modal__footer']/button[2]";
	public static String imgThumb = "//img[@class='attachments-modal__saved-thumb']";
	public static String crossIcon2 = "(//button[@class='close'])[2]";
	public static String yesCloseBtn = "//div[@class='attachments-modal__footer']/button[1]";
	public static String dontCloseBtn = "//div[@class='attachments-modal__footer']/button[2]";
	public static String imgThumb2 = "//img[@class='attachments-tile__saved-thumb']";
	public static String closeAttachmentTitle = "//div[@class='modal-header' and text()='Close Add Attachments']";
	public static String attachmentDetailsTitle = "//div[@class='modal-header' and text()='Attachments Details']";
	public static String modalHeaders = "//div[@class='modal-header']";
	public static String addedImage = "//div[@class='attachments-tile__photo-container']/img";
	public static String description = "//input[@name='description']";
	public static String cancelBtnAttachDet = "//div[@class='attachments-edit__footer']/button[1]";
	public static String updateBtn = "//div[@class='attachments-edit__footer']/button[2]";
	public static String crossIcon = "//button[@class='delete-btn  btn btn-default']";
	public static String countAttachment = "//div[@class='attachment-tile tile']//h2/span";
	public static String deleteAttach = "//div[@class='attachments-edit__carousel']//button";
	public static String yesDelete = "//div[@class='flex-row--middle']/button[2]";
	public static String toasterMSGAttachment = "//div[text()='One/more files with unsupported format is/are discarded.']";
	public static String toasterMSGSize = "//div[text()='File size cannot exceed 15MB']";
	public static String uploadedImgTitle = "//div[@class='attachments-modal__saved-title']/span/b";
	public static String uploadedImgName = "//input[@name='title']";
	public static String uploadedImgLoc = "//input[@name='location']";
	public static String imgTitleonCCP = "//a[@class='attachments-tile__photo-title']";
	public static String imgDesconCCP = "//span[@class='clipped-text']";
	public static String imgLoconCCP = "//label[@class='attachments-tile__photo-location']";
	public static String createCasePop = "//div[@class='modal-header' and text()='Create Case']";
	public static String checkboxPerIns = "//label[@for='PERFORM_INSPECTION']";
	public static String checkboxSchIns = "//label[@for='SCHEDULE_INSPECTION']";
	public static String crtSchInsButton = "//div[@class='modal-footer']//button[2]";
	public static String nextInsSec = "//div[@class='inspection-details']";
	public static String caseStatus = "//h2[@class='case-details__case-status']";
	public static String totalContactsCDP = "//div[@class='contact flex-row--center']";
	public static String totalViolationsCDP = "//div[@class='case-violation-list']";
	public static String totalAttachmentsCDP = "//img[@class='attachments-tile__saved-thumb']";
	public static String caseTilesCDP = "//div[@class='tile-header']//h2";
	public static String assigneeTo = "//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']";

	public static By AssigneeTo = By.xpath(assigneeTo);
	public static By CEOption = By.xpath(cEOption);
	public static By CCPOption = By.xpath(cCPOption);
	public static By CloseCDP = By.cssSelector(closeCDP);
	public static By CreateCaseButton = By.xpath(createCaseButton);
	public static By AssignCaseTo = By.xpath(assignCaseTo);
	public static By InspectionAssigneeTo = By.xpath(inspectionAssigneeTo);
	public static By CreateScheduleInspectionButton = By.xpath(createScheduleInspectionButton);
	public static By AddBtn = By.xpath(addButton);
	public static By addAttachmenttop = By.xpath(AddAttachmenttop);
	public static By addAttachmentCCP = By.xpath(AddAttachmentCCP);
	public static By addAttachmentbottom = By.xpath(AddAttachmentbottom);
	public static By LocationSearchField = By.xpath(locationSearchField);
	public static By LocationSearchResult = By.xpath(locationSearchResult);
	public static By CRMOption = By.xpath(cRMOption);
	public static By CCPTitle = By.xpath(cCPTitle);
	public static By PlusIconToCECRM = By.xpath(plusIconToCECRM);
	public static By LocationFld = By.xpath(Location);
	public static By InfoMsg = By.xpath(infoMsg);
	public static By Map3 = By.xpath(Map);
	public static By MapGis2 = By.xpath(mapGis2);
	public static By EditLocIcon = By.xpath(EditLocation);
	public static By EditStreetAdd = By.xpath(editStreetAddress);
	public static By EditCity = By.xpath(editCity);
	public static By EditZip = By.xpath(editZip);
	public static By SaveButton = By.xpath(saveButton);
	public static By CCButton = By.xpath(CCbutton);
	public static By GlobalValidMsg = By.xpath(globalValidMsg);
	public static By AddLocManually = By.xpath(addLocManually);
	public static By ManualLocPopup = By.xpath(manualLocPopup);
	public static By ValidationMsg3 = By.xpath(validationMsg3);
	public static By SaveButton2 = By.xpath(saveButton2);
	public static By StreetAdd = By.xpath(streetAdd);
	public static By CityAdd = By.xpath(cityAdd);
	public static By ZipAdd = By.xpath(zipAdd);
	public static By ApnAdd = By.xpath(apnAdd);
	public static By OutAgencyMsg = By.xpath(outAgencyMsg);
	public static By CancelBtnLoc = By.xpath(cancelBtnLoc);
	public static By StreetLabel = By.xpath(streetLabel);
	public static By CityLabel = By.xpath(cityLabel);
	public static By ZipLabel = By.xpath(zipLabel);
	public static By zipLabel20 = By.xpath(ZipLabel20);
	public static By CancelButton = By.xpath(cancelButton);
	public static By toggleChecked = By.xpath(ToggleChecked);
	public static By FlagToggle = By.xpath(flagToggle);
	public static By PopupTitle = By.xpath(popupTitle);
	public static By ReasonToFlag = By.xpath(reasonToFlag);
	public static By FlagAddressBtn = By.xpath(flagAddressBtn);
	public static By CrossIconFlag = By.xpath(crossIconFlag);
	public static By FlaggedLabel = By.xpath(flaggedLabel);

	public static By ViolationsTile = By.xpath(violationsTile);
	public static By ViolationSearchBox = By.xpath(violationSearchBox);
	public static By ViolationList = By.xpath(violationList);
	public static By violationList20 = By.xpath(ViolationList20);
	public static By ViolationPopup = By.xpath(violationPopup);
	public static By EntityField1 = By.xpath(entityField1);
	public static By AddButton = By.xpath(addButton);
	public static By ValidationMsg2 = By.xpath(validationMsg2);
	public static By InfoMsg2 = By.xpath(infoMsg2);
	public static By InfoMsgNoSearch = By.xpath(infoMsgNoSearch);
	public static By CustomIssueIcon = By.xpath(customIssueIcon);
	public static By CustomIssueFeild = By.xpath(customIssueFeild);
	public static By CustomIssueDesc = By.xpath(customIssueDesc);
	public static By ValidMsgCustom = By.xpath(validMsgCustom);
	public static By WaterViolation = By.xpath(waterViolation);
	public static By ValidMsgVioPopup = By.xpath(validMsgVioPopup);
	public static By EntitySearchBox = By.xpath(entitySearchBox);
	public static By EntitySearchList = By.xpath(entitySearchList);
	public static By entitySeachListCss = By.cssSelector(EntitySeachListCss);
	public static By entitySearchListB = By.xpath(EntitySearchListB);
	public static By entitySearchList20 = By.xpath(EntitySearchList20);
	public static By AddedVioList = By.xpath(addedVioList);
	public static By AddAnotherVio = By.xpath(addAnotherVio);
	public static By CrossIconVio = By.xpath(crossIconVio);
	public static By EditIconVio = By.xpath(editIconVio);
	public static By UploadLink = By.xpath(uploadLink);
	public static By UploadLink2 = By.xpath(uploadLink2);
	public static By UploadedImg = By.xpath(uploadedImg);
	public static By CustomIssueDlt = By.xpath(customIssueDlt);
	public static By DltUploadedImg = By.xpath(dltUploadedImg);
	public static By EntityAddBtn = By.xpath(entityAddBtn);
	public static By EntityCancelBtn = By.xpath(entityCancelBtn);
	public static By UploadedImgThumb = By.xpath(uploadedImgThumb);
	public static By CountViolations = By.xpath(countViolations);
	public static By CountEachVio = By.xpath(countEachVio);
	public static By ClosePopup = By.xpath(closePopup);
	public static By AddedImgThumb = By.xpath(addedImgThumb);

	public static By AddContactFld = By.xpath(addContactFld);
	public static By CrtNewContact = By.xpath(crtNewContact);
	public static By ContactPopup = By.xpath(contactPopup);
	public static By CrtContactBtn = By.xpath(crtContactBtn);
	public static By ContactErrMsg = By.xpath(contactErrMsg);
	public static By NameField = By.xpath(nameField);
	public static By CreateContactBtn = By.xpath(createContactBtn);
	public static By CreateContactBtn2 = By.xpath(createContactBtn2);
	public static By ViolationsList = By.xpath(violationsList);
	public static By AddContactField = By.xpath(addContactField);
	public static By CreateNewContact = By.xpath(createNewContact);
	public static By CountContact = By.xpath(countContact);
	public static By CancelContactBtn = By.xpath(cancelContactBtn);
	public static By EditContact = By.xpath(editContact);
	public static By EditContactPopup = By.xpath(editContactPopup);
	public static By CancelEditPopup = By.xpath(cancelEditPopup);
	public static By DeleteContact = By.xpath(deleteContact);
	public static By CountContactTile = By.xpath(countContactTile);
	public static By CreateAnyway = By.xpath(createAnyway);
	public static By PropertyOwnerOption = By.xpath(propertyOwnerOption);
	public static By ApplyButton = By.xpath(applyButton);
	public static By EmailField = By.xpath(emailField);
	public static By WorkPhoneField = By.xpath(workPhoneField);

	public static By ImageIcon = By.xpath(imageIcon);
	public static By AttachmentTitle = By.xpath(attachmentTitle);
	public static By CameraButton = By.xpath(cameraButton);
	public static By AddButton2 = By.xpath(addButton2);
	public static By ImgThumb = By.xpath(imgThumb);
	public static By CrossIcon2 = By.xpath(crossIcon2);
	public static By YesCloseBtn = By.xpath(yesCloseBtn);
	public static By DontCloseBtn = By.xpath(dontCloseBtn);
	public static By ImgThumb2 = By.xpath(imgThumb2);
	public static By CloseAttachmentTitle = By.xpath(closeAttachmentTitle);
	public static By ModalHeaders = By.xpath(modalHeaders);
	public static By AddedImage = By.xpath(addedImage);
	public static By Description = By.xpath(description);
	public static By CancelBtnAttachDet = By.xpath(cancelBtnAttachDet);
	public static By UpdateBtn = By.xpath(updateBtn);
	public static By CrossIcon = By.xpath(crossIcon);
	public static By CountAttachment = By.xpath(countAttachment);
	public static By DeleteAttach = By.xpath(deleteAttach);
	public static By YesDelete = By.xpath(yesDelete);
	public static By AttachmentDetailsTitle = By.xpath(attachmentDetailsTitle);
	public static By UploadedImgName = By.xpath(attachmentDetailsTitle);

	public static By ToasterMSGAttachment = By.xpath(toasterMSGAttachment);
	public static By ToasterMSGSize = By.xpath(toasterMSGSize);
	public static By UploadedImgTitle = By.xpath(uploadedImgTitle);
	public static By UploadedImgNameA = By.xpath(uploadedImgName);
	public static By UploadedImgLoc = By.xpath(uploadedImgLoc);
	public static By ImgTitleonCCP = By.xpath(imgTitleonCCP);
	public static By ImgDesconCCP = By.xpath(imgDesconCCP);
	public static By ImgLoconCCP = By.xpath(imgLoconCCP);

	public static By CreateCasePop = By.xpath(createCasePop);
	public static By CheckboxPerIns = By.xpath(checkboxPerIns);
	public static By CheckboxSchIns = By.xpath(checkboxSchIns);
	public static By CrtSchInsButton = By.xpath(crtSchInsButton);
	public static By NextInsSec = By.xpath(nextInsSec);
	public static By CaseStatus = By.xpath(caseStatus);
	public static By TotalContactsCDP = By.xpath(totalContactsCDP);
	public static By TotalViolationsCDP = By.xpath(totalViolationsCDP);
	public static By TotalAttachmentsCDP = By.xpath(totalAttachmentsCDP);
	public static By CaseTilesCDP = By.xpath(caseTilesCDP);

	public static SoftAssert softAssert = new SoftAssert();

	public static String searchLocationKey1O = PropertiesUtils.getPropertyValue("searchLocationKey1O");
	public static String searchLocationKey = PropertiesUtils.getPropertyValue("searchLocationKey");

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}
	
	public void CCP_PreRequisite() throws InterruptedException {
		CECommonMethodS.NavigateToCCP();
		WaitUntilVisible(CCPTitle);
		WaitForElementInteractable(CCButton);
		String CCPTitleActual = GetText(CCPTitle);
		SoftAssert s1 = new SoftAssert();

		s1.assertEquals(CCPTitleActual, "Create A Case");
		s1.assertAll();

	}

	public void CCP_GlobalValidationMsgForNoData() throws InterruptedException {

		WaitForElementInteractable(CCButton);
		ClickOn(CCButton);

		WaitUntilVisible(GlobalValidMsg);
		String CCValidationActual = GetText(GlobalValidMsg);
		String ValidationMsgExpected = "Please complete all fields marked in red below to continue.";
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(CCValidationActual, ValidationMsgExpected);
		s2.assertAll();
	}

	public void CCP_DefaultInfoMsgOnLOcationTile() {
		String InfoMessage = GetText(InfoMsg);
		String ExpInfoMsg = "";
		if (agencyConfig.equalsIgnoreCase(agencyConfigGisLite)) {
			ExpInfoMsg = "Enter an address, or drop a pin on the map to add location details\n"
					+ "Location is required to create a case";
		} else {
			ExpInfoMsg = "Enter an address, APN Number, or drop a pin on the map to add location details\n"
					+ "Location is required to create a case";
		}
		SoftAssert s3 = new SoftAssert();
		s3.assertEquals(InfoMessage, ExpInfoMsg);
		s3.assertAll();
	}

	public void CCP_ValidationMsgOutsideAgencyBoundary() throws InterruptedException {

		if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
			SendKeys(LocationFld, "Texas");
			refreshPage();

		} else {
			SendKeys(LocationFld, "Turkey");
			WaitUntilVisible(Map3);
			WaitForElementInteractable(Map3);
			ClickOn(Map3);
			WaitForCurserRunning(5);
			WaitUntilVisible(OutAgencyMsg);
			WaitUntilVisible(OutAgencyMsg);
			String OutsideAgencyMsg = GetText(OutAgencyMsg);
			String ValidMsg7 = "The location you have entered falls outside of the\n"
					+ "agency boundary. Please select a location within\n" + "the city limits to continue";
			SoftAssert s4 = new SoftAssert();
			s4.assertEquals(OutsideAgencyMsg, ValidMsg7);
			s4.assertAll();
		}

	}

	public void CCP_SearchAndAddAddress() throws InterruptedException {

		if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect1o)) {
			CECommonMethodS.serachLocationCCP(PropertiesUtils.getPropertyValue("searchLocationKey1O"));
			WaitUntilVisible(EditLocIcon);
			String ValidateStreetAdd = GetText(StreetLabel);
			SoftAssert s5b = new SoftAssert();
			Assert.assertEquals(ValidateStreetAdd, CCPStreetAddress1);
			String ValidateZip = GetText(ZipLabel);
			s5b.assertEquals(ValidateZip, CCPZip1);
			s5b.assertAll();
		} else if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
			CECommonMethodS.serachLocationCCP(searchLocationKey1O);

			WaitUntilVisible(EditLocIcon);
			WaitUntilVisible(StreetLabel);
			String ValidateStreetAdd = GetText(StreetLabel);
			SoftAssert s5b = new SoftAssert();

			Assert.assertEquals(ValidateStreetAdd, CCPStreetAddress2);
			String ValidateZip = GetText(zipLabel20);
			s5b.assertEquals(ValidateZip, CCPZip1);
			s5b.assertAll();
		} else {
			CECommonMethodS.serachLocationCCP(searchLocationKey);
			WaitUntilVisible(By.xpath("//label[contains(text(),'409 6TH ST N')]"));
			WaitUntilVisible(StreetLabel);
			String ValidateStreetAdd = GetText(StreetLabel);
			SoftAssert s5b = new SoftAssert();
			Assert.assertEquals(ValidateStreetAdd, CCPStreetAddress1);
			String ValidateZip = GetText(ZipLabel);
			s5b.assertEquals(ValidateZip, CCPZip1);
			s5b.assertAll();
		}

	}

	public void CCP_OpenAddAddressManuallyPopup() throws InterruptedException {
		List<WebElement> OutsideAgency = driver.findElements(OutAgencyMsg);
		if ((OutsideAgency.size() > 0) == true) {
			refreshPage();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		SendKeys(LocationFld, " ");

		WebElement AddLoc = (WebElement) jse
				.executeScript("return document.querySelector('#react-autowhatever-1 > div')");
		WaitUntilVisible(AddLoc);
		WaitForElementInteractable(AddLoc);
		ClickOnWE(AddLoc);

		WaitUntilVisible(ManualLocPopup);
		String PopupTitleActual = GetText(ManualLocPopup);
		String PopupTitleExpected = "Add Address Manually";

		SoftAssert s7 = new SoftAssert();
		s7.assertEquals(PopupTitleActual, PopupTitleExpected);
		s7.assertAll();
	}

	public void CCP_CloseAddAddressManuallyPopup() throws InterruptedException {
		WaitUntilVisible(CancelBtnLoc);
		WaitForElementInteractable(CancelBtnLoc);
		ClickOn(CancelBtnLoc);
		WaitUntilElementInvisible(CancelBtnLoc);
		WaitUntilElementInvisible(
				By.xpath("//div[@class='modal-header']//h2[contains(text(),'Add Address Manually')]"));
		WaitUntilVisible(ModalHeaders);
		List<WebElement> ModalHeaders1 = findElementsByXPath(ModalHeaders);
		if ((ModalHeaders1.size() <= 1) == false) {

			SoftAssert s8 = new SoftAssert();
			s8.assertEquals(false, true);
			s8.assertAll();
		}
	}

	public void CCP_ValidationMsgForNoAddressDetails() throws InterruptedException {

		WaitForElementInteractable(LocationFld);
		ClickOn(LocationFld);
		ClickOn(AddLocManually);
		ClickOn(SaveButton2);
		WaitUntilVisible(ValidationMsg3);
		String ValidationMsgActual = GetText(ValidationMsg3);
		String ValidMsgExpected = "The Address is required.";

		SoftAssert s9 = new SoftAssert();
		s9.assertEquals(ValidationMsgActual, ValidMsgExpected);
		s9.assertAll();
	}

	public void CCP_AddTheAddressManually() throws InterruptedException {
		WaitUntilVisible(StreetAdd);
		WaitForElementInteractable(StreetAdd);
		SendKeys(StreetAdd, "Manual Street");
		WaitUntilVisible(CityAdd);
		WaitForElementInteractable(CityAdd);
		SendKeys(CityAdd, "Manual City");
		WaitUntilVisible(ZipAdd);
		WaitForElementInteractable(ZipAdd);
		SendKeys(ZipAdd, "77590");
		WaitUntilVisible(ApnAdd);
		WaitForElementInteractable(ApnAdd);
		SendKeys(ApnAdd, "7030-0122-0011-000");
		WaitUntilVisible(SaveButton2);
		WaitForElementInteractable(SaveButton2);
		ClickOn(SaveButton2);
		WaitForCurserRunning(5);
		WaitUntilVisible(StreetLabel);
		WaitForElementInteractable(StreetLabel);
		String ValidateStreetAdd = GetText(StreetLabel);
		SoftAssert s10 = new SoftAssert();
		s10.assertEquals(ValidateStreetAdd, "Manual Street");
		s10.assertAll();

	}

	public void CCP_EditAddedAddress() throws InterruptedException {

		WaitUntilVisible(EditLocIcon);
		WaitForElementInteractable(EditLocIcon);

		ClickOn(EditLocIcon);
		WebElement EditStreet = WaitUntilVisibleWE(EditStreetAdd);
		EditStreet.clear();
		SendKeys(EditStreetAdd, StreetAddress);
		WebElement EditCityFld = WaitUntilVisibleWE(EditCity);
		EditCityFld.clear();
		EditCityFld.sendKeys(City);
		WebElement EditZipFld = WaitUntilVisibleWE(EditZip);
		EditZipFld.clear();
		EditZipFld.sendKeys(Zip);

		WebElement SaveBtn = WaitUntilVisibleWE(SaveButton);
		if ((SaveBtn.isDisplayed()) == false) {

			SoftAssert s11 = new SoftAssert();
			s11.assertEquals(false, true);
			s11.assertAll();
		}
	}

	public void CCP_UpdateAddressOnSaveButton() throws InterruptedException {

		WaitUntilVisible(SaveButton);
		WaitForElementInteractable(SaveButton);
		ClickOn(SaveButton);
		WaitForCurserRunning(5);
		WaitUntilVisible(StreetLabel);
		WaitUntilVisible(ZipLabel);
		String NameLabel1 = GetText(StreetLabel);
		Assert.assertEquals(StreetAddress, NameLabel1);
		String CityLabel1 = GetText(CityLabel);
		SoftAssert s12b = new SoftAssert();
		s12b.assertEquals(City, CityLabel1);
		s12b.assertAll();
		String ZipLabel1 = GetText(ZipLabel);
		SoftAssert s12c = new SoftAssert();
		s12c.assertEquals(Zip, ZipLabel1);
		s12c.assertAll();

	}

	public void CCP_AddressShouldntGetUpdatedOnCancelButton() throws InterruptedException {

		WaitUntilVisible(EditLocIcon);
		WaitForElementInteractable(EditLocIcon);
		ClickOn(EditLocIcon);
		ClickOn(CancelButton);
		String NameLabel1 = GetText(StreetLabel);
		SoftAssert s13a = new SoftAssert();
		s13a.assertEquals(StreetAddress, NameLabel1);
		s13a.assertAll();
		String CityLabel1 = GetText(CityLabel);
		SoftAssert s13b = new SoftAssert();
		s13b.assertEquals(City, CityLabel1);
		s13b.assertAll();
		String ZipLabel1 = GetText(ZipLabel);
		SoftAssert s13c = new SoftAssert();
		s13c.assertEquals(Zip, ZipLabel1);
		s13c.assertAll();
	}

	public void CCP_OpenFlagAddressPopup() throws InterruptedException {

		if (ElementIsDisplayed(toggleChecked)) {
			ClickOn(FlagToggle);
			WaitForElementInteractable(FlagToggle);
			ClickByJsExecuter(FlagToggle);

		} else
			ClickOn(FlagToggle);

		WaitUntilVisible(PopupTitle);
		String[] FlagPopup = GetText(PopupTitle).split("-");
		String FlagPopupTitle = FlagPopup[0];

		SoftAssert s14 = new SoftAssert();
		s14.assertEquals("Flag Address ", FlagPopupTitle);
		s14.assertAll();
	}

	public void CCP_CloseFlagAddressPopup() throws InterruptedException {

		WaitForPageLoadTime(5);
		WaitUntilVisible(CrossIconFlag);
		WaitForElementInteractable(CrossIconFlag);
		ClickOn(CrossIconFlag);
		WaitUntilElementInvisible(By.xpath("//div[@class='modal-header']//h2[contains(text(),'Flag Address')]"));
		WaitUntilVisible(ModalHeaders);
		List<WebElement> ModalHeaders3 = findElementsByXPath(ModalHeaders);
		if ((ModalHeaders3.size() <= 1) == false) {

			SoftAssert s15 = new SoftAssert();
			s15.assertEquals(true, false);
			s15.assertAll();
		}

	}

	public void CCP_VerifyFlagAddressButtonState() throws InterruptedException {

		WaitForElementInteractable(FlagToggle);
		ClickOn(FlagToggle);

		boolean Status = driver.findElement(FlagAddressBtn).isEnabled();

		SoftAssert s16a = new SoftAssert();
		s16a.assertEquals(Status, false);
		String RandomReason = RandomStrings.RequiredString(20);
		SendKeys(ReasonToFlag, RandomReason);

		WaitUntilVisible(FlagAddressBtn);
		boolean Status1 = driver.findElement(FlagAddressBtn).isEnabled();

		SoftAssert s16b = new SoftAssert();
		s16b.assertEquals(Status1, true);
		s16a.assertAll();
		s16b.assertAll();
	}

	public void CCP_VerifyFlaggedButtonState() throws InterruptedException {

		WaitForElementInteractable(FlagAddressBtn);
		ClickOn(FlagAddressBtn);

		WaitUntilVisible(FlaggedLabel);
		String FlaggedLabel1 = GetText(FlaggedLabel);

		SoftAssert s17 = new SoftAssert();
		s17.assertEquals(FlaggedLabel1, "Yes");
		s17.assertAll();

	}

	public void CCP_InfoMsgForNoViolation() throws InterruptedException {
		WebElement InfoMessage2 = WaitUntilVisibleWE(InfoMsg2);
		if ((InfoMessage2.isDisplayed()) == false) {

			SoftAssert s18 = new SoftAssert();
			s18.assertEquals(false, true);
			s18.assertAll();
		}
	}

	public void CCP_ValidationMsgForNoViolation() {

		ClickOn(CCButton);

		WebElement ValidMsg2 = WaitUntilVisibleWE(ValidationMsg2);
		if ((ValidMsg2.isDisplayed()) == false) {

			SoftAssert s19 = new SoftAssert();
			s19.assertEquals(false, true);
			s19.assertAll();
		}

	}

	public void CCP_InfoMsgForNonExistingData() {
		String RandomReason1 = RandomStrings.RequiredString(10);
		SendKeys(ViolationSearchBox, RandomReason1);
		String NoSearchResult = GetText(InfoMsgNoSearch);
		String InfoMsg = "No matching violations";

		SoftAssert s20 = new SoftAssert();
		s20.assertEquals(NoSearchResult, InfoMsg);
		s20.assertAll();

	}

	public void CCP_AddCustomIssueDescriptionField() {

		ClickOn(CustomIssueIcon);
		boolean CustomIssue = driver.findElement(CustomIssueFeild).isDisplayed();

		SoftAssert s21 = new SoftAssert();
		s21.assertEquals(CustomIssue, true);
		s21.assertAll();

	}

	public void CCP_validationMsgForEmptyCustomIssueDescriptionField() {

		ClickOn(CustomIssueDlt);
		ClickOn(ViolationSearchBox);
		ClickOn(CustomIssueIcon);
		String CustomValidMsg = GetText(ValidMsgCustom);
		String CustValidMsg = "The Custom Issue Description is required.";

		SoftAssert s22 = new SoftAssert();
		s22.assertEquals(CustomValidMsg, CustValidMsg);
		s22.assertAll();

	}

	public void CCP_AddViolationWithoutEntity() throws InterruptedException {

		ClickOn(CustomIssueDlt);
		ClickOn(ViolationSearchBox);

		WaitForElementInteractable(ViolationSearchBox);
		SendKeys(ViolationSearchBox, "Wa");

		if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
			WaitForElementInteractable(violationList20);
			ClickOn(violationList20);
			WebElement WaterVio = WaitUntilVisibleWE(WaterViolation);
			if ((WaterVio.isDisplayed()) == false) {

				SoftAssert s23 = new SoftAssert();
				s23.assertEquals(false, true);
				s23.assertAll();
			}
		} else {
			WaitForElementInteractable(ViolationList);
			ClickOn(ViolationList);
			WebElement WaterVio = WaitUntilVisibleWE(WaterViolation);
			if ((WaterVio.isDisplayed()) == false) {

				SoftAssert s23 = new SoftAssert();
				s23.assertEquals(false, true);
				s23.assertAll();
			}
		}

	}

	public void CCP_OpenViolationWithEntityPopup() throws InterruptedException {
		ClickOn(ViolationSearchBox);
		SendKeys(ViolationSearchBox, "An");

		if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
			WaitForElementInteractable(violationList20);
			ClickOn(violationList20);
			List<WebElement> ModalHeaders4 = WaitUntilVisibleList(ModalHeaders);
			if ((ModalHeaders4.size() > 1) == false) {

				SoftAssert s24 = new SoftAssert();
				s24.assertEquals(false, true);
				s24.assertAll();
			}
		} else {
			WaitForElementInteractable(ViolationList);
			ClickOn(ViolationList);
			List<WebElement> ModalHeaders4 = WaitUntilVisibleList(ModalHeaders);
			if ((ModalHeaders4.size() > 1) == false) {

				SoftAssert s24 = new SoftAssert();
				s24.assertEquals(false, true);
				s24.assertAll();
			}
		}
	}

	public void CCP_ValidationMsgForNoViolationData() {
		ClickOn(AddButton);
		WebElement ValidMsgVio = WaitUntilVisibleWE(ValidMsgVioPopup);
		if ((ValidMsgVio.isDisplayed()) == false) {

			SoftAssert s25 = new SoftAssert();
			s25.assertEquals(false, true);
			s25.assertAll();
		}
		WaitForElementInteractable(EntityCancelBtn);
		ClickOn(EntityCancelBtn);
	}

	public void CCP_AddViolationWithEntity() throws InterruptedException {
		List<WebElement> countVio1 = driver.findElements(AddedVioList);
		int BeforeAdd = countVio1.size();
		ClickOn(ViolationSearchBox);
		clearByJSE(ViolationSearchBox);

		if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
			WaitForElementInteractable(ViolationSearchBox);
			SendKeys(ViolationSearchBox, "An");
			ClickOn(violationList20);

			WaitForElementInteractable(EntityField1);
			SendKeys(EntityField1, "Black");
			ClickOn(AddButton);
			List<WebElement> countVio2 = driver.findElements(AddedVioList);
			int AfterAdd = countVio2.size();
			if (AfterAdd != (BeforeAdd + 1)) {

				SoftAssert s26 = new SoftAssert();
				s26.assertEquals(false, true);
				s26.assertAll();
			}

		} else {
			SendKeys(ViolationSearchBox, "An");
			ClickOn(ViolationList);

			WaitForElementInteractable(EntityField1);
			SendKeys(EntityField1, "Black");
			ClickOn(AddButton);
			List<WebElement> countVio2 = driver.findElements(AddedVioList);
			int AfterAdd = countVio2.size();
			if (AfterAdd != (BeforeAdd + 1)) {

				SoftAssert s26 = new SoftAssert();
				s26.assertEquals(false, true);
				s26.assertAll();

			}
		}

	}

	public void CCP_SearchAndAddViolation() throws InterruptedException {

		WaitForElementInteractable(ViolationSearchBox);
		ClickOn(ViolationSearchBox);
		if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
			SendKeys(ViolationSearchBox, "An");
			ClickOn(violationList20);

			WaitForElementInteractable(EntitySearchBox);
			SendKeys(EntitySearchBox, "Wh");

			WaitForElementInteractable(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));
			ClickOn(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));

			WaitForElementInteractable(AddButton);
			ClickOn(AddButton);

			WaitForElementInteractable(AddedVioList);
			WebElement VioList = findElement(AddedVioList);
			if ((VioList.isDisplayed()) == false) {

				SoftAssert s27 = new SoftAssert();
				s27.assertEquals(false, true);
				s27.assertAll();

			}

		} else {

			SendKeys(ViolationSearchBox, "An");
			ClickOn(ViolationList);
			SendKeys(EntitySearchBox, "Wh");
			WaitForElementInteractable(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));
			ClickOn(By.xpath("//li[@role='option']//div[@class='list-label']//b[text()='Wh']"));

			WaitForElementInteractable(AddButton);
			ClickOn(AddButton);
			WebElement VioList = WaitUntilVisibleWE(AddedVioList);
			if ((VioList.isDisplayed()) == false) {

				SoftAssert s27 = new SoftAssert();
				s27.assertEquals(false, true);
				s27.assertAll();

			}
		}
	}

	public void CCP_VerifyAddAnotherViolationLink() {
		String AddAnotherVio1 = GetText(AddAnotherVio);

		SoftAssert s28 = new SoftAssert();
		s28.assertEquals(AddAnotherVio1, "Add another Animal");
		s28.assertAll();
	}

	public void CCP_DeleteAddedViolation() {
		List<WebElement> countVio = driver.findElements(CrossIconVio);
		int CountVio = countVio.size();
		ClickOn(CrossIconVio);
		List<WebElement> countVio1 = WaitUntilVisibleList(CrossIconVio);
		int NewCountVio = countVio1.size() + 1;

		SoftAssert s29 = new SoftAssert();
		s29.assertEquals(CountVio, NewCountVio);
		s29.assertAll();
	}

	public void CCP_OpenEditViolationPopup() throws InterruptedException {

		WaitUntilVisible(EditIconVio);
		WaitForElementInteractable(EditIconVio);
		ClickOn(EditIconVio);

		WaitForElementInteractable(ViolationPopup);
		String[] PopupTitle = driver.findElement(ViolationPopup).getText().split(" ");

		SoftAssert s30 = new SoftAssert();
		s30.assertEquals(PopupTitle[0], "Edit");
		s30.assertAll();
	}

	public void CCP_UploadPhotoForViolation() throws InterruptedException {

		WebElement UploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/Jellyfish_11zon.jpg");
		WaitForCurserRunning(5);
		WaitUntilVisible(EntityAddBtn);
		WebElement ImgWait = findElement(EntityAddBtn);
		if ((ImgWait.isEnabled()) == false) {
			for (int w = 0; w < 10; w++) {

				if ((ImgWait.isEnabled()) == true) {
					break;
				}
			}
		}
		WaitUntilPresent(EntityAddBtn);
		WaitForElementInteractable(EntityAddBtn);
		ClickByJsExecuter(EntityAddBtn);
		WaitForCurserRunning(6);
		WebElement ImageThumb = WaitUntilVisibleWE(UploadedImgThumb);
		if ((ImageThumb.isDisplayed()) == false) {

			SoftAssert s31 = new SoftAssert();
			s31.assertEquals(false, true);
			s31.assertAll();
		}
	}

	public void CCP_VerifyReplaceButtonPresence() throws InterruptedException {

		WaitUntilVisible(EditIconVio);
		WaitUntilPresent(EditIconVio);
		WaitForElementInteractable(EditIconVio);
		ClickByJsExecuter(EditIconVio);
		WaitForCurserRunning(5);
		WaitUntilVisible(UploadLink2);
		String ReplaceBtn = GetText(UploadLink2);
		SoftAssert s32 = new SoftAssert();
		s32.assertEquals(ReplaceBtn, "Replace");
		s32.assertAll();
	}

	public void CCP_DeleteAddedPhoto() throws InterruptedException {

		WaitUntilVisible(DltUploadedImg);
		WaitForElementInteractable(DltUploadedImg);
		ClickOn(DltUploadedImg);
		WaitForCurserRunning(4);
		Boolean ImgThumb4 = driver.findElements(AddedImgThumb).size() > 0;
		if (ImgThumb4 == true) {

			SoftAssert s33 = new SoftAssert();
			s33.assertEquals(false, true);
			s33.assertAll();
		}
		WaitUntilVisible(EntityCancelBtn);
		WaitForElementInteractable(EntityCancelBtn);
		ClickOn(EntityCancelBtn);

	}

	public static int TotalVioCountCCP;

	public void CCP_VerifyTotalViolationsCount() throws InterruptedException {

		WaitUntilVisible(CountViolations);
		WaitForElementInteractable(CountViolations);
		String CountVio = GetText(CountViolations);
		List<WebElement> countVio3 = WaitUntilVisibleList(CrossIconVio);
		TotalVioCountCCP = countVio3.size();

		String FinalCount = "Add Violations (" + (TotalVioCountCCP) + ")";

		SoftAssert s35 = new SoftAssert();
		s35.assertEquals(CountVio, FinalCount);
		s35.assertAll();

	}

	public void CCP_OpenViolationListingPopup() throws InterruptedException {

		WebElement IndiVio = WaitUntilVisibleWE(CountEachVio);
		String[] FirstVio = IndiVio.getText().split(" ");
		String FinalIndiVio = FirstVio[1];
		WaitForElementInteractable(CountEachVio);
		ClickOn(CountEachVio);
		WaitUntilVisible(PopupTitle);
		String[] popupVio = GetText(PopupTitle).split(" ");
		String FinalPopupVio = popupVio[0] + "s";

		SoftAssert s36 = new SoftAssert();
		s36.assertEquals(FinalIndiVio, FinalPopupVio);
		s36.assertAll();

	}

	public void CCP_CloseViolationListingPopup() throws InterruptedException {
		ClickOn(EntityCancelBtn);
		WaitUntilElementInvisible(EntityCancelBtn);
		WaitUntilVisible(ModalHeaders);
		List<WebElement> ModalHeaders5 = findElementsByXPath(ModalHeaders);
		if ((ModalHeaders5.size() <= 1) == false) {

			SoftAssert s37 = new SoftAssert();
			s37.assertEquals(false, true);
			s37.assertAll();

		}
	}

	public void CCP_OpenCreateAContactPopup() throws InterruptedException {
		WaitForElementInteractable(AddContactFld);
		ClickOn(AddContactFld);
		ClickOn(CrtNewContact);
		String ContactTitle = GetText(ContactPopup);

		SoftAssert s38 = new SoftAssert();
		s38.assertEquals(ContactTitle, "Create a Contact");
		s38.assertAll();

	}

	public void CCP_ValidationMsgForNodataInNameField() {
		ClickOn(CrtContactBtn);
		WebElement ErrMsg = WaitUntilVisibleWE(ContactErrMsg);
		if ((ErrMsg.isDisplayed()) == false) {

			SoftAssert s39 = new SoftAssert();
			s39.assertEquals(false, true);
			s39.assertAll();

		}

	}

	public void CCP_CloseCreateAContactPopup() throws InterruptedException {

		WaitForElementInteractable(CancelContactBtn);
		ClickOn(CancelContactBtn);
		WaitUntilElementInvisible(
				By.xpath("//div[@class='full-page-modal__header']//h1[contains(text(),'Create a Contact')]"));
		WaitUntilVisible(ModalHeaders);
		List<WebElement> ModalHeaders4 = findElementsByXPath(ModalHeaders);
		if ((ModalHeaders4.size() <= 1) == false) {

			SoftAssert s40 = new SoftAssert();
			s40.assertEquals(false, true);
			s40.assertAll();
		}
	}

	public void CCP_AddNewContact() throws InterruptedException {

		List<WebElement> BeforeAdding = driver.findElements(CountContact);
		int a = BeforeAdding.size();
		for (int z = 0; z < 3; z++) {
			String RandomName = RandomStrings.RequiredCharacters(8);
			String RandomMail = RandomName + "@yopmail.com";
			String RandomContact = RandomStrings.RequiredDigits(10);
			WaitUntilVisible(AddContactFld);
			ClickOn(AddContactFld);
			ClickOn(CrtNewContact);
			SendKeys(NameField, RandomName);
			SendKeys(EmailField, RandomMail);
			SendKeys(WorkPhoneField, RandomContact);

			WaitForElementInteractable(CrtContactBtn);
			ClickOn(CrtContactBtn);

			WaitForElementInteractable(PropertyOwnerOption);
			ClickOn(PropertyOwnerOption);
			ClickOn(ApplyButton);
		}
		List<WebElement> AfterAdding = WaitUntilVisibleList(CountContact);
		int b = AfterAdding.size();
		if ((b > a) == false) {

			SoftAssert s41 = new SoftAssert();
			s41.assertEquals(false, true);
			s41.assertAll();

		}

	}

	public void CCP_OpenEditContactPopup() throws InterruptedException {
		WaitForElementInteractable(EditContact);
		ClickOn(EditContact);
		WaitForCurserRunning(3);
		WaitUntilVisible(EditContactPopup);
		String ContactEditPopup = GetText(EditContactPopup);

		SoftAssert s43 = new SoftAssert();
		s43.assertEquals(ContactEditPopup, "Edit Contact");
		s43.assertAll();

		WaitforCustometime(2);
		WaitForElementInteractable(CancelEditPopup);
		ClickOn(CancelEditPopup);
	}

	public void CCP_DeleteAddedContact() throws InterruptedException {

		WaitUntilVisible(CountContact);
		List<WebElement> BeforeDeleting = findElementsByXPath(CountContact);
		int a1 = BeforeDeleting.size();

		WaitForElementInteractable(DeleteContact);
		ClickByJsExecuter(DeleteContact);

		WaitUntilVisible(CountContact);
		List<WebElement> AfterDeleting = WaitUntilVisibleList(CountContact);
		int b1 = AfterDeleting.size();
		if ((b1 == (a1 - 1)) == false) {

			SoftAssert s44 = new SoftAssert();
			s44.assertEquals(false, true);
			s44.assertAll();

		}
	}

	public static int TotalContactsCountCCP;

	public void CCP_VerifyTotalContactCount() throws InterruptedException {

		String ContactTile = GetText(CountContactTile);
		WaitUntilVisible(CountContact);
		WaitUntilVisible(CountContact);
		List<WebElement> CountContacts = findElementsByXPath(CountContact);
		TotalContactsCountCCP = CountContacts.size();

		String FinalCountContacts = "Contacts (" + (TotalContactsCountCCP) + ")";

		SoftAssert s45 = new SoftAssert();
		s45.assertEquals(ContactTile, FinalCountContacts);
		s45.assertAll();

	}

	public void CCP_VerifyViolationAttachmentsPresence() throws InterruptedException {

		WaitForCurserRunning(2);

		WaitUntilVisible(UploadedImgThumb);
		List<WebElement> VioImages = findElementsByXPath(UploadedImgThumb);
		int count1 = VioImages.size();
		List<WebElement> AttachImages = WaitUntilVisibleList(AddedImage);
		int count2 = AttachImages.size();
		if ((count2 >= count1) == false) {

			SoftAssert s46 = new SoftAssert();
			s46.assertEquals(false, true);
			s46.assertAll();
		}

	}

	public void CCP_OpenAddAttachmentsPopup() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
		JavascriptExecutor jser = (JavascriptExecutor) driver;

		WebElement AttachmentIcon = (WebElement) jser
				.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");

		WaitForElementInteractable(AttachmentIcon);
		AttachmentIcon.click();
		String Title = GetText(AttachmentTitle);
		String AttachTitle = "Add Attachments";

		SoftAssert s47 = new SoftAssert();
		s47.assertEquals(AttachTitle, Title);
		s47.assertAll();

	}

	public void CCP_VerifyAttachmentsPreview() throws InterruptedException {

		WaitforCustometime(3);
		WebElement UploadFile2 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile2.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");

		WaitForCurserRunning(4);
		WebElement ImageThumb = WaitUntilVisibleWE(ImgThumb);
		if ((ImageThumb.isDisplayed()) == false) {

			SoftAssert s48 = new SoftAssert();
			s48.assertEquals(false, true);
			s48.assertAll();
		}
	}

	public void CCP_OpenCloseAddAttachmentsPopup() throws InterruptedException {
		try {

			WaitforCustometime(1);
			WaitUntilVisible(YesCloseBtn);
			WaitForElementInteractable(YesCloseBtn);
			ClickOn(YesCloseBtn);

			WaitUntilVisible(CloseAttachmentTitle);
			String PopupTitle2 = GetText(CloseAttachmentTitle);
			String PopupTitle3 = "Close Add Attachments";

			SoftAssert s49 = new SoftAssert();
			s49.assertEquals(PopupTitle3, PopupTitle2);
			s49.assertAll();
		} catch (WebDriverException e) {
			e.printStackTrace();
			SoftAssert s49 = new SoftAssert();
			s49.assertEquals(Boolean.TRUE, Boolean.FALSE);
			s49.assertAll();
		}
	}

	public void CCP_CloseAddAttachmentsPopup() throws InterruptedException {

		WaitUntilVisible(YesCloseBtn);
		WaitUntilPresent(YesCloseBtn);
		WaitForElementInteractable(YesCloseBtn);
		ClickByJsExecuter(YesCloseBtn);
		WaitUntilElementInvisible(YesCloseBtn);
		WaitForCurserRunning(2);
		WaitUntilVisible(ModalHeaders);
		WaitUntilVisible(ModalHeaders);
		List<WebElement> ModalHeaders2 = findElementsByXPath(ModalHeaders);
		if ((ModalHeaders2.size() <= 1) == false) {

			SoftAssert s50 = new SoftAssert();
			s50.assertEquals(false, true);
			s50.assertAll();
		}
	}

	public void CCP_ReopenAddAttachmentsPopup() throws InterruptedException {

		JavascriptExecutor jser = (JavascriptExecutor) driver;
		WebElement AttachmentIcon = (WebElement) jser
				.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");
		WaitUntilVisible(AttachmentIcon);
		WaitForElementInteractable(AttachmentIcon);
		AttachmentIcon.click();
		WebElement UploadFile3 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
		WaitforCustometime(4);

		WaitUntilVisible(YesCloseBtn);
		WaitForElementInteractable(YesCloseBtn);
		// WaitForElementInteractable(YesCloseBtn);
		ClickOn(YesCloseBtn);

		WaitUntilVisible(DontCloseBtn);
		WaitForElementInteractable(DontCloseBtn);
		ClickOn(DontCloseBtn);
		WaitForCurserRunning(4);
		WaitUntilVisible(AttachmentTitle);
		String Title4 = GetText(AttachmentTitle);
		String AttachTitle = "Add Attachments";
		SoftAssert s51 = new SoftAssert();
		s51.assertEquals(AttachTitle, Title4);
		s51.assertAll();
	}

	public void CCP_AddAnAttachment() throws InterruptedException {

		WaitForCurserRunning(2);
		WaitUntilVisible(AddButton2);
		WaitForElementInteractable(AddButton2);
		ClickByJsExecuter(AddButton2);
		WebElement AddedImgThumb = WaitUntilVisibleWE(ImgThumb2);
		if ((AddedImgThumb.isDisplayed()) == false) {

			SoftAssert s52 = new SoftAssert();
			s52.assertEquals(false, true);
			s52.assertAll();
		}

	}

	public void CCP_AddMultipleAttachments() throws InterruptedException {
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		WebElement AttachmentIcon = (WebElement) jser
				.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");
		WaitUntilVisible(AttachmentIcon);
		WaitForElementInteractable(AttachmentIcon);
		AttachmentIcon.click();
		WaitForCurserRunning(4);
		WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile4.sendKeys(System.getProperty("user.dir") + "/TestData/Jellyfish_11zon.jpg");
		WaitForCurserRunning(5);
		WaitForElementInteractable(AddButton2);
		WebElement UploadFile5 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile5.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
		WaitForCurserRunning(5);
		WaitForElementInteractable(AddButton2);
		ClickOn(AddButton2);
		WaitForCurserRunning(5);
	}

	public void CCP_OpenAttachmentsDetailsPopup() throws InterruptedException {
		WaitForElementInteractable(AddedImage);
		ClickOn(AddedImage);
		WaitUntilVisible(AttachmentDetailsTitle);
		String AttachTitle1 = GetText(AttachmentDetailsTitle);
		String AttachTitle2 = "Attachments Details";

		SoftAssert s54 = new SoftAssert();
		s54.assertEquals(AttachTitle1, AttachTitle2);
		s54.assertAll();

	}

	public void CCP_UpdateAttachmentDetails() throws InterruptedException {

		String RandomReason2 = RandomStrings.RequiredString(15);
		SendKeys(Description, RandomReason2);

		WaitForElementInteractable(UpdateBtn);
		ClickOn(UpdateBtn);
	}

	public void CCP_DeleteAnAttachment() throws InterruptedException {

		WaitForCurserRunning(2);
		WaitUntilVisible(AttachmentDetailsTitle);
		List<WebElement> AttachmentDet = driver.findElements(AttachmentDetailsTitle);
		if ((AttachmentDet.size()) > 0) {
			ClickOn(CancelBtnAttachDet);
		}
		WaitUntilVisible(AddedImage);
		List<WebElement> countAttach0 = findElementsByXPath(AddedImage);
		int i = countAttach0.size();
		ClickOn(AddedImage);
		WaitForElementInteractable(DeleteAttach);
		ClickOn(DeleteAttach);
		WaitForElementInteractable(YesDelete);
		ClickOn(YesDelete);
		WaitForElementInteractable(UpdateBtn);
		ClickOn(UpdateBtn);
		WaitUntilElementInvisible(UpdateBtn);
		List<WebElement> countAttach1 = WaitUntilVisibleList(AddedImage);
		int j = countAttach1.size();
		if ((j == (i - 1)) == false) {

			SoftAssert s56 = new SoftAssert();
			s56.assertEquals(false, true);
			s56.assertAll();
		}
	}

	public static int TotalAttachmentsCountCCP;

	public void CCP_VerifyTotalAttachmentsCount() throws InterruptedException {
		List<WebElement> AttachmentDet = driver.findElements(AttachmentDetailsTitle);
		if ((AttachmentDet.size()) > 0) {
			WaitUntilVisible(CancelBtnAttachDet);
			WaitUntilPresent(CancelBtnAttachDet);
			WaitForElementInteractable(CancelBtnAttachDet);
			ClickByJsExecuter(CancelBtnAttachDet);
			WaitUntilElementInvisible(CancelBtnAttachDet);
		}
		WaitUntilVisible(CountAttachment);
		WaitUntilPresent(CountAttachment);
		String AttachCount = GetText(CountAttachment);
		WaitUntilVisible(AddedImage);
		List<WebElement> countAttach = driver.findElements(AddedImage);
		TotalAttachmentsCountCCP = countAttach.size();
		String FinalCount1 = "Attachments (" + (TotalAttachmentsCountCCP) + ")";

		SoftAssert s57 = new SoftAssert();
		s57.assertEquals(AttachCount, FinalCount1);
		s57.assertAll();
	}

	public void CCP_OpenCreateCasePopup() throws InterruptedException {

		WaitForElementInteractable(CCButton);
		ClickOn(CCButton);
		String CreateCaseTitle = GetText(CreateCasePop);

		SoftAssert s58 = new SoftAssert();
		s58.assertEquals(CreateCaseTitle, "Create Case");
		s58.assertAll();
	}

	public void CCP_VerifyCreateAndScheduleInspectionButton() throws InterruptedException {

		WaitUntilVisible(CrtSchInsButton);
		String ButtonText = GetText(CrtSchInsButton);

		SoftAssert s60 = new SoftAssert();
		s60.assertEquals(ButtonText, "Create & Schedule Inspection");
		s60.assertAll();
	}

	public void CCP_VerifyNextInspectionSectionState() {

		WebElement NextInspection = WaitUntilVisibleWE(NextInsSec);
		if ((NextInspection.isEnabled()) == false) {

			SoftAssert s61 = new SoftAssert();
			s61.assertEquals(false, true);
			s61.assertAll();
		}

	}

	public static String caseId;

	public void CCP_VerifyCaseCreation() throws InterruptedException {

		WaitUntilVisible(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
		WaitUntilPresent(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));

		WaitUntilVisible(By.xpath("(//div[@class='multi-choice-buttons']//button)[1]"));
		WaitForElementInteractable(By.xpath("(//div[@class='multi-choice-buttons']//button)[1]"));
		ClickByJsExecuter(By.xpath("(//div[@class='multi-choice-buttons']//button)[1]"));
		WaitUntilVisible(CrtSchInsButton);
		ScrollIntoView(CrtSchInsButton);
		WaitForElementInteractable(CrtSchInsButton);
		WaitForElementInteractable(CrtSchInsButton);
		ClickByJsExecuter(CrtSchInsButton);
		WaitForCurserRunning(10);
		WaitforCustometime(10);
		WaitUntilVisible(CaseStatus);
		WebElement Case = findElement(CaseStatus);
		if ((Case.isDisplayed()) == false) {

			SoftAssert s62 = new SoftAssert();
			s62.assertEquals(false, true);
			s62.assertAll();
		}

		caseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];

		caseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];

	}

	public void CCP_CDP_CountVerifications() throws InterruptedException {
		int VioCountCCP = TotalVioCountCCP;
		int ContactsCountCCP = TotalContactsCountCCP;
		int AttachmentsCountCCP = TotalAttachmentsCountCCP;
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(4));
		WaitUntilVisible(TotalViolationsCDP);
		WaitUntilPresent(TotalViolationsCDP);
		List<WebElement> CountViolations = driver.findElements(TotalViolationsCDP);
		int ViolationsCountCDP = CountViolations.size();
		WaitUntilVisible(TotalContactsCDP);
		ScrollIntoView(TotalContactsCDP);
		WaitUntilPresent(TotalContactsCDP);
		List<WebElement> CountContacts = driver.findElements(TotalContactsCDP);
		int ContactsCountCDP = CountContacts.size();
		WaitUntilVisibleList(TotalAttachmentsCDP);
		List<WebElement> CountAttachments = driver.findElements(TotalAttachmentsCDP);
		int AttachmentsCountCDP = CountAttachments.size();
		if ((VioCountCCP != ViolationsCountCDP) || (ContactsCountCCP != ContactsCountCDP)
				|| (AttachmentsCountCCP != AttachmentsCountCDP)) {
			Assert.assertEquals(false, true);
		}
	}

	public void CCP_CaseCreationWithMultipleViolationSameEntity() throws InterruptedException {

		CECommonMethodS.CloseCaseDetailPage();
		CECommonMethodS.NavigateToCCP();
		WaitUntilVisible(CCPTitle);
		WaitForElementInteractable(CCButton);
		CECommonMethodS.CE_AddLocation();
		CECommonMethodS.CE_AddViolationWithEntity("Animal", "Black");
		CECommonMethodS.CE_AddContact();
		CECommonMethodS.CE_AddViolationWithEntity("Animal", "Black");
		WaitForElementInteractable(CreateCaseButton);
		ClickOn(CreateCaseButton);

		WaitForCurserRunning(5);
		WaitUntilVisible(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
		WaitUntilPresent(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));

		WaitUntilVisible(AssignCaseTo);
		WaitForElementInteractable(AssignCaseTo);
		ClickOn(AssignCaseTo);
		WaitForElementInteractable(InspectionAssigneeTo);
		ClickOn(InspectionAssigneeTo);
		WaitForElementInteractable(CreateScheduleInspectionButton);
		ClickOn(CreateScheduleInspectionButton);
		WaitForCurserRunning(10);
		WaitUntilVisible(CaseStatus);
		WebElement Case = findElement(CaseStatus);
		if ((Case.isDisplayed()) == false) {

			SoftAssert s62 = new SoftAssert();
			s62.assertEquals(false, true);
			s62.assertAll();
		}
		CECommonMethodS.CloseCaseDetailPage();
	}

	public static String serachCaseId;

	public void CCP_SearchCaseAndNavigatetoCDP() throws InterruptedException {
		CECommonMethodS.NavigationTo_CaseListPage();
		WaitUntilPresent(CLPUtility.CSLPSearchField);
		WaitUntilPresent(CLPUtility.CSLPSearchField);
		WaitForElementInteractable(CLPUtility.CSLPSearchField);
		SendKeys(CLPUtility.CSLPSearchField, caseId);
		WaitForCurserRunning(2);
		WaitUntilVisible(By.xpath("//a[text()='" + caseId + "']"));
		WaitUntilVisible(By.xpath("//a[text()='" + caseId + "']"));
		WaitForElementInteractable(By.xpath("//a[text()='" + caseId + "']"));
		ClickByJsExecuter(By.xpath("//a[text()='" + caseId + "']"));
		WaitForCurserRunning(10);
		WaitUntilVisible(By.xpath("//h2[@class='case-details__case-number']"));
		serachCaseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
		SoftAssert s62 = new SoftAssert();
		s62.assertEquals(serachCaseId, caseId);
		s62.assertAll();

	}

}
