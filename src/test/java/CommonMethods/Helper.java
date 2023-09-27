package CommonMethods;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import BrowsersBase.BrowsersInvoked;
import ExtentReport.ExtentReportClass;
import io.jsonwebtoken.security.Keys;

public class Helper {
	public WebDriver driver;
	public WebDriverWait wait;
	public  Wait<WebDriver> fluentWait ;
	ExtentReportClass extentClass;
	
	public Helper(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime15"))));
		fluentWait = new FluentWait<WebDriver>(driver);
		extentClass = new ExtentReportClass(driver);
	
	}
	
	
	public  void ClickOn(WebElement element,String...label ) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	
	
	public  void Navigation(String Url) {
		driver.get(Url);
		
	}

	public  void SendKeys(WebElement element, String value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public String GetText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		String text = element.getText();
		return text;
	}
	
	
	
	  public  void WaitUntilPresent(By element) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(NoSuchElementException.class,ElementNotInteractableException.class);
	            fluentWait1.until(ExpectedConditions.presenceOfElementLocated(element));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	        }
	    }


	    public  void WaitUntilElementPresent(By locator, int tries) {

	            for (int i = 0; i < tries; i++) {
	                try {
	                    Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                            .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                            .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                            .ignoring(NoSuchElementException.class);
	                    fluentWait1.until(ExpectedConditions.presenceOfElementLocated(locator));
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }

	    }

	    public  void WaitforCustometime(long time) {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	    }

	    public  void WaitUntilVisible(By element) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(NoSuchElementException.class,ElementNotInteractableException.class);
	            fluentWait1.until(ExpectedConditions.visibilityOfElementLocated(element));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public  void WaitUntilVisible(WebElement element) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(NoSuchElementException.class,ElementNotInteractableException.class);
	            fluentWait1.until(ExpectedConditions.visibilityOf(element));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	        }
	    }

	    public  void waitForStaleElementReference(By element){
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(StaleElementReferenceException.class);
	            fluentWait1.until(ExpectedConditions.presenceOfElementLocated(element));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	    public  void WaitUntilElementVisible(By locator, int tries) {
	        try {
	            for (int i = 0; i < tries; i++) {
	                Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                        .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                        .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                        .ignoring(TimeoutException.class);
	                fluentWait1.until(ExpectedConditions.visibilityOfElementLocated(locator));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public  void WaitForElementInteractable(By element) {

	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(ElementClickInterceptedException.class, ElementNotInteractableException.class);
	            fluentWait1.until(ExpectedConditions.elementToBeClickable(element));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	        }
	    }

	    public  void WaitForElementInteractable(WebElement element) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(ElementClickInterceptedException.class,ElementNotInteractableException.class);
	            fluentWait1.until(ExpectedConditions.elementToBeClickable(element));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	        }
	    }

	    public  void WaitUntilInvisible(By element) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(NoSuchElementException.class);
	            fluentWait1.until(ExpectedConditions.invisibilityOf(driver.findElement(element)));

	        } catch (WebDriverException e) {
	            e.printStackTrace();
	        }
	    }

	    public  void WaitUntilElementInvisible(By element) {

	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(TimeoutException.class);
	            fluentWait1.until(ExpectedConditions.invisibilityOfElementLocated(element));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	        }

	    }
	    public  boolean waitForElementContainsText(By ele,String text) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(TimeoutException.class);
	            return   fluentWait1.until(ExpectedConditions.textToBePresentInElementLocated(ele,text));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public  boolean waitForinvisibilityOfElementText(By ele,String text) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(TimeoutException.class);
	            return   fluentWait1.until(ExpectedConditions.invisibilityOfElementWithText(ele,text));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public  boolean WaitForElementInvisiblilty(WebElement ele) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(TimeoutException.class);
	          return   fluentWait1.until(ExpectedConditions.invisibilityOf(ele));
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public void WaitForCurserRunning(int tries) throws InterruptedException {

	        for (int i = 1; i <= tries; i++) {
	            try {
	                int elecheck = driver.findElements(By.xpath("//img[@src='/assets/loading.gif']")).size();
	                if (elecheck > 0) {
	                    WebElement ele = driver.findElement(By.xpath("//img[@src='/assets/loading.gif']"));
	                    wait.until(ExpectedConditions.invisibilityOf(ele));
	                } else {
	                    break;
	                }
	            } catch (Exception e) {
	                e.printStackTrace();

	            }
	        }

	    }

	    public  void WaitForPageLoadTime(long time) {
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time));
	    }

	    public  void ScriptTimeout(long time){
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(time));
	    }

	    public  void clearByJSE(By element) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	        wait.until(ExpectedConditions.presenceOfElementLocated(element));
	        WebElement ele = driver.findElement(element);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value ='';", ele);

	    }

	    public  String getTextByJSExecutor(By element){
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement ele = driver.findElement(element);
	        String elementText = (String) js.executeScript("return arguments[0].innerText;", ele);
	        return  elementText;
	    }

	    public  boolean ElementIsDisplayed(By path) {
	        try {
	            WebElement ele = driver.findElement(path);
	            return ele.isDisplayed();
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public  WebElement WaitUntilVisibleWE(By element) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(TimeoutException.class);
	            return fluentWait1.until(ExpectedConditions.visibilityOfElementLocated(element));
	        } catch (WebDriverException e) {
	            return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(element));
	        }
	    }

	    public  WebElement WaitUntilVisibleWE20(By element) {
	        try {
	            Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                    .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                    .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                    .ignoring(TimeoutException.class);
	            return fluentWait1.until(ExpectedConditions.visibilityOfElementLocated(element));
	        } catch (WebDriverException e) {
	            return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(element));
	        }

	    }


	    public  List<WebElement> WaitUntilVisibleList(By element) {
	        try {
	            return (List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	        } catch (WebDriverException e) {
	            return (List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	        }
	    }

	    public  void ClickOn(By element) {
	        wait.until(ExpectedConditions.presenceOfElementLocated(element));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        WebElement ele = driver.findElement(element);
	        ele.click();
	    }

	    public  void SendKeys(By element, String value) {
	        wait.until(ExpectedConditions.presenceOfElementLocated(element));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        WebElement ele = driver.findElement(element);
	        ele.sendKeys(value);
	    }

	    public  void VisibilityOfElementLocated(By element, int tries) {

	        for (int i = 1; i <= tries; i++) {
	            try {
	                wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }


	    }

	    public  void Clear(By element) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	        wait.until(ExpectedConditions.presenceOfElementLocated(element));
	        WebElement ele = driver.findElement(element);
	        ele.clear();
	    }

	    public  void ClickOnWE(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();
	    }

	    public  void ClickOnWE20(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        element.click();
	    }

	    public  String GetText(By element) {

	        wait.until(ExpectedConditions.presenceOfElementLocated(element));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        WebElement ele = driver.findElement(element);
	        String text = ele.getText();
	        return text;
	    }

	    public  void WaitForElementInteractable(By locator, int tries) {
	        try {
	            for (int i = 0; i < tries; i++) {
	                Wait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
	                        .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime20"))))
	                        .pollingEvery(Duration.ofMillis(Long.parseLong(PropertiesUtils.getPropertyValue("waitTime5"))))
	                        .ignoring(TimeoutException.class);
	                fluentWait1.until(ExpectedConditions.elementToBeClickable(locator));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public  void CloseOtherTabs() throws InterruptedException {
	        String originalHandle = driver.getWindowHandle();
	        Set<String> tabs = driver.getWindowHandles();

	        for (String handle : tabs) {
	            if (!handle.equals(originalHandle)) {
	                driver.switchTo().window(handle);
	                driver.close();
	            }
	        }

	        driver.switchTo().window(originalHandle);

	    }

	    public  void ScrollIntoView(By element) {
	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        WebElement ele = driver.findElement(element);
	        jse.executeScript("arguments[0].scrollIntoView(true);", ele);

	    }

	    public  String GetValueAttribute(By element) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	        WebElement ele = driver.findElement(element);
	        String text = ele.getAttribute("value");
	        return text;
	    }

	    public  void ClickByJsExecuter(By element) {
	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        WebElement ele = driver.findElement(element);
	        jse.executeScript("arguments[0].click();", ele);
	    }

	    public  void scrollToRight() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(6000,0)");
	    }

	    public  void scrolltoUp() {

	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        jse.executeScript("window.scrollBy(0,-400)");
	    }


	    public  void scrolltoUpCustom(int x, int y) {

	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        jse.executeScript("window.scrollBy(" + x + ",-" + y + ")");
	    }

	    public  WebElement FindElementByXPath(String selector) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selector)));
	        WebElement ele = driver.findElement(By.xpath(selector));
	        return ele;
	    }

	    public  List<WebElement> findElementsByXPath(By element) {
	        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	        List<WebElement> ele = driver.findElements(element);
	        return ele;
	    }

	    public  int fineElementsSize(By element){
	        int count = driver.findElements(element).size();
	        return count;
	    }

	    public  WebElement findElementByCssSelector(String selector) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
	        WebElement ele = driver.findElement(By.cssSelector(selector));
	        return ele;
	    }

	    public  List<WebElement> findElementsByCssSelector(String selector) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
	        List<WebElement> ele = driver.findElements(By.cssSelector(selector));
	        return ele;
	    }

	    public  WebElement findElementById(String selector) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.id(selector)));
	        WebElement ele = driver.findElement(By.id(selector));
	        return ele;
	    }


	    public  WebElement findElementByPartialLinkTxt(String selector) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(selector)));
	        WebElement ele = driver.findElement(By.partialLinkText(selector));
	        return ele;
	    }


	    public  WebElement findElementByName(String selector) {
	        wait.until(ExpectedConditions.elementToBeClickable(By.name(selector)));
	        WebElement ele = driver.findElement(By.name(selector));
	        return ele;
	    }

	   

	    public  void ScrollTillPageEnd() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

	    }

	    public  WebElement GetWebElementByJS(String CSSselector) {
	        JavascriptExecutor jser = (JavascriptExecutor) driver;
	        String query = "return document.querySelector('" + CSSselector;

	        WebElement CCPBtnJSE = (WebElement) jser.executeScript(query);
	        return CCPBtnJSE;
	    }

	    public  WebElement findElement(By element) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	        WebElement ele = driver.findElement(element);
	        return ele;
	    }

	    public  void forcedWaitTime(long time) throws InterruptedException {
	        long interval = 1000;
	        long sec = time * interval;
	        Thread.sleep(sec);
	    }

	    public  void refreshPage() {
	        driver.navigate().refresh();
	    }

	    public  void waitForPresenceandVisiblity(By ele){
	        WaitUntilVisible(ele);
	        WaitUntilPresent(ele);
	    }

	    public void moveToWebElement(WebElement element) {
	    	Actions a = new Actions(driver);
	    	a.moveToElement(element);
	    }
	
	
	
	
	
	
	
	
}
