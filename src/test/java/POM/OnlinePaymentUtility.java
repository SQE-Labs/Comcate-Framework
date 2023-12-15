package POM;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;



public class OnlinePaymentUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	PerformInspectionUtility PI;
	CCPUtility ccp;
	ForcedAbatementUtility FA;
	CECommonMethods CEcommonMethod;
	CLPUtility clp;
	
	public OnlinePaymentUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		PI = new PerformInspectionUtility(driver);
		ccp = new CCPUtility(driver);
		FA = new ForcedAbatementUtility(driver);
		CEcommonMethod=new CECommonMethods(driver);
		clp=new CLPUtility(driver);
	}
	public static String outstandingBalDetails = "//label[text()='Outstanding Balance']//parent::div//a[@class='view-details']";
    public static String finePaymentDetailsPopup = "//div[contains(text(),'Fines & Payments Details')]";
    public static String selectFineDropdownArrow = "//label[@title='Select Fine']//parent::div//parent::div//span[@class='Select-arrow']";
    public static String selectFineOptions = "(//div[@class='Select-menu-outer']//div[@role='option'])[1]";
    public static String addNewFine = "//div[@class='add-transaction']//button[text()='Add Fine']";
    public static String closeFinePaymentDetailsPop = "//div[contains(text(),'Fines & Payments Details')]//parent::div//button[text()='Close']";
    public static String voidIconFinePaymentList = "(//img[@class='void-icon'])[1]";
    public static String unpaidButton = "//button[text()='Unpaid']";
    public static String contactName = "(//div[@class='contact__name']//label//b)[1]";
    public static String paymentSideBar = "//label[text()='Payments']";
    public static String citizenPaymentProtal = "//label[text()='Citizen Payment Portal']";
    public static String paymentPortallinkText = "//div[@class='payment-portal-form__url-section__url']//h5";
    public static String copyPaymentPortalLink = "//div[@class='payment-portal-form__url-section__url']//button";
    public static String defaultPaymentPortaltitle = "//input[@placeholder='Enter Payment Portal Title'][@name='title']";
    public static String savePaymentPorrtalSettings = "//button[text()='Save Changes']";
    public static String paymentPortalHeaderTitle = "//section[@class='payment-info']//h1";
    public static String paymentPortalDescription = "//div[@class='payment-description']//p";
    public static String paymentPortalParaGraphText = "//textarea[@name='description']";
    public static String caseSearchButton = "//div[@class='case-search-fields']//following-sibling::button";
    public static String validationErrorMessage = "//span[@class='field__error']";
    public static String notificationError = "//div[@class='notifications-wrapper']";
    public static String caseNumberField = "//input[@name='caseNumber']";
    public static String noticenameField = "//input[@name='nameOnNotice']";
    public static String balanceDetails = "//header[@class='outstanding-balance-details']//div[@class='balance']";
    public static String balnceOnCDP = "//div[@class='field-section outstanding-balance']//span";
    public static String totalTransactionAmount = "//header[@class='payment-portal-total-payment-details']//div[@class='amount']";
    public static String enterPaymentdetailbtn = "//div[@class='payment-details-btn-container']//button";
    public static String orderSummary = "//label[contains(text(),'Order Summary')]";
    public static String cardDetails = "//input[@id='cardNum'][@name='cardNum']";
    public static String cardExPDate = "//input[@id='expiryDate'][@name='expiryDate']";
    public static String cardCVVCode = "//input[@id='cvv'][@name='cvv']";
    public static String payButton = "//button[@id='payBtn']";
    public static String receiptMerchantName = "//label[@id='receiptMerchantName']";
    public static String receiptTransactMessage = "//label[@id='receiptTransactMessage']";
    public static String receiptTransactionId = "//label[@id='receiptTransactionId']";
    public static String paymnetdetailsExpander = "(//div[@class='rt-expander'])[1]";
    public static String paymentTransactionndetails = "//div[@class='expanded-row-content']//label[contains(text(),'AUTHORIZE')]//label";
    public static String voidPayment = "//div[contains(text(),'Void or Refund Payment')]";
    public static String reasonForVoid = "//textarea[@name='reason']";
    public static String voidPaymentbutton = "//button[text()='Void Payment']";
    public static String voidfineBtn = "//button[text()='Void Fine']";
    public static String waivefineBtn = "//button[text()='Waive Fine']";
    public static String voidLable = "((//div[@class='rt-expander'])[1]//ancestor::div[@role='rowgroup']//div[@role='gridcell'])[4]//button";
    public static String paymentNullified = "((//div[@class='rt-expander'])[1]//ancestor::div[@role='rowgroup']//div[@role='gridcell'])[5]//span[@class='payment_amount is-nullified']";
    public static String fineNullified = "((//div[@class='rt-expander'])[1]//ancestor::div[@role='rowgroup']//div[@role='gridcell'])[5]//span[@class='is-nullified']";
    public static String minimumPayAmount = "//input[@name='paymentAmount']";
    public static String cardInvalidError = "errorMsgID";
    public static String addedfineDetails = "//div[@role='rowgroup']//div[@role='gridcell']//span";
    public static String addPayment = "//button[text()='Add Payment']";
    public static String addPaymentAmnt = "//input[@name='amount']";
    public static String selectPayor = "//div[text()='Payor']";
    public static String selectPayorOpt = "(//div[@class='Select-menu-outer']//div[@class='Select-option'])[1]";
    public static String addPaymentbtn = "//div[@class='add-transaction']//button";
    public static String addFineToggle = "//button[text()='Add Fine']";
    public static String dueDatePicker = "//span[@class='datepicker-image']";
    public static String prevDateArrow = "//th[@class='rdtPrev']";
    public static String selectDate10 = "//td[@data-value='10']";
    public static String overdueFineLbl = "//Button[text()='Unpaid']//following-sibling::span[@class='is-overdue']";
    public static String paymentVoid = "(//div[@class='rt-td']//span[contains(text(),'Payment')]//parent::div//following-sibling::div[@role='gridcell'])[2]";
    public static String paymentCashNullified = "(//div[@class='rt-td']//span[contains(text(),'Payment')]//parent::div//following-sibling::div[@role='gridcell'])[3]//span[@class='payment_amount is-nullified']";
    public static String paymentVoidSymbol = "//div[@class='rt-td']//span[contains(text(),'Payment')]//parent::div//following-sibling::div[@role='gridcell']//img[@class='void-icon']";



    public static By OutstandingBalDetails = By.xpath(outstandingBalDetails);
    public static By PaymentVoidSymbol = By.xpath(paymentVoidSymbol);
    public static By PaymentCashNullified = By.xpath(paymentCashNullified);
    public static By PaymentVoid = By.xpath(paymentVoid);
    public static By OverdueFineLbl = By.xpath(overdueFineLbl);
    public static By AddPayment = By.xpath(addPayment);
    public static By SelectDate10 = By.xpath(selectDate10);
    public static By PrevDateArrow = By.xpath(prevDateArrow);
    public static By DueDatePicker = By.xpath(dueDatePicker);
    public static By AddFineToggle = By.xpath(addFineToggle);
    public static By AddPaymentbtn = By.xpath(addPaymentbtn);
    public static By SelectPayorOpt = By.xpath(selectPayorOpt);
    public static By SelectPayor = By.xpath(selectPayor);
    public static By AddPaymentAmnt = By.xpath(addPaymentAmnt);
    public static By AddedfineDetails = By.xpath(addedfineDetails);
    public static By ReasonForVoid = By.xpath(reasonForVoid);
    public static By PaymentNullified = By.xpath(paymentNullified);
    public static By FineNullified = By.xpath(fineNullified);
    public static By VoidLable = By.xpath(voidLable);
    public static By VoidPaymentbutton = By.xpath(voidPaymentbutton);
    public static By VoidfineBtn = By.xpath(voidfineBtn);
    public static By PaymnetdetailsExpander = By.xpath(paymnetdetailsExpander);
    public static By PaymentTransactionndetails = By.xpath(paymentTransactionndetails);
    public static By PaymentSideBar  = By.xpath(paymentSideBar);
    public static By CitizenPaymentProtal = By.xpath(citizenPaymentProtal);
    public static By FinePaymentDetailsPopup = By.xpath(finePaymentDetailsPopup);
    public static By SelectFineDropdownArrow = By.xpath(selectFineDropdownArrow);
    public static By SelectFineOptions = By.xpath(selectFineOptions);
    public static By AddNewFine = By.xpath(addNewFine);
    public static By CloseFinePaymentDetailsPop = By.xpath(closeFinePaymentDetailsPop);
    public static By VoidIconFinePaymentList = By.xpath(voidIconFinePaymentList);
    public static By UnpaidButton = By.xpath(unpaidButton);
    public static By ContactName  = By.xpath(contactName);
    public static By PaymentPortallinkText = By.xpath(paymentPortallinkText);
    public static By CopyPaymentPortalLink = By.xpath(copyPaymentPortalLink);
    public static By DefaultPaymentPortaltitle = By.xpath(defaultPaymentPortaltitle);
    public static By SavePaymentPorrtalSettings = By.xpath(savePaymentPorrtalSettings);
    public static By PaymentPortalHeaderTitle = By.xpath(paymentPortalHeaderTitle);
    public static By PaymentPortalParaGraphText = By.xpath(paymentPortalParaGraphText);
    public static By PaymentPortalDescription = By.xpath(paymentPortalDescription);
    public static By CaseSearchButton = By.xpath(caseSearchButton);
    public static By ValidationErrorMessage = By.xpath(validationErrorMessage);
    public static By NotificationError = By.xpath(notificationError);
    public static By CaseNumberField = By.xpath(caseNumberField);
    public static By NoticenameField = By.xpath(noticenameField);
    public static By BalanceDetails = By.xpath(balanceDetails);
    public static By BalnceOnCDP = By.xpath(balnceOnCDP);
    public static By TotalTransactionAmount = By.xpath(totalTransactionAmount);
    public static By EnterPaymentdetailbtn = By.xpath(enterPaymentdetailbtn);
    public static By OrderSummary = By.xpath(orderSummary);
    public static By CardDetails = By.xpath(cardDetails);
    public static By CardExPDate = By.xpath(cardExPDate);
    public static By CardCVVCode = By.xpath(cardCVVCode);
    public static By PayButton = By.xpath(payButton);
    public static By ReceiptMerchantName = By.xpath(receiptMerchantName);
    public static By ReceiptTransactMessage = By.xpath(receiptTransactMessage);
    public static By ReceiptTransactionId = By.xpath(receiptTransactionId);
    public static By VoidPayment = By.xpath(voidPayment);
    public static By MinimumPayAmount = By.xpath(minimumPayAmount);
    public static By CardInvalidError = By.id(cardInvalidError);
    public static By WaivefineBtn = By.xpath(waivefineBtn);





    public static Boolean FinePaymentDetailsHeader;
    public static int UnPaidFinePaymentCounBefore ;
    public static int UnPaidFinePaymentCounAfter ;
    public static String caseId;
    public static String caseOutstandingBal;
    public static String BillToContactName;
    public static String expectedPortalLink;
    public static String actualPortalLink;
    public static String DefaultPaymentPortaltitleText;
    public static String DefaultPaymentParaGraphText;
    public static String paymentProtalText = "Look Up and Pay Outstanding Balances";
    public static String actualPaymentPortalHeaderTitle;
    public static String actualPaymentPortalDescription;
    public static String actualPaymentPortal;


   
}
