package POM;

import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import CommonMethods.PropertiesUtils;

public class AppPreRequisiteUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public AppPreRequisiteUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	
	public static By AppMenuIcon = By.xpath("//div[@class='app-header__menu__icon']");
    public static By AgencySetupIcon = By.xpath("//a[@class='tools-dropdown__tool-img tools-dropdown__tool-img--setup']");
    public static By AgencySetUpIconLbl = By.xpath("//label[text()='Agency Setup']//preceding-sibling::a");
    public static By LocationManagementTab = By.xpath("//label[text()='Location Management']");
    public static By LocationandMapsTab = By.xpath("//label[text()='Location and Maps']");
    public static By LCFTab = By.xpath("//div[text()='Location Custom Fields']");
    public static By CreateCustomFieldButton = By.xpath("//button[text()='Create Custom Field']");
    public static By OpenedPopupsTitle = By.xpath("//div[@class='modal-header']");
    public static By NameFieldLCF = By.xpath("//input[@name='label']");
    public static By TypeDropdownField = By.xpath("//div[@class='Select-placeholder']");
    public static By CreateCustomFieldButton2 = By.xpath("//div[@class='modal-footer']//button[2]");
    public static By MapLayersTab = By.xpath("//div[text()='Map Layers']");
    public static By UploadMapLayerButton = By.xpath("//button[text()='Upload Map Layer']");
    public static By LabelField = By.xpath("//input[@name='label']");
    public static By ReplaceFile = By.xpath("//label[@for='file-upload__kml'][@class='file-upload__label']");
    public static By UploadFileLink = By.xpath("//label[@for='file-upload__kml']");
    public static By UploadFileInput = By.xpath("//input[@id='file-upload__kml']");
    public static By CreateMapLayerButton = By.xpath("//button[text()='Create Map Layer']");
    public static By AgencyBoundaryTab = By.xpath("//div[text()='Agency Boundary']");
    public static By AgencyBoundayTitle = By.xpath("//div[@class='flex-column--left agency-boundary__title']//h4");
    public static By AgencyMapSettingTitle = By.xpath("//div[@class='agency-setup-tab map-settings']//h4");
    public static By UploadAgencyBoundary = By.xpath("//input[@id='file-upload__boundary']");
    public static By UploadKMZFileInput = By.xpath("//input[@id='file-upload__boundary']");
    public static By MapSettingsTab = By.xpath("//div[text()='Map Settings']");
    public static By SaveChangesButton = By.xpath("//button[text()='Save Changes']");
    public static By CenterLongitudeField = By.xpath("//input[@name='centerLongitude']");
    public static By CenterLatitudeField = By.xpath("//input[@name='centerLatitude']");
    public static By TextOptionForCLFType = By.xpath("//div[text()='Text']");
    public static By LCFsActiveCount = By.xpath("(//div[@class='agency-setup-tab__section__header']/h2)[1]");
    public static By MapLayerUploadFile = By.xpath("//input[@id='file-upload__kml']");
    public static By SaveButton = By.xpath("//button[text()='Save']");
    public static By UploadedFileLabel = By.xpath("//div[@class='file-upload']//b");
    public static By AgencyParcelFileInput = By.xpath("//input[@id='file-upload__layer']");
    public static By RefreshLinkText = By.xpath("//a[text()='Refresh']");
    public static By ForcedAbatementTab = By.xpath("//div[@class='tabs__names']/div[text()='Forced Abatement']");
    public static By CreateFAActivityButton = By.xpath("//button[text()='Create Forced Abatement Activity']");
    public static By LabelFieldFAA = By.xpath("//input[@name='label']");
    public static By DescriptionFieldFA = By.xpath("//textarea[@name='description']");
    public static By AddFieldLinkTextFA = By.xpath("//a[@class='fields-container__add-field']");
    public static By TypeDropdownFA = By.xpath("//div[@class='Select-value']");
    public static By CreateFAActivityButton2 = By.xpath("//h1[text()='Create Forced Abatement Activity']/following::button[2]");
    public static By CreatedFAALabel = By.xpath("//div[@class='sortable-table__body__td'][1]");
    public static By FieldsLabel = By.xpath("//div[@class='tile-header']/following::input[@name='label']");
    public static By ViolationsSidebarOption = By.xpath("//label[text()='Violations']");
    public static By CreateViolationButton = By.xpath("//button[text()='Create Violation']");
    public static By CreateViolationButton2 = By.xpath("(//button[text()='Create Violation'])[2]");
    public static By CreateViolationPopup = By.xpath("//h1[text()='Create Violation']");
    public static By ViolationTypeDropdown = By.xpath("//label[@title='Violation Type']/following::div[@class='Select-placeholder']");
    public static By CaseManagementSidebar = By.xpath("//label[text()='Case Management']");
    public static By WaterVioOption = By.xpath("//div[text()='Water']");
    public static By GeneralVioOption = By.xpath("//div[text()='General']");
    public static By VioOptionGeneral = By.xpath("//div[@aria-label='General']");

    public static By VioOptionAnimal = By.xpath("//div[@aria-label='Animal']");
    public static By AnimalVioOption = By.xpath("//div[text()='Animal']");
    public static By MunicipalCodeField = By.xpath("//label[text()='Municipal Code']/following::span[1]");
    public static By MunicipalCodeOption = By.xpath("//ul[@class='picklist-with-handler__picklist-section']/li");
    public static By AddedViolationsRows = By.xpath("//div[@class='sortable-table__body__tr']");
    public static By DispositionsTab = By.xpath("//div[text()='Dispositions']");
    public static By InvalidDisposition = By.xpath("//button[text()='Invalid Dispositions']");
    public static By CreateInvalidDispositionButton = By.xpath("//button[text()='Create Invalid Disposition']");
    public static By CreateInvalidDispositionPopup = By.xpath("//div[text()='Create Invalid Disposition']");
    public static By CreateDispositionButton = By.xpath("//button[text()='Create Disposition']");
    public static By LabelValidation = By.xpath("//span[@class='field__error']");
    public static By InvalidDispositionsToggle = By.xpath("//button[text()='Invalid Dispositions']");
    public static By ActiveDispositionsHeader = By.xpath("//div[text()='Dispositions']/following::h2");
    public static By MunicipalCodeTab = By.xpath("//div[text()='Municipal Code']");
    public static By CreateMunicipalCodeButton = By.xpath("//button[text()='Create Municipal Code']");
    public static By CreateMunicipalCodePopup = By.xpath("//div[text()='Create Municipal Code']");
    public static By ArticleNumberField = By.xpath("//input[@name='articleNumber']");
    public static By DescriptionField = By.xpath("//textarea[@name='description']");
    public static By ResolutionActionField = By.xpath("//textarea[@name='resolutionAction']");
    public static By CreateMunicipalCodeButton2 = By.xpath("//div[@class='municipal-code-form__footer']/button[2]");
    public static By CEProdSideBar = By.xpath("//h6[text()='PRODUCT SETTINGS']/following::label[1]");
    public static By UserManagementSidebar = By.xpath("//label[text()='User Management']");
    public static By NoticesSidebar = By.xpath("//label[text()='Notices']");
    public static By ViolationsTab = By.xpath("//div[text()='Violations']");
    public static By CRMProdSideBar = By.xpath("//div[@class='sidebar__options-container__options flex-column--left'][2]/label");
    public static By CategoriesSideBar = By.xpath("//label[text()='Categories']");
    public static By FinesSideBar = By.xpath("//label[text()='Fines']");
    public static By LateFeeSubtab = By.xpath("//div[text()='Late Fees']");
    public static By SubmissionSettingsSideBar = By.xpath("//label[text()='Submission Settings']");
    public static By CodeEnforcementOption = By.xpath("//label[text()='Code Enforcement Case']");
    public static By CreateACasePopupTitle = By.xpath("//h1[text()='Create A Case']");
    public static By CancelButton = By.xpath("//button[text()='Cancel']");
    public static By AuditTrial = By.xpath("//label[text()='Audit Trail']");
    public static By CreateFineBtn = By.xpath("//button[text()='Create Fine']");
    public static By CreateFinePopup = By.xpath("//div[@class='modal-header']");
    public static By CancelCreateFine = By.xpath("//button[text()='Cancel']");
    public static By DoNotAttachedNoticeChk = By.xpath("//label[text()='Do not associate a notice']");
    public static By CreateFinePopUpbtn = By.xpath("//div[text()='Create Fine'][@class='modal-header']//parent::div//button[text()='Create Fine']");

    public static By CrtFineLabelValidMsg = By.xpath("(//span[@class='field__error'])[1]");
    public static By CrtFineDefaultAmountValidMsg = By.xpath("(//span[@class='field__error'])[2]");
    public static By CrtFineNoticeRequiredValidMsg = By.xpath("(//span[@class='field__error'])[4]");
    public static By CrtFineLabelName = By.xpath("//input[@name='label']");
    public static By CrtDefaultAmnt = By.xpath("//input[@name='defaultAmount']");
    public static By ActiveFines = By.xpath("(//div[@class='agency-setup-tab__section__header']//h2)[1]");
    public static By CrtFineSelectNoitce = By.xpath("//span[text()='Select Notice']");
    public static By CrtFineCheckHtmlNotice = By.xpath("(//input[@name='associatedNoticeIds'][@type='checkbox'][not (@disabled)])[1]");
    public static By CrtFineApplyNotices = By.xpath("//button[text()='Apply']");
    public static By CreateFineGridValLable = By.xpath("(//div[@class='rt-tr-group']//div[@class='rt-td']//div)[1]");
    public static By CrtFineGridDefAmt = By.xpath("(//div[@class='rt-tr-group']//div[@class='rt-td'])[4]");
    public static By EditActiveFine = By.xpath("//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//button[@class='edit-btn space-right btn btn-primary']");
    public static By EditSavebtn = By.xpath("//button[text()='Save']");
    public static By EditInactiveFine = By.xpath("//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//button[@class='edit-btn space-right btn btn-primary']");
    public static By InactiveFinebtn = By.xpath("//button[text()='Inactive']");
    public static By ActiveFinetoogle = By.xpath("//button[text()='Active']");
    public static By InactiveFines = By.xpath("(//div[@class='agency-setup-tab__section__header']//h2)[2]");
    public static By InactiveFineGridData = By.xpath("//h2[contains(text(),'Inactive')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-tr-group']//div[@class='rt-td']");
    public static By ActiveFineGridData = By.xpath("//h2[contains(text(),'Active')]//ancestor::div[@class='agency-setup-tab__section']//div[@class='rt-tr-group']//div[@class='rt-td']");
    public static By CreateLateFeebtn = By.xpath("//button[text()='Create Late Fee']");
    public static By CreateLateFeePopupText = By.xpath("//div[text()='Create Late Fee']");
    public static By CreateLateFeebtnpopup = By.xpath("//div[text()='Create Late Fee']//ancestor::div//button[text()='Create Late Fee']");
    public static By CrtLateFineLabelName = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='label']");
    public static By CrtLateFineLabeldesc = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='description']");
    public static By CrtLateFeeManualToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='Manual Late Fee']");
    public static By CrtLateFeeFlatToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='Flat Late Fee']");
    public static By CrtLateFeeFixedAmtToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='Fixed Amount']");
    public static By CrtLateFeeAmount = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='amount']");
    public static By AfterDayLateFeePayDue = By.xpath("//div[text()='Create Late Fee']//parent::div//input[@name='payByDays']");
    public static By CrtLateFeeOutstdBalToggle = By.xpath("//div[text()='Create Late Fee']//parent::div//button[text()='% of outstanding balance']");

    public static String createNonHtmlNoticeBtn = "//button[text()='Create Non-HTML Notice']";
    public static String createNonHtmlNoticePopup = "//div[text()='Create Non-HTML Notice']";
    public static String labelField = "//input[@name='label']";
    public static String createNoticeBtn = "//button[text()='Create Notice']";
    public static String createHtmlNoticeBtn = "//button[text()='Create HTML Notice']";
    public static String createHtmlNoticePopup = "//h1[text()='Create HTML Notice']";
    public static String mergeFieldsLink = "//span[text()='Merge Fields']";
    public static String addMergeFieldsPopup = "//div[text()='Add Merge Fields']";
    public static String countNotices = "//div[@class='agency-setup-tab__section__header']/h2";
    public static String categoryDropdown = "//div[@class='Select-value']";
    public static String categoryOption = "//*[text()='Case Activity']";
    public static String fieldResults = "//div/div[@class='rt-td']/a";
    public static String categoryResults = "//div[text()='Case Activity']";
    public static String doneButton = "//button[text()='Done']";
    public static String previewButton = "//button[text()='Preview']";
    public static String previewPopupBody = "//div[@class='modal-base__body']//div/p";
    public static String fADocumentToggle = "//button[text()='FA Document']";
    public static String noticesPageLink = "//label[text()='Notices']";
    public static String editIconNotice = "//button[@class='edit-btn space-right btn btn-primary']";
    public static String noticeLabelColumn = "//div[@class='sortable-table__body__td'][1]";
    public static String noticesCountHeader = "//div[@class='agency-setup-tab__section__header']/h2";
    public static String noticesCountActual = "//div[@class='sortable-table__body__td'][1]";
    public static String linkToVioTypesField = "//span[@class='Select-placeholder placeholder']";
    public static String waterOptionToLink = "//*[text()='Water']";
    public static String appHeaderIcon = "//div[@class='app-header__menu__icon']";
    public static String agencySetupLabel = "//label[text()='Agency Setup']";
    public static By CreateNonHtmlNoticeBtn = By.xpath(createNonHtmlNoticeBtn);
    public static By CreateNonHtmlNoticePopup = By.xpath(createNonHtmlNoticePopup);
    public static By CreateNoticeBtn = By.xpath(createNoticeBtn);
    public static By CreateHtmlNoticeBtn = By.xpath(createHtmlNoticeBtn);
    public static By MergeFieldsLink = By.xpath(mergeFieldsLink);
    public static By AddMergeFieldsPopup = By.xpath(addMergeFieldsPopup);
    public static By CreateHtmlNoticePopup = By.xpath(createHtmlNoticePopup);
    public static By CountNotices = By.xpath(countNotices);
    public static By CategoryDropdown = By.xpath(categoryDropdown);
    public static By CategoryOption = By.xpath(categoryOption);
    public static By FieldResults = By.xpath(fieldResults);
    public static By CategoryResults = By.xpath(categoryResults);
    public static By DoneButton = By.xpath(doneButton);
    public static By PreviewButton = By.xpath(previewButton);
    public static By PreviewPopupBody = By.xpath(previewPopupBody);
    public static By FADocumentToggle = By.xpath(fADocumentToggle);
    public static By NoticesPageLink = By.xpath(noticesPageLink);
    public static By EditIconNotice = By.xpath(editIconNotice);
    public static By NoticeLabelColumn = By.xpath(noticeLabelColumn);
    public static By NoticesCountHeader = By.xpath(noticesCountHeader);
    public static By NoticesCountActual = By.xpath(noticesCountActual);
    public static By LinkToVioTypesField = By.xpath(linkToVioTypesField);
    public static By WaterOptionToLink = By.xpath(waterOptionToLink);
    public static By AppHeaderIcon = By.xpath(appHeaderIcon);
    public static By AgencySetupLabel = By.xpath(agencySetupLabel); 
    
    
    public static String getMuncipalVioCode(String codeName) {

        String xPath = "//div[contains(text(),'" + codeName + "')]";
        return xPath;
    }
    
    public static int InactiveLateFeeCountBefore;
    public static int InactiveLateFeeCountafter;
    public static String activeLateFeeLabel;
    public static Boolean inactiveLateFeeLabel;
    public static int activeLateFeeCountBefore;
    public static int activeLateFeeCountafter;
    public static String InactiveLateFeeLabel;
    public static Boolean ActiveLateFeeLabel;
    
    public static String LateFeeLabel;
    public static String LateFeeLabelDesc;
    public static String LateFeeAmount;
    public static String PayDueAfterDay;
    public static int AfterActiveLateFeeCount;
    public static int BeforeActiveLateFeeCount;
    public static Boolean NewAddedLateFeeLable;
    
    public static int InactivefineCountBefore;
    public static int InactivefineCountafter;
    public static String activeFineLabel;
    public static Boolean inactiveFineLabel;
    
    public static int activefineCountBefore;
    public static int activefineCountafter;
    public static String InactiveFineLabel;
    public static Boolean ActiveFineLabel;
    public static String LabelValBefore;
    public static String labelNameAfter;
    public static String DefltAmtAfter;
    public static String DefltAmtBefore;
    public static String EditedLabelName;
    public static String EditedDefAmt;
    
    public static String ActualcreateLateFeePOp;
    public static String ExpectedCreateLateFeePopup = "Create Late Fee";
    public static int CloseCreateLateFeePOpup;
    public static String ExpectedCrtLateFeeLabelValidMsg = "The Label is required.";
    public static String ActualCrtLateFeeLabelValidMsg;
    
    public static String ActualCrtFineLabelValidMsg;
    public static String ActualCrtFineDefaultAmntValidMsg;

    public static String ExpectedCrtFineLabelValidMsg = "The Label is required.";
    public static String ExpectedCrtFineDefaultAmntValidMsg = "Number should be greater than 0";

    public static String ActualNoticeRequiresValidMsg;
    public static String ExpectedNoticeRequiresValidMsg = "The Notice is required.";


    public static String labelName;
    public static String DefaultFineAmount;
    public static int BeforActiveFines;
    public static int AfterActiveFines;

    public static String CreateFineText;
    public static int CloseCreateFinePOpup;
    public static String LCFTabTitle;
    public static String CLCFPopupTitle;
    public static String ExpectedCLCFTitle;
    public static String RandomCLFName;
    public static int LCFsCountBefore;
    public static int LCFsCountAfter;
    public static boolean CompareLCFsCount;
    public static String MapLayerTabTitle;
    public static String RandomLabelName;
    public static int MapLayerCountBefore;
    public static int MapLayerCountAfter;
    public static boolean CompareMapLayersCount;
    public static String CreateMLPopupTitle;
    public static String ExpectedCreateMLTitle;
    public static String ActualBoundaryFile;
    public static String ExpectedBoundaryFile;
    public static String BoundaryTabTitle;
    public static String ActualAPZipFile;
    public static String ExpectedAPZipFile;
    public static String MapSettingsTabTitle;
    public static String MapSettingsTitle;
    public static String AddedFAActivity;
    public static String CreateViolationTitle;
    public static boolean CheckVio1;
    public static boolean CheckVio2;
    public static String DispositionsPopupTitle;
    public static String LabelValidationMsg;
    public static String[] DispositionsHeader;
    public static int DispositionsHeaderCount;
    public static String ExpectedDispositionsPopupTitle;
    public static String ExpDispositionLabelValidationMsg;
    public static boolean CheckDispositionCount;
    public static String CreateMunicipalCodePopupTitle;
    public static String AddedMuncipalCode;
    public static int CurrentNoticesCount;
    public static boolean CompareCountNonHTML;
    public static boolean CompareCountHTML;
    public static boolean CompareCountFADoc;
    public static String GetCRMTrace;
    public static boolean ToggleButtonState1;
    public static boolean ToggleButtonState2;
    public static boolean CCPStatus;
    public static String RandomArticleNumber;


    public static String locationMapLayerEnterprise = PropertiesUtils.getPropertyValue("locationMapLayerEnterprise");
    public static String locationMapLayerGIS12O = PropertiesUtils.getPropertyValue("locationMapLayerGIS12O");
    public static String locationParcelFileEnterprise = PropertiesUtils.getPropertyValue("locationParcelFileEnterprise");
    public static String locationParcelFileGIS12O = PropertiesUtils.getPropertyValue("locationParcelFileGIS12O");
    public static String centerLongitudeEnterprise = PropertiesUtils.getPropertyValue("centerLongitudeEnterprise");
    public static String centerLongitudeGIS12O = PropertiesUtils.getPropertyValue("centerLongitudeGIS12O");
    public static String centerLatitudeGIS120 = PropertiesUtils.getPropertyValue("centerLatitudeGIS120");
    public static String centerLatitudeEnterprise = PropertiesUtils.getPropertyValue("centerLatitudeEnterprise");

}
