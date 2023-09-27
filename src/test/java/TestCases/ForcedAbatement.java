package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import ExtentReport.ExtentReportClass;
import POM.ForcedAbatementUtility;

public class ForcedAbatement extends BrowsersInvoked{
	private WebDriver driver;
	ExtentReportClass extentClass;
	ITestResult result;
	ForcedAbatementUtility forcedAbatement;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		extentClass = new ExtentReportClass(driver);
		forcedAbatement = new ForcedAbatementUtility(driver);
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
		forcedAbatement.LoginAgency();

	}
	
	@Test(priority = 1)
	public void ForcedAbatement_OpenInitiateForcedAbabtementPopup() throws InterruptedException {
		forcedAbatement.ForcedAbatement_OpenInitiateForcedAbabtementPopup();
	}
	
	
	@Test(priority = 2)
	public void ForcedAbatement_ValidationMsgForEmptyNote() throws InterruptedException {
		forcedAbatement.ForcedAbatement_ValidationMsgForEmptyNote();
	}
	
	@Test(priority = 3)
	public void ForcedAbatement_ValidationMsgForCharactersOver500InNote() {
		forcedAbatement.ForcedAbatement_ValidationMsgForCharactersOver500InNote();
	}
	
	@Test(priority = 4)
	public void ForcedAbatement_InitiateForcedAbatement() {
		forcedAbatement.ForcedAbatement_InitiateForcedAbatement();
	}
	
	@Test(priority = 5)
	public void ForcedAbatement_VerifyForcedStageBadge() {
		forcedAbatement.ForcedAbatement_VerifyForcedStageBadge();
	}
	
	@Test(priority = 6)
	public void ForcedAbatement_OpenEditFaNotePopup() {
		forcedAbatement.ForcedAbatement_OpenEditFaNotePopup();
	}
	
	@Test(priority = 7)
	public void ForcedAbatement_EditNoteInEditFaNoteField() {
		forcedAbatement.ForcedAbatement_EditNoteInEditFaNoteField();
	}
	
	@Test(priority = 8)
	public void ForcedAbatement_VerifyTheUpdatedNote() {
		forcedAbatement.ForcedAbatement_VerifyTheUpdatedNote();
	}
	
	@Test(priority = 9)
	public void ForcedAbatement_VerifyAddActivityBtn() throws InterruptedException {
		forcedAbatement.ForcedAbatement_VerifyAddActivityBtn();
	}
	
	
	@Test(priority = 10)
	public void ForcedAbatement_OpenAddForcedAbatementActivityPopup() {
		forcedAbatement.ForcedAbatement_OpenAddForcedAbatementActivityPopup();
	}
	
	@Test(priority = 11)
	public void ForcedAbatement_VerifyFirstActivityBtnState() {
		forcedAbatement.ForcedAbatement_VerifyFirstActivityBtnState();
	}
	
	@Test(priority = 12)
	public void ForcedAbatement_ValidationMsgForNoDataOfActivity() throws InterruptedException {
		forcedAbatement.ForcedAbatement_ValidationMsgForNoDataOfActivity();
	}
	
	@Test(priority = 13)
	public void ForcedAbatement_VerifyDocumentNoteFieldPresence() {
		forcedAbatement.ForcedAbatement_VerifyDocumentNoteFieldPresence();
	}
	
	@Test(priority = 14)
	public void ForcedAbatement_ValidationMsgForEmptyDocumentNote() throws InterruptedException{
		forcedAbatement.ForcedAbatement_ValidationMsgForEmptyDocumentNote();
	}
	 
	@Test(priority = 15)
	public void ForcedAbatement_AddForcedAbatementActivity() {
		forcedAbatement.ForcedAbatement_AddForcedAbatementActivity();
	}
	
	@Test(priority = 16)
	public void ForcedAbatement_OpenEditForcedAbatementActivityPopup() {
		forcedAbatement.ForcedAbatement_OpenEditForcedAbatementActivityPopup();
	}
	
	@Test(priority = 17)
	public void ForcedAbatement_CloseEditForcedAbatementActivityPopup() {
		forcedAbatement.ForcedAbatement_CloseEditForcedAbatementActivityPopup();
	}
	
	@Test(priority = 18)
	public void ForcedAbatement_EditAddedActivity() {
		forcedAbatement.ForcedAbatement_EditAddedActivity();
	}
	
	@Test(priority = 19)
	public void ForcedAbatement_ConfirmationPopupForDeletingActivity() {
		forcedAbatement.ForcedAbatement_ConfirmationPopupForDeletingActivity();
	}
	
	@Test(priority = 20)
	public void ForcedAbatement_DeleteAddedActivity() {
		forcedAbatement.ForcedAbatement_DeleteAddedActivity();
	}
	
	@Test(priority = 21)
	public void ForcedAbatement_VerifyAbleToSelectActivityType() throws InterruptedException {
		forcedAbatement.ForcedAbatement_VerifyAbleToSelectActivityType();
	}
	
	@Test(priority = 22)
	public void ForceAbatement_AbatementDetailsPopupopen() throws InterruptedException {
		forcedAbatement.ForceAbatement_AbatementDetailsPopupopen();
	}
	
	@Test(priority = 23)
	public void ForceAbatement_AbatementDetailsDetails() throws InterruptedException {
		forcedAbatement.ForceAbatement_AbatementDetailsDetails();
	}
	
	@Test(priority = 24)
	public void ForceAbatement_AttachmentSectionAppearFAADocSelected() throws InterruptedException {
		forcedAbatement.ForceAbatement_AttachmentSectionAppearFAADocSelected();
	}
	
	@Test(priority = 25)
	public void ForceAbatement_ContactAppearUnderResponsibleParty() throws InterruptedException {
		forcedAbatement.ForceAbatement_ContactAppearUnderResponsibleParty();
	}
	
	@Test(priority = 26)
	public void ForceAbatement_SelectedAttachmentPopulatedonPrintPreview() throws InterruptedException {
		forcedAbatement.ForceAbatement_SelectedAttachmentPopulatedonPrintPreview();
	}
	
	
	
}
