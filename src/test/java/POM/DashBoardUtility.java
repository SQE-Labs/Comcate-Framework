package POM;

import BrowsersBase.BrowsersInvoked;

import static java.lang.Integer.parseInt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class DashBoardUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public DashBoardUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);

	}

	String dashboardDropdownArrow = "//span[@class='dropdown__arrow']";
	String allStaffOption = "//li[text()='All Staff']";
	String selectedOptionText = "//div[@class='dropdown__selector__selected']/label";
	String meOption = "//li[text()='Me']";
	String openCasesAssignedToMe = "//label[text()='Open cases assigned to me']";
	String dashboardPage = "//a[text()='Dashboard']";
	String openCasesForMyAgency = "//label[text()='Open cases for my agency']";
	String overdueInspections = "//label[text()='Overdue Inspections']";
	String overdueInspection = "//label[text()='Overdue Inspection']";
	String inspectionsDueToday = "//label[contains(text(),'Due Today')]";
	String totalInspections = "//label[text()='Total Inspections']";
	String totalCasesForMyAgency = "//label[text()='Total cases for my agency']";
	String showMoreLink = "//label[text()='Total Inspections']/following::a";
	String totalCasesPopup = "//div[@class='modal-header']/label[@class='widget__text']";
	String closePopupButton = "//div[@class='modal-footer']//button";
	String countOpenCasesFMA = "//label[text()='Open cases for my agency']/preceding-sibling::span";
	String noticesToPrintLink = "//label[text()='notices in your print queue']";
	String noticesTotal = "(//span[@class='widget__total'])[7]";
	String noticeToPrintLink = "//label[text()='notice in your print queue']";
	String printQueuePopup = "//div[@class='modal-header']//h2";
	String closePrintQueuePopoup = "//div[@class='modal-footer']//button[1]";
	String inspectionsDueTodayCount = "//label[contains(text(),'Due Today')]/preceding-sibling::span";
	String inspectionDueToday = "//label[text()='Inspection Due Today']";

	By DashboardDropdownArrow = By.xpath(dashboardDropdownArrow);
	By AllStaffOption = By.xpath(allStaffOption);
	By SelectedOptionText = By.xpath(selectedOptionText);
	By MeOption = By.xpath(meOption);
	By OpenCasesAssignedToMe = By.xpath(openCasesAssignedToMe);
	By DashboardPage = By.xpath(dashboardPage);
	By OpenCasesForMyAgency = By.xpath(openCasesForMyAgency);
	By OverdueInspections = By.xpath(overdueInspections);
	By OverdueInspection = By.xpath(overdueInspection);
	By InspectionsDueToday = By.xpath(inspectionsDueToday);
	By TotalInspections = By.xpath(totalInspections);
	By TotalCasesForMyAgency = By.xpath(totalCasesForMyAgency);
	By ShowMoreLink = By.xpath(showMoreLink);
	By TotalCasesPopup = By.xpath(totalCasesPopup);
	By ClosePopupButton = By.xpath(closePopupButton);
	By NoticeTotal = By.xpath(noticesTotal);

	By NoticesToPrintLink = By.xpath(noticesToPrintLink);
	By NoticeToPrintLink = By.xpath(noticeToPrintLink);

	By PrintQueuePopup = By.xpath(printQueuePopup);
	By ClosePrintQueuePopoup = By.xpath(closePrintQueuePopoup);
	By CountOpenCasesFMA = By.xpath(countOpenCasesFMA);

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	public void TC_Dashboard_ViewAllStaffDashboard() throws InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitForCurserRunning(7);
		WaitUntilVisible(DashboardDropdownArrow);
		WaitForElementInteractable(DashboardDropdownArrow);
		ClickByJsExecuter(DashboardDropdownArrow);
		WaitUntilVisible(AllStaffOption);
		WaitForElementInteractable(AllStaffOption);
		ClickByJsExecuter(AllStaffOption);
		WaitUntilVisible(SelectedOptionText);
		String AllStaffText = GetText(SelectedOptionText);
		Assert.assertEquals(AllStaffText, "All Staff");

	}

	public void TC_Dashboard_ViewMeDashboard() throws InterruptedException {
		try {
			WaitUntilVisible(DashboardDropdownArrow);
			WaitForElementInteractable(DashboardDropdownArrow);

			ClickOn(DashboardDropdownArrow);
		} catch (Exception e) {
			Thread.sleep(5000);
			ClickOn(DashboardDropdownArrow);
		}
		WaitUntilVisible(MeOption);
		WaitForElementInteractable(MeOption);
		ClickOn(MeOption);
		String AllStaffText = GetText(SelectedOptionText);
		Assert.assertEquals(AllStaffText, "Me");

	}

	public void TC_Dashboard_OpenCasesAssignedToMeLink() throws InterruptedException {

		WaitUntilVisible(OpenCasesAssignedToMe);
		WaitForElementInteractable(OpenCasesAssignedToMe);
		WaitforCustometime(2);
		ClickByJsExecuter(OpenCasesAssignedToMe);

		WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
		if ((CasesText.isDisplayed()) == false) {

			SoftAssert s3 = new SoftAssert();
			s3.assertEquals(false, true);
			s3.assertAll();

		}

	}

	@Test(priority = 4)
	public void TC_Dashboard_OpenCasesForMyAgencyLink() {

		try {

			ClickByJsExecuter(By.xpath("//a[text()='Dashboard']"));
			WaitForCurserRunning(2);
			WaitUntilVisible(DashboardDropdownArrow);
			WaitForElementInteractable(DashboardDropdownArrow);
			ClickByJsExecuter(DashboardDropdownArrow);
			ClickOn(MeOption);
			WaitUntilVisible(OpenCasesForMyAgency);
			WaitForElementInteractable(OpenCasesForMyAgency);
			ClickOn(OpenCasesForMyAgency);

			WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s4 = new SoftAssert();
				s4.assertEquals(false, true);
				s4.assertAll();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void TC_Dashboard_OverdueInspectionsLink() {

		driver.navigate().to(BrowsersInvoked.URLDashboard);

		WaitUntilVisible(DashboardDropdownArrow);
		WaitForElementInteractable(DashboardDropdownArrow);
		ClickByJsExecuter(DashboardDropdownArrow);

		WaitUntilVisible(MeOption);
		ScrollIntoView(MeOption);
		WaitForElementInteractable(MeOption);
		ClickByJsExecuter(MeOption);

		WaitUntilVisible(OverdueInspections);
		ScrollIntoView(OverdueInspections);
		int overDueInstpections = driver.findElements(OverdueInspections).size();
		if (overDueInstpections > 0) {

			WaitUntilPresent(OverdueInspections);
			WaitForElementInteractable(OverdueInspections);
			ClickByJsExecuter(OverdueInspections);

		} else {
			ClickOn(OverdueInspection);
		}

		WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
		if ((CasesText.isDisplayed()) == false) {
			SoftAssert s5 = new SoftAssert();
			s5.assertEquals(false, true);
			s5.assertAll();
		}

	}

	public By InspectionDueTodayCount = By.xpath(inspectionsDueTodayCount);
	public By InspectionDueToday = By.xpath(inspectionDueToday);
	public By InspectionDuetdy = By.xpath(inspectionsDueToday);

	public void TC_Dashboard_InspectionsDueTodayLink() {

		try {
			driver.navigate().to(BrowsersInvoked.URLDashboard);
			WaitforCustometime(5);
			WaitUntilVisible(DashboardDropdownArrow);
			WaitForElementInteractable(DashboardDropdownArrow);
			ClickByJsExecuter(DashboardDropdownArrow);
			WaitUntilVisible(MeOption);
			WaitForElementInteractable(MeOption);
			ClickByJsExecuter(MeOption);
			ScrollIntoView(InspectionDueTodayCount);
			String dueTodayCount = GetText(InspectionDueTodayCount);
			int TodayDueWidget = parseInt(dueTodayCount);
			if (TodayDueWidget > 1) {
				ClickByJsExecuter(InspectionsDueToday);
			} else {
				ClickByJsExecuter(InspectionDueToday);
			}

			WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
			if (!(CasesText.isDisplayed())) {
				SoftAssert s6 = new SoftAssert();
				s6.assertEquals(false, true);
				s6.assertAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void TC_Dashboard_TotalInspectionsLink() {

		try {
			driver.navigate().to(BrowsersInvoked.URLDashboard);

			WaitforCustometime(3);
			WaitUntilVisible(DashboardDropdownArrow);
			WaitForElementInteractable(DashboardDropdownArrow);
			ClickByJsExecuter(DashboardDropdownArrow);
			WaitForElementInteractable(MeOption);
			ClickByJsExecuter(MeOption);

			WaitUntilVisible(TotalInspections);
			ScrollIntoView(TotalInspections);

			WaitUntilVisible(TotalInspections);
			WaitForElementInteractable(TotalInspections);
			ClickByJsExecuter(TotalInspections);

			WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s7 = new SoftAssert();
				s7.assertEquals(false, true);
				s7.assertAll();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void TC_Dashboard_AllStaff_OpenCasesForMyAgency() throws InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitForCurserRunning(10);
		WaitUntilVisible(OpenCasesForMyAgency);

		WaitForElementInteractable(OpenCasesForMyAgency);
		ClickByJsExecuter(OpenCasesForMyAgency);

		WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
		if ((CasesText.isDisplayed()) == false) {
			SoftAssert s8 = new SoftAssert();
			s8.assertEquals(false, true);
			s8.assertAll();

		}

	}

	public void TC_Dashboard_TotalcasesForMyAgencyLink() {

		driver.navigate().to(BrowsersInvoked.URLDashboard);

		WaitUntilVisible(TotalCasesForMyAgency);
		ScrollIntoView(TotalCasesForMyAgency);

		WaitForElementInteractable(TotalCasesForMyAgency);
		ClickByJsExecuter(TotalCasesForMyAgency);

		WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
		if ((CasesText.isDisplayed()) == false) {
			SoftAssert s9 = new SoftAssert();
			s9.assertEquals(false, true);
			s9.assertAll();
		}

	}

	public void TC_Dashboard_AllStaff_OverdueInspections() {

		driver.navigate().to(BrowsersInvoked.URLDashboard);

		WaitUntilVisible(OverdueInspections);
		ScrollIntoView(OverdueInspections);
		WaitForElementInteractable(OverdueInspections);
		ClickByJsExecuter(OverdueInspections);

		WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
		if ((CasesText.isDisplayed()) == false) {
			SoftAssert s10 = new SoftAssert();
			s10.assertEquals(false, true);
			s10.assertAll();
		}

	}

	@Test(priority = 11)
	public void TC_Dashboard_AllStaff_InspectionsDueToday() {

		try {
			driver.navigate().to(BrowsersInvoked.URLDashboard);
			WaitUntilVisible(InspectionDueTodayCount);
			WaitUntilPresent(InspectionDueTodayCount);
			String dueTodayCount = GetText(InspectionDueTodayCount);
			int TodayDueWidget = Integer.parseInt(dueTodayCount);
			if (TodayDueWidget > 1) {
				ScrollIntoView(InspectionsDueToday);

				WaitForElementInteractable(InspectionDueTodayCount);
				ClickByJsExecuter(InspectionsDueToday);
			} else {

				ScrollIntoView(InspectionDueToday);
				ClickByJsExecuter(InspectionDueToday);

			}

			WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
			if ((CasesText.isDisplayed()) == false) {
				SoftAssert s11 = new SoftAssert();
				s11.assertEquals(false, true);
				s11.assertAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void TC_Dashboard_AllStaff_TotalInspectionsLink() {

		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitUntilVisible(TotalInspections);
		WaitUntilVisibleWE(TotalInspections);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");

		ScrollIntoView(TotalInspections);

		WaitForElementInteractable(TotalInspections);
		ClickByJsExecuter(TotalInspections);

		WaitUntilVisibleWE(CLPUtility.Cases);
		WaitUntilPresent(CLPUtility.Cases);
		WebElement CasesText = WaitUntilVisibleWE(CLPUtility.Cases);
		if ((CasesText.isDisplayed()) == false) {
			SoftAssert s12 = new SoftAssert();
			s12.assertEquals(false, true);
			s12.assertAll();
		}

	}

	public void TC_Dashboard_OpenTotalInspectionPopup() {

		try {
			driver.navigate().to(BrowsersInvoked.URLDashboard);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2500)", "");

			ClickOn(ShowMoreLink);

			String PopupTitle = GetText(TotalCasesPopup);

			SoftAssert s13 = new SoftAssert();
			s13.assertEquals(PopupTitle, "Total Inspections");
			s13.assertAll();
			ClickOn(ClosePrintQueuePopoup);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void TC_Dashboard_CompareCountOfCasesWithCLP() throws InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitUntilVisible(CountOpenCasesFMA);
		String GetOpenCasesFMACount = GetText(CountOpenCasesFMA);
		int CountCases1 = Integer.parseInt(GetOpenCasesFMACount);
		System.out.println("count1 " + CountCases1);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,-2500)", "");
		WaitUntilVisibleWE(OpenCasesForMyAgency);
		WaitForElementInteractable(OpenCasesForMyAgency);
		ClickOn(OpenCasesForMyAgency);

		Thread.sleep(5000);
		WaitforCustometime(12);
		WaitUntilPresent(CLPUtility.CasesCount);
		WaitUntilVisibleWE(CLPUtility.CasesCount);
		System.out.println(GetText(CLPUtility.CasesCount));
		String[] CountOfCases = GetText(CLPUtility.CasesCount).split(" ");
		System.out.println("size of list " + CountOfCases.length);
		for (String s : CountOfCases)
			System.out.println(s);
		String CountCases0 = CountOfCases[0];
		int CountCases = Integer.parseInt(CountCases0);
		Assert.assertEquals(CountCases1, CountCases);
		System.out.println("2nd " + CountCases1 + " " + CountCases);
		ClickOn(DashboardPage);

	}

	public void TC_Dashboard_OpenPrintQueuePopup() throws InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitForCurserRunning(2);
		WaitUntilPresent(NoticeTotal);
		WaitUntilVisible(NoticeTotal);
		ScrollIntoView(NoticeTotal);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		ScrollTillPageEnd();
		if (parseInt(GetText(NoticeTotal)) > 1) {
			ScrollIntoView(NoticesToPrintLink);
			WaitForElementInteractable(NoticesToPrintLink);
			ClickByJsExecuter(NoticesToPrintLink);

		} else {
			WaitForElementInteractable(NoticeToPrintLink);
			ScrollIntoView(NoticeToPrintLink);
			WaitForElementInteractable(NoticeToPrintLink);
			ClickByJsExecuter(NoticeToPrintLink);
		}
		WebElement PopupTitle = WaitUntilVisibleWE(PrintQueuePopup);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(PopupTitle.isDisplayed(), "Print Queue Popup didn't open!!");
		WaitUntilVisible(ClosePrintQueuePopoup);
		ClickOn(ClosePrintQueuePopoup);
		softAssert.assertAll();

	}

}
