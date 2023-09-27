package POM;



import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;

public class CaseAssignmentUtility extends Helper {

	public WebDriver driver;
	public LoginUtility log;
	

	public CaseAssignmentUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		

	}

	String editAssignmentIcon = "//div[text()='Case Created']//following::button[1]";
	public static String assignmentRuleSideBar = "//label[text()='Assignment Rules']";
	String editAssignmentPopup = "//div[@class='full-page-modal__header']/h1";
	String nameField = "//label[@title='Name']/following::input[@name='label']";
	String descriptionField = "//input[@name='description']";
	String actionDropdown = "//div[@class='Select-value']";
	String optionActionDropdown = "//*[text()='Submission Received']";
	String saveButton = "//button[text()='Save']";
	String crossIconRuleSet = "//div[@class='sortable-table__body__td']/button[2]";
	String validationNoRule = "//div[@class='modal-base__error modal-base__error--show']";
	String addRuleButton = "//button[text()='Add Rule']";
	String createRule = "//h1[text()='Create Rule']";
	String criteriaFields = "//label[@title='Attribute']/following::div[@class='Select-placeholder'][1]";
	String zipOption = "//*[text()='Zip']";
	String equalsOption = "//*[text()='Equals']";
	String addCriteriaLink = "//a[text()='Add Criteria']";
	String valueField = "//input[@name='value']";
	String blockOption = "//*[text()='Block']";
	String equalsOption2 = "(//*[text()='Equals'])[2]";
	String valueField2 = "(//input[@name='value'])[2]";
	String caseAssigneeField = "//label[@for='caseAssignee']/following::label";
	String inspectionAssigneeField = "//label[@for='inspectionAssignee']/following::label[text()='Select Option']";
	String userOptionCA = "//label[@for='caseAssignee']/following::ul/li[1]";
	String userOptionIA = "//label[@for='inspectionAssignee']/following::ul/li[1]";
	String createRulebutton = "//button[text()='Create Rule']";
	String addedRule = "//div[@class='sortable-table__body__tr']";
	String editRuleIcon = "//div[@class='sortable-table__body__td']/button[1]";
	String crossCriteriaIcon = "(//div[@class='close-icon'])[2]";
	String userOptionCA2 = "//label[@for='caseAssignee']/following::ul/li[2]";
	String saveButtonEditRule = "//h1[text()='Edit Rule']/following::button[text()='Save']";
	String assignCaseToColumn = "//div[@class='sortable-table__body__td'][2]";
	String deleteRuleIcon = "//div[@class='sortable-table__body__td']/button[2]";
	String inactiveToggle = "//button[text()='Inactive']";
	String activeToggle = "//button[text()='Active']";

	By EditAssignmentIcon = By.xpath(editAssignmentIcon);
	public static By AssignmentRuleSideBar = By.xpath(assignmentRuleSideBar);
	By EditAssignmentPopup = By.xpath(editAssignmentPopup);
	By NameField = By.xpath(nameField);
	By DescriptionField = By.xpath(descriptionField);
	By ActionDropdown = By.xpath(actionDropdown);
	By OptionActionDropdown = By.xpath(optionActionDropdown);
	By CrossIconRuleSet = By.xpath(crossIconRuleSet);
	By SaveButton = By.xpath(saveButton);
	By ValidationNoRule = By.xpath(validationNoRule);
	By AddRuleButton = By.xpath(addRuleButton);
	By CreateRule = By.xpath(createRule);
	By CriteriaFields = By.xpath(criteriaFields);
	By ZipOption = By.xpath(zipOption);
	By EqualsOption = By.xpath(equalsOption);
	By ValueField = By.xpath(valueField);
	By AddCriteriaLink = By.xpath(addCriteriaLink);
	By EqualsOption2 = By.xpath(equalsOption2);
	By CaseAssigneeField = By.xpath(caseAssigneeField);
	By InspectionAssigneeField = By.xpath(inspectionAssigneeField);
	By UserOptionCA = By.xpath(userOptionCA);
	By UserOptionIA = By.xpath(userOptionIA);
	By CreateRulebutton = By.xpath(createRulebutton);
	By AddedRule = By.xpath(addedRule);
	By EditRuleIcon = By.xpath(editRuleIcon);
	By UserOptionCA2 = By.xpath(userOptionCA2);
	By SaveButtonEditRule = By.xpath(saveButtonEditRule);
	By AssignCaseToColumn = By.xpath(assignCaseToColumn);
	By DeleteRuleIcon = By.xpath(deleteRuleIcon);
	By InactiveToggle = By.xpath(inactiveToggle);
	By BlockOption = By.xpath(blockOption);
	By ValueField2 = By.xpath(valueField2);
	By ActiveToggle = By.xpath(activeToggle);

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();
		
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
	
	
	 public  void Navigate_To_AssignmentRules() throws InterruptedException {

	      waitForPresenceandVisiblity(AssignmentRuleSideBar);
	      ScrollIntoView(AssignmentRuleSideBar);
	      WaitForElementInteractable(AssignmentRuleSideBar);
	      ClickByJsExecuter(AssignmentRuleSideBar);
	      WaitForCurserRunning(2);


	    }


	
	public void CaseAssignment_OpenEditAssignmentPopup() throws InterruptedException {
		NavigateTo_AgencySetup();
		Navigate_To_AssignmentRules();
		WaitUntilVisible(EditAssignmentIcon);
		WaitUntilVisible(EditAssignmentIcon);
		WaitForElementInteractable(EditAssignmentIcon);
		ClickOn(EditAssignmentIcon);
		String PopupTitle = GetText(EditAssignmentPopup);
		Assert.assertEquals(PopupTitle, "Edit Assignment");
	}

	
	public void CaseAssignment_EditFieldsOnEditAssignmentPopup() throws InterruptedException {
	       
		String RandomName = RandomStrings.RequiredString(10);

		WebElement Name = WaitUntilVisibleWE(NameField);

		Name.clear();
		Name.sendKeys(RandomName);
		String NameValue = WaitUntilVisibleWE(NameField).getAttribute("value");
		Assert.assertEquals(NameValue, RandomName);
	}

	
	public void CaseAssignment_NotAbleToUpdateWithoutRule() throws InterruptedException {	    
		try {
		ScrollIntoView(CrossIconRuleSet);
		}
		catch(WebDriverException we) {
			we.printStackTrace();
		}

		WaitforCustometime(2);
		List<WebElement> CrossIcon = driver.findElements(CrossIconRuleSet);

		int CountCrossIcons = CrossIcon.size();
		while (CountCrossIcons > 0) {
			WaitForElementInteractable(CrossIconRuleSet);
			driver.findElement(CrossIconRuleSet).click();

			WaitforCustometime(2);
			CountCrossIcons--;
		}

		ClickOn(SaveButton);
		String NoRuleValidation = GetText(ValidationNoRule);
		String ExpectedValidation = "At least one rule should be present.";
		Assert.assertEquals(NoRuleValidation, ExpectedValidation);
	}

	
	public void CaseAssignment_OpenCreateRulepopup() {	        
		ClickOn(AddRuleButton);
		String PopupTitle = GetText(CreateRule);
		Assert.assertEquals(PopupTitle, "Create Rule");
	}

	
	public void CaseAssignment_CreateRuleWithMultipleCriterias() throws InterruptedException {
		ClickOn(CriteriaFields);
		WaitForElementInteractable(ZipOption);
		ClickOn(ZipOption);
		ClickOn(CriteriaFields);
		WaitForElementInteractable(EqualsOption);
		ClickOn(EqualsOption);
		WaitForElementInteractable(ValueField);
		SendKeys(ValueField, "77590");
		ClickOn(AddCriteriaLink);
		ClickOn(CriteriaFields);
		WaitForElementInteractable(BlockOption);
		ClickOn(BlockOption);
		ClickOn(CriteriaFields);
		WaitForElementInteractable(EqualsOption2);
		ClickOn(EqualsOption2);
		WaitForElementInteractable(ValueField2);
		SendKeys(ValueField2, "1");
		ClickOn(CaseAssigneeField);
		WaitForElementInteractable(UserOptionCA);
		ClickOn(UserOptionCA);
		ClickOn(InspectionAssigneeField);
		WaitForElementInteractable(UserOptionIA);
		ClickOn(UserOptionIA);
		ClickOn(CreateRulebutton);
		WaitForElementInteractable(AddedRule);
		List<WebElement> RulesCount = driver.findElements(AddedRule);
		boolean SizeAfter = RulesCount.size() >= 1;
		Assert.assertEquals(SizeAfter, true);

	}

	
	public void CaseAssignment_EditAddedRule() throws InterruptedException {
		String AssigneeBefore = GetText(AssignCaseToColumn);
		ClickOn(EditRuleIcon);
		ClickOn(CaseAssigneeField);
		WaitForElementInteractable(UserOptionCA2);
		ClickOn(UserOptionCA2);
		WaitForElementInteractable(SaveButtonEditRule);
		ClickOn(SaveButtonEditRule);
		String AssigneeAfter = GetText(AssignCaseToColumn);
		boolean CompareStr = AssigneeBefore.equals(AssigneeAfter);
		Assert.assertEquals(CompareStr, false);

	}

	
	public void CaseAssignment_DeleteAddedRule() {
		List<WebElement> RulesCountBefore = driver.findElements(AddedRule);
		int BeforeDeleting = RulesCountBefore.size();
		ClickOn(DeleteRuleIcon);
		List<WebElement> RulesCountAfter = driver.findElements(AddedRule);
		int AfterDeleting = RulesCountAfter.size();
		boolean CompareCount = (AfterDeleting == BeforeDeleting - 1);
		Assert.assertEquals(CompareCount, true);

	}

	
	public void CaseAssignment_AssignmentRuleUnderInactiveSection() throws InterruptedException {
		ClickOn(AddRuleButton);
		ClickOn(CriteriaFields);

		WaitForElementInteractable(ZipOption);
		ClickOn(ZipOption);
		ClickOn(CriteriaFields);

		WaitForElementInteractable(EqualsOption);
		ClickOn(EqualsOption);

		WaitForElementInteractable(ValueField);
		SendKeys(ValueField, "77590");
		ClickOn(CaseAssigneeField);

		WaitForElementInteractable(UserOptionCA);
		ClickOn(UserOptionCA);
		ClickOn(InspectionAssigneeField);

		WaitForElementInteractable(UserOptionIA);
		ClickOn(UserOptionIA);
		ClickOn(CreateRulebutton);

		WaitForElementInteractable(InactiveToggle);
		ClickOn(InactiveToggle);
		ClickOn(SaveButton);
		WaitForCurserRunning(5);
		WaitUntilVisible(By.xpath("//div[@role='gridcell']"));
		WaitUntilPresent(By.xpath("//div[@role='gridcell']"));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
		WaitUntilVisible(EditAssignmentIcon);
		waitForStaleElementReference(EditAssignmentIcon);
		WaitUntilPresent(EditAssignmentIcon);
		WaitForElementInteractable(EditAssignmentIcon);
		ClickByJsExecuter(EditAssignmentIcon);
		WaitUntilVisible(ActiveToggle);
		WaitUntilPresent(ActiveToggle);
		WaitForElementInteractable(ActiveToggle);
		ClickByJsExecuter(ActiveToggle);
		WaitUntilVisible(SaveButton);
		WaitForElementInteractable(SaveButton);
		ClickByJsExecuter(SaveButton);

	}


	

}
