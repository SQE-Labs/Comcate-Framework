package POM;

import BrowsersBase.BrowsersInvoked;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import junit.framework.Assert;

public class NoticesUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	CRMCommonMethods CRMcommonMethod;

	public NoticesUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		CRMcommonMethod = new CRMCommonMethods(driver);
		
	}

	public static String activeTab = "//div[@class='tab-name tab-name--active']";
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
	public static String cE = "//label[contains(text(),'CE')]";
	public static String productDemo = "//label[contains(text(),'Product Demo')]";
	public static String cancelButtonCCP = "//button[text()='Cancel']";
	public static String noticeContent = "//body[@class='mce-content-body ']/p";
	public static String closePopup="//button[text()='Close']";
	public static String saveBtn="//button[text()='Save']";
	public static String iframeHTML = "editor_ifr";
	
	public static By IframeHTML = By.id(iframeHTML);
	public static By SaveBtn =By.xpath(saveBtn);
	public static By ClosePopup = By.xpath(closePopup);
	public static By NoticeContent = By.xpath(noticeContent);
	public static By ActiveTab = By.xpath(activeTab);
	public static By CreateNonHtmlNoticeBtn = By.xpath(createNonHtmlNoticeBtn);
	public static By CreateNonHtmlNoticePopup = By.xpath(createNonHtmlNoticePopup);
	public static By LabelField = By.xpath(labelField);
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
	public static By CE = By.xpath(cE);
	public static By ProductDemo = By.xpath(productDemo);
	public static By CancelButtonCCP= By.xpath(cancelButtonCCP);
	
	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	    public void Notices_PreRequisite() throws InterruptedException {
	        WaitForCurserRunning(3);
	        CRMcommonMethod.NavigationTo_NoticesUtility();

	    }

	    public void Notices_OpenCreateNonHtmlNoticePopup() throws InterruptedException {
	        WaitForElementInteractable(ActiveTab);
	        ScrollIntoView(ActiveTab);
	        WaitUntilPresent(CreateNonHtmlNoticeBtn);
	        ScrollIntoView(CreateNonHtmlNoticeBtn);
	        WaitForElementInteractable(CreateNonHtmlNoticeBtn);
	        ClickByJsExecuter(CreateNonHtmlNoticeBtn);
	        WaitforCustometime(3);
	        WaitUntilVisible(CreateNonHtmlNoticePopup);
	        String PopupTitle = GetText(CreateNonHtmlNoticePopup);
	        Assert.assertEquals(PopupTitle, "Create Non-HTML Notice");
	    }

	    public static int CurrentNoticesCount;

	    public  void Notices_CreateNonHTMLNotice() throws InterruptedException {
	        WaitUntilVisible(CancelButtonCCP);
	        WaitForElementInteractable(CancelButtonCCP);
	        ClickByJsExecuter(CancelButtonCCP);
	        WaitUntilVisible(CountNotices);
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
	        WaitUntilPresent(By.xpath("div.sortable-table__body__td"));
	        WaitUntilPresent(CountNotices);
	        String[] NoticesSplit = GetText(CountNotices).split(" ");
	        String CountText = NoticesSplit[0];
	        int NoticesCountBefore = Integer.parseInt(CountText);
	        WaitForElementInteractable(CreateNonHtmlNoticeBtn);
	        ClickByJsExecuter(CreateNonHtmlNoticeBtn);
	        WaitUntilVisible(LabelField);
	        WaitForElementInteractable(LabelField);
	        String RandomLabel = "Non-HTML " + RandomStrings.RequiredCharacters(8);
	        SendKeys(LabelField, RandomLabel);
	        WaitUntilVisible(CreateNoticeBtn);
	        WaitForElementInteractable(CreateNoticeBtn);
	        ScrollIntoView(CreateNoticeBtn);
	        WaitForElementInteractable(CreateNoticeBtn);
	        ClickByJsExecuter(CreateNoticeBtn);
	        //WaitUntilElementInvisible(CreateNoticeBtn);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CountNotices);
	        WaitUntilPresent(CountNotices);
	        ScrollIntoView(CountNotices);
	        WaitForElementInteractable(CountNotices);
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
	        WaitUntilPresent(By.xpath("div.sortable-table__body__td"));
	        String[] NoticesSplit2 = GetText(CountNotices).split(" ");
	        String CountText2 = NoticesSplit2[0];
	        CurrentNoticesCount = Integer.parseInt(CountText2);
	        boolean CompareCount = CurrentNoticesCount == (NoticesCountBefore + 1);
	        Assert.assertEquals(CompareCount, true);
	    }

	    public void Notices_OpenCreateHtmlNoticePopup() throws InterruptedException {
	        WaitUntilVisible(CreateHtmlNoticeBtn);
	        ScrollIntoView(CreateHtmlNoticeBtn);
	        WaitForElementInteractable(CreateHtmlNoticeBtn);
	        ClickOn(CreateHtmlNoticeBtn);
	        WaitUntilVisible(CreateHtmlNoticePopup);
	        String PopupTitle = GetText(CreateHtmlNoticePopup);
	        Assert.assertEquals(PopupTitle, "Create HTML Notice");
	    }

	    public void Notices_OpenAddMergeFieldsPopup() throws InterruptedException {
	        WaitUntilVisible(MergeFieldsLink);
	        WaitForElementInteractable(MergeFieldsLink);
	        ClickByJsExecuter(MergeFieldsLink);
	        WaitUntilVisible(AddMergeFieldsPopup);
	        String PopupTitle = GetText(AddMergeFieldsPopup);
	        Assert.assertEquals(PopupTitle, "Add Merge Fields");
	    }

	    public void Notices_ApplyCategoryOnMergeFields() throws InterruptedException {
	        WaitUntilVisible(CategoryDropdown);
	        WaitForElementInteractable(CategoryDropdown);
	        ClickOn(CategoryDropdown);

	        WaitForElementInteractable(CategoryOption);
	        ClickOn(CategoryOption);
	        List<WebElement> CategoryApplied = driver.findElements(FieldResults);
	        int CountFields = CategoryApplied.size();
	        List<WebElement> CategoryResult = driver.findElements(CategoryResults);
	        int CountCategory = CategoryResult.size();
	        Assert.assertEquals(CountFields, CountCategory);
	    }

	    public void Notices_VerifyMergeFieldsOnHtmleditor() throws InterruptedException {
	       WaitForElementInteractable(FieldResults);
	        ClickOn(FieldResults);
	        String FieldText = GetText(FieldResults);
	        ClickOn(DoneButton);
	        WebElement switchFrame = WaitUntilVisibleWE(IframeHTML);

	        WaitforCustometime(2);
	        driver.switchTo().frame(switchFrame);
	        String NoticeText = GetText(NoticeContent);
	        Assert.assertEquals(FieldText, NoticeText);
	    }

	    public void Notices_VerifyPreviewPopup() {
	        String NoticeText = GetText(NoticeContent);
	        driver.switchTo().defaultContent();
	        ClickOn(PreviewButton);
	        String PreviewText = GetText(PreviewPopupBody);
	        Assert.assertEquals(PreviewText, NoticeText);
	    }

	    public void Notices_CreateHtmlCaseNotice() throws InterruptedException {
	        WaitUntilVisible(ClosePopup);
	        ClickOn(ClosePopup);
	        String RandomLabel = "HTML " + RandomStrings.RequiredCharacters(8);
	        WaitUntilVisible(LabelField);
	        WaitUntilPresent(LabelField);
	        WaitForElementInteractable(LabelField);
	        SendKeys(LabelField, RandomLabel);
	        ScrollIntoView(CreateNoticeBtn);
	        WaitForElementInteractable(CreateNoticeBtn);
	        ClickByJsExecuter(CreateNoticeBtn);
	        WaitUntilElementInvisible(CreateNoticeBtn);
	        WaitUntilElementInvisible(CreateNoticeBtn);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CountNotices);
	        WaitUntilVisible(By.xpath("//div[@class='sortable-table__body__td']"));
	        WaitUntilPresent(By.xpath("//div[@class='sortable-table__body__td']"));
	        ScrollIntoView(CountNotices);
	        String[] NoticesSplit2 = GetText(CountNotices).split(" ");
	        String CountText2 = NoticesSplit2[0];
	        int NoticesCountAfter = Integer.parseInt(CountText2);
	        boolean CompareCount = NoticesCountAfter == (CurrentNoticesCount + 1);
	        Assert.assertEquals(CompareCount, true);

	    }

	    public void Notices_CreateFADocumentHtmlNotice() throws InterruptedException {
	        WaitForCurserRunning(3);
	        WaitUntilVisible(CreateHtmlNoticeBtn);
	        WaitUntilPresent(CreateHtmlNoticeBtn);
	        ScrollIntoView(CreateHtmlNoticeBtn);
	        WaitForElementInteractable(CreateHtmlNoticeBtn);
	        WaitForElementInteractable(CreateHtmlNoticeBtn);
	        ClickByJsExecuter(CreateHtmlNoticeBtn);
	        WaitUntilElementInvisible(CreateHtmlNoticeBtn);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(FADocumentToggle);
	        WaitUntilPresent(FADocumentToggle);
	        WaitForElementInteractable(FADocumentToggle);
	        ClickOn(FADocumentToggle);
	        String RandomLabel = "FA Doc " + RandomStrings.RequiredCharacters(8);
	        WaitForElementInteractable(LabelField);
	        SendKeys(LabelField, RandomLabel);
	        ClickOn(MergeFieldsLink);
	        ClickOn(FieldResults);
	        ClickOn(DoneButton);
	        WaitForElementInteractable(CreateNoticeBtn);
	        ClickOn(CreateNoticeBtn);
	        WaitForCurserRunning(3);
	        WaitUntilVisibleWE(CountNotices);
	        ScrollIntoView(CountNotices);
	        WaitUntilPresent(By.xpath("div.sortable-table__body__td"));
	        WaitUntilVisible(CountNotices);
	        WaitForElementInteractable(CountNotices);
	        String[] NoticesSplit2 = GetText(CountNotices).split(" ");
	        String CountText2 = NoticesSplit2[0];
	        int NoticesCountAfter = Integer.parseInt(CountText2);
	        boolean CompareCount = NoticesCountAfter == (CurrentNoticesCount + 2);
	        Assert.assertEquals(CompareCount, true);
	    }

	    public void Notices_VerifyEditNotices() throws InterruptedException {
	        WaitUntilVisible(EditIconNotice);
	        WaitUntilPresent(EditIconNotice);
	        WaitForElementInteractable(EditIconNotice);
	        WaitForElementInteractable(EditIconNotice);
	        ClickByJsExecuter(EditIconNotice);
	        WaitUntilElementInvisible(EditIconNotice);
	        WaitUntilVisible(LabelField);
	        WaitUntilPresent(LabelField);
	        WaitForElementInteractable(LabelField);
	        WebElement Label = findElement(LabelField);
	        Label.clear();
	        String RandomLabel = "Non-Html Edited " + RandomStrings.RequiredCharacters(4);
	        WaitForElementInteractable(LabelField);
	        Label.sendKeys(RandomLabel);
	        ClickOn(SaveBtn);
	        WaitUntilElementInvisible(SaveBtn);
	        WaitForCurserRunning(6);
	        WaitUntilVisible(By.xpath("//div[@class='sortable-table__body__td']"));
	        WaitUntilPresent(By.xpath("//div[@class='sortable-table__body__td']"));
	        WaitUntilPresent(NoticeLabelColumn);
	        String GetLabel = GetText(NoticeLabelColumn);
	        Assert.assertEquals(GetLabel, RandomLabel);
	    }

	    public void Notices_VerifyCountOfNotices() throws InterruptedException {
	        WaitUntilVisible(NoticesCountHeader);
	        String[] CountAtHeader = GetText(NoticesCountHeader).split(" ");
	        String NoticesCountExp = CountAtHeader[0];
	        int NoticesCountExpected = Integer.parseInt(NoticesCountExp);
	        WaitUntilVisible(NoticesCountActual);
	        List<WebElement> NoOfNotices = driver.findElements(NoticesCountActual);
	        int TotalCountNotices = NoOfNotices.size();
	        Assert.assertEquals(NoticesCountExpected, TotalCountNotices);
	    }

	    public static void Notices_VerifyAutoPopulationOfNotices() throws InterruptedException {
	    	
	    }

	
}
