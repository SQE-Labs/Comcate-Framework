package POM;
import BrowsersBase.BrowsersInvoked;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;

import CommonMethods.Helper;
import CommonMethods.RandomStrings;


public class UserManagementUtility extends Helper{
  
	public WebDriver driver;
	public LoginUtility log;
	public SoftAssert softAssert ;
	
	
	public UserManagementUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		softAssert = new SoftAssert();
	}
	
	
	
	
	 public  String createUserButton = "//button[text()='Create User']";
	    public static  String userMangementSideBar = "//label[text()='User Management']";
	    public static String creatUserBtn = "//div[@class='action-item']//button";
	    public  String createUserPopupTitle = "//h1[text()='Create User']";
	    public  String firstNameField = "//input[@name='firstName']";
	    public  String lastNameField = "//input[@name='lastName']";
	    public  String emailField = "//input[@name='email']";
	    public  String roleDropdown = "//label[text()='Role']/following::span[1]";
	    public  String roleOptionselect = "//*[text()='Agency Admin CEM']";
	    public  String cancelButton = "//button[text()='Cancel']";
	    public  String searchField = "//input[@placeholder='Filter by name or email']";
	    public  String usersCount = "//div[@class='agency-setup-tab__section__header']/h2[contains(text(),'Users')]";
	    public  String roleCount = "//div[@class='agency-setup-tab__section__header']//h2[contains(text(),'Active')]";
	    public  String searchResultName = "//div[@class='rt-tr -odd']/div";
	    public  String createUserPopupBtn = "//div[@class='user-form__header full-page-modal__header']//button[text()='Create User']";
	    public  String editUserIcon = "//button[@class='edit-btn  btn btn-primary']";
	    public  String editUserpopupTitle = "//h1[text()='Edit User']";
	    public  String yopmailSearchUser = "//input[@class='ycptinput']";
	    public  String paginationText = "//span[@class='table__pagination-of-text']";
	    public  String userSearchResult = "//div[@class='rt-tr-group']";
	    public  String yopmailInboxArrow = "//button[@class='md']";
	    public  String rolesTab = "//div[contains(text(),'Roles')]";
	    public  String createRoleButton = "//button[text()='Create Role']";
	    public  String createRolePopupTitle = "//h1[text()='Create Role']";
	    public  String roleNameField = "//input[@placeholder='Enter Text']";
	    public  String descriptionField = "//textarea[@name='description']";
	    public  String createRolePopupBtn = "//div[@class='modal-header']//following::button[text() ='Create Role']";
	    public  String roleCreatedSuccessMsg = "//span[text()='Role created']";
	    public  String iframeSwitch = "//iframe[@id='ifmail']";
	    public  String firstMail = "//button[@class='lm']";
	    public  String activateBtn = "//span[contains(text(),'Activate')]";
	    public  String activateOktaBtn = "//span[text()='Activate Okta Account']";
	    public  String activateOktaBtn_Stage = "//span[text()=' Activate Comcate Account ']";
	    public  String newPassword = "//input[@name='newPassword']";
	    public  String confirmPassword = "//input[@name='confirmPassword']";
	    public  String resetPasswordBtn = "//input[@value='Reset Password']";
	    public  String productSettingsToggle = "//span[@class='toggle__children']";
	    public  String deleteReissueYesBtn = "//label[@title='Delete and Reissue Notice']/following::button[text()='Yes'][1]";
	    public  String basicToggle = "//button[text()='Basic']";
	    public  String groupsTab = "//div[contains(text(),'Groups')]";
	    public  String createNewGroupBtn = "//button[text()='Create New Group']";
	    public  String createGroupPopupTitle = "//h1[text()='Create Group']";
	    public  String createGroupPopupBtn = "//button[text()='Create Group']";
	    public  String groupName = "//input[@name='label']";
	    public  String groupCreatedSuccessMsg = "//span[text()='Group created']";
	    public  String nextNavigationIcon = "//div[@class='table__pagination-nav-btns']/button[2]";
	    public  String saveButton = "//button[text()='Save']";
	    public  String nextPagination = "//div[@class='table__pagination-nav-btns']//button[@class='square-btn btn btn-default'][2]";
	    
	    
	    
	By NextPagination = By.xpath(nextPagination);
	By CreateUserButton = By.xpath(createUserButton);
    public static By UserMangementSideBar = By.xpath(userMangementSideBar);
    public static By CreateUserbtn = By.xpath(creatUserBtn);
    By CreateUserPopupTitle = By.xpath(createUserPopupTitle);
    By FirstNameField = By.xpath(firstNameField);
    public  By SaveButton = By.xpath(saveButton);
    public  By LastNameField = By.xpath(lastNameField);
    public  By EmailField = By.xpath(emailField);
    public  By RoleDropdown = By.xpath(roleDropdown);
    public  By RoleOptionselect = By.xpath(roleOptionselect);
    public  By CancelButton = By.xpath(cancelButton);
    public  By SearchField = By.xpath(searchField);
    public  By CreateUserPopupBtn = By.xpath(createUserPopupBtn);
    public  By UsersCount = By.xpath(usersCount);
    public  By RoleCount = By.xpath(roleCount);
    public  By UserSearchResult = By.xpath(userSearchResult);
    public  By EditUserIcon = By.xpath(editUserIcon);
    public  By EditUserpopupTitle = By.xpath(editUserpopupTitle);
    public  By YopmailSearchUser = By.xpath(yopmailSearchUser);
    public  By PaginationText = By.xpath(paginationText);
    public  By SearchResultName = By.xpath(searchResultName);
    public  By YopmailInboxArrow = By.xpath(yopmailInboxArrow);
    public  By CreateRoleButton = By.xpath(createRoleButton);
    public  By RolesTab = By.xpath(rolesTab);
    public  By CreateRolePopupTitle = By.xpath(createRolePopupTitle);
    public  By RoleNameField = By.xpath(roleNameField);
    public  By DescriptionField = By.xpath(descriptionField);
    public  By CreateRolePopupBtn = By.xpath(createRolePopupBtn);
    public  By IframeSwitch = By.xpath(iframeSwitch);
    public  By FirstMail = By.xpath(firstMail);
    public  By ActivateBtn = By.xpath(activateBtn);
    public  By ActivateOktaBtn = By.xpath(activateOktaBtn);
    public  By ActivateOktaBtn_stage = By.xpath(activateOktaBtn_Stage);

    public  By NewPassword = By.xpath(newPassword);
    public  By ConfirmPassword = By.xpath(confirmPassword);
    public  By ResetPasswordBtn = By.xpath(resetPasswordBtn);
    public  By RoleCreatedSuccessMsg = By.xpath(roleCreatedSuccessMsg);
    public  By ProductSettingsToggle = By.xpath(productSettingsToggle);
    public  By DeleteReissueYesBtn = By.xpath(deleteReissueYesBtn);
    public  By BasicToggle = By.xpath(basicToggle);
    public  By GroupsTab = By.xpath(groupsTab);
    public  By CreateNewGroupBtn = By.xpath(createNewGroupBtn);
    public  By CreateGroupPopupTitle = By.xpath(createGroupPopupTitle);
    public  By CreateGroupPopupBtn = By.xpath(createGroupPopupBtn);
    public  By GroupName = By.xpath(groupName);
    public  By GroupCreatedSuccessMsg = By.xpath(groupCreatedSuccessMsg);
    public  By NextNavigationIcon = By.xpath(nextNavigationIcon);
	
	
	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();
		
	}

	public  String UserCreated(String username) {
		String xpath = "//div[contains(text(),'" + username + "')]";
		return xpath;
	}

	
	public  void NavigateTo_AgencySetup() throws InterruptedException {
       waitForPresenceandVisiblity(By.xpath("//div[@class='app-header__menu__icon']"));
       WaitForElementInteractable(By.xpath("//div[@class='app-header__menu__icon']"));
       ScrollIntoView(By.xpath("//div[@class='app-header__menu__icon']"));
       ClickByJsExecuter(By.xpath("//div[@class='app-header__menu__icon']"));

       waitForPresenceandVisiblity(By.xpath("//a[@class='tools-dropdown__tool-img tools-dropdown__tool-img--setup']"));
       ScrollIntoView(By.xpath("//a[@class='tools-dropdown__tool-img tools-dropdown__tool-img--setup']"));
       WaitForElementInteractable(By.xpath("//a[@class='tools-dropdown__tool-img tools-dropdown__tool-img--setup']"));
       ClickByJsExecuter(By.xpath("//a[@class='tools-dropdown__tool-img tools-dropdown__tool-img--setup']"));

       WaitForCurserRunning(10);
       waitForPresenceandVisiblity(By.xpath("//label[text()='Audit Trail']"));
       ScrollIntoView(By.xpath("//label[text()='Audit Trail']"));
	}
	
	
	public  void NavigateTo_UserManagement() throws InterruptedException {
		
		        WaitUntilVisible(UserMangementSideBar);
		        WaitUntilPresent(UserMangementSideBar);
		        ScrollIntoView(UserMangementSideBar);
		        WaitForElementInteractable(UserMangementSideBar);
		        ClickOn(UserMangementSideBar);
		        WaitForCurserRunning(4);
		        WaitUntilVisible(CreateUserbtn);
		        WaitUntilPresent(CreateUserbtn);
		        WaitForElementInteractable(CreateUserbtn);

		    }
	
	
	
	
	public  void UserManagement_OpenCreateUserPopup() throws InterruptedException {

		NavigateTo_AgencySetup();
		NavigateTo_UserManagement();
		ScrollIntoView(CreateUserbtn);
		WaitForElementInteractable(CreateUserbtn);
		ClickByJsExecuter(CreateUserbtn);
		String PopupTitle = GetText(CreateUserPopupTitle);
		Assert.assertEquals(PopupTitle, "Create User");
		softAssert.assertAll();
	}

	public  String RandomFirstName = RandomStrings.RequiredCharacters(6);
	public  String RandomLastName = RandomStrings.RequiredCharacters(6);

	public  void UserManagement_VerifyUserGetsCreated() throws InterruptedException {

		ClickOn(CancelButton);
		WaitUntilElementInvisible(CreateUserPopupTitle);
		WaitForCurserRunning(3);
		WaitUntilVisible(UsersCount);
		ScrollIntoView(CreateUserbtn);
		WaitForElementInteractable(CreateUserbtn);
		String[] CountUsers1 = GetText(UsersCount).split(" ");
		String UsersBefore = CountUsers1[0];
		int TotalUsersBefore = Integer.parseInt(UsersBefore);
		ClickByJsExecuter(CreateUserbtn);
		WaitUntilVisible(FirstNameField);
		WaitForElementInteractable(FirstNameField);
		SendKeys(FirstNameField, "CE User " + RandomFirstName);
		SendKeys(LastNameField, RandomLastName);
		String EmailRandom = RandomFirstName + RandomLastName + "@yopmail.com";
		SendKeys(EmailField, EmailRandom);
		ClickOn(RoleDropdown);
		WaitForElementInteractable(RoleOptionselect);
		ClickOn(RoleOptionselect);
		WaitForElementInteractable(CreateUserPopupBtn);
		ClickOn(CreateUserPopupBtn);
		WaitUntilElementInvisible(CreateUserPopupBtn);
		WaitForCurserRunning(5);
		WaitUntilVisible(UsersCount);

		WaitForElementInteractable(CreateUserbtn);
		ScrollIntoView(UsersCount);
		String[] CountUsers2 = GetText(UsersCount).split(" ");
		String UsersAfter = CountUsers2[0];
		int TotalUsersAfter = Integer.parseInt(UsersAfter);
		boolean CompareCount = (TotalUsersAfter == (TotalUsersBefore + 1));
		Assert.assertEquals(CompareCount, true);
		softAssert.assertAll();
	}

	public  void UserManagement_VerifySearchUser() throws InterruptedException {

		WaitForElementInteractable(SearchField);
		SendKeys(SearchField, RandomFirstName);
		WaitForElementInteractable(SearchField);
		SendKeys(SearchField, RandomLastName);

		WaitUntilVisible(By.xpath(UserCreated(RandomLastName)));
		List<WebElement> SearchResults = driver.findElements(UserSearchResult);
		boolean ResultsCount = SearchResults.size() >= 1;
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ResultsCount, true);
		soft.assertAll();
		WaitUntilVisible(By.xpath(UserCreated(RandomLastName)));

		String ResultName = GetText(SearchResultName);

		String ResultNameExpected = "CE User " + RandomFirstName + " " + RandomLastName;

		Assert.assertEquals(ResultName, ResultNameExpected);
		softAssert.assertAll();
	}

	public  void UserManagement_OpenEditUserPopup() throws InterruptedException {

		WaitForElementInteractable(EditUserIcon);
		ClickOn(EditUserIcon);
		WaitUntilVisible(EditUserpopupTitle);
		String PopupTitle = GetText(EditUserpopupTitle);
		Assert.assertEquals(PopupTitle, "Edit User");
		softAssert.assertAll();
	}

	public  void UserManagement_VerifyUpdatedUserDetails() throws InterruptedException {

		WaitForElementInteractable(FirstNameField);
		WebElement FirstNameFld = WaitUntilVisibleWE(FirstNameField);
		clearByJSE(FirstNameField);
		WaitForCurserRunning(2);
		SendKeys(FirstNameField, "Edited User");
		String RandomStr01 = RandomStrings.RequiredCharacters(8);
		WebElement LastNameFld = WaitUntilVisibleWE(LastNameField);
		WaitForElementInteractable(LastNameField);
		LastNameFld.clear();
		WaitForCurserRunning(2);
		SendKeys(LastNameField, RandomStr01);
		ClickOn(SaveButton);
		WaitForCurserRunning(5);
		WaitUntilVisible(SearchField);
		WebElement SearchFld = driver.findElement(SearchField);
		WaitForElementInteractable(SearchField);
		SearchFld.clear();
		WaitUntilVisible(SearchField);
		WaitUntilPresent(SearchField);
		WaitForElementInteractable(SearchField);
		SendKeys(SearchField, "Edited User ");
		WaitUntilVisible(By.xpath(UserCreated("Edited User")));
		WaitUntilPresent(By.xpath(UserCreated("Edited User")));
		SearchFld.clear();
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		WaitUntilVisible(SearchField);
		WaitUntilPresent(SearchField);
		WaitForElementInteractable(SearchField);
		WaitForElementInteractable(SearchField);
		SendKeys(SearchField, " " + RandomStr01);
		WaitForCurserRunning(5);
		WaitUntilVisible(By.xpath(UserCreated(RandomStr01)));
		WaitUntilPresent(By.xpath(UserCreated(RandomStr01)));
		List<WebElement> SearchResults = driver.findElements(UserSearchResult);
		boolean ResultsCount = SearchResults.size() >= 1;
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ResultsCount, true);
		soft.assertAll();

		WaitUntilVisible(SearchResultName);
		String ResultName = GetText(SearchResultName);
		String ResultNameExpected = "Edited User" + " " + RandomStr01;
		Assert.assertEquals(ResultName, ResultNameExpected);
		softAssert.assertAll();
	}

	public  void UserManagement_VerifyResetMailReceived() throws AWTException, InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLUserManagement);
		WaitForCurserRunning(4);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://yopmail.com/en/");
		WaitForPageLoadTime(5);

		WaitUntilVisible(YopmailSearchUser);
		WaitForElementInteractable(YopmailSearchUser);
		SendKeys(YopmailSearchUser, (RandomFirstName + RandomLastName));
		ClickOn(YopmailInboxArrow);
		WaitUntilVisible(IframeSwitch);
		WebElement switchFrame = WaitUntilVisibleWE(IframeSwitch);

		driver.switchTo().frame(switchFrame);
		WaitUntilVisible(ActivateBtn);
		String AOB = GetText(ActivateBtn);
		if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("QA"))
			Assert.assertEquals(AOB.trim(), "Activate Okta Account");
		else
			Assert.assertEquals(AOB.trim(), "Activate Comcate Account");
		softAssert.assertAll();
	}

	public  void UserManagement_ResetPasswordForUser() throws InterruptedException {

		if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("QA")) {

			WaitForElementInteractable(ActivateOktaBtn);
			ClickOn(ActivateOktaBtn);
		} else {
			WaitForElementInteractable(ActivateOktaBtn_stage);
			ClickOn(ActivateOktaBtn_stage);
		}

		WaitforCustometime(3);
		ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
		WaitforCustometime(2);
		driver.switchTo().window((String) tabs2.get(2));
		WaitForPageLoadTime(2);
		WaitUntilVisible(NewPassword);
		WaitUntilPresent(NewPassword);
		WaitForElementInteractable(NewPassword);
		SendKeys(NewPassword, "Hello@123");
		WaitForElementInteractable(ConfirmPassword);
		SendKeys(ConfirmPassword, "Hello@123");
		ClickOn(ResetPasswordBtn);
		WaitForCurserRunning(5);
		WaitforCustometime(3);
		driver.switchTo().window((String) tabs2.get(0));

	}

	public void UserManagement_VerifyCountOfUsers() throws InterruptedException {

		refreshPage();
		WaitForCurserRunning(5);
		waitForElementContainsText(UsersCount, "Users");
		WaitUntilVisible(UsersCount);
		WaitUntilPresent(UsersCount);
		ScrollIntoView(UsersCount);
		WaitForElementInteractable(UsersCount);
		forcedWaitTime(5);
		String[] CountUsers = getTextByJSExecutor(UsersCount).split(" ");
		String usersCount = CountUsers[0];

		if (Integer.parseInt(usersCount) == 0) {
			CountUsers = driver.findElement(UsersCount).getText().split(" ");
			usersCount = CountUsers[0];
			System.out.println(usersCount);
		}

		int TotalUsers = Integer.parseInt(usersCount);
		WaitUntilPresent(PaginationText);
		WaitUntilVisible(PaginationText);
		String[] Pagination = GetText(PaginationText).split(" ");
		String PaginationCount = Pagination[1];
		int PgCount = Integer.parseInt(PaginationCount);
		WaitUntilVisible(NextPagination);
		WaitUntilPresent(NextPagination);
		WebElement ele = findElement(NextPagination);
		int FinalCountUsers = findElementsByXPath(UserSearchResult).size();
		Boolean eleCheck = ele.isEnabled();
		int i = 0;
		while (eleCheck) {
			forcedWaitTime(2);
			WaitForElementInteractable(NextPagination);
			ClickOn(NextPagination);
			WaitUntilVisible(NextPagination);
			WaitUntilPresent(NextPagination);
			WaitUntilPresent(By.xpath("//div[@role='gridcell']"));
			ele = findElement(NextPagination);
			eleCheck = ele.isEnabled();
			WaitUntilPresent(UserSearchResult);
			forcedWaitTime(2);
			WaitUntilPresent(By.xpath("//button[@type='button'][@class='edit-btn  btn btn-primary']"));
			WaitForElementInteractable(By.xpath("//button[@type='button'][@class='edit-btn  btn btn-primary']"));
			int count = findElementsByXPath(UserSearchResult).size();
			FinalCountUsers = FinalCountUsers + count;
		}
		WaitUntilVisible(UserSearchResult);
		WaitUntilPresent(UserSearchResult);
		Assert.assertEquals(TotalUsers, FinalCountUsers);
		softAssert.assertAll();
	}

	public void UserManagement_OpenCreateRolePopup() throws InterruptedException {

		ScrollIntoView(RolesTab);
		WaitForElementInteractable(RolesTab);
		ClickByJsExecuter(RolesTab);
		WaitForElementInteractable(CreateRoleButton);
		ClickByJsExecuter(CreateRoleButton);
		WaitUntilElementInvisible(CreateRoleButton);
		WaitUntilVisible(CreateRolePopupTitle);
		String PopupTitle = GetText(CreateRolePopupTitle);
		Assert.assertEquals(PopupTitle, "Create Role");
		softAssert.assertAll();
	}

	public void UserManagement_VerifyRoleCreationWithoutProdSettings() throws InterruptedException {

		WaitForCurserRunning(3);
		WaitUntilVisible(RoleCount);
		ScrollIntoView(RoleCount);
		WaitForElementInteractable(RoleCount);
		String[] CountUsers1 = GetText(RoleCount).split(" ");
		String UsersBefore = CountUsers1[0];
		int TotalUsersBefore = Integer.parseInt(UsersBefore);

		String RandomRoleName = RandomStrings.RequiredCharacters(8);
		WaitUntilVisible(RoleNameField);
		WaitUntilPresent(RoleNameField);
		WaitForElementInteractable(RoleNameField);
		SendKeys(RoleNameField, RandomRoleName);
		String RandomDescription = RandomStrings.RequiredString(20);
		SendKeys(DescriptionField, RandomDescription);
		WaitUntilPresent(CreateRolePopupBtn);
		WaitForElementInteractable(CreateRolePopupBtn);
		ClickOn(CreateRolePopupBtn);
		WaitUntilElementInvisible(CreateRolePopupBtn);
		// String SuccessMsg =GetText(RoleCreatedSuccessMsg);
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		WaitUntilVisible(RoleCount);
		ScrollIntoView(RoleCount);
		WaitForElementInteractable(RoleCount);
		String[] AfterCountUsers = GetText(RoleCount).split(" ");
		String AfterCountUsers1 = AfterCountUsers[0];
		int AfterCountRole = Integer.parseInt(AfterCountUsers1);
		// String SuccessMsg =
		// driver.findElement(By.xpath(roleCreatedSuccessMsg)).getText();
		Assert.assertEquals(TotalUsersBefore + 1, AfterCountRole);

		softAssert.assertAll();
	}

	public  void UserManagement_VerifyRoleCreationWithProdSettings() throws InterruptedException {

		WaitUntilVisible(CreateRoleButton);
		WaitUntilVisible(CreateRoleButton);
		WaitUntilPresent(CreateRoleButton);
		WaitForElementInteractable(CreateRoleButton);
		ClickOn(CreateRoleButton);
		WaitUntilElementInvisible(CreateRoleButton);
		String RandomRoleName = RandomStrings.RequiredCharacters(8);
		WaitUntilVisible(RoleNameField);
		WaitUntilPresent(RoleNameField);
		WaitForElementInteractable(RoleNameField);
		SendKeys(RoleNameField, RandomRoleName);
		String RandomDescription = RandomStrings.RequiredString(20);
		SendKeys(DescriptionField, RandomDescription);
		WaitForElementInteractable(ProductSettingsToggle);
		ClickOn(ProductSettingsToggle);
		WaitForElementInteractable(DeleteReissueYesBtn);
		ClickOn(DeleteReissueYesBtn);
		WaitForElementInteractable(BasicToggle);
		ClickOn(BasicToggle);
		ScrollIntoView(CreateRolePopupBtn);
		WaitForElementInteractable(CreateRolePopupBtn);
		ClickOn(CreateRolePopupBtn);
		String SuccessMsg = GetText(RoleCreatedSuccessMsg);
		Assert.assertEquals(SuccessMsg, "Role created");
		softAssert.assertAll();
	}

	public  void UserManagement_OpenCreateGroupPopup() throws InterruptedException {

		WaitForElementInteractable(GroupsTab);
		ClickByJsExecuter(GroupsTab);
		WaitForElementInteractable(CreateNewGroupBtn);
		ScrollIntoView(CreateNewGroupBtn);
		ClickByJsExecuter(CreateNewGroupBtn);
		WaitUntilVisible(CreateGroupPopupTitle);
		String PopupTitle = GetText(CreateGroupPopupTitle);
		Assert.assertEquals(PopupTitle, "Create Group");
		softAssert.assertAll();
	}

	public void UserManagement_VerifyGroupCreationWithoutProdSettings() throws InterruptedException {

		WaitUntilVisible(GroupName);
		WaitUntilPresent(GroupName);
		String RandomGrpName = RandomStrings.RequiredCharacters(8);
		WaitForElementInteractable(GroupName);
		forcedWaitTime(2);
		SendKeys(GroupName, RandomGrpName);
		String RandomDescription = RandomStrings.RequiredString(20);
		WaitUntilVisible(DescriptionField);
		WaitUntilPresent(DescriptionField);
		WaitForElementInteractable(DescriptionField);
		SendKeys(DescriptionField, RandomDescription);

		WaitUntilPresent(CreateGroupPopupBtn);
		WaitForElementInteractable(CreateGroupPopupBtn);
		ClickOn(CreateGroupPopupBtn);
		// WaitUntilElementInvisible(CreateGroupPopupBtn);
		String SuccessMsg = GetText(GroupCreatedSuccessMsg);
		Assert.assertEquals(SuccessMsg, "Group created");
		softAssert.assertAll();
	}


	

}
