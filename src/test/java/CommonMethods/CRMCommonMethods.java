package CommonMethods;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import POM.CaseAssignmentUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowsersBase.BrowsersInvoked;
import BrowsersBase.BrowsersInvoked;
import POM.CSDPUtility;
import POM.CSPExternalUtility;
import POM.CSPInternalUtility;
import POM.CaseAssignmentUtility;
import POM.AppPreRequisiteUtility;
import POM.NotificationManagementUtility;
import POM.SLAUtility;
import POM.TemplateManagementUtility;
import POM.CategoryUtility;
import POM.NoticesUtility;

public class CRMCommonMethods {

	public WebDriver driver;
	public Helper helper;
	public CSPExternalUtility cspExternal;

	public CRMCommonMethods(WebDriver driver) {
		this.driver = driver;
		helper = new Helper(driver);
		cspExternal = new CSPExternalUtility(driver);

	}

	public String searchLocationKey1O = PropertiesUtils.getPropertyValue("searchLocationKey1O");
	public String searchLocationKey = PropertiesUtils.getPropertyValue("searchLocationKey");

	public void searchLocationCSP(String Address) throws InterruptedException {
		helper.WaitForElementInteractable(CSPInternalUtility.LocationField);
		helper.SendKeys(CSPInternalUtility.LocationField, Address);
		helper.waitForPresenceandVisiblity(CSPInternalUtility.LocationSearchResult);
		helper.WaitForElementInteractable(CSPInternalUtility.LocationSearchResult);
		helper.ClickOn(CSPInternalUtility.LocationSearchResult);
		helper.WaitForCurserRunning(5);

	}

	public void NavigationTo_CSP() throws InterruptedException {
		helper.waitForPresenceandVisiblity(CSPInternalUtility.PlusIconToCRM);
		helper.WaitForElementInteractable(CSPInternalUtility.PlusIconToCRM);
		helper.ClickOn(CSPInternalUtility.PlusIconToCRM);
		helper.ClickOn(CSPInternalUtility.CustomerSubmissionOption);
		helper.WaitForCurserRunning(2);
		helper.waitForPresenceandVisiblity(CSPInternalUtility.CSPPopupTitle);
		helper.waitForPresenceandVisiblity(CSPInternalUtility.CreateSubmissionButton);
		helper.WaitForElementInteractable(CSPInternalUtility.CreateSubmissionButton);
	}

	public void searchLocationExternalCS(String Address) throws InterruptedException {
		helper.WaitForElementInteractable(CSPExternalUtility.LocationSearchField);
		helper.ClickOn(CSPExternalUtility.LocationSearchField);
		helper.SendKeys(CSPExternalUtility.LocationSearchField, Address);
		helper.waitForPresenceandVisiblity(CSPExternalUtility.LocationSearchResult);
		helper.WaitForElementInteractable(CSPExternalUtility.LocationSearchResult);
		helper.ClickOn(CSPExternalUtility.LocationSearchResult);
		helper.WaitForCurserRunning(5);

	}

	public void CreationOf50PlusSubmissions() throws InterruptedException {

		for (int i = 0; i <= 50; i++) {
			CRM_CreateSubmission("No", "Yes", "Yes", "Yes", "Yes", "Location Required");

		}
	}

