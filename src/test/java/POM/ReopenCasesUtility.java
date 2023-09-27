package POM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import junit.framework.Assert;

public class ReopenCasesUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	

	public ReopenCasesUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		
	}

	public static String statusColumnSort = "//div[text()='Status']";
	public static String closedCase = "//span[@class='checkbox-holder']/following::a[1]";
	public static String reOpenCaseGrid = "//span[contains(text(),' Reopened')]//parent::div//parent::div//preceding-sibling::div//span[@class='checkbox-holder']/following::a[1]";
	public static String reopenCaseOption = "//li[text()='Reopen Case']";
	public static String closedCaseGrid = "//div[contains(text(),'Closed')]//parent::div//parent::div//preceding-sibling::div//span[@class='checkbox-holder']/following::a[1]";
	public static String reopenCasePopup = "//div[@class='modal-header']/following::span[text()='Reopen Case']";
	public static String violationsOnCDP = "//span[@class='violation-label']";
	public static String reopenCaseButton = "//button[text()='Reopen Case']";
	public static String errorMessageRCP = "//h5[@id='reopen-case-heading']";
	public static String violationsOnRCP = "//div[@class='case-violation-list reopen-variant']//span[@class='violation-label']";
	public static String nonCompliantButton = "//button[text()='Non-Compliant']";
	public static String reopenedCaseActivity = "//h4[@class='case-activity__label' and text()='Case Reopened']";
	public static String dateReopenedCase = "//h4[text()='Case Reopened']/following-sibling::span";
	public static String userInfoRCP = "//h4[text()='Case Reopened']/following::label[@class='case-activity__user-info']";
	public static String CancelButton = "//button[text()='Cancel']";
	
	public static By StatusColumnSort = By.xpath(statusColumnSort);
	public static By ReOpenCaseGrid = By.xpath(reOpenCaseGrid);
	public static By ClosedCaseGrid = By.xpath(closedCaseGrid);
	public static By ClosedCase = By.xpath(closedCase);
	public static By ReopenCaseOption = By.xpath(reopenCaseOption);
	public static By ReopenCasePopup = By.xpath(reopenCasePopup);
	public static By ViolationsOnCDP = By.xpath(violationsOnCDP);
	public static By ReopenCaseButton = By.xpath(reopenCaseButton);
	public static By ViolationsOnRCP = By.xpath(violationsOnRCP);
	public static By ErrorMessageRCP = By.xpath(errorMessageRCP);
	public static By NonCompliantButton = By.xpath(nonCompliantButton);
	public static By ReopenedCaseActivity = By.xpath(reopenedCaseActivity);
	public static By DateReopenedCase = By.xpath(dateReopenedCase);
	public static By UserInfoRCP = By.xpath(userInfoRCP);
	public static By cancelButton = By.xpath(CancelButton);

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	public void ReopenCase_PreRequisite() throws InterruptedException {
		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitForPageLoadTime(5);
		WaitForCurserRunning(5);
		WaitUntilVisible(CLPUtility.CLP);
		WaitUntilPresent(CLPUtility.CLP);
		WaitForElementInteractable(CLPUtility.CLP);
		ClickByJsExecuter(CLPUtility.CLP);
		WaitUntilVisible(StatusColumnSort);
		WaitUntilPresent(StatusColumnSort);
		WaitForElementInteractable(StatusColumnSort);
		ClickOn(StatusColumnSort);
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		WaitUntilPresent(StatusColumnSort);
		WaitForElementInteractable(StatusColumnSort);
		ClickByJsExecuter(StatusColumnSort);
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));
		ScrollIntoView(StatusColumnSort);
		int checkOpen = driver.findElements(ReopenCasesUtility.ClosedCaseGrid).size();
		if (checkOpen > 0) {
			WaitUntilVisible(ReopenCasesUtility.ClosedCaseGrid);
			WaitUntilPresent(ReopenCasesUtility.ClosedCaseGrid);
			ScrollIntoView(ReopenCasesUtility.ClosedCaseGrid);
			WaitForElementInteractable(ReopenCasesUtility.ClosedCaseGrid);
			ClickByJsExecuter(ReopenCasesUtility.ClosedCaseGrid);
			WaitUntilInvisible(ReopenCasesUtility.ClosedCaseGrid);
		} else {
			ClickOn(StatusColumnSort);
			WaitforCustometime(5);
			int checktOpen = driver.findElements(ReopenCasesUtility.ClosedCaseGrid).size();
			if (checktOpen > 0) {
				WaitUntilPresent(ReopenCasesUtility.ClosedCaseGrid);
				ScrollIntoView(ReopenCasesUtility.ClosedCaseGrid);
				WaitForElementInteractable(ReopenCasesUtility.ClosedCaseGrid);
				ClickByJsExecuter(ReopenCasesUtility.ClosedCaseGrid);
				WaitUntilInvisible(ReopenCasesUtility.ClosedCaseGrid);

			}
		}
		WaitForCurserRunning(5);
		WaitUntilVisible(CCPUtility.CaseStatus);
		WaitUntilPresent(CCPUtility.CaseStatus);
		String ClosedStatus = GetText(CCPUtility.CaseStatus);
		Assert.assertEquals("Closed", ClosedStatus);
	}

	public void ReopenCase_OpenReopenCasePopup() throws InterruptedException {
		WaitUntilVisible(ForcedAbatementUtility.MoreBtn);
		WaitForElementInteractable(ForcedAbatementUtility.MoreBtn);
		ClickByJsExecuter(ForcedAbatementUtility.MoreBtn);
		WaitUntilVisible(ReopenCaseOption);
		WaitForElementInteractable(ReopenCaseOption);
		ClickOn(ReopenCaseOption);
		WaitUntilVisible(ReopenCasePopup);
		String PopupTitle = GetText(ReopenCasePopup);
		Assert.assertEquals("Reopen Case", PopupTitle);
	}

	public ArrayList<String> VioCDPList = new ArrayList<String>();

	public void ReopenCase_VerifyViolationsFromCDP() throws InterruptedException {
		WaitUntilVisible(cancelButton);
		WaitForElementInteractable(cancelButton);
		ClickOn(cancelButton);
		WaitUntilInvisible(cancelButton);
		WaitUntilVisible(ViolationsOnCDP);
		WaitUntilVisible(ViolationsOnCDP);
		ScrollIntoView(ViolationsOnCDP);
		List<WebElement> VioCDP = WaitUntilVisibleList(ViolationsOnCDP);
		int VioCDPCount = VioCDP.size();
		for (int i = 0; i < VioCDPCount; i++) {
			WebElement VioList = VioCDP.get(i);
			String ViolationsCDP = VioList.getText();
			VioCDPList.add(ViolationsCDP);
		}
		WaitUntilVisible(ForcedAbatementUtility.MoreBtn);
		ScrollIntoView(ForcedAbatementUtility.MoreBtn);
		WaitForElementInteractable(ForcedAbatementUtility.MoreBtn);
		ClickOn(ForcedAbatementUtility.MoreBtn);
		WaitUntilVisible(ReopenCaseOption);
		WaitForElementInteractable(ReopenCaseOption);
		ClickOn(ReopenCaseOption);
		WaitForCurserRunning(5);
		WaitUntilVisible(ViolationsOnRCP);
		ArrayList<String> VioRCPList = new ArrayList<String>();
		List<WebElement> VioRCP = WaitUntilVisibleList(ViolationsOnRCP);
		int VioRCPCount = VioRCP.size();
		for (int i = 0; i < VioRCPCount; i++) {
			WebElement VioList2 = VioRCP.get(i);
			String ViolationsRCP = VioList2.getText();
			VioRCPList.add(ViolationsRCP);
		}
		boolean CompareList = VioCDPList.equals(VioRCPList);
		Assert.assertEquals(CompareList, true);
	}

	public void ReopenCase_NonCompliantViolationIsRequired() {
		WaitForElementInteractable(ReopenCaseButton);
		ClickOn(ReopenCaseButton);
		String ErrorMsgExp = "You must mark at least one violation as Non-Compliant and schedule an inspection to reopen this Case.";
		String ErrorMsgActual = GetText(ErrorMessageRCP);
		Assert.assertEquals(ErrorMsgExp, ErrorMsgActual);
	}

	public void ReopenCase_CaseDoesNotReopenOnCancel() throws InterruptedException {
		WaitForElementInteractable(cancelButton);
		ClickOn(cancelButton);
		WaitUntilVisible(CCPUtility.CaseStatus);
		WaitUntilVisible(CCPUtility.CaseStatus);
		String ClosedStatus = GetText(CCPUtility.CaseStatus);
		Assert.assertEquals("Closed", ClosedStatus);
	}

	public void ReopenCase_VerifyCaseReopened() throws InterruptedException {
		ClickOn(ForcedAbatementUtility.MoreBtn);
		WaitForElementInteractable(ReopenCaseOption);
		ClickOn(ReopenCaseOption);
		ClickOn(NonCompliantButton);
		ClickOn(ReopenCaseButton);
		WaitForCurserRunning(10);

		WaitUntilVisible(CCPUtility.CaseStatus);
		WaitUntilVisibleWE(CCPUtility.CaseStatus);
		String ClosedStatus = GetText(CCPUtility.CaseStatus);
		Assert.assertEquals("Open", ClosedStatus);
	}

	public void ReopenCase_VerifyCaseReopenedDetails() throws InterruptedException {
		String ReopenedCaseStr = GetText(ReopenedCaseActivity);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("Case Reopened", ReopenedCaseStr);
		String UserInfoActual = GetText(UserInfoRCP);
		String UserInfoExp = "Reopened by " + LoginUtility.AgencyLoggedInUserName;
		SoftAssert soft2 = new SoftAssert();
		soft2.assertEquals(UserInfoExp, UserInfoActual);
		soft.assertAll();
//        WaitUntilVisible(By.cssSelector("div.case-details__close-icon img"));
//        ScrollIntoView(By.cssSelector("div.case-details__close-icon img"));
//        ClickOn(By.cssSelector("div.case-details__close-icon img"));
//        WaitForCurserRunning(4);

	}

}
