package POM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonMethods.CECommonMethods;
import CommonMethods.Helper;

public class CSLPUtility extends Helper{
	
	
	public WebDriver driver;
	LoginUtility log;
	PerformInspectionUtility PI;
	CCPUtility ccp;
	ForcedAbatementUtility FA;
	CECommonMethods CEcommonMethod;
	CLPUtility clp;
	OnlinePaymentUtility op;
	CSLPUtility CSLPUtils;
	
	
	public CSLPUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		PI = new PerformInspectionUtility(driver);
		ccp = new CCPUtility(driver);
		FA = new ForcedAbatementUtility(driver);
		//CEcommonMethod=new CECommonMethods(driver);
		clp=new CLPUtility(driver);
		op=new OnlinePaymentUtility(driver);
	}
	
	
	 public  String cSLPTab = "//a[text()='Customer Submissions']";
	    public  String customerSubmissionsHeader = "//label[@class='dropdown__selector__label']";
	    public  String statusPrimaryFilter = "//label[text()='Status']";
	    public  String createdPrimaryFilter = "//label[text()='Created']";
	    public  String allButtonCSLP = "//button[text()='All']";
	    public  String mineButton = "//button[text()='Mine']";
	    public  String moreButton = "//label[text()='More...']";
	    public  String tagsUnderColumn = "//span[@class='clipped-text']/a";
	    public  String tagsAppliedFilter = "//label[@for='tagIds']";
	    public  String selectedTag = "//label[@for='tagIds']/following::label[1]";
	    public  String clearAllFiltersLink = "//a[text()='Clear all filters']";
	    public  String nextPaginationCSLP = "//div[@class='table__pagination-nav-btns']/button[2]";
	    public  String submissionID = "//span[@class='checkbox-holder']/following::a[1]";
	    public  String previousPaginationCSLP = "//div[@class='table__pagination-nav-btns']/button[1]";
	    public  String submissionNumberHeader = "//div[text()='Submission Number']";
	    public  String deleteLink = "//a[text()='Delete']";
	    public  String deleteSubmissionPopup = "//div[@class='modal-header' and text()='Delete Submission']";
	    public  String deleteTextField = "//input[@name='deleteText']";
	    public  String deleteSubmissionButton = "//button[text()='Delete Submission']";
	    public  String validationMsgDeleteSubmission = "//div[@class='modal-base__error modal-base__error--show']";
	    public  String submissionsCount = "//div[@class='cs-listing__section__header']//following-sibling::span";
	    public  String doNotDeleteButton = "//button[text()='Do Not Delete']";
	    public  String paginationCount = "//span[@class='table__pagination-of-text']";
	    public  String filterSlider = "//i[@class='fa fa-2 fa-sliders']";
	    public  String categoryCheckbox = "//label[text()='Category']";
	    public  String filterSliderClose = "//button[@class='drawer__close']";
	    public  String categoryDropdownIcon = "//label[@for='categoryIds']/following::span[1]";
	    public  String firstCategoryCheckbox = "input#Category-0 + .checkbox__content.htmlfor--enabled";
	    public  String categoryColumnResults = "//div[@class='rt-td'][9]";
	    public  String crossSecondaryFilter = "//div[@class='filter-options category']/following::button[1]";
	    public  String countSecondaryFilters = "//div[@class='filters-secondary__chip']";
	    public  String cSLPSearchField = "//input[@name='searchQuery']";
	    public  String anonymousColumn = "//span[text()='Anonymous']";

	    public  By CSLPTab = By.xpath(CSLPUtils.cSLPTab);
	    public  By CustomerSubmissionsHeader = By.xpath(CSLPUtils.customerSubmissionsHeader);
	    public  By StatusPrimaryFilter = By.xpath(CSLPUtils.statusPrimaryFilter);
	    public  By CreatedPrimaryFilter = By.xpath(CSLPUtils.createdPrimaryFilter);
	    public  By AllButtonCSLP = By.xpath(CSLPUtils.allButtonCSLP);
	    public  By MineButton = By.xpath(CSLPUtils.mineButton);
	    public  By MoreButton = By.xpath(CSLPUtils.moreButton);
	    public  By TagsUnderColumn = By.xpath(CSLPUtils.tagsUnderColumn);
	    public  By TagsAppliedFilter = By.xpath(CSLPUtils.tagsAppliedFilter);
	    public  By SelectedTag = By.xpath(CSLPUtils.selectedTag);
	    public  By ClearAllFiltersLink = By.xpath(CSLPUtils.clearAllFiltersLink);
	    public  By NextPaginationCSLP = By.xpath(CSLPUtils.nextPaginationCSLP);
	    public  By PreviousPaginationCSLP = By.xpath(CSLPUtils.previousPaginationCSLP);
	    public  By SubmissionID = By.xpath(CSLPUtils.submissionID);
	    public  By SubmissionNumberHeader = By.xpath(CSLPUtils.submissionNumberHeader);
	    public  By DeleteLink = By.xpath(CSLPUtils.deleteLink);
	    public  By DeleteSubmissionPopup = By.xpath(CSLPUtils.deleteSubmissionPopup);
	    public  By DeleteTextField = By.xpath(CSLPUtils.deleteTextField);
	    public  By DeleteSubmissionButton = By.xpath(CSLPUtils.deleteSubmissionButton);
	    public  By ValidationMsgDeleteSubmission = By.xpath(CSLPUtils.validationMsgDeleteSubmission);
	    public  By SubmissionsCount = By.xpath(CSLPUtils.submissionsCount);
	    public  By DoNotDeleteButton = By.xpath(CSLPUtils.doNotDeleteButton);
	    public  By PaginationCount = By.xpath(CSLPUtils.paginationCount);
	    public  By FilterSlider = By.xpath(CSLPUtils.filterSlider);
	    public  By CategoryCheckbox = By.xpath(CSLPUtils.categoryCheckbox);
	    public  By FilterSliderClose = By.xpath(CSLPUtils.filterSliderClose);
	    public  By CategoryDropdownIcon = By.xpath(CSLPUtils.categoryDropdownIcon);
	    public  By FirstCategoryCheckbox = By.cssSelector(CSLPUtils.firstCategoryCheckbox);
	    public  By CategoryColumnResults = By.xpath(CSLPUtils.categoryColumnResults);
	    public  By CrossSecondaryFilter = By.xpath(CSLPUtils.crossSecondaryFilter);
	    public  By CountSecondaryFilters = By.xpath(CSLPUtils.countSecondaryFilters);
	    public  By CSLPSearchField = By.xpath(CSLPUtils.cSLPSearchField);
	    public  By AnonymousColumn = By.xpath(CSLPUtils.anonymousColumn);

	    public  By SaveAsButton = By.xpath("//button[text()='Save As']");
	    public  By SaveAsPopup = By.xpath("//div[text()='Save As']");
	    public  By ErrorMsgSaveAsPopup = By.xpath("//span[text()='The Filter Name is required.']");
	    public  By FilterNameField = By.xpath("//input[@placeholder='Enter Text']");
	    public  By CountSavedFilters = By.xpath("(//ul[@class='dropdown__options--single'])[1]/li");
	    public  By CrossIconFilters = By.xpath("//button[@class='delete-btn  btn btn-primary']");
	    public  By FiltersDropdown = By.xpath("(//div[@class='dropdown__selector__selected']/label)[1]");
	    public  By YesDelete = By.xpath("//div[@class='flex-row--middle']/button[2]");
	    public  By DownloadButton = By.xpath("//button[text()='Download']");
	    public  By CSVOption = By.xpath("//li[text()='CSV']");
	    public  By CSVSuccessMessage = By.xpath("//div[@class='success-custom-message']");
	    public  By AgencyUserName = By.xpath("//div[@class='app-header__user-name']/label");
	    public  By IssueDescriptionColumn = By.xpath("//div[text()='Issue Description']");
	    public  By IssueDescriptionCheckbox = By.xpath("//label[@for='checkbox-column-Issue Description']");
	    public  By ColumnControlWidget = By.xpath("//i[@class='fa fa-2 fa-cog']");
	    public  By CloseColumnControl = By.xpath("//button[@class='drawer__close']");
	    public  By CrossIconForCSDP = By.xpath("//div[@class='customer-submission-details__close-icon']/img");
	    public  By submissionCountDetails = By.xpath("(//div[@class='cs-listing__section__header']//span)[2]");
	    public  By mapViewCasList = By.xpath("//ul[@class='map-view-sidebar-listing__wrapper']");

	    public  ArrayList<Integer> IDArray = new ArrayList<Integer>();
	    public  String CSLPHeader;
	    public  String ExpectedHeader;
	    public  boolean PrimaryFiltersPresence;
	    public  String TagFilterText;
	    public  String TagText;
	    public  String SelectedTagText;
	    public  boolean PaginationDifference;
	    public  boolean VerifyDescendingOrder;
	    public  boolean VerifyAscendingOrder;
	    public  String DeleteSubmissionTitle;
	    public  String ValidationMessageDeleteSubmission;
	    public  String ExpectedMsgDeleteSubmission;
	    public  boolean SubmissionDeletion;
	    public  int SubmissionCountAtHeader;
	    public  int TotalCasesCount;
	    public  boolean ClearAllFiltersPresence;
	    public  boolean ClearAllFiltersAbsence;
	    public  boolean CompareFilterResultsCount;
	    public  boolean CompareRemovedFilterCount;
	    public  boolean CompareSearchResultsCount;
	    public  boolean VerifyAbsenceOfCol;
	    public  boolean VerifyColumnsPresence;
	    public  String SaveAsPopupTitle;
	    public  boolean CompareCountDeletedFilter;
	    public  String SuccessMsgCSV;
	    public  String ExpectedMsgCSV;
	    public  String FileStatus;
	    public  String RecentSubmissionID;
	    public  String OpenedSubmissionID;
	    public  boolean CompareMineResultsCount;

}