	public void CRM_CreateSubmission(String Anonymous, String Customer, String Tags, String Location, String Attachment,
			String CategoryName) throws InterruptedException {
		driver.navigate().to(BrowsersInvoked.URLCreateCustomerSubmission);
		helper.WaitForCurserRunning(5);
		helper.waitForPresenceandVisiblity(CSPInternalUtility.CategoryDropdown);
		helper.ScrollIntoView(CSPInternalUtility.CategoryDropdown);
		helper.WaitForElementInteractable(CSPInternalUtility.CategoryDropdown);
		helper.ClickByJsExecuter(CSPInternalUtility.CategoryDropdown);
		helper.WaitForElementInteractable(CSPInternalUtility.SearchCategory);
		helper.SendKeys(CSPInternalUtility.SearchCategory, CategoryName);
		helper.WaitForElementInteractable(CSPInternalUtility.SearchResultsCategory);
		helper.ClickOn(CSPInternalUtility.SearchResultsCategory);
		String RandomDescription = RandomStrings.RequiredString(20);
		helper.SendKeys(CSPInternalUtility.IssueDescriptionField, RandomDescription);

		if (Anonymous == "Yes") {
			JavascriptExecutor jser = (JavascriptExecutor) driver;
			WebElement PostAnonymouslyCheckbox = (WebElement) jser
					.executeScript("return document.querySelector('div > div:nth-child(2) > span > input')");
			PostAnonymouslyCheckbox.click();

		}
		if (Customer == "Yes") {
			helper.SendKeys(CSPInternalUtility.AddExistingCustomerField, "a");

			helper.ClickOn(CSPInternalUtility.ContactSearchResults);
			if (helper.GetValueAttribute(CellPhoneField).isEmpty()) {
				helper.SendKeys(CSPInternalUtility.CellPhoneField, "12057547399");
			}
			int Emailcheck = driver
					.findElements(By.xpath(
							"//button[@class='square-btn preference-selected-button btn btn-primary'][text()='Email']"))
					.size();
			int Textcheck = driver.findElements(By.xpath(
					"//button[@class='square-btn preference-selected-button btn btn-primary'][text()='Text Message']"))
					.size();

			if (Emailcheck == 0) {
				helper.ClickOn(By.xpath("//button[contains(text(),'Email')]"));

			}
			if (Textcheck == 0) {
				helper.ClickOn(By.xpath("//button[text()='Text Message']"));

			}

		}
		if (Tags == "Yes") {
			for (int i = 0; i < 5; i++) {
				String RandomTags = RandomStrings.RequiredString(4);
				helper.SendKeys(CSPInternalUtility.TagsField, RandomTags + ",");
			}
		}
		if (Location == "Yes") {

			if (BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect1o)
					|| BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect2o)) {
				serachLocationCCP(searchLocationKey1O);
			} else {
				serachLocationCCP(searchLocationKey);
			}
			helper.waitForPresenceandVisiblity(CSPInternalUtility.FlagToggle);
			if (helper.ElementIsDisplayed(CSPInternalUtility.ToggleChecked)) {
				helper.ClickOn(CSPInternalUtility.FlagToggle);
				int flagCheck = helper.fineElementsSize(By.xpath("//textarea[@name='reasonForFlagging']"));
				if (flagCheck > 0) {
					helper.SendKeys(By.xpath("//textarea[@name='reasonForFlagging']"), "Unflagged");
					helper.WaitForElementInteractable(By.xpath("//button[text()='Unflag address']"));
					helper.ClickOn(By.xpath("//button[text()='Unflag address']"));
					helper.WaitForCurserRunning(5);
					helper.waitForPresenceandVisiblity(CSPInternalUtility.AttachmentIcon);

				}

			}

		}
		if (Attachment == "Yes") {
			helper.ClickOn(CSPInternalUtility.AttachmentIcon);
			WebElement UploadFile3 = driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
			helper.ClickOn(CSPInternalUtility.AddButton);
			helper.WaitUntilElementInvisible(CSPInternalUtility.AddButton);

		}

		helper.waitForPresenceandVisiblity(CSPInternalUtility.CreateSubmissionButton);
		helper.WaitUntilPresent(CSPInternalUtility.CreateSubmissionButton);
		helper.ScrollIntoView(CSPInternalUtility.CreateSubmissionButton);
		helper.ClickOn(CSPInternalUtility.CreateSubmissionButton);
		helper.WaitUntilElementInvisible(CSPInternalUtility.CreateSubmissionButton);

		helper.WaitForCurserRunning(5);
		List<WebElement> DuplicateSubsPopup = driver.findElements(CSDPUtility.PossibleDuplicateSubmissionsPopup);
		if (DuplicateSubsPopup.size() == 1) {
			helper.ScrollIntoView(CSDPUtility.SubmitAnywayButton);
			helper.WaitForElementInteractable(CSDPUtility.SubmitAnywayButton);
			helper.ClickOn(CSDPUtility.SubmitAnywayButton);
			helper.WaitForCurserRunning(4);

		}

	}

	public void CRM_CreateSubmissionPreRequisite(String Anonymous, String Customer, String Tags, String Location,
			String Attachment, String CategoryName) throws InterruptedException {

		int CheckCancel = driver.findElements(CSPInternalUtility.CancelCreateCase).size();
		if (CheckCancel > 0) {
			helper.ScrollIntoView(CSPInternalUtility.CancelCreateCase);
			helper.ClickOn(CSPInternalUtility.CancelCreateCase);

		}

		int CancelSubmission = driver.findElements(CSPInternalUtility.CloseSubmissionIcon).size();
		if (CancelSubmission > 0) {
			helper.ScrollIntoView(CSPInternalUtility.CloseSubmissionIcon);
			helper.ClickOn(CSPInternalUtility.CloseSubmissionIcon);

		}

		helper.waitForPresenceandVisiblity(CSPInternalUtility.PlusIconToCRM);
		helper.ScrollIntoView(CSPInternalUtility.PlusIconToCRM);
		helper.WaitForElementInteractable(CSPInternalUtility.PlusIconToCRM);
		helper.ClickByJsExecuter(CSPInternalUtility.PlusIconToCRM);
		helper.WaitForElementInteractable(CSPInternalUtility.CustomerSubmissionOption);
		helper.ClickByJsExecuter(CSPInternalUtility.CustomerSubmissionOption);
		helper.WaitForCurserRunning(2);
		helper.waitForPresenceandVisiblity(CSPInternalUtility.CategoryDropdown);
		helper.ScrollIntoView(CSPInternalUtility.CategoryDropdown);
		helper.WaitUntilPresent(CSPInternalUtility.CategoryDropdown);
		helper.WaitForElementInteractable(CSPInternalUtility.CategoryDropdown);
		helper.ClickByJsExecuter(CSPInternalUtility.CategoryDropdown);
		helper.WaitForElementInteractable(CSPInternalUtility.SearchCategory);
		helper.SendKeys(CSPInternalUtility.SearchCategory, CategoryName);
		helper.waitForPresenceandVisiblity(CSPInternalUtility.SearchResultsCategory);
		helper.ClickByJsExecuter(CSPInternalUtility.SearchResultsCategory);
		String RandomDescription = RandomStrings.RequiredString(20);
		helper.SendKeys(CSPInternalUtility.IssueDescriptionField, RandomDescription);

		if (Anonymous == "Yes") {
			JavascriptExecutor jser = (JavascriptExecutor) driver;
			WebElement PostAnonymouslyCheckbox = (WebElement) jser
					.executeScript("return document.querySelector('div > div:nth-child(2) > span > input')");
			PostAnonymouslyCheckbox.click();

		}
		if (Customer == "Yes") {
			helper.SendKeys(CSPInternalUtility.AddExistingCustomerField,
					PropertiesUtils.getPropertyValue("crmCustomerName"));
			if (PropertiesUtils.getPropertyValue("RunEnvironment").equalsIgnoreCase("stage")) {
				helper.WaitForElementInteractable(By.xpath("(//div[@class='list-label']//b)[1]"));
				helper.ClickOn(By.xpath("(//div[@class='list-label']//b)[1]"));
			} else {
				helper.WaitForElementInteractable(By.xpath("//div[contains(text(),'automationcomcate')]"));
				helper.ClickOn(By.xpath("//div[contains(text(),'automationcomcate')]"));
			}
			if (helper.GetValueAttribute(CellPhoneField).isEmpty())
				helper.SendKeys(CSPInternalUtility.CellPhoneField, "12057547399");

		}
		if (Tags == "Yes") {
			for (int i = 0; i < 5; i++) {
				String RandomTags = RandomStrings.RequiredString(4);
				helper.SendKeys(CSPInternalUtility.TagsField, RandomTags + ",");
			}
		}
		if (Location == "Yes") {
			if (BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect1o)) {
				searchLocationCSP(searchLocationKey1O);
			} else {
				searchLocationCSP(searchLocationKey);
			}
			helper.waitForPresenceandVisiblity(CSPInternalUtility.FlagToggle);
			if (helper.ElementIsDisplayed(CSPInternalUtility.ToggleChecked)) {
				helper.ClickOn(CSPInternalUtility.FlagToggle);
				int flagCheck = helper.fineElementsSize(By.xpath("//textarea[@name='reasonForFlagging']"));
				if (flagCheck > 0) {
					helper.SendKeys(By.xpath("//textarea[@name='reasonForFlagging']"), "Unflagged");
					helper.WaitForElementInteractable(By.xpath("//button[text()='Unflag address']"));
					helper.ClickOn(By.xpath("//button[text()='Unflag address']"));
					helper.WaitForCurserRunning(5);
					helper.waitForPresenceandVisiblity(CSPInternalUtility.AttachmentIcon);

				}
			}
		}
		if (Attachment == "Yes") {
			helper.waitForPresenceandVisiblity(CSPInternalUtility.AttachmentIcon);
			helper.WaitForElementInteractable(CSPInternalUtility.AttachmentIcon);
			helper.ClickOn(CSPInternalUtility.AttachmentIcon);
			WebElement UploadFile3 = driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
			helper.WaitForCurserRunning(5);
			helper.WaitForElementInteractable(CSPInternalUtility.AddButton);
			helper.ClickOn(CSPInternalUtility.AddButton);
			helper.WaitForCurserRunning(4);
		}

		helper.waitForPresenceandVisiblity(CSPInternalUtility.CreateSubmissionButton);
		helper.ScrollIntoView(CSPInternalUtility.CreateSubmissionButton);
		helper.WaitUntilPresent(CSPInternalUtility.CreateSubmissionButton);
		helper.WaitForElementInteractable(CSPInternalUtility.CreateSubmissionButton);
		helper.ClickByJsExecuter(CSPInternalUtility.CreateSubmissionButton);
		helper.WaitForCurserRunning(5);
		List<WebElement> DuplicateSubsPopup = driver.findElements(CSDPUtility.PossibleDuplicateSubmissionsPopup);
		if (DuplicateSubsPopup.size() == 1) {
			helper.ClickOn(CSDPUtility.SubmitAnywayButton);
		}

	}

	public void CRM_CreateCategory(String Checkbox, String IncludeLoc, String Keywords, String CategoryName)
			throws InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLCategories);
		helper.WaitForCurserRunning(5);
		helper.waitForPresenceandVisiblity(CategoryUtility.CreateCategoryButton);
		helper.scrollToRight();
		helper.WaitForElementInteractable(CategoryUtility.CreateCategoryButton);
		helper.ClickByJsExecuter(CategoryUtility.CreateCategoryButton);

		if (Checkbox == "Yes") {
			helper.ClickOn(CategoryUtility.LocationRequiredCheckbox);
		}
		if (IncludeLoc == "No") {
			helper.ClickOn(CategoryUtility.NoLocationToggle);
		}
		if (Keywords == "Yes") {
			WebElement AddKeywordsField = helper.findElement(CategoryUtility.KeywordsField);
			for (int i = 0; i < 10; i++) {
				String RandomKeyword = RandomStrings.RequiredCharacters(4);
				AddKeywordsField.sendKeys(RandomKeyword);
				AddKeywordsField.sendKeys(Keys.SPACE);
			}
		}
		helper.waitForPresenceandVisiblity(CategoryUtility.NameField);
		helper.WaitForElementInteractable(CategoryUtility.NameField);
		helper.SendKeys(CategoryUtility.NameField, CategoryName);
		helper.ClickOn(CategoryUtility.CreateCategoryPopupBtn);
		List<WebElement> ExistsOrNot = driver.findElements(CategoryUtility.NotificationMsg);
		if (ExistsOrNot.size() == 1) {
			helper.ClickOn(CategoryUtility.CancelButton);
		}

	}

	public void CRM_CreateCategoryAppPrerequisute(String Checkbox, String IncludeLoc, String Keywords,
			String CategoryName) throws InterruptedException {

		helper.waitForPresenceandVisiblity(CategoryUtility.CreateCategoryButton);
		helper.scrollToRight();
		helper.ScrollIntoView(CategoryUtility.CreateCategoryButton);
		helper.WaitForElementInteractable(CategoryUtility.CreateCategoryButton);
		helper.ClickByJsExecuter(CategoryUtility.CreateCategoryButton);
		helper.waitForPresenceandVisiblity(CategoryUtility.LocationRequiredCheckbox);
		if (Checkbox == "Yes") {
			helper.ClickOn(CategoryUtility.LocationRequiredCheckbox);
		}
		if (IncludeLoc == "No") {
			helper.ClickOn(CategoryUtility.NoLocationToggle);
		}
		if (Keywords == "Yes") {
			WebElement AddKeywordsField = helper.findElement(CategoryUtility.KeywordsField);
			for (int i = 0; i < 10; i++) {
				String RandomKeyword = RandomStrings.RequiredCharacters(4);
				AddKeywordsField.sendKeys(RandomKeyword);
				AddKeywordsField.sendKeys(Keys.SPACE);
			}
		}
		helper.WaitForElementInteractable(CategoryUtility.NameField);
		helper.SendKeys(CategoryUtility.NameField, CategoryName);
		helper.waitForPresenceandVisiblity(CategoryUtility.CreateCategoryPopupBtn);
		helper.ClickOn(CategoryUtility.CreateCategoryPopupBtn);
		List<WebElement> ExistsOrNot = driver.findElements(CategoryUtility.NotificationMsg);
		if (ExistsOrNot.size() == 1) {
			helper.ClickOn(CategoryUtility.CancelButton);
		}
		helper.WaitForCurserRunning(5);
		helper.waitForPresenceandVisiblity(CategoryUtility.CreateCategoryButton);
	}

	public void CRM_CreateExternalSubmission(String Attachment, String Category, String Anonymous, String Contact)
			throws InterruptedException {
		cspExternal.CSPExternal_PreRequisite_OpenReportAnIssuePage();
		String RandomDescription = RandomStrings.RequiredString(50);
		helper.SendKeys(CSPExternalUtility.IssueDescriptionField, RandomDescription);
		if (Attachment == "Yes") {

			WebElement UploadFile = driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");

		}
		helper.waitForPresenceandVisiblity(CSPExternalUtility.NextButton);
		helper.ScrollIntoView(CSPExternalUtility.NextButton);
		helper.WaitForElementInteractable(CSPExternalUtility.NextButton);
		helper.ClickByJsExecuter(CSPExternalUtility.NextButton);
		if (Category == "Location Not Included") {
			String CategorySelected = helper.GetText(CSPExternalUtility.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Included");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = driver.findElements(CSPExternalUtility.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Included")) {
						AllCategories.click();
						break;
					}
				}
			}
		} else if (Category == "Location Required") {
			String CategorySelected = helper.GetText(CSPExternalUtility.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = driver.findElements(CSPExternalUtility.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Required")) {
						AllCategories.click();
						break;
					}
				}
			}
			helper.WaitForElementInteractable(CSPExternalUtility.LocationSearchField);
			helper.ClickOn(CSPExternalUtility.LocationSearchField);
			helper.SendKeys(CSPExternalUtility.LocationSearchField, "Texas City Museum");
			helper.ClickOn(CSPExternalUtility.LocationSearchResult);
		} else if (Category == "Location Not Required") {
			String CategorySelected = helper.GetText(CSPExternalUtility.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = driver.findElements(CSPExternalUtility.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Required")) {
						AllCategories.click();
						break;
					}
				}
			}
		}
		helper.waitForPresenceandVisiblity(CSPExternalUtility.NextButtonSec2);
		helper.ScrollIntoView(CSPExternalUtility.NextButtonSec2);
		helper.WaitForElementInteractable(CSPExternalUtility.NextButtonSec2);
		helper.ClickByJsExecuter(CSPExternalUtility.NextButtonSec2);

		helper.waitForPresenceandVisiblity(CSPExternalUtility.NextButtonSec3);
		helper.ScrollIntoView(CSPExternalUtility.NextButtonSec3);
		helper.WaitForElementInteractable(CSPExternalUtility.NextButtonSec3);
		helper.ClickByJsExecuter(CSPExternalUtility.NextButtonSec3);

		if (Anonymous == "Yes") {
			helper.WaitUntilVisible(CSPExternalUtility.YesButton);
			helper.ScrollIntoView(CSPExternalUtility.YesButton);
			helper.WaitForElementInteractable(CSPExternalUtility.YesButton);
			helper.ClickByJsExecuter(CSPExternalUtility.YesButton);

			helper.WaitUntilVisible(CSPExternalUtility.SubmitButton);
			helper.ScrollIntoView(CSPExternalUtility.SubmitButton);
			helper.WaitForElementInteractable(CSPExternalUtility.SubmitButton);
			helper.ClickByJsExecuter(CSPExternalUtility.SubmitButton);
			helper.ClickOn(CSPExternalUtility.SubmitButton);
		}

		if (Contact == "Yes") {

			helper.waitForPresenceandVisiblity(CSPExternalUtility.EmailPreferenceButton);
			helper.ScrollIntoView(CSPExternalUtility.TextMsgPreferenceButton);
			helper.WaitForElementInteractable(CSPExternalUtility.EmailPreferenceButton);
			helper.ClickByJsExecuter(CSPExternalUtility.EmailPreferenceButton);
			helper.ScrollIntoView(CSPExternalUtility.TextMsgPreferenceButton);
			helper.WaitForElementInteractable(CSPExternalUtility.TextMsgPreferenceButton);
			helper.ClickByJsExecuter(CSPExternalUtility.TextMsgPreferenceButton);
			String RandomFirstName = RandomStrings.RequiredCharacters(6);
			String RandomLastName = RandomStrings.RequiredCharacters(6);
			helper.SendKeys(CSPExternalUtility.FirstNameField, RandomFirstName);
			helper.SendKeys(CSPExternalUtility.LastNameField, RandomLastName);
			helper.SendKeys(CSPExternalUtility.EmailField, "automationcomcate@gmail.com");
			helper.SendKeys(CSPExternalUtility.MobileNumberField, "+12057547399");
		}

		helper.waitForPresenceandVisiblity(By.cssSelector("div.actions button.btn-primary"));
		helper.ScrollIntoView(By.cssSelector("div.actions button.btn-primary"));
		helper.forcedWaitTime(2);
		helper.WaitForElementInteractable(By.cssSelector("div.actions button.btn-primary"));
		helper.ClickByJsExecuter(By.cssSelector("div.actions button.btn-primary"));
	}

	public void CRM_CreateExternalSubmissionWithoutLogin(String Attachment, String Category, String Anonymous,
			String Contact) throws InterruptedException {
		cspExternal.CSPExternal_PreRequisite_OpenReportAnIssuePageNOLogin();
		String RandomDescription = RandomStrings.RequiredString(50);
		helper.SendKeys(CSPExternalUtility.IssueDescriptionField, RandomDescription);
		if (Attachment == "Yes") {
			WebElement UploadFile = driver.findElement(By.xpath("//input[@type='file']"));
			UploadFile.sendKeys(System.getProperty("user.dir") + "/TestData/Panda_11zon.jpg");

		}

		helper.ClickOn(CSPExternalUtility.NextButton);

		if (Category == "Location Not Included") {

			String CategorySelected = helper.GetText(CSPExternalUtility.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Included");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = driver.findElements(CSPExternalUtility.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Included")) {
						AllCategories.click();
						break;
					}
				}
			}
		} else if (Category == "Location Required") {

			String CategorySelected = helper.GetText(CSPExternalUtility.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = driver.findElements(CSPExternalUtility.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Required")) {
						AllCategories.click();
						break;
					}
				}
			}
			helper.WaitForElementInteractable(CSPExternalUtility.LocationSearchField);
			helper.ClickOn(CSPExternalUtility.LocationSearchField);
			helper.SendKeys(CSPExternalUtility.LocationSearchField, "Texas City Museum");
			helper.ClickOn(CSPExternalUtility.LocationSearchResult);
		} else if (Category == "Location Not Required") {
			helper.waitForPresenceandVisiblity(CSPExternalUtility.SelectedCategory);
			String CategorySelected = helper.GetText(CSPExternalUtility.SelectedCategory);
			boolean CompareSelCategory = CategorySelected.equals("Location Not Required");
			if (!CompareSelCategory) {
				List<WebElement> CountCategories = driver.findElements(CSPExternalUtility.OtherCategories);
				for (int i = 0; i < CountCategories.size(); i++) {
					WebElement AllCategories = CountCategories.get(i);
					String CategoriesText = AllCategories.getText();
					if (CategoriesText.equals("Location Not Required")) {
						AllCategories.click();
						break;
					}
				}
			}
		}
		helper.WaitForElementInteractable(CSPExternalUtility.NextButtonSec2);
		helper.ClickOn(CSPExternalUtility.NextButtonSec2);
		helper.WaitForElementInteractable(CSPExternalUtility.NextButtonSec3);
		helper.ClickOn(CSPExternalUtility.NextButtonSec3);

		if (Anonymous == "Yes") {
			helper.WaitForElementInteractable(CSPExternalUtility.YesButton);
			helper.ClickOn(CSPExternalUtility.YesButton);
			helper.ClickOn(CSPExternalUtility.SubmitButton);
		}

		if (Contact == "Yes") {
			helper.waitForPresenceandVisiblity(CSPExternalUtility.EmailPreferenceButton);
			helper.ScrollIntoView(CSPExternalUtility.EmailPreferenceButton);
			helper.ClickOn(CSPExternalUtility.EmailPreferenceButton);
			helper.WaitForElementInteractable(CSPExternalUtility.FirstNameField);
			String RandomFirstName = RandomStrings.RequiredCharacters(6);
			String RandomLastName = RandomStrings.RequiredCharacters(6);
			helper.SendKeys(CSPExternalUtility.FirstNameField, RandomFirstName);
			helper.SendKeys(CSPExternalUtility.LastNameField, RandomLastName);
			helper.SendKeys(CSPExternalUtility.EmailField, "automationcomcate@gmail.com");
			helper.SendKeys(CSPExternalUtility.MobileNumberField, "+12057547399");
		}
		helper.ClickOn(CSPExternalUtility.SubmitButton);

	}

	public By LocationSearchField = By.xpath("//div[@class='location-tile__inputs-container']//input");
	public By LocationSearchResult = By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']");
	public By CCPOption = By.xpath("//label[text()='Code Enforcement Case']");
	public By CustomIssueIcon = By.xpath("(//div/i[@class='react-autosuggest__add-icon'])[2]");
	public By ViolationSearchBox = By.xpath("//div[@id='violation-tile']//input");
	public By ViolationsList = By.xpath("//div[@class='react-autosuggest__suggestion-element']/div");
	public By AddContactField = By.xpath("//div[@class='contact-tile tile']//input");
	public By CreateNewContact = By
			.xpath("//div[@class='contact-tile tile']//div[@class='react-autosuggest__function']");
	public By NameField = By.xpath("//input[@name='name']");
	public By EmailField = By.xpath("//input[@name='email']");
	public By WorkPhoneField = By.xpath("//input[@name='workPhone']");
	public By CellPhoneField = By.xpath("//input[@name='phoneNumber']");
	public By CreateContactBtn = By.xpath("(//div[@class='full-page-modal__header']//button[2])[2]");
	public By PropertyOwnerOption = By.xpath("//span/label[text()='Property Owner']");
	public By ApplyButton = By.xpath("//button[text()='Apply']");
	public By AddButton = By.xpath("//div[@class='attachments-modal__footer']/button[2]");
	public By CreateCaseButton = By.xpath("//div/button[text()='Create Case']");
	public By AssignCaseTo = By.xpath("//h5[text()='Assign Case To']//parent::div//button");
	public By InspectionAssigneeTo = By.xpath("//h5[text()='Assign Inspection To']//parent::div//button");
	public By CreateScheduleInspectionButton = By.xpath("//div[@class='modal-footer']//button[2]");
	public By CloseCDPIcon = By.xpath("//div[@class='case-details__close-icon']");
	public By AnimalColourField = By.xpath("//input[@name='Animal Colour']");
	public By AddanotherAnimalLinkText = By.xpath("//a[text()='Add another Animal']");
	public By AddButtonViolation = By.xpath("//button[text()='Add']");
	public By YesBtnConfirmationPopup = By.xpath("//div[@class='flex-row--center']/button[text()='Yes']");
	public By FooterButton = By.xpath("//div[@class='footer_actions']/button");
	public By InvalidVioToggle = By.xpath("//div[@class='multi-choice-buttons']/button[text()='Invalid']");
	public By PerformInsButton = By.xpath("//button[text()='Perform Inspection']");
