package POM;

import BrowsersBase.BrowsersInvoked;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import TestCases.CCP;
import POM.ForcedAbatementUtility;
import Constant.Constant;

public class CloseCaseUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	CECommonMethods ceMethods;

	public CloseCaseUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		ceMethods = new CECommonMethods(driver);

	}

	public static String closeCaseBtn = "//li[text()='Close Case']";
	public static String closeCasePopup = "//div[@class='modal-header' and text()='Close Case']";
	public static String cancelBtnCCPopup = "//button[text()='Cancel']";
	public static String voluntaryBtn = "//button[text()='Voluntary']";
	public static String closeCaseBtnCCPopup = "//button[text()='Close Case']";
	public static String yesBtnConfirmationPopup = "//div[@class='flex-row--center']/button[text()='Yes']";
	public static String closedStatus = "//h2[text()='Closed']";
	public static String closeCDPIcon = "//div[@class='case-details__close-icon']";

	public static By CloseCaseBtn = By.xpath(closeCaseBtn);
	public static By CloseCasePopup = By.xpath(closeCasePopup);
	public static By CancelBtnCCPopup = By.xpath(cancelBtnCCPopup);
	public static By VoluntaryBtn = By.xpath(voluntaryBtn);
	public static By CloseCaseBtnCCPopup = By.xpath(closeCaseBtnCCPopup);
	public static By YesBtnConfirmationPopup = By.xpath(yesBtnConfirmationPopup);
	public static By ClosedStatus = By.xpath(closedStatus);
	public static By CloseCDPIcon = By.xpath(closeCDPIcon);

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	public void CloseCase_PreRequisite() throws InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitForCurserRunning(5);
		WaitUntilVisible(CLPUtility.CLP);
		WaitUntilPresent(CLPUtility.CLP);
		WaitForElementInteractable(CLPUtility.CLP);
		ClickByJsExecuter(CLPUtility.CLP);
		WaitForCurserRunning(4);
		WaitUntilVisible(ReopenCasesUtility.StatusColumnSort);
		WaitUntilPresent(ReopenCasesUtility.StatusColumnSort);
		ScrollIntoView(ReopenCasesUtility.StatusColumnSort);
		WaitForElementInteractable(ReopenCasesUtility.StatusColumnSort);
		int checkOpen = driver.findElements(ReopenCasesUtility.ReOpenCaseGrid).size();
		if (checkOpen > 0) {
			WaitUntilPresent(ReopenCasesUtility.ReOpenCaseGrid);
			ScrollIntoView(ReopenCasesUtility.ReOpenCaseGrid);
			WaitUntilPresent(ReopenCasesUtility.ReOpenCaseGrid);
			WaitForElementInteractable(ReopenCasesUtility.ReOpenCaseGrid);
			ClickByJsExecuter(ReopenCasesUtility.ReOpenCaseGrid);

		} else {
			WaitUntilVisible(ReopenCasesUtility.StatusColumnSort);
			WaitUntilPresent(ReopenCasesUtility.StatusColumnSort);
			WaitForElementInteractable(ReopenCasesUtility.StatusColumnSort);
			ClickOn(ReopenCasesUtility.StatusColumnSort);
			WaitUntilVisible(ReopenCasesUtility.ReOpenCaseGrid);
			WaitUntilPresent(ReopenCasesUtility.ReOpenCaseGrid);
			int checktOpen = driver.findElements(ReopenCasesUtility.ReOpenCaseGrid).size();
			if (checktOpen > 0) {
				ScrollIntoView(ReopenCasesUtility.ReOpenCaseGrid);
				WaitUntilPresent(ReopenCasesUtility.ReOpenCaseGrid);
				WaitForElementInteractable(ReopenCasesUtility.ReOpenCaseGrid);
				WaitForElementInteractable(ReopenCasesUtility.ReOpenCaseGrid);
				ClickByJsExecuter(ReopenCasesUtility.ReOpenCaseGrid);

			}
		}

		WaitForCurserRunning(4);
		WaitUntilVisible(ForcedAbatementUtility.MoreBtn);
		WaitUntilPresent(ForcedAbatementUtility.MoreBtn);
		WaitForElementInteractable(ForcedAbatementUtility.MoreBtn);
		ClickByJsExecuter(ForcedAbatementUtility.MoreBtn);
		WaitUntilVisible(CloseCaseBtn);
		WaitUntilPresent(CloseCaseBtn);
		Constant.CloseCaseText = GetText(CloseCaseBtn);
		SoftAssert s134 = new SoftAssert();
		s134.assertEquals(Constant.CloseCaseText, "Close Case");
		s134.assertAll();

	}

	public void CloseCase_OpenCloseCasePopup() throws InterruptedException {

		WaitForElementInteractable(CloseCaseBtn);
		System.out.print(Constant.CloseCaseText);
		ClickOn(CloseCaseBtn);
		WaitUntilVisible(CloseCasePopup);
		WaitUntilPresent(CloseCasePopup);
		Constant.CCPopupText = GetText(CloseCasePopup);
		SoftAssert s135 = new SoftAssert();
		s135.assertEquals(Constant.CCPopupText, "Close Case");
		s135.assertAll();

	}

	public void CloseCase_CloseCloseCasePopup() throws InterruptedException {

		WaitUntilPresent(CancelBtnCCPopup);
		WaitForElementInteractable(CancelBtnCCPopup);
		ClickOn(CancelBtnCCPopup);
		WaitUntilElementInvisible(CancelBtnCCPopup);
		WaitUntilVisible(By.cssSelector("h2.case-details__case-number"));
		WaitUntilPresent(By.cssSelector("h2.case-details__case-number"));
	    Constant.modalCount = findElementsByCssSelector("h2.case-details__case-number");
		if (((Constant.modalCount.size()) <= 1) == false) {

			SoftAssert s136 = new SoftAssert();
			s136.assertEquals(false, true);
			s136.assertAll();
		}

	}

	public void CloseCase_VerifyVoluntaryToggleBtnState() {

		WaitUntilVisible(ForcedAbatementUtility.MoreBtn);
		WaitUntilElementPresent(ForcedAbatementUtility.MoreBtn, 2);
		ScrollIntoView(ForcedAbatementUtility.MoreBtn);
		WaitForElementInteractable(ForcedAbatementUtility.MoreBtn);
		ClickByJsExecuter(ForcedAbatementUtility.MoreBtn);
		WaitUntilVisible(CloseCaseBtn);
		WaitUntilPresent(CloseCaseBtn);
		ClickOn(CloseCaseBtn);
		WaitUntilVisible(By.xpath("//div[@class='multi-choice-buttons']//button[@class='square-btn btn btn-primary']"));
		WaitUntilPresent(By.xpath("//div[@class='multi-choice-buttons']//button[@class='square-btn btn btn-primary']"));
		Constant.VoluntaryBtnState = findElement(VoluntaryBtn);
		if ((Constant.VoluntaryBtnState.isEnabled()) == false) {

			SoftAssert s137 = new SoftAssert();
			s137.assertEquals(false, true);
			s137.assertAll();
		}

	}

	public void CloseCase_SelectForcedToggleBtn() {

		WaitForPageLoadTime(3);
		WaitUntilPresent(PerformInspectionUtility.ForcedToggle);
		Constant.ForcedBtnState = findElement(PerformInspectionUtility.ForcedToggle);
		if ((Constant.ForcedBtnState.isEnabled()) == false) {

			SoftAssert s138 = new SoftAssert();
			s138.assertEquals(false, true);
			s138.assertAll();
		}

	}

	public void CloseCase_VerifyClosedStatus() throws InterruptedException {

		WaitUntilPresent(CloseCaseBtnCCPopup);
		WaitForElementInteractable(CloseCaseBtnCCPopup);
		ClickByJsExecuter(CloseCaseBtnCCPopup);
		WaitUntilElementInvisible(CloseCaseBtnCCPopup);
		WaitForCurserRunning(7);
		WaitUntilVisible(CCPUtility.CaseStatus);
		WaitUntilPresent(CCPUtility.CaseStatus);
		Constant.ClosedStatus = GetText(CCPUtility.CaseStatus);
		SoftAssert s139 = new SoftAssert();
		s139.assertEquals(Constant.ClosedStatus, "Closed");
		s139.assertAll();
		ceMethods.CloseCaseDetailPage();

	}

	public void AddAddress() throws InterruptedException {

		WaitUntilPresent(CCPUtility.LocationFld);
		WaitForElementInteractable(CCPUtility.LocationFld);
		ClickOn(CCPUtility.LocationFld);
		WaitUntilPresent(CCPUtility.AddLocManually);
		WaitForElementInteractable(CCPUtility.AddLocManually);
		ClickOn(CCPUtility.AddLocManually);

		String StreetAddress1 = RandomStrings.RequiredString(8);
		SendKeys(CCPUtility.StreetAdd, StreetAddress1);
		String CityAddress1 = RandomStrings.RequiredString(8);
		SendKeys(CCPUtility.CityAdd, CityAddress1);
		SendKeys(CCPUtility.ZipAdd, "77590");
		SendKeys(CCPUtility.ApnAdd, "7030-0122-0011-000");
		ClickOn(CCPUtility.SaveButton2);
		WaitUntilElementInvisible(CCPUtility.SaveButton2);
	}

	public void AddVio() throws InterruptedException {

		WaitForElementInteractable(CCPUtility.ViolationSearchBox);
		ClickOn(CCPUtility.ViolationSearchBox);
		SendKeys(CCPUtility.ViolationSearchBox, "An");
		ClickOn(CCPUtility.ViolationList);
		SendKeys(CCPUtility.EntitySearchBox, "Wh");
		ClickOn(CCPUtility.EntitySearchList);
		ClickOn(CCPUtility.AddButton);
		WaitUntilElementInvisible(CCPUtility.AddButton);
	}

	public void CloseCase_PreRequisiteCaseCreationForCloseCase() throws InterruptedException {

		ceMethods.NavigateToCCP();
		ceMethods.CE_AddLocation();
		ceMethods.CE_AddViolation();

		WaitUntilVisible(CCPUtility.CCButton);
		WaitUntilPresent(CCPUtility.CCButton);
		ScrollIntoView(CCPUtility.CCButton);
		WaitForElementInteractable(CCPUtility.CCButton);
		ClickByJsExecuter(CCPUtility.CCButton);
		WaitForCurserRunning(5);
	    WaitUntilVisible(By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
	    WaitUntilPresent(By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));

		WaitUntilVisible(CCPUtility.CrtSchInsButton);
		WaitUntilPresent(CCPUtility.CrtSchInsButton);
		ScrollIntoView(CCPUtility.CrtSchInsButton);
		WaitForElementInteractable(CCPUtility.CrtSchInsButton);
		ClickByJsExecuter(CCPUtility.CrtSchInsButton);
		WaitForCurserRunning(10);
		WaitUntilVisible(CCPUtility.CaseStatus);
		WaitUntilPresent(CCPUtility.CaseStatus);
		ScrollIntoView(CCPUtility.CaseStatus);
		Constant.Case = WaitUntilVisibleWE(CCPUtility.CaseStatus);
		if ((Constant.Case.isDisplayed()) == false) {

			SoftAssert s140 = new SoftAssert();
			s140.assertEquals(false, true);
			s140.assertAll();

		}

	}

	public void CloseCase_ConfirmationPopupForCloseCaseInvalidViolations() throws InterruptedException {

		WaitUntilVisible(PerformInspectionUtility.AddContactsPIP);
		WaitUntilPresent(PerformInspectionUtility.AddContactsPIP);
		ScrollIntoView(PerformInspectionUtility.AddContactsPIP);
		WaitForElementInteractable(PerformInspectionUtility.AddContactsPIP);
		ClickOn(PerformInspectionUtility.AddContactsPIP);
		WaitUntilVisible(PerformInspectionUtility.CrtContactLink2);
		WaitUntilPresent(PerformInspectionUtility.CrtContactLink2);
		WaitForElementInteractable(PerformInspectionUtility.CrtContactLink2);
		ClickOn(PerformInspectionUtility.CrtContactLink2);
		String RandomName = RandomStrings.RequiredCharacters(8);
		String RandomMail = RandomName + "@yopmail.com";
		String RandomContact = RandomStrings.RequiredDigits(10);
		WaitUntilVisible(PerformInspectionUtility.NameFieldPIP);
		WaitForElementInteractable(PerformInspectionUtility.NameFieldPIP);
		SendKeys(PerformInspectionUtility.NameFieldPIP, RandomName);
		SendKeys(CCPUtility.NameField, RandomName);
		SendKeys(CCPUtility.EmailField, RandomMail);
		SendKeys(CCPUtility.WorkPhoneField, RandomContact);
		WaitUntilPresent(CCPUtility.CrtContactBtn);
		WaitForElementInteractable(CCPUtility.CrtContactBtn);
		ClickOn(CCPUtility.CrtContactBtn);

		WaitUntilVisible(CCPUtility.PropertyOwnerOption);
		WaitUntilPresent(CCPUtility.PropertyOwnerOption);
		WaitForElementInteractable(CCPUtility.PropertyOwnerOption);
		ClickOn(CCPUtility.PropertyOwnerOption);
		ClickOn(CCPUtility.ApplyButton);
		WaitUntilElementInvisible(CCPUtility.ApplyButton);
		WaitUntilVisible(PerformInspectionUtility.PerformInsButton);
		WaitUntilPresent(PerformInspectionUtility.PerformInsButton);
		WaitForElementInteractable(PerformInspectionUtility.PerformInsButton);
		ClickByJsExecuter(PerformInspectionUtility.PerformInsButton);
		WaitUntilElementInvisible(PerformInspectionUtility.PerformInsButton);
		Constant.InvalidBtnList = WaitUntilVisibleList(PerformInspectionUtility.InvalidBtnList);
		int CountList = Constant.InvalidBtnList.size();
		for (int i = 0; i < CountList; i++) {
			WebElement ListClick = Constant.InvalidBtnList.get(i);

			ListClick.click();
		}
		WaitUntilVisible(PerformInspectionUtility.FooterButtons);
		WaitUntilPresent(PerformInspectionUtility.FooterButtons);
		WaitForElementInteractable(PerformInspectionUtility.FooterButtons);
		ClickOn(PerformInspectionUtility.FooterButtons);
		Constant.ConfirmationIcon = WaitUntilVisibleWE(PerformInspectionUtility.ConfirmationPopup);
		if ((Constant.ConfirmationIcon.isDisplayed()) == false) {

			SoftAssert s141 = new SoftAssert();
			s141.assertEquals(false, true);
			s141.assertAll();

		}

	}

	public void CloseCase_CloseConfirmationPopupForCloseCase() throws InterruptedException {

		WaitUntilVisible(PerformInspectionUtility.CancelConfirmation);
		WaitUntilPresent(PerformInspectionUtility.CancelConfirmation);
		ScrollIntoView(PerformInspectionUtility.CancelConfirmation);
		WaitForElementInteractable(PerformInspectionUtility.CancelConfirmation);
		ClickOn(PerformInspectionUtility.CancelConfirmation);
		WaitUntilElementInvisible(PerformInspectionUtility.CancelConfirmation);
		Constant.ConfirmationValid = driver.findElements(PerformInspectionUtility.ConfirmationPopup);
		if (((Constant.ConfirmationValid.size()) < 1) == false) {

			SoftAssert s142 = new SoftAssert();
			s142.assertEquals(false, true);
			s142.assertAll();

		}

	}

	public void CloseCase_VerifyClosedStatusViaPerformInspection() throws InterruptedException {

		WaitUntilVisible(PerformInspectionUtility.FooterButtons);
		WaitForElementInteractable(PerformInspectionUtility.FooterButtons);
		ClickOn(PerformInspectionUtility.FooterButtons);

		WaitUntilVisible(YesBtnConfirmationPopup);
		WaitUntilPresent(YesBtnConfirmationPopup);
		WaitForElementInteractable(YesBtnConfirmationPopup);
		ClickOn(YesBtnConfirmationPopup);
		WaitUntilElementInvisible(YesBtnConfirmationPopup);
		WaitForCurserRunning(4);
		WaitUntilVisible(ClosedStatus);
		WaitUntilPresent(ClosedStatus);
		Constant.ClosedStatus = GetText(ClosedStatus);

		SoftAssert s143 = new SoftAssert();
		s143.assertEquals(Constant.ClosedStatus, "Closed");
		s143.assertAll();

	}

	public void Create_New_Contact() throws InterruptedException {

		WaitUntilVisible(CCPUtility.AddContactFld);
		WaitUntilPresent(CCPUtility.AddContactFld);
		WaitForElementInteractable(CCPUtility.AddContactFld);
		ClickOn(CCPUtility.AddContactFld);
		WaitUntilPresent(PerformInspectionUtility.CrtContactLink2);
		ClickOn(PerformInspectionUtility.CrtContactLink2);
		WaitUntilVisible(PerformInspectionUtility.NameFieldPIP);
		WaitForElementInteractable(PerformInspectionUtility.NameFieldPIP);
		String RandomName = RandomStrings.RequiredCharacters(8);
		String RandomMail = RandomName + "@yopmail.com";
		String RandomContact = RandomStrings.RequiredDigits(10);
		SendKeys(PerformInspectionUtility.NameFieldPIP, RandomName);
		SendKeys(CCPUtility.NameField, RandomName);
		SendKeys(CCPUtility.EmailField, RandomMail);
		SendKeys(CCPUtility.WorkPhoneField, RandomContact);
		ClickOn(PerformInspectionUtility.CrtContactBtn);
		WaitUntilVisible(CCPUtility.PropertyOwnerOption);
		WaitForElementInteractable(CCPUtility.PropertyOwnerOption);
		ClickOn(CCPUtility.PropertyOwnerOption);
		ClickOn(CCPUtility.ApplyButton);
		WaitUntilElementInvisible(CCPUtility.ApplyButton);
	}

	public void CreateCasePreRequisites() throws InterruptedException {
		driver.navigate().to(BrowsersInvoked.URLCreateCase);

		AddAddress();
		AddVio();
		Create_New_Contact();

		WaitUntilVisible(CCPUtility.CCButton);
		WaitUntilPresent(CCPUtility.CCButton);
		WaitForElementInteractable(CCPUtility.CCButton);
		ClickOn(CCPUtility.CCButton);
		WaitForCurserRunning(5);
		WaitUntilVisible(CCPUtility.CrtSchInsButton);
		WaitUntilPresent(CCPUtility.CrtSchInsButton);
		WaitUntilVisible(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
		WaitUntilPresent(
				By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
		WaitForElementInteractable(CCPUtility.CrtSchInsButton);
		ClickByJsExecuter(CCPUtility.CrtSchInsButton);
		WaitUntilElementInvisible(CCPUtility.CrtSchInsButton);
		WaitForCurserRunning(5);

	}

	public void CloseCaseDetailPage() throws InterruptedException {
		WaitUntilVisible(CCPUtility.CloseCDP);
		ScrollIntoView(CCPUtility.CloseCDP);
		WaitForElementInteractable(CCPUtility.CloseCDP);
		ClickByJsExecuter(CCPUtility.CloseCDP);
		WaitUntilElementInvisible(CCPUtility.CloseCDP);
		WaitForCurserRunning(5);
	}

	public void CloseCase_CloseCasewithValidViolations() throws InterruptedException {

		CloseCaseDetailPage();
		CloseCase_PreRequisiteCaseCreationForCloseCase();
		WaitForCurserRunning(10);
		WaitUntilVisible(By.cssSelector("h2.case-details__case-number"));
		WaitUntilVisible(PerformInspectionUtility.PerformInsButton);
		ScrollIntoView(PerformInspectionUtility.PerformInsButton);
		WaitUntilPresent(PerformInspectionUtility.PerformInsButton);
		WaitForElementInteractable(PerformInspectionUtility.PerformInsButton);
		ClickOn(PerformInspectionUtility.PerformInsButton);
		WaitUntilVisible(PerformInspectionUtility.ValidBtnList);
		WaitUntilPresent(PerformInspectionUtility.ValidBtnList);
		WaitForElementInteractable(PerformInspectionUtility.ValidBtnList);
		ClickOn(PerformInspectionUtility.ValidBtnList);
		ScrollIntoView(PerformInspectionUtility.FooterButtons);
		WaitUntilPresent(PerformInspectionUtility.FooterButtons);
		WaitForElementInteractable(PerformInspectionUtility.FooterButtons);
		ClickOn(PerformInspectionUtility.FooterButtons);
		WaitForCurserRunning(3);
		WaitUntilVisible(CloseCasePopup);
		Constant.CCPopupText = GetText(CloseCasePopup);

		SoftAssert s144a = new SoftAssert();
		s144a.assertEquals(Constant.CCPopupText, "Close Case");
		s144a.assertAll();

		ClickOn(CloseCaseBtnCCPopup);
		WaitUntilElementInvisible(CloseCaseBtnCCPopup);
		WaitForCurserRunning(10);
		WaitUntilVisible(CCPUtility.CaseStatus);
		WaitUntilPresent(CCPUtility.CaseStatus);
		ScrollIntoView(CCPUtility.CaseStatus);
		Constant.ClosedStatus = GetText(CCPUtility.CaseStatus);

		SoftAssert s144b = new SoftAssert();
		s144b.assertEquals(Constant.ClosedStatus, "Closed");
		s144b.assertAll();

	}

}
