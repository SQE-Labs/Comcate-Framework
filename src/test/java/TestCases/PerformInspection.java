package TestCases;

import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import ExtentReport.ExtentReportClass;
import POM.CloseCaseUtility;
import POM.PerformInspectionUtility;

public class PerformInspection extends BrowsersInvoked {

	protected WebDriver driver;
	PerformInspectionUtility perInspect;
	ExtentReportClass extentClass;
	ITestResult result;

	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		perInspect = new PerformInspectionUtility(driver);
		extentClass = new ExtentReportClass(driver);
	}

	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}

	@AfterMethod
	public void flushReport(Method method, ITestResult result) {
		Test test = method.getAnnotation(Test.class);
		ExtentReportClass.extentTest = ExtentReportClass.extent.startTest(method.getName());
		ExtentReportClass.extentTest.setDescription(test.description());
		try {
			extentClass.tearDown(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		perInspect.LoginAgency();
	}

	@Test(priority=1)
	public void CCP_CDP_EditLocation() throws InterruptedException {
		perInspect.PerformInspection_PreRequisite_CDP();
		perInspect.CCP_CDP_EditLocation();

	}

	@Test(priority = 64)
	public void PerformInspection_PreRequisite_Contacts() {
		perInspect.PerformInspection_PreRequisite_Contacts();
	}

	@Test(priority = 65)
	public void PerformInspection_OpenVerificationInspectionInProgressPage() throws InterruptedException {
		perInspect.PerformInspection_OpenVerificationInspectionInProgressPage();

	}

	@Test(priority = 66)
	public void PerformInspection_ValidationMessageSection1() throws InterruptedException {
		perInspect.PerformInspection_ValidationMessageSection1();

	}

	@Test(priority = 67)
	public void PerformInspection_VerifySection1Status() {
		perInspect.PerformInspection_VerifySection1Status();
	}

	@Test(priority = 68)
	public void PerformInspection_AddAViolation() throws InterruptedException {
		perInspect.PerformInspection_AddAViolation();
	}

	@Test(priority = 69)
	public void PerformInspection_VerifyVerificationPendingStatusForViolation() {
		
perInspect.PerformInspection_VerifyVerificationPendingStatusForViolation();
	}

	@Test(priority = 70)
	public void PerformInspection_SelectAnyToggleButtonForViolation() {

		perInspect.PerformInspection_SelectAnyToggleButtonForViolation();
	}

	@Test(priority = 71)
	public void PerformInspection_VerifyClosedStatusForViolation() {
		perInspect.PerformInspection_VerifyClosedStatusForViolation();
	}

	@Test(priority = 72)
	public void PerformInspection_VerifyOpenStatusForViolation() {
		perInspect.PerformInspection_VerifyOpenStatusForViolation();
	}

	@Test(priority = 73)
	public void PerformInspection_VerifyContinueButtonPresence() {
		perInspect.PerformInspection_VerifyContinueButtonPresence();

	}

	@Test(priority = 74)
	public void PerformInspection_OpenConfirmationPopupForCloseCaseButton() {
		perInspect.PerformInspection_OpenConfirmationPopupForCloseCaseButton();

	}

	@Test(priority = 75)
	public void PerformInspection_CloseConfirmationPopup() {
		perInspect.PerformInspection_CloseConfirmationPopup();
	}

	@Test(priority = 76)
	public void PerformInspection_VerifySection2Title() {
		perInspect.PerformInspection_VerifySection2Title();
	}

	@Test(priority = 77)
	public void PerformInspection_OpenCloseCasePopup() {
		perInspect.PerformInspection_OpenCloseCasePopup();

	}

	@Test(priority = 78)
	public void PerformInspection_VerifyVoluntaryToggleButtonState() {
		perInspect.PerformInspection_VerifyVoluntaryToggleButtonState();

	}

	@Test(priority = 79)
	public void PerformInspection_SelectForcedToggleButton() {
		perInspect.PerformInspection_SelectForcedToggleButton();

	}

	@Test(priority = 80)
	public void PerformInspection_CloseCloseCasePopup() {
		perInspect.PerformInspection_CloseCloseCasePopup();
	}

	@Test(priority = 81)
	public void PerformInspection_AddInspectionNote() {
		perInspect.PerformInspection_AddInspectionNote();
	}

	@Test(priority = 82)
	public void PerformInspection_AddAttachment() {
		perInspect.PerformInspection_AddAttachment();
	}

	@Test(priority = 83)
	public void PerformInspection_ExpandSection2OnContinue() {
		perInspect.PerformInspection_ExpandSection2OnContinue();
	}

	@Test(priority = 84)
	public void PerformInspection_VerifySection1Label() {
		perInspect.PerformInspection_VerifySection1Label();
	}

	@Test(priority = 85)
	public void PerformInspection_EditVerifyViolationSection() {
		perInspect.PerformInspection_EditVerifyViolationSection();
	}

	@Test(priority = 86)
	public void PerformInspection_VerifyFirstNoticeState() throws InterruptedException {
		perInspect.PerformInspection_VerifyFirstNoticeState();
	}

	@Test(priority = 87)
	public void PerformInspection_SelectAnyNotice() throws InterruptedException {
		perInspect.PerformInspection_SelectAnyNotice();
	}

	@Test(priority = 88)
	public void PerformInspection_VerifySection3Title() {
		perInspect.PerformInspection_VerifySection3Title();
	}

	@Test(priority = 89)
	public void PerformInspection_SelectNoNoticeRequiredCheckbox() throws InterruptedException {
		perInspect.PerformInspection_SelectNoNoticeRequiredCheckbox();

	}

	@Test(priority = 90)
	public void PerformInspection_UpdateNoticeIssueDate() throws InterruptedException {
		perInspect.PerformInspection_UpdateNoticeIssueDate();

	}

	@Test(priority = 91)
	public void PerformInspection_VerifyIssueNoticeAndCompleteInspectionButton() {
		perInspect.PerformInspection_VerifyIssueNoticeAndCompleteInspectionButton();
	}

	@Test(priority = 92)
	public void PerformInspection_VerifyContinueButtonPresenceOnHtmlSelected() {
		perInspect.PerformInspection_VerifyContinueButtonPresenceOnHtmlSelected();

	}

	@Test(priority = 93)
	public void PerformInspection_VerifyViolationsUnderReviewOpenViolations() {
		perInspect.PerformInspection_VerifyViolationsUnderReviewOpenViolations();
	}

	@Test(priority = 94)
	public void PerformInspection_UpdateComplyByDate() {
		perInspect.PerformInspection_UpdateComplyByDate();
	}

	@Test(priority = 97)
	public void PerformInspection_UpdateFollowUpInspectionDate() throws InterruptedException {
		perInspect.PerformInspection_UpdateFollowUpInspectionDate();

	}

	@Test(priority = 98)
	public void PerformInspection_VerifyLoggedInUserToggleButtonState() throws InterruptedException {
		perInspect.PerformInspection_VerifyLoggedInUserToggleButtonState();
	}

	@Test(priority = 99)
	public void PerformInspection_ExpandSection3() {
		perInspect.PerformInspection_ExpandSection3();

	}

	@Test(priority = 100)
	public void PerformInspection_EnterCertifiedMailNumber() {
		perInspect.PerformInspection_EnterCertifiedMailNumber();

	}

	@Test(priority = 101)
	public void PerformInspection_VerifyRecipientSubSectionPresence() {
		perInspect.PerformInspection_VerifyRecipientSubSectionPresence();
	}

	@Test(priority = 102)
	public void PerformInspection_VerifyRecipientNoLongerMandatory() throws InterruptedException {
		perInspect.PerformInspection_VerifyRecipientNoLongerMandatory();
	}

	@Test(priority = 103)
	public void PerformInspection_SelectMultipleContact() {
		perInspect.PerformInspection_SelectMultipleContact();
	}

	@Test(priority = 104)
	public void PerformInspection_VerifyResponsiblePartySectionPresence() {
		perInspect.PerformInspection_VerifyResponsiblePartySectionPresence();

	}

	@Test(priority = 105)
	public void PerformInspection_OpenConfirmationPopupOnExitButton() {
		perInspect.PerformInspection_OpenConfirmationPopupOnExitButton();
	}

	@Test(priority = 106)
	public void PerformInspection_CloseConfirmationPopupForExitButto() {
		perInspect.PerformInspection_CloseConfirmationPopupForExitButto();
	}

	@Test(priority = 107)
	public void PerformInspection_OpenGenerateNoticepopup() {
		perInspect.PerformInspection_OpenGenerateNoticepopup();
	}

	@Test(priority = 108)
	public void PerformInspection_CloseGenerateNoticePopup() {
		perInspect.PerformInspection_CloseGenerateNoticePopup();
	}

	@Test(priority = 109)
	public void PerformInspection_AddTextToTextBox() {
		perInspect.PerformInspection_AddTextToTextBox();
	}

	@Test(priority = 110)
	public void PerformInspection_VerifyPrintToggleButtonState() {
		perInspect.PerformInspection_VerifyPrintToggleButtonState();

	}

	@Test(priority = 111)
	public void PerformInspection_SelectAnyToggleButton() {
		perInspect.PerformInspection_SelectAnyToggleButton();

	}

	@Test(priority = 112)
	public void PerformInspection_OpenConfirmationPopupForCompleteInspection() {

		perInspect.PerformInspection_OpenConfirmationPopupForCompleteInspection();
	}

	@Test(priority = 113)
	public void PerformInspection_CloseConfirmationPopupOnCancel() {
		perInspect.PerformInspection_CloseConfirmationPopupOnCancel();
	}

	@Test(priority = 114)
	public void PerformInspection_VerifyTheNoticeIssued() {
		perInspect.PerformInspection_VerifyTheNoticeIssued();
	}

	@Test(priority = 115)
	public void FollowUpInspection_VerifyFollowUpInspectionSubSection() {
		perInspect.FollowUpInspection_VerifyFollowUpInspectionSubSection();

	}

	@Test(priority = 116)
	public void FollowUpInspection_OpenEditFollowUpInspectionPopup() {
		perInspect.FollowUpInspection_OpenEditFollowUpInspectionPopup();
	}

	@Test(priority = 117)
	public void FollowUpInspection_VerifyEditedDetails() {
		perInspect.FollowUpInspection_VerifyEditedDetails();
	}

	@Test(priority = 118)
	public void FollowUpInspection_OpenFollowUpInspectionInProgressPopup() {
		perInspect.FollowUpInspection_OpenFollowUpInspectionInProgressPopup();
	}

	@Test(priority = 119)
	public void FollowUpInspection_VerifyInspectViolationsHeadersection1() {
		perInspect.FollowUpInspection_VerifyInspectViolationsHeadersection1();
	}

	@Test(priority = 120)
	public void FollowUpInspection_PerformFollowUpInspection() {
		perInspect.FollowUpInspection_PerformFollowUpInspection();
	}

	@Test(priority = 121)
	public void FollowUpInspection_VerifyFollowUpInspection2Title() {
		perInspect.FollowUpInspection_VerifyFollowUpInspection2Title();
	}

	@Test(priority = 122)
	public void CDP_PerformInspection_AddedNoteVerification() {
		perInspect.CDP_PerformInspection_AddedNoteVerification();
	}

	@Test(priority = 123)
	public void CDP_VerifyOpenAddCaseNotePopup() {
		perInspect.CDP_VerifyOpenAddCaseNotePopup();
	}

	@Test(priority = 124)
	public void CDP_VerifyPopopClosesOnclickingCancel() {
		perInspect.CDP_VerifyPopopClosesOnclickingCancel();
	}

	@Test(priority = 125)
	public void CDP_ValidationMessageForAddCaseNoteField() {
		perInspect.CDP_ValidationMessageForAddCaseNoteField();
	}

	@Test(priority = 126)
	public void CDP_validationMsgForMoreThan5000Characters() {
		perInspect.CDP_validationMsgForMoreThan5000Characters();

	}

	@Test(priority = 127)
	public void CDP_VerifyCaseNoteGetsAdded() throws Exception {
		perInspect.CDP_VerifyCaseNoteGetsAdded();

	}

}