//	public  By  = By.xpath("");

	public void CE_CreateACase() throws InterruptedException {

		JavascriptExecutor jser = (JavascriptExecutor) driver;
		WebElement CCPBtnJSE = (WebElement) jser.executeScript(
				"return document.querySelector('#header > div.app-header__right > div:nth-child(2) > div.app-header__new')");

		helper.ClickOnWE20(CCPBtnJSE);
		helper.ClickOn(CCPOption);
		helper.WaitForCurserRunning(8);
		helper.waitForPresenceandVisiblity(CreateCaseButton);

		CE_AddLocation();
		CE_AddViolation();
		CE_AddContact();
		helper.waitForPresenceandVisiblity(CreateCaseButton);
		helper.WaitForElementInteractable(CreateCaseButton);
		helper.ClickOn(CreateCaseButton);
		helper.waitForPresenceandVisiblity(AssignCaseTo);
		helper.WaitforCustometime(2);
		helper.WaitForElementInteractable(AssignCaseTo);
		helper.ClickOn(AssignCaseTo);
		helper.WaitForElementInteractable(InspectionAssigneeTo);
		helper.ClickOn(InspectionAssigneeTo);
		helper.WaitForElementInteractable(CreateScheduleInspectionButton);
		helper.ClickOn(CreateScheduleInspectionButton);
		helper.WaitForCurserRunning(5);

	}

	public void CE_AddAttachment() throws InterruptedException {
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		WebElement AttachmentIcon = (WebElement) jser
				.executeScript("return document.querySelector('div.tile-header-container > div > h2 > button')");
		AttachmentIcon.click();
		WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile4.sendKeys(System.getProperty("user.dir") + "/TestData/Jellyfish_11zon.jpg");
		helper.ClickOn(AddButton);

	}

	public void serachLocationCCP(String Address) throws InterruptedException {
		helper.WaitForElementInteractable(LocationSearchField);
		helper.SendKeys(LocationSearchField, Address);
		helper.waitForPresenceandVisiblity(LocationSearchResult);
		helper.WaitForElementInteractable(LocationSearchResult);
		helper.ClickOn(LocationSearchResult);

	}

	public void CE_AddLocation() throws InterruptedException {

		if (BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect1o)
				|| BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect2o)) {
			serachLocationCCP(searchLocationKey1O);
		} else {
			serachLocationCCP(searchLocationKey);
		}

	}

	public void CE_AddViolation() throws InterruptedException {

		helper.WaitForElementInteractable(ViolationSearchBox);
		helper.ClickOn(ViolationSearchBox);
		helper.WaitForElementInteractable(ViolationSearchBox);
		helper.SendKeys(ViolationSearchBox, "Wa");
		helper.waitForPresenceandVisiblity(ViolationsList);
		helper.WaitForElementInteractable(ViolationsList);
		helper.ClickOn(ViolationsList);
	}

	public void CE_AddContact() throws InterruptedException {

		helper.waitForPresenceandVisiblity(AddContactField);
		helper.WaitForElementInteractable(AddContactField);
		helper.ClickOn(AddContactField);
		helper.ClickOn(CreateNewContact);
		String RandomName = RandomStrings.RequiredCharacters(8);
		String RandomMail = RandomName + "@yopmail.com";
		String RandomContact = RandomStrings.RequiredDigits(10);
		helper.SendKeys(NameField, RandomName);
		helper.SendKeys(EmailField, RandomMail);
		helper.SendKeys(WorkPhoneField, RandomContact);
		helper.WaitForElementInteractable(CreateContactBtn);
		helper.ClickOn(CreateContactBtn);
		helper.waitForPresenceandVisiblity(PropertyOwnerOption);
		helper.WaitForElementInteractable(PropertyOwnerOption);
		helper.ClickOn(PropertyOwnerOption);
		helper.ClickOn(ApplyButton);
		helper.WaitForCurserRunning(4);

	}

	public void CE_CloseCaseOnCDP() throws InterruptedException {

		helper.waitForPresenceandVisiblity(PerformInsButton);
		helper.WaitForElementInteractable(PerformInsButton);
		helper.ClickOn(PerformInsButton);
		helper.WaitForElementInteractable(InvalidVioToggle);
		helper.ClickOn(InvalidVioToggle);
		helper.WaitForElementInteractable(FooterButton);
		helper.ClickOn(FooterButton);
		helper.WaitForElementInteractable(YesBtnConfirmationPopup);
		helper.ClickOn(YesBtnConfirmationPopup);

	}

	public void NavigateTo_AgencySetup() throws InterruptedException {
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.AppMenuIcon);
		helper.WaitForElementInteractable(AppPreRequisiteUtility.AppMenuIcon);
		helper.ScrollIntoView(AppPreRequisiteUtility.AppMenuIcon);
		helper.ClickByJsExecuter(AppPreRequisiteUtility.AppMenuIcon);

		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.AgencySetUpIconLbl);
		helper.ScrollIntoView(AppPreRequisiteUtility.AgencySetUpIconLbl);
		helper.WaitForElementInteractable(AppPreRequisiteUtility.AgencySetUpIconLbl);
		helper.ClickByJsExecuter(AppPreRequisiteUtility.AgencySetUpIconLbl);

		helper.WaitForCurserRunning(10);
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.AuditTrial);
		helper.ScrollIntoView(AppPreRequisiteUtility.AuditTrial);
	}

	public void NavigationTo_NoticesUtility() throws InterruptedException {
		NavigateTo_AgencySetup();
		helper.waitForPresenceandVisiblity(By.xpath("//label[text()='Change Logo']"));
		helper.WaitForElementInteractable(By.xpath("//label[text()='Change Logo']"));
		helper.forcedWaitTime(2);
		if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("STAGE")) {
			helper.waitForPresenceandVisiblity(NoticesUtility.CE);
			helper.ScrollIntoView(NoticesUtility.CE);
			helper.WaitUntilVisible(NoticesUtility.CE);
			helper.WaitForElementInteractable(NoticesUtility.CE);
			helper.WaitForElementInteractable(NoticesUtility.CE);
			helper.ClickByJsExecuter(NoticesUtility.CE);
		} else {
			int ceSize = driver.findElements(NoticesUtility.CE).size();
			int ProductDemoSize = driver.findElements(NoticesUtility.ProductDemo).size();
			if (ceSize > 0) {
				helper.waitForPresenceandVisiblity(NoticesUtility.CE);
				helper.ScrollIntoView(NoticesUtility.CE);
				helper.WaitUntilPresent(NoticesUtility.CE);
				helper.WaitForElementInteractable(NoticesUtility.CE);
				helper.ClickByJsExecuter(NoticesUtility.CE);
			} else if (ProductDemoSize > 0) {
				helper.waitForPresenceandVisiblity(NoticesUtility.ProductDemo);
				helper.ScrollIntoView(NoticesUtility.ProductDemo);
				helper.WaitUntilPresent(NoticesUtility.ProductDemo);
				helper.WaitForElementInteractable(NoticesUtility.ProductDemo);
				helper.ClickByJsExecuter(NoticesUtility.ProductDemo);
			}

		}
		helper.waitForPresenceandVisiblity(NoticesUtility.NoticesPageLink);
		helper.ScrollIntoView(NoticesUtility.NoticesPageLink);
		helper.WaitForElementInteractable(NoticesUtility.NoticesPageLink);
		helper.ClickByJsExecuter(NoticesUtility.NoticesPageLink);
		helper.WaitforCustometime(3);
		helper.ScrollIntoView(NoticesUtility.AppHeaderIcon);
		helper.waitForPresenceandVisiblity(NoticesUtility.ActiveTab);
	}

	public void NavigateTo_Fines() throws InterruptedException {
		helper.ScrollIntoView(AppPreRequisiteUtility.CEProdSideBar);
		if (!driver.findElement(AppPreRequisiteUtility.FinesSideBar).isDisplayed()) {
			helper.WaitUntilVisible(AppPreRequisiteUtility.CEProdSideBar);
			helper.ScrollIntoView(AppPreRequisiteUtility.CEProdSideBar);
			helper.WaitForElementInteractable(AppPreRequisiteUtility.CEProdSideBar);
			helper.WaitForElementInteractable(AppPreRequisiteUtility.CEProdSideBar);
			helper.ClickByJsExecuter(AppPreRequisiteUtility.CEProdSideBar);

		}
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.FinesSideBar);
		helper.ScrollIntoView(AppPreRequisiteUtility.FinesSideBar);
		helper.WaitForElementInteractable(AppPreRequisiteUtility.FinesSideBar);
		helper.ClickByJsExecuter(AppPreRequisiteUtility.FinesSideBar);
		helper.WaitForCurserRunning(4);
		helper.WaitforCustometime(3);
		helper.scrolltoUp();

	}

	public void NavigateTo_LateFeesSubTab() throws InterruptedException {

		helper.ScrollIntoView(AppPreRequisiteUtility.CEProdSideBar);
		if (!driver.findElement(AppPreRequisiteUtility.FinesSideBar).isDisplayed()) {
			helper.ClickOn(AppPreRequisiteUtility.CEProdSideBar);

		}
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.FinesSideBar);
		helper.ScrollIntoView(AppPreRequisiteUtility.FinesSideBar);
		helper.WaitForElementInteractable(AppPreRequisiteUtility.FinesSideBar);
		helper.ClickByJsExecuter(AppPreRequisiteUtility.FinesSideBar);
		helper.WaitForCurserRunning(4);
		helper.scrolltoUp();
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.LateFeeSubtab);
		helper.ScrollIntoView(AppPreRequisiteUtility.LateFeeSubtab);
		helper.ClickByJsExecuter(AppPreRequisiteUtility.LateFeeSubtab);
		helper.WaitforCustometime(3);

	}

	public void NavigateTo_TemplateManagement() throws InterruptedException {

		helper.waitForPresenceandVisiblity(TemplateManagementUtility.TemplateManagementSideBarTab);
		helper.ScrollIntoView(TemplateManagementUtility.TemplateManagementSideBarTab);
		helper.WaitForElementInteractable(TemplateManagementUtility.TemplateManagementSideBarTab);
		helper.ClickOn(TemplateManagementUtility.TemplateManagementSideBarTab);
		helper.waitForPresenceandVisiblity(TemplateManagementUtility.EmailTemplatesTab);

	}

	public void AddTemplateFiles(String selector, String filePath) throws InterruptedException, AWTException {

		helper.waitForPresenceandVisiblity(By.xpath(selector));
		helper.ScrollIntoView(By.xpath(selector));
		WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile4.sendKeys(filePath);

	}

	public void addNewTemplate(String templateName) throws InterruptedException, AWTException {

		helper.ScrollIntoView(TemplateManagementUtility.CreateTemplateBtn);
		helper.WaitForElementInteractable(TemplateManagementUtility.CreateTemplateBtn);
		helper.ClickByJsExecuter(TemplateManagementUtility.CreateTemplateBtn);
		helper.WaitForCurserRunning(5);
		helper.waitForPresenceandVisiblity(TemplateManagementUtility.TemplateNameTxt);
		helper.ScrollIntoView(TemplateManagementUtility.TemplateNameTxt);
		helper.WaitForElementInteractable(TemplateManagementUtility.TemplateNameTxt);
		helper.SendKeys(TemplateManagementUtility.TemplateNameTxt, templateName);
		helper.ScrollIntoView(TemplateManagementUtility.EmailSubLineInput);
		String rndSubLine = RandomStrings.RequiredString(3) + "EmailSubjectLine";
		helper.WaitForElementInteractable(TemplateManagementUtility.EmailSubLineInput);
		helper.Clear(TemplateManagementUtility.EmailSubLineInput);
		helper.WaitForElementInteractable(TemplateManagementUtility.EmailSubLineInput);
		helper.SendKeys(TemplateManagementUtility.EmailSubLineInput, rndSubLine);
		String TemplateMessgae = RandomStrings.RequiredCharacters(10);
		String ExpectedpreviewTemplateData = TemplateMessgae;
		WebElement switchFrame = helper.findElement(TemplateManagementUtility.IframeBody);
		driver.switchTo().frame(switchFrame);
		helper.SendKeys(TemplateManagementUtility.MessageBody, TemplateMessgae);
		driver.switchTo().defaultContent();
		helper.WaitUntilVisible(TemplateManagementUtility.IncludeMagicLinkchk);
		helper.ScrollIntoView(TemplateManagementUtility.IncludeMagicLinkchk);
		helper.WaitForElementInteractable(TemplateManagementUtility.IncludeMagicLinkchk);
		helper.ClickByJsExecuter(TemplateManagementUtility.IncludeMagicLinkchk);
		helper.ScrollIntoView(TemplateManagementUtility.SaveCrtTemplate);
		helper.WaitForElementInteractable(TemplateManagementUtility.SaveCrtTemplate);
		helper.ClickOn(TemplateManagementUtility.SaveCrtTemplate);

	}

	public void Navigate_To_NotificationMangement() throws InterruptedException {

		helper.waitForPresenceandVisiblity(NotificationManagementUtility.NotificationMangementSideBar);
		helper.ScrollIntoView(NotificationManagementUtility.NotificationMangementSideBar);
		helper.WaitForElementInteractable(NotificationManagementUtility.NotificationMangementSideBar);
		helper.ClickByJsExecuter(NotificationManagementUtility.NotificationMangementSideBar);
		helper.WaitForCurserRunning(4);

	}

	public void Navigate_To_AssignmentRules() throws InterruptedException {

		helper.waitForPresenceandVisiblity(POM.CaseAssignmentUtility.AssignmentRuleSideBar);
		helper.ScrollIntoView(CaseAssignmentUtility.AssignmentRuleSideBar);
		helper.WaitForElementInteractable(CaseAssignmentUtility.AssignmentRuleSideBar);
		helper.ClickByJsExecuter(CaseAssignmentUtility.AssignmentRuleSideBar);
		helper.WaitForCurserRunning(2);

	}

	public void Navigate_To_SLA() throws InterruptedException {

		helper.waitForPresenceandVisiblity(SLAUtility.SLASideBar);
		helper.ScrollIntoView(SLAUtility.SLASideBar);
		helper.WaitForElementInteractable(SLAUtility.SLASideBar);
		helper.ClickByJsExecuter(SLAUtility.SLASideBar);
		helper.WaitForCurserRunning(4);

	}

	public void navigation_To_FAAAdmin(By CaseManagementSidebar) throws InterruptedException {
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("window.scrollBy(0,450)", "");
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.CEProdSideBar);
		helper.WaitForElementInteractable(AppPreRequisiteUtility.CEProdSideBar);
		helper.ClickOn(AppPreRequisiteUtility.CEProdSideBar);
		helper.waitForPresenceandVisiblity(CaseManagementSidebar);
		helper.WaitForElementInteractable(CaseManagementSidebar);
		helper.ClickOn(CaseManagementSidebar);
		helper.WaitForCurserRunning(4);
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.ForcedAbatementTab);
		jser.executeScript("window.scrollBy(0,-450)", "");

	}

	public void navigation_To_ViolationAdmin(By ViolationsSidebarOption) throws InterruptedException {
		helper.refreshPage();
		helper.WaitForCurserRunning(6);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("window.scrollBy(0,450)", "");
		helper.waitForPresenceandVisiblity(ViolationsSidebarOption);
		helper.ScrollIntoView(ViolationsSidebarOption);
		helper.WaitForElementInteractable(ViolationsSidebarOption);
		helper.WaitUntilPresent(ViolationsSidebarOption);
		helper.ClickByJsExecuter(ViolationsSidebarOption);
		helper.WaitForCurserRunning(3);
		jser.executeScript("window.scrollBy(0,-450)", "");
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.MunicipalCodeTab);
		// WebDriverWaits.waitForPresenceandVisiblity(AppPreRequisiteUtility.CreateMunicipalCodeButton);
	}

	public void addNewViolationAdmin(String violationName) throws InterruptedException {
		helper.WaitForElementInteractable(AppPreRequisiteUtility.LabelField);
		helper.SendKeys(AppPreRequisiteUtility.LabelField, violationName);

		helper.ScrollIntoView(AppPreRequisiteUtility.ViolationTypeDropdown);
		helper.ClickOn(AppPreRequisiteUtility.ViolationTypeDropdown);

		if (violationName.equalsIgnoreCase("Animal")) {

			helper.ScrollIntoView(AppPreRequisiteUtility.VioOptionAnimal);
			helper.ClickOn(AppPreRequisiteUtility.VioOptionAnimal);
		} else {
			helper.WaitForElementInteractable(AppPreRequisiteUtility.VioOptionGeneral);
			helper.ClickOn(AppPreRequisiteUtility.VioOptionGeneral);
		}
		helper.WaitForElementInteractable(AppPreRequisiteUtility.MunicipalCodeField);
		helper.ClickOn(AppPreRequisiteUtility.MunicipalCodeField);

		helper.WaitForElementInteractable(AppPreRequisiteUtility.MunicipalCodeOption);
		helper.ClickOn(AppPreRequisiteUtility.MunicipalCodeOption);

		helper.WaitForElementInteractable(AppPreRequisiteUtility.CreateViolationButton2);
		helper.ClickByJsExecuter(AppPreRequisiteUtility.CreateViolationButton2);
		helper.WaitForCurserRunning(5);
		helper.waitForPresenceandVisiblity(By.xpath(AppPreRequisiteUtility.getMuncipalVioCode(violationName)));

	}

	public void navigate_To_Disposition() throws InterruptedException {
		helper.refreshPage();
		helper.WaitForCurserRunning(5);
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.DispositionsTab);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		helper.ScrollIntoView(AppPreRequisiteUtility.DispositionsTab);
		helper.WaitForElementInteractable(AppPreRequisiteUtility.DispositionsTab);
		helper.WaitForElementInteractable(AppPreRequisiteUtility.DispositionsTab);
		helper.ClickByJsExecuter(AppPreRequisiteUtility.DispositionsTab);
		helper.WaitForCurserRunning(5);
		helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.CreateInvalidDispositionButton);
	}

}