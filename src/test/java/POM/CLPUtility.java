package POM;

import BrowsersBase.BrowsersInvoked;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CheckDownloadedFile;
import CommonMethods.DateAndTime;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import POM.CCPUtility;

public class CLPUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CLPUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}

	public static String cLP = "//a[text()='Cases']";
	public static String cases = "//label[text()='Cases: ']";
	public static String cSLPSearchField = "//input[@name='searchQuery']";
	public static String violationTypeFilter = "//label[text()='Violation Type']";
	public static String violationTypeCol = "//div[contains(text(),'Violation Type')]";
	public static String locationCol = "//div[contains(text(),'Location')]";
	public static String apnCol = "//div[contains(text(),'APN')]";
	public static String assigneeCol = "//div[text()='Assignee']";
	public static String statusCol = "//div[text()='Status']";
	public static String createdCol = "//div[text()='Created']";
	public static String closedCol = "//div[text()='Closed']";
	public static String inspectionAssigneeCol = "//div[text()='Inspection Assignee']";
	public static String nextInsepectionAssingeeCol = "//div[text()='Next Scheduled Inspection']";
	public static String deleteCol = "//div[text()='Delete']";
	public static String caseStatusFilter = "//label[text()='Case Status']";
	public static String createdFilter = "//label[text()='Created']";
	public static String inspectionAssigneeFilter = "//div[text()='Inspection Assignee']";
	public static String nextScheduledInspectionFilter = "//div[text()='Next Scheduled Inspection']";
	public static String paginationField = "//div[@class='table__pagination-page-nos']//input";
	public static String nextPagination = "//div[@class='table__pagination-nav-btns']//button[@class='square-btn btn btn-default'][2]";
	public static String previousPagingation = "(//div[@class='table__pagination-nav-btns']//button)[1]";
	public static String caseID = "//span[@class='checkbox-holder']/following::a[1]";
	public static String caseNumberHeader = "//div[text()='Case Number']";
	public static String deleteLink = "//a[text()='Delete']";
	public static String deleteCasePopup = "//div[@class='modal-header' and text()='Delete Case']";
	public static String deleteTextField = "//input[@name='deleteText']";
	public static String deleteCaseButton = "//button[text()='Delete Case']";
	public static String validationMsgDeleteCase = "//div[@class='modal-base__error modal-base__error--show']";
	public static String casesCount = "//div[@class='cs-listing__section__header']//following-sibling::span";
	public static String casesCount1= "(//div[@class='cs-listing__section__header']//following-sibling::span)[1]";
	public static String doNotDeleteButton = "//button[text()='Do Not Delete']";
	public static String paginationCount = "//span[@class='table__pagination-of-text']";
	public static String violationTypePF = "//label[text()='Violation Type']";
	public static String caseStatusPF = "//label[text()='Case Status']";
	public static String createPF = "//label[text()='Created']";
	public static String inspectionAssigneePF = "//div[text()='Inspection Assignee']";
	public static String nextScheduledPF = "//label[text()='Next Scheduled Inspection']";
	public static String caseStatusDropDown = "//label[text()='Case Status']/following::span[1]";
	public static String violationTypesPF = "//label[text()='Violation Type']/following::span[1]";
	public static String closedOption = "//span[text()='Closed']";
	public static String animalviolationOption = "//label[text()='Animal'][@for='Violation Type-0']";
	public static String animalViolationOptionChk = "//input[@type='checkbox'][@name='Animal']";
	public static String closedStatusCLP = "//div[@class='rt-td']/div[text()='Closed']";
	public static String clearAllFiltersLink = "//a[text()='Clear all filters']";
	public static String filterSlider = "//i[@class='fa fa-2 fa-sliders']";
	public static String violationsFilter = "//label[@for='checkbox-violations']";
	public static String outstandingBalanceFilter = "//label[@for='checkbox-outstandingBalance']";
	public static String violationsFilterCLP = "//label[text()='Violations']";
	public static String outstandingBalanceFilterCLP = "//label[text()='Outstanding Balance']";
	public static String filterSliderClose = "//button[@class='drawer__close']";
	public static String columnControlWidget = "//i[@class='fa fa-2 fa-cog']";
	public static String columnOutstandingBalance = "//label[@for='checkbox-column-outstandingBalance' and text()='Outstanding Balance']";
	public static String closeColumnControl = "//button[@class='drawer__close']";
	public static String dropdownOutstandingBalance = "//div[@id='outstandingBalance']//div/label[text()='Any']";
	public static String option2OB = "//label[@for='Outstanding Balance-2']";
	public static String applyButtonOB = "//label[@for='Outstanding Balance-2']//following::button[text()='Apply']";
	public static String crossSecondaryFilter = "//div[@class='filter-options violations']/following-sibling::button";
	public static String countSecondaryFilters = "//div[@class='filters-secondary__chip']";
	public static String cLPSearchField = "//input[@name='searchQuery']";
	public static String noCasesInfoMsg = "//div[@class='rt-noData']";
	public static String columnOutstandingBalanceCLP = "//div[text()='Outstanding Balance']";
	public static String restoreDefaultsLink = "//a[text()='Restore Defaults']";
	public static String saveAsButton = "//button[text()='Save As']";
	public static String saveAsPopup = "//div[text()='Save As']";
	public static String saveButton = "//button[text()='Save']";
	public static String errorMsgSaveAsPopup = "//span[text()='The Filter Name is required.']";
	public static String filterNameField = "//input[@placeholder='Enter Text']";
	public static String countFiltersSaveAs = "(//ul[@class='dropdown__options--single'])[1]/li";
	public static String crossIconFilters = "//button[@class='delete-btn  btn btn-primary']";
	public static String filtersDropdown = "(//div[@class='dropdown__selector__selected']/label)[1]";
	public static String createCaseButtonCLP = "//button[text()='Create Case']";
	public static String downloadButton = "//button[text()='Download']";
	public static String cSVOption = "//li[text()='CSV']";
	public static String openedCaseId = "//h2[@class='case-details__case-number']";
	public static String printButtonCLP = "//button[text()='Print']";
	public static String closeCaseIcon = "//div[@class='case-details__close-icon']/img";
	public static String cancelButtonCCP = "//button[text()='Cancel']";
	public static String agencyUserName = "//div[@class='app-header__user-name']/label";
	public static String mineButtonCLP = "//button[text()='Mine']";
	public static String assigneeColumn = "//span[@class='checkbox-holder']/following::span[2]";

	public static By CLP = By.xpath(cLP);
	public static By Cases = By.xpath(cases);
	public static By ViolationTypeFilter = By.xpath(violationTypeFilter);

	public static By ViolationTypeCol = By.xpath(violationTypeCol);
	public static By LocationCol = By.xpath(locationCol);
	public static By ApnCol = By.xpath(apnCol);

	public static By AssigneeCol = By.xpath(assigneeCol);
	public static By StatusCol = By.xpath(statusCol);
	public static By CreatedCol = By.xpath(createdCol);
	public static By ClosedCol = By.xpath(closedCol);
	public static By InspectionAssigneeCol = By.xpath(inspectionAssigneeCol);
	public static By NextInsepectionAssingeeCol = By.xpath(nextInsepectionAssingeeCol);
	public static By DeleteCol = By.xpath(deleteCol);

	public static By CaseStatusFilter = By.xpath(caseStatusFilter);
	public static By CreatedFilter = By.xpath(createdFilter);
	public static By InspectionAssigneeFilter = By.xpath(inspectionAssigneeFilter);
	public static By NextScheduledInspectionFilter = By.xpath(nextScheduledInspectionFilter);
	public static By PaginationField = By.xpath(paginationField);
	public static By NextPagination = By.xpath(nextPagination);
	public static By PreviousPagingation = By.xpath(previousPagingation);
	public static By CaseID = By.xpath(caseID);
	public static By CaseNumberHeader = By.xpath(caseNumberHeader);
	public static By DeleteLink = By.xpath(deleteLink);
	public static By DeleteCasePopup = By.xpath(deleteCasePopup);
	public static By DeleteTextField = By.xpath(deleteTextField);
	public static By DeleteCaseButton = By.xpath(deleteCaseButton);
	public static By ValidationMsgDeleteCase = By.xpath(validationMsgDeleteCase);
	public static By CasesCount = By.xpath(casesCount);
	public static By CasesCount1 = By.xpath(casesCount1);
	public static By DoNotDeleteButton = By.xpath(doNotDeleteButton);
	public static By PaginationCount = By.xpath(paginationCount);
	public static By ViolationTypePF = By.xpath(violationTypePF);
	public static By CaseStatusPF = By.xpath(caseStatusPF);
	public static By CreatePF = By.xpath(createPF);
	public static By InspectionAssigneePF = By.xpath(inspectionAssigneePF);
	public static By NextScheduledPF = By.xpath(nextScheduledPF);
	public static By CaseStatusDropDown = By.xpath(caseStatusDropDown);
	public static By ViolationTypesPF = By.xpath(violationTypesPF);
	public static By ClosedOption = By.xpath(closedOption);
	public static By AnimalviolationOption = By.xpath(animalviolationOption);
	public static By AnimalViolationOptionChk = By.xpath(animalViolationOptionChk);

	public static By ClosedStatusCLP = By.xpath(closedStatusCLP);
	public static By ClearAllFiltersLink = By.xpath(clearAllFiltersLink);
	public static By FilterSlider = By.xpath(filterSlider);
	public static By ViolationsFilter = By.xpath(violationsFilter);
	public static By OutstandingBalanceFilter = By.xpath(outstandingBalanceFilter);
	public static By ViolationsFilterCLP = By.xpath(violationsFilterCLP);
	public static By OutstandingBalanceFilterCLP = By.xpath(outstandingBalanceFilterCLP);
	public static By FilterSliderClose = By.xpath(filterSliderClose);
	public static By ColumnControlWidget = By.xpath(columnControlWidget);
	public static By ColumnOutstandingBalance = By.xpath(columnOutstandingBalance);
	public static By CloseColumnControl = By.xpath(closeColumnControl);
	public static By DropdownOutstandingBalance = By.xpath(dropdownOutstandingBalance);
	public static By Option2OB = By.xpath(option2OB);
	public static By ApplyButtonOB = By.xpath(applyButtonOB);
	public static By CrossSecondaryFilter = By.xpath(crossSecondaryFilter);
	public static By CountSecondaryFilters = By.xpath(countSecondaryFilters);
	public static By CLPSearchField = By.xpath(cLPSearchField);
	public static By NoCasesInfoMsg = By.xpath(noCasesInfoMsg);
	public static By ColumnOutstandingBalanceCLP = By.xpath(columnOutstandingBalanceCLP);
	public static By RestoreDefaultsLink = By.xpath(restoreDefaultsLink);
	public static By SaveAsButton = By.xpath(saveAsButton);
	public static By SaveAsPopup = By.xpath(saveAsPopup);
	public static By SaveButton = By.xpath(saveButton);
	public static By ErrorMsgSaveAsPopup = By.xpath(errorMsgSaveAsPopup);
	public static By FilterNameField = By.xpath(filterNameField);
	public static By CountFiltersSaveAs = By.xpath(countFiltersSaveAs);
	public static By CrossIconFilters = By.xpath(crossIconFilters);
	public static By FiltersDropdown = By.xpath(filtersDropdown);
	public static By CreateCaseButtonCLP = By.xpath(createCaseButtonCLP);
	public static By DownloadButton = By.xpath(downloadButton);
	public static By CSVOption = By.xpath(cSVOption);
	public static By OpenedCaseId = By.xpath(openedCaseId);
	public static By PrintButtonCLP = By.xpath(printButtonCLP);
	public static By CloseCaseIcon = By.xpath(closeCaseIcon);
	public static By CancelButtonCCP = By.xpath(cancelButtonCCP);
	public static By AgencyUserName = By.xpath(agencyUserName);
	public static By MineButtonCLP = By.xpath(mineButtonCLP);
	public static By AssigneeColumn = By.xpath(assigneeColumn);
	public static By CSLPSearchField = By.xpath(cSLPSearchField);

	String CountBefore;
	int BeforeDeleting;
	
	
	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();
		
	}
	
	

	
	public  void CLP_VerifyCLPOpensUp() throws InterruptedException {
		
		WaitUntilVisible(CLP);
		WaitUntilPresent(CLP);
		ScrollIntoView(CLP);
		WaitForElementInteractable(CLP);
		WaitForElementInteractable(CLP);
		ClickByJsExecuter(CLP);
		WaitForCurserRunning(5);
		WaitUntilVisible(Cases);
		WaitUntilPresent(Cases);
		WebElement CasesText = WaitUntilVisibleWE(Cases);
		if ((CasesText.isDisplayed()) == false) {

			SoftAssert s1 = new SoftAssert();
			s1.assertEquals(false, true);
			s1.assertAll();
		}

	}

	
	public  void CLP_VerifyDefaultColumns() throws InterruptedException {
		
		WaitforCustometime(5);
		WebElement DefaultCol1 = WaitUntilVisibleWE(ViolationTypeCol);
		WebElement DefaultCol2 = WaitUntilVisibleWE(LocationCol);
		WebElement DefaultCol3 = WaitUntilVisibleWE(ApnCol);
		ScrollIntoView(AssigneeCol);
		WebElement DefaultCol4 = WaitUntilVisibleWE(AssigneeCol);
		ScrollIntoView(StatusCol);
		WebElement DefaultCol5 = WaitUntilVisibleWE(StatusCol);
		ScrollIntoView(CreatedCol);
		WebElement DefaultCol6 = WaitUntilVisibleWE(CreatedCol);
		ScrollIntoView(ClosedCol);
		WebElement DefaultCol7 = WaitUntilVisibleWE(ClosedCol);
		ScrollIntoView(InspectionAssigneeCol);
		WebElement DefaultCol8 = WaitUntilVisibleWE(InspectionAssigneeCol);
		ScrollIntoView(NextInsepectionAssingeeCol);
		WebElement DefaultCol9 = WaitUntilVisibleWE(NextInsepectionAssingeeCol);
		ScrollIntoView(DeleteCol);
		WebElement DefaultCol10 = WaitUntilVisibleWE(DeleteCol);

		if (((DefaultCol1.isDisplayed()) == true) && (DefaultCol2.isDisplayed() == true)
				&& (DefaultCol3.isDisplayed() == true) && (DefaultCol4.isDisplayed() == true)
				&& (DefaultCol5.isDisplayed() == true) && (DefaultCol6.isDisplayed() == true)
				&& (DefaultCol7.isDisplayed() == true) && (DefaultCol8.isDisplayed() == true)
				&& (DefaultCol9.isDisplayed() == true) && (DefaultCol1.isDisplayed() == true)) {

			SoftAssert s2 = new SoftAssert();
			s2.assertEquals(true, true);
			s2.assertAll();
		}

	}


	public  void CLP_VerifyNavigationToNextPage() throws InterruptedException {
		
		WaitUntilVisible(CaseID);
		String[] CaseIDBeforeClick = GetText(CaseID).split("-");
		String ID1 = CaseIDBeforeClick[1];
		ScrollIntoView(NextPagination);
		WaitForElementInteractable(NextPagination);
		WaitForElementInteractable(NextPagination);
		ClickByJsExecuter(NextPagination);
		WaitForCurserRunning(5);
		WaitforCustometime(4);
		WaitUntilVisible(CaseID);
		String[] CaseIDAfterClick = GetText(CaseID).split("-");
		String ID2 = CaseIDAfterClick[1];
		int differenceID = Integer.parseInt(ID1) - Integer.parseInt(ID2);
		if ((differenceID >= 50) == false) {

			SoftAssert s3 = new SoftAssert();
			s3.assertEquals(false, true);
			s3.assertAll();
			Assert.assertEquals(false, true);
		}

	}

	
	public  void CLP_VerifynavigationToSpecificPage() throws InterruptedException {
		
		WebElement Pagination = WaitUntilVisibleWE(PaginationField);

		Pagination.sendKeys(Keys.BACK_SPACE);
		Pagination.sendKeys("2");
		Pagination.sendKeys(Keys.RETURN);

	}

	public  ArrayList<Integer> IDArray = new ArrayList<Integer>();


	public  void CLP_VerifyDescendingOrderOfCases() throws InterruptedException {
		
		int FinalIDs = 0;

		WaitUntilVisible(CaseID);
		waitForStaleElementReference(CaseID);
		List<WebElement> AllCasesID = WaitUntilVisibleList(CaseID);
		int CountIDs = AllCasesID.size() / 2;
		for (int i = 0; i < CountIDs; i++) {
			WebElement IDList = AllCasesID.get(i);
			String[] IDList1 = IDList.getText().split("-");
			String IDs = IDList1[1];
			FinalIDs = Integer.parseInt(IDs);
			IDArray.add(FinalIDs);
		}
		Integer[] arr = new Integer[IDArray.size()];
		for (int i = 0; i < 1; i++) {
			arr[i] = IDArray.get(i);
			for (int j = i + 1; j < IDArray.size(); j++) {
				arr[j] = IDArray.get(j);
				if ((arr[j] < arr[i]) == false) {
					SoftAssert s5 = new SoftAssert();
					s5.assertEquals(false, true);
					s5.assertAll();
				}
			}
		}

	}

	
	public  void CLP_VerifyAscendingOrderOfCases() throws InterruptedException {
		
		WaitUntilVisible(CaseNumberHeader);
		ClickOn(CaseNumberHeader);

		WaitForCurserRunning(4);
		WaitUntilVisible(CaseID);
		List<WebElement> AllCasesID = WaitUntilVisibleList(CaseID);
		int CountIDs = AllCasesID.size() / 2;
		IDArray.clear();
		for (int i = 0; i < CountIDs; i++) {
			WebElement IDList = AllCasesID.get(i);
			String[] IDList1 = IDList.getText().split("-");
			String IDs = IDList1[1];
			int FinalIDs = Integer.parseInt(IDs);
			IDArray.add(FinalIDs);
		}
		Integer[] arr = new Integer[IDArray.size()];
		for (int i = 0; i < 1; i++) {
			arr[i] = IDArray.get(i);
			for (int j = i + 1; j < IDArray.size(); j++) {
				arr[j] = IDArray.get(j);
				if ((arr[j] > arr[i]) == false) {
					Assert.assertEquals(false, true);
				}
			}
		}

	}

	
	public  void CLP_OpenDeleteCasePopup() throws InterruptedException {
		
		WaitUntilVisible(CaseNumberHeader);
		WaitUntilPresent(CaseNumberHeader);
		ClickOn(CaseNumberHeader);
		WaitUntilVisible(DeleteLink);
		WaitUntilPresent(DeleteLink);
		ScrollIntoView(DeleteLink);
		WaitForElementInteractable(DeleteLink);
		ClickByJsExecuter(DeleteLink);
		String DeleteCaseTitle = GetText(DeleteCasePopup);
		SoftAssert s7 = new SoftAssert();
		s7.assertEquals(DeleteCaseTitle, "Delete Case");
		s7.assertAll();

	}

	
	public  void CLP_ValidationMsgForDeleteCase() throws InterruptedException {
		
		WaitUntilVisible(CasesCount);
		String[] CountCases = GetText(CasesCount).split(" ");
		CountBefore = CountCases[0];

		BeforeDeleting = Integer.parseInt(CountBefore);
		WaitUntilPresent(DeleteCaseButton);
		WaitForElementInteractable(DeleteCaseButton);
		WaitForElementInteractable(DeleteTextField);
		ClickByJsExecuter(DeleteCaseButton);
		WaitUntilVisible(ValidationMsgDeleteCase);
		String ValidationMsgDltCase = GetText(ValidationMsgDeleteCase);
		String ExpectedMsg = "Please enter DELETE in all caps";

		SoftAssert s8 = new SoftAssert();
		s8.assertEquals(ValidationMsgDltCase, ExpectedMsg);
		s8.assertAll();

	}

	
	public  void CLP_VerifyDeletedcase() throws InterruptedException {
		
		WaitUntilVisible(DeleteTextField);
		WaitUntilPresent(DeleteTextField);
		ScrollIntoView(DeleteTextField);
		WaitForElementInteractable(DeleteTextField);
		SendKeys(DeleteTextField, "DELETE");
		WaitUntilVisible(DeleteCaseButton);
		WaitForElementInteractable(DeleteCaseButton);
		ClickOn(DeleteCaseButton);
		WaitForCurserRunning(2);
		refreshPage();
		WaitForCurserRunning(5);
		WaitUntilVisible(By.cssSelector("span.checkbox-holder + a"));
		WaitUntilPresent(By.cssSelector("span.checkbox-holder + a"));
		WaitUntilVisible(CasesCount);
		WaitUntilVisible(CasesCount);
		WaitUntilPresent(CasesCount);
		ScrollIntoView(CasesCount);
		forcedWaitTime(2);
		String[] CountCases2 = GetText(CasesCount).split(" ");
		String CountAfter = CountCases2[0];
		int AfterDeleting = Integer.parseInt(CountAfter);
		if ((AfterDeleting < BeforeDeleting) == false) {

			SoftAssert s9 = new SoftAssert();
			s9.assertEquals(false, true, "Case did not get deleted!");
			s9.assertAll();
		}

	}

	
	public  void CLP_VerifyCasesForDoNotDeleteOption() {
		
		WaitUntilVisible(CasesCount);
		String[] CountCases = GetText(CasesCount).split(" ");
		String CountBefore = CountCases[0];
		int BeforeDeleting = Integer.parseInt(CountBefore);
		ClickOn(DeleteLink);
		ClickOn(DoNotDeleteButton);

		WaitUntilVisible(CasesCount);
		String[] CountCases2 = GetText(CasesCount).split(" ");
		String CountAfter = CountCases2[0];
		int AfterDeleting = Integer.parseInt(CountAfter);
		if ((AfterDeleting == BeforeDeleting) == false) {

			SoftAssert s10 = new SoftAssert();
			s10.assertEquals(false, true);
			s10.assertAll();
		}

	}


	public  void CLP_VerifyTotalCountOfCases() throws InterruptedException {
		
		WaitUntilVisible(CasesCount);
		String[] CountOfCases = GetText(CasesCount).split(" ");
		String CountHeader = CountOfCases[0];
		int CountAtHeader = Integer.parseInt(CountHeader);
		String[] PaginationCounts = GetText(PaginationCount).split(" ");
		String PaginationFinal = PaginationCounts[1];
		int PgCount = Integer.parseInt(PaginationFinal);
		int CountCasesCLP = (PgCount - 1) * 50;
		for (int i = 0; i < PgCount - 1; i++) {

			WaitUntilVisible(NextPagination);
			ScrollIntoView(NextPagination);
			WaitForElementInteractable(NextPagination);
			ClickByJsExecuter(NextPagination);
			WaitUntilVisible(CaseID);
			WaitUntilPresent(CaseID);

		}
		forcedWaitTime(3);
		WaitUntilVisible(CaseID);
		WaitUntilPresent(CaseID);
		int CountIDs = findElementsByXPath(CaseID).size();
		int TotalCasesCount = CountCasesCLP + CountIDs;
		SoftAssert s11 = new SoftAssert();
		s11.assertEquals(TotalCasesCount, CountAtHeader);
		s11.assertAll();

	}

	
	public  void CLP_VerifyPrimaryFilters() throws InterruptedException {
		
		WebElement PrimaryFilter1 = WaitUntilVisibleWE(ViolationTypePF);
		WebElement PrimaryFilter2 = WaitUntilVisibleWE(CaseStatusPF);
		WebElement PrimaryFilter3 = WaitUntilVisibleWE(CreatePF);
		WebElement PrimaryFilter4 = WaitUntilVisibleWE(InspectionAssigneePF);
		if (((PrimaryFilter1.isDisplayed()) == false) || (PrimaryFilter2.isDisplayed() == false)
				|| (PrimaryFilter3.isDisplayed() == false) || (PrimaryFilter4.isDisplayed() == false)) {

			SoftAssert s12 = new SoftAssert();
			s12.assertEquals(false, true);
			s12.assertAll();
		}

	}

	
	public  void CLP_VerifyApplicationOfPrimaryFilters() throws InterruptedException {
		
		Boolean prePage = driver.findElement(PreviousPagingation).isEnabled();
		while (prePage) {
			WaitForElementInteractable(PreviousPagingation);
			ClickByJsExecuter(PreviousPagingation);
			prePage = driver.findElement(PreviousPagingation).isEnabled();
		}

		WaitUntilVisible(CaseStatusDropDown);
		ScrollIntoView(CaseStatusDropDown);
		WaitForElementInteractable(CaseStatusDropDown);
		ClickByJsExecuter(CaseStatusDropDown);
		WaitUntilPresent(ClosedOption);
		WaitForElementInteractable(ClosedOption);
		ClickOn(ClosedOption);

		WaitUntilPresent(CaseStatusDropDown);
		WaitForElementInteractable(CaseStatusDropDown);
		ClickByJsExecuter(CaseStatusDropDown);
		WaitUntilVisible(CaseID);
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(4));
		WaitUntilPresent(CaseID);
		WaitUntilPresent(By.xpath("//input[@class='checkbox__input'][@type='checkbox']"));
		WaitForElementInteractable(By.xpath("//input[@class='checkbox__input'][@type='checkbox']"));
		List<WebElement> AllCasesID = findElementsByXPath(CaseID);
		int CountIDs = AllCasesID.size();
		WaitUntilVisible(ClosedStatusCLP);
		List<WebElement> ClosedCasesCount = findElementsByXPath(ClosedStatusCLP);
		int CountClosedCases = ClosedCasesCount.size();
		SoftAssert s13 = new SoftAssert();
		s13.assertEquals(CountClosedCases, CountIDs);
		s13.assertAll();

	}


	public  void CLP_VerifyClearAllFiltersLinkText() throws InterruptedException {
		
		WaitUntilVisible(ViolationTypesPF);
		ScrollIntoView(ViolationTypesPF);
		WaitForElementInteractable(ViolationTypesPF);
		ClickOn(ViolationTypesPF);

		WaitForElementInteractable(AnimalViolationOptionChk);
		ClickByJsExecuter(AnimalViolationOptionChk);

		WaitForElementInteractable(ViolationTypesPF);
		ClickOn(ViolationTypesPF);

		WaitForCurserRunning(3);
		WaitUntilVisible(ClearAllFiltersLink);
		ScrollIntoView(ClearAllFiltersLink);
		WebElement ClearAllFilters = WaitUntilVisibleWE(ClearAllFiltersLink);

		if ((ClearAllFilters.isDisplayed()) == false) {

			SoftAssert s14 = new SoftAssert();
			s14.assertEquals(false, true);
			s14.assertAll();
		}

	}

	
	public  void CLP_VerifyClearAllFiltersLinkNotPresent() throws InterruptedException {

		
		ScrollIntoView(ClearAllFiltersLink);
		ClickOn(ClearAllFiltersLink);

		WaitUntilElementInvisible(ClearAllFiltersLink);
		List<WebElement> ClearAllFilters = driver.findElements(ClearAllFiltersLink);
		if ((ClearAllFilters.size() > 0) == true) {

			SoftAssert s15 = new SoftAssert();
			s15.assertEquals(false, true);
			s15.assertAll();
		}

	}

	
	public  void CLP_VerifySelectionOfSecondaryFilters() throws InterruptedException {
		
		WaitUntilVisible(FilterSlider);
		WaitForElementInteractable(FilterSlider);
		ClickByJsExecuter(FilterSlider);
		WaitUntilVisible(ViolationsFilter);
		WaitForElementInteractable(ViolationsFilter);
		ClickOn(ViolationsFilter);
		WaitUntilVisible(OutstandingBalanceFilter);
		WaitForElementInteractable(OutstandingBalanceFilter);
		ClickOn(OutstandingBalanceFilter);
		WebElement ViolationCheckbox = WaitUntilVisibleWE(ViolationsFilter);

		WebElement OutstandingBalanceCheckbox = WaitUntilVisibleWE(OutstandingBalanceFilter);
		if ((ViolationCheckbox.isEnabled() == false) || (OutstandingBalanceCheckbox.isEnabled() == false)) {

			SoftAssert s16 = new SoftAssert();
			s16.assertEquals(false, true);
			s16.assertAll();

		}

	}

	
	public  void CLP_VerifyPresenceOfSecondaryFiltersUnderPrimaryFilters() throws InterruptedException {
		
		ClickOn(FilterSliderClose);

		WaitUntilVisible(ViolationsFilterCLP);
		WebElement ViolationSecondaryFilter = WaitUntilVisibleWE(ViolationsFilterCLP);

		WaitUntilVisible(OutstandingBalanceFilterCLP);
		WebElement OutstandingBalance2ndFilter = WaitUntilVisibleWE(OutstandingBalanceFilterCLP);
		if ((ViolationSecondaryFilter.isDisplayed() == false) || (OutstandingBalance2ndFilter.isDisplayed() == false)) {

			SoftAssert s17 = new SoftAssert();
			s17.assertEquals(false, true);
			s17.assertAll();
		}

	}


	public  void CLP_VerifyApplicationOfsecondaryFilters() throws InterruptedException {
		
		WaitUntilVisible(ColumnControlWidget);
		WaitForElementInteractable(ColumnControlWidget);
		ClickOn(ColumnControlWidget);
		WaitForElementInteractable(ColumnOutstandingBalance);
		ClickOn(ColumnOutstandingBalance);
		WaitForElementInteractable(CloseColumnControl);
		ClickOn(CloseColumnControl);
		WaitForElementInteractable(DropdownOutstandingBalance);
		ClickOn(DropdownOutstandingBalance);
		WaitForElementInteractable(Option2OB);
		ClickOn(Option2OB);
		WaitForElementInteractable(ApplyButtonOB);
		ClickOn(ApplyButtonOB);

	}

	
	public  void CLP_VerifyRemovalOfSecondaryFilters() throws InterruptedException {
		
		WaitUntilVisible(CountSecondaryFilters);
		List<WebElement> SecondaryFilters = WaitUntilVisibleList(CountSecondaryFilters);
		int countSF1 = SecondaryFilters.size();
		ClickOn(CrossSecondaryFilter);
		WaitUntilVisible(CountSecondaryFilters);

		List<WebElement> SecondaryFilters2 = WaitUntilVisibleList(CountSecondaryFilters);
		int countSF2 = SecondaryFilters2.size();
		if ((countSF1 > countSF2) == false) {

			SoftAssert s19 = new SoftAssert();
			s19.assertEquals(false, true);
			s19.assertAll();
		}

	}

	
	public  void CLP_VerifySearchField() throws InterruptedException {
		
		WaitUntilVisible(ClearAllFiltersLink);
		WaitForElementInteractable(ClearAllFiltersLink);
		ClickByJsExecuter(ClearAllFiltersLink);
		String APN = "7030-0159-0010-000";
		SendKeys(CLPSearchField, APN);

		WaitForCurserRunning(3);
		WaitUntilVisible(CaseID);
		List<WebElement> AllCasesID = driver.findElements(CaseID);
		int CountIDs = AllCasesID.size();

		WaitforCustometime(3);
		List<WebElement> APNCases = driver.findElements(By.xpath("//div[text()='" + (APN) + "']"));
		int APNCaseList = APNCases.size();
		if (APNCaseList < CountIDs) {

			SoftAssert s20 = new SoftAssert();
			s20.assertEquals(false, true);
			s20.assertAll();
		}

	}

	
	public  void CLP_VerifyInfoMsgForNoSearchResults() throws InterruptedException {
		
		WaitUntilVisible(ClearAllFiltersLink);
		WaitForElementInteractable(ClearAllFiltersLink);
		ClickOn(ClearAllFiltersLink);
		String CLPSearchRandom = RandomStrings.RequiredCharacters(15);
		SendKeys(CLPSearchField, CLPSearchRandom);

		WaitForCurserRunning(3);
		WaitUntilVisible(NoCasesInfoMsg);
		String NoCasesMsg = GetText(NoCasesInfoMsg);
		SoftAssert s21 = new SoftAssert();
		s21.assertEquals(NoCasesMsg, "No cases to display");
		s21.assertAll();

	}

	
	public  void CLP_VerifyAdditionOfColumns() throws InterruptedException {
		
		WaitForElementInteractable(ColumnControlWidget);
		ClickOn(ColumnControlWidget);

		WaitForElementInteractable(ColumnOutstandingBalance);
		ClickOn(ColumnOutstandingBalance);
		WaitForElementInteractable(CloseColumnControl);
		ClickOn(CloseColumnControl);
		WebElement ColumnAdded = WaitUntilVisibleWE(ColumnOutstandingBalanceCLP);
		if ((ColumnAdded.isDisplayed() == false)) {

			SoftAssert s22 = new SoftAssert();
			s22.assertEquals(false, true);
			s22.assertAll();
		}

	}

	
	public  void CLP_VerifyRestorationOfCheckedBoxes() throws InterruptedException {
		
		WaitForElementInteractable(ColumnControlWidget);
		ClickOn(ColumnControlWidget);
		ClickOn(RestoreDefaultsLink);

		WaitUntilVisible(ColumnOutstandingBalance);
		WebElement OBColumn = WaitUntilVisibleWE(ColumnOutstandingBalance);
		if ((OBColumn.isSelected() == true)) {

			SoftAssert s23 = new SoftAssert();
			s23.assertEquals(false, true);
			s23.assertAll();
		}

	}

	
	public  void CLP_VerifyAddedColumnsAfterRestoreDefaultsLink() throws InterruptedException {
		
		ClickOn(ColumnOutstandingBalance);

		WaitForElementInteractable(RestoreDefaultsLink);
		ClickOn(RestoreDefaultsLink);

		WaitForElementInteractable(CloseColumnControl);
		ClickOn(CloseColumnControl);

		WaitUntilVisible(ColumnOutstandingBalanceCLP);
		List<WebElement> ColumnRemoved = driver.findElements(ColumnOutstandingBalanceCLP);
		if ((ColumnRemoved.size()) != 0) {

			SoftAssert s24 = new SoftAssert();
			s24.assertEquals(false, true);
			s24.assertAll();
		}

	}

	
	public  void CLP_OpenSaveAsPopup() throws InterruptedException {
		
		WaitUntilVisible(FiltersDropdown);
		WaitForElementInteractable(FiltersDropdown);
		ClickByJsExecuter(FiltersDropdown);

		int CountFiltersCross = driver.findElements(CrossIconFilters).size();
		if (CountFiltersCross > 0) {
			List<WebElement> DeleteFilters = WaitUntilVisibleList(CrossIconFilters);
			for (int d = 0; d < CountFiltersCross - 2; d++) {
				WebElement CrossIcons = DeleteFilters.get(d);
				CrossIcons.click();

				WaitForElementInteractable(CCPUtility.YesDelete);
				ClickOn(CCPUtility.YesDelete);
			}
			WaitForElementInteractable(FiltersDropdown);
			ClickOn(FiltersDropdown);
		}

		WaitForElementInteractable(SaveAsButton);
		ClickOn(SaveAsButton);
		WaitForElementInteractable(SaveAsPopup);
		WebElement SaveasPopup = WaitUntilVisibleWE(SaveAsPopup);
		if ((SaveasPopup.isDisplayed() == false)) {

			SoftAssert s25 = new SoftAssert();
			s25.assertEquals(false, true);
			s25.assertAll();

		}

	}


	public  void CLP_VerifyValidationMessageForSaveBtn() throws InterruptedException {
		
		WaitUntilVisible(SaveButton);
		WaitForElementInteractable(SaveButton);
		ClickOn(SaveButton);
		WaitUntilVisible(ErrorMsgSaveAsPopup);
		WebElement ErrorMsg = WaitUntilVisibleWE(ErrorMsgSaveAsPopup);
		if ((ErrorMsg.isDisplayed() == false)) {

			SoftAssert s26 = new SoftAssert();
			s26.assertEquals(false, true);
			s26.assertAll();
		}

	}


	public  void CLP_VerifySavedFilter() throws InterruptedException {
		
		WaitUntilVisible(FilterNameField);
		WaitForElementInteractable(FilterNameField);
		String FilterNameRandom = RandomStrings.RequiredString(6);
		SendKeys(FilterNameField, "Filter " + (FilterNameRandom));

		WaitForElementInteractable(SaveButton);
		ClickOn(SaveButton);

		WaitForElementInteractable(FiltersDropdown);
		ClickOn(FiltersDropdown);

	}

	
	public  void CLP_VerifyDeletionOfSavedFilter() throws InterruptedException {
		
		WaitForElementInteractable(CountFiltersSaveAs);
		List<WebElement> CountFilters = WaitUntilVisibleList(CountFiltersSaveAs);
		int FiltersCount = CountFilters.size();
		WaitForElementInteractable(CrossIconFilters);
		ClickOn(CrossIconFilters);
		WaitForElementInteractable(CCPUtility.YesDelete);
		ClickOn(CCPUtility.YesDelete);
		WaitUntilVisible(CountFiltersSaveAs);
		WaitForElementInteractable(CountFiltersSaveAs);
		List<WebElement> CountFiltersAfter = WaitUntilVisibleList(CountFiltersSaveAs);
		int FiltersCountAfter = CountFiltersAfter.size();
		if ((FiltersCountAfter < FiltersCount) == false) {

			SoftAssert s28 = new SoftAssert();
			s28.assertEquals(false, true);
			s28.assertAll();

		}

	}


	public  void CLP_OpenCCPFromCreateCaseBtn() throws InterruptedException {
		WaitForElementInteractable(CreateCaseButtonCLP);
		ClickOn(CreateCaseButtonCLP);

		WaitUntilVisible(CCPUtility.ViolationsTile);
		WebElement CCPElement = WaitUntilVisibleWE20(CCPUtility.ViolationsTile);
		if ((CCPElement.isDisplayed()) == false) {

			SoftAssert s29 = new SoftAssert();
			s29.assertEquals(false, true);
			s29.assertAll();

		}

	}

	
	public  void CLP_VerifyCSVFileDownloaded() throws InterruptedException {
		WaitForElementInteractable(CancelButtonCCP);
		ClickByJsExecuter(CancelButtonCCP);

		WaitUntilVisible(ClearAllFiltersLink);
		WaitForElementInteractable(ClearAllFiltersLink);
		ClickByJsExecuter(ClearAllFiltersLink);
		WaitUntilVisible(DownloadButton);
		WaitUntilPresent(DownloadButton);
		WaitForElementInteractable(DownloadButton);
		ClickOn(DownloadButton);
		WaitUntilVisible(CSVOption);
		WaitForElementInteractable(CSVOption);
		ClickOn(CSVOption);
		WaitForCurserRunning(3);
		driver.getTitle();
		CheckDownloadedFile.isFileDownloaded("AUTOMATION_NEW_AGENCY_06-21-2022_03_46 am.csv");

	}

	
	public  void CLP_VerifyDirectionToCDP() throws InterruptedException {
		String FirstCasID = GetText(CaseID);
		ClickOn(CaseID);

		WaitForCurserRunning(3);
		WaitUntilVisible(OpenedCaseId);
		String[] OpenedID = GetText(OpenedCaseId).split(" #");
		String OpenedCase = OpenedID[1];

		SoftAssert s31 = new SoftAssert();
		s31.assertEquals(OpenedCase, FirstCasID);
		s31.assertAll();

	}

	
	public  void CLP_VerifyDirectionToCLPPreview() throws InterruptedException {
		WaitUntilVisible(CloseCaseIcon);
		WaitForElementInteractable(CloseCaseIcon);
		ClickOn(CloseCaseIcon);
		WaitUntilVisible(PrintButtonCLP);
		WaitUntilPresent(PrintButtonCLP);
		WaitForElementInteractable(PrintButtonCLP);
		ClickByJsExecuter(PrintButtonCLP);
		WaitForCurserRunning(3);
		String currentWindow = driver.getWindowHandle();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window((String) tabs.get(1));
		driver.switchTo().window(currentWindow);

	}

	
	public void CLP_VerifyMineButtonApplication() throws InterruptedException {

		CLP_VerifyCLPOpensUp();
		WaitForCurserRunning(3);
		WaitUntilVisible(MineButtonCLP);
		WaitUntilPresent(MineButtonCLP);
		WaitForElementInteractable(MineButtonCLP);
		ClickOn(MineButtonCLP);
		WaitForCurserRunning(3);
		WaitUntilVisible(CaseID);
		WaitUntilPresent(CaseID);
		WaitUntilPresent(By.xpath("//input[@class='checkbox__input'][@type='checkbox']"));
		WaitForElementInteractable(By.xpath("//input[@class='checkbox__input'][@type='checkbox']"));
		List<WebElement> AllCasesID = WaitUntilVisibleList(CaseID);
		int CountIDs = AllCasesID.size();
		String LoggedInUserName = GetText(AgencyUserName);
		WaitUntilPresent(AssigneeColumn);
		WaitUntilVisible(AssigneeColumn);
		ScrollIntoView(AssigneeColumn);
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
		List<WebElement> AssigneeList = driver.findElements(AssigneeColumn);
		int matched = 0;
		for (int i = 0; i < AssigneeList.size(); i++) {
			WebElement MatchAssignee = AssigneeList.get(i);
			WaitForElementInteractable(MatchAssignee);
			String MatchUser = MatchAssignee.getText();
			if (MatchUser.equals(LoggedInUserName)) {
				matched++;
			}
		}
		boolean CompareCount = (matched == CountIDs);
		Assert.assertTrue(CompareCount);

	}

}
