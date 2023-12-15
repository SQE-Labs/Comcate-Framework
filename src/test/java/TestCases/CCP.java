package TestCases;

import BrowsersBase.BrowsersInvoked;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import ExtentReport.ExtentReportClass;
import POM.CCPUtility;

public class CCP extends BrowsersInvoked {
	public WebDriver driver;
	ExtentReportClass extentClass;
	ITestResult result;
	CCPUtility ccp;

	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		extentClass = new ExtentReportClass(driver);
		ccp = new CCPUtility(driver);
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
		ccp.LoginAgency();

	}

	@Test(priority = 1)
	public void CCP_GlobalValidationMsgForNoData() throws InterruptedException {
		ccp.CCP_PreRequisite();
		ccp.CCP_GlobalValidationMsgForNoData();
	}

	@Test(priority = 2)
	public void CCP_DefaultInfoMsgOnLOcationTile() throws InterruptedException {
		ccp.CCP_DefaultInfoMsgOnLOcationTile();
	}
	
	@Test(priority = 3)
	public void CCP_ValidationMsgOutsideAgencyBoundary() throws InterruptedException {
		ccp.CCP_ValidationMsgOutsideAgencyBoundary();
	}
	
	@Test(priority = 4)
	public void CCP_SearchAndAddAddress() throws InterruptedException {
		ccp.CCP_SearchAndAddAddress();
	}
	
	@Test(priority = 5)
	public void CCP_OpenAddAddressManuallyPopup() throws InterruptedException {
		ccp.CCP_OpenAddAddressManuallyPopup();
	}
	
	@Test(priority = 6)
	public void CCP_CloseAddAddressManuallyPopup() throws InterruptedException {
		ccp.CCP_CloseAddAddressManuallyPopup();
	}
	
	@Test(priority = 7)
	public void CCP_ValidationMsgForNoAddressDetails() throws InterruptedException {
		ccp.CCP_ValidationMsgForNoAddressDetails();
	}
	
	@Test(priority = 8)
	public void CCP_AddTheAddressManually() throws InterruptedException {
		ccp.CCP_AddTheAddressManually();
	}
	
	@Test(priority = 9)
	public void CCP_EditAddedAddress() throws InterruptedException {
		ccp.CCP_EditAddedAddress();
	}
	
	@Test(priority = 10)
	public void CCP_UpdateAddressOnSaveButton() throws InterruptedException {
		ccp.CCP_UpdateAddressOnSaveButton();
	}
	
	@Test(priority = 11)
	public void CCP_AddressShouldntGetUpdatedOnCancelButton() throws InterruptedException {
		ccp.CCP_AddressShouldntGetUpdatedOnCancelButton();
	}
	
	@Test(priority = 12)
	public void CCP_OpenFlagAddressPopup() throws InterruptedException {
		ccp.CCP_OpenFlagAddressPopup();
	}
	
	@Test(priority = 13)
	public void CCP_CloseFlagAddressPopup() throws InterruptedException {
		ccp.CCP_CloseFlagAddressPopup();
	}

	
	@Test(priority = 14)
	public void CCP_VerifyFlagAddressButtonState() throws InterruptedException {
		ccp.CCP_VerifyFlagAddressButtonState();
	}
	
	@Test(priority = 15)
	public void CCP_VerifyFlaggedButtonState() throws InterruptedException {
		ccp.CCP_VerifyFlaggedButtonState();
	}
	
	@Test(priority = 16)
	public void CCP_InfoMsgForNoViolation() throws InterruptedException {
		ccp.CCP_InfoMsgForNoViolation();
	}
	
	@Test(priority = 17)
	public void CCP_ValidationMsgForNoViolation() throws InterruptedException {
		ccp.CCP_ValidationMsgForNoViolation();
	}
	
	@Test(priority = 18)
	public void CCP_InfoMsgForNonExistingData() throws InterruptedException {
		ccp.CCP_InfoMsgForNonExistingData();
	}
	
	@Test(priority = 19)
	public void CCP_AddCustomIssueDescriptionField() throws InterruptedException {
		ccp.CCP_AddCustomIssueDescriptionField();
	}
	
	@Test(priority = 20)
	public void CCP_validationMsgForEmptyCustomIssueDescriptionField() throws InterruptedException {
		ccp.CCP_validationMsgForEmptyCustomIssueDescriptionField();
	}
	
	@Test(priority = 21)
	public void CCP_AddViolationWithoutEntity() throws InterruptedException {
		ccp.CCP_AddViolationWithoutEntity();
	}
	
	@Test(priority = 22)
	public void CCP_OpenViolationWithEntityPopup() throws InterruptedException {
		ccp.CCP_OpenViolationWithEntityPopup();
	}

	@Test(priority = 23)
	public void CCP_ValidationMsgForNoViolationData() throws InterruptedException {
		ccp.CCP_ValidationMsgForNoViolationData();
	}
	
	@Test(priority = 24)
	public void CCP_AddViolationWithEntity() throws InterruptedException {
		ccp.CCP_AddViolationWithEntity();
	}
	
	@Test(priority = 25)
	public void CCP_SearchAndAddViolation() throws InterruptedException {
		ccp.CCP_SearchAndAddViolation();
	}
	
	@Test(priority = 26)
	public void CCP_VerifyAddAnotherViolationLink() throws InterruptedException {
		ccp.CCP_VerifyAddAnotherViolationLink();
	}
	
	@Test(priority = 27)
	public void CCP_DeleteAddedViolation() throws InterruptedException {
		ccp.CCP_DeleteAddedViolation();
	}
	
	@Test(priority = 28)
	public void CCP_OpenEditViolationPopup() throws InterruptedException {
		ccp.CCP_OpenEditViolationPopup();
	}
	
	@Test(priority = 29)
	public void CCP_UploadPhotoForViolation() throws InterruptedException {
		ccp.CCP_UploadPhotoForViolation();
	}
	
	@Test(priority = 30)
	public void CCP_VerifyReplaceButtonPresence() throws InterruptedException {
		ccp.CCP_VerifyReplaceButtonPresence();
	}
	
	@Test(priority = 31)
	public void CCP_DeleteAddedPhoto() throws InterruptedException {
		ccp.CCP_DeleteAddedPhoto();
	}
	
	@Test(priority = 32)
	public void CCP_VerifyTotalViolationsCount() throws InterruptedException {
		ccp.CCP_VerifyTotalViolationsCount();
	}
	
	@Test(priority = 33)
	public void CCP_OpenViolationListingPopup() throws InterruptedException {
		ccp.CCP_OpenViolationListingPopup();
	}
	
	@Test(priority = 34)
	public void CCP_CloseViolationListingPopup() throws InterruptedException {
		ccp.CCP_CloseViolationListingPopup();
	}
	
	@Test(priority = 35)
	public void CCP_OpenCreateAContactPopup() throws InterruptedException {
		ccp.CCP_OpenCreateAContactPopup();
	}
	
	@Test(priority = 36)
	public void CCP_ValidationMsgForNodataInNameField() throws InterruptedException {
		ccp.CCP_ValidationMsgForNodataInNameField();
	}
	
	@Test(priority = 37)
	public void CCP_CloseCreateAContactPopup() throws InterruptedException {
		ccp.CCP_CloseCreateAContactPopup();
	}
	
	@Test(priority = 38)
	public void CCP_AddNewContact() throws InterruptedException {
		ccp.CCP_AddNewContact();
	}
	
	@Test(priority = 39)
	public void CCP_OpenEditContactPopup() throws InterruptedException {
		ccp.CCP_OpenEditContactPopup();
	}
	
	@Test(priority = 40)
	public void CCP_DeleteAddedContact() throws InterruptedException {
		ccp.CCP_DeleteAddedContact();
	}
	
	@Test(priority = 41)
	public void CCP_VerifyTotalContactCount() throws InterruptedException {
		ccp.CCP_VerifyTotalContactCount();
	}
	
	@Test(priority = 42)
	public void CCP_VerifyViolationAttachmentsPresence() throws InterruptedException {
		ccp.CCP_VerifyViolationAttachmentsPresence();
	}
	
	@Test(priority = 43)
	public void CCP_OpenAddAttachmentsPopup() throws InterruptedException {
		ccp.CCP_OpenAddAttachmentsPopup();
	}
	
	@Test(priority = 44)
	public void CCP_VerifyAttachmentsPreview() throws InterruptedException {
		ccp.CCP_VerifyAttachmentsPreview();
	}
	
	@Test(priority = 45)
	public void CCP_OpenCloseAddAttachmentsPopup() throws InterruptedException {
		ccp.CCP_OpenCloseAddAttachmentsPopup();
	}
	
	@Test(priority = 46)
	public void CCP_CloseAddAttachmentsPopup() throws InterruptedException {
		ccp.CCP_CloseAddAttachmentsPopup();
	}
	
	@Test(priority = 47)
	public void CCP_ReopenAddAttachmentsPopup() throws InterruptedException {
		ccp.CCP_ReopenAddAttachmentsPopup();
	}
	
	@Test(priority = 48)
	public void CCP_AddAnAttachment() throws InterruptedException {
		ccp.CCP_AddAnAttachment();
	}
	
	@Test(priority = 49)
	public void CCP_AddMultipleAttachments() throws InterruptedException {
		ccp.CCP_AddMultipleAttachments();
	}
	
	@Test(priority = 50)
	public void CCP_OpenAttachmentsDetailsPopup() throws InterruptedException {
		ccp.CCP_OpenAttachmentsDetailsPopup();
	}
	
	@Test(priority = 51)
	public void CCP_UpdateAttachmentDetails() throws InterruptedException {
		ccp.CCP_UpdateAttachmentDetails();
	}
	
	@Test(priority = 52)
	public void CCP_DeleteAnAttachment() throws InterruptedException {
		ccp.CCP_DeleteAnAttachment();
	}
	
	@Test(priority = 53)
	public void CCP_VerifyTotalAttachmentsCount() throws InterruptedException {
		ccp.CCP_VerifyTotalAttachmentsCount();
	}
	
	@Test(priority = 53)
	public void CCP_OpenCreateCasePopup() throws InterruptedException {
		ccp.CCP_OpenCreateCasePopup();
	}
	
	@Test(priority = 54)
	public void CCP_VerifyCreateAndScheduleInspectionButton() throws InterruptedException {
		ccp.CCP_VerifyCreateAndScheduleInspectionButton();
	}
	
	@Test(priority = 55)
	public void CCP_VerifyNextInspectionSectionState() throws InterruptedException {
		ccp.CCP_VerifyNextInspectionSectionState();
	}
	
	@Test(priority = 56)
	public void CCP_VerifyCaseCreation() throws InterruptedException {
		ccp.CCP_VerifyCaseCreation();
	}
	
	@Test(priority = 57)
	public void CCP_CDP_CountVerifications() throws InterruptedException {
		ccp.CCP_CDP_CountVerifications();
	}
	
	@Test(priority = 58)
	public void CCP_CaseCreationWithMultipleViolationSameEntity() throws InterruptedException {
		ccp.CCP_CaseCreationWithMultipleViolationSameEntity();
	}
	
	@Test(priority = 59)
	public void CCP_SearchCaseAndNavigatetoCDP() throws InterruptedException {
		ccp.CCP_SearchCaseAndNavigatetoCDP();
	}

}
