package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {
	
	public static int IMPLICITWAIT=10;
	public static int EXPLICITWAIT=10;
	public static int FLUENTWAIT=2;
	
	public void fluentWaitElements(WebDriver driver, WebElement element, String attribute, String attributeValue,
			int total) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(total))
				.pollingEvery(Duration.ofSeconds( FLUENTWAIT)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
	}
	
	public void waitForWebElementAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void waitUntilElementIsVisible(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOf(null));
	}
	
	public void setImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITWAIT));
	}
	public void setExplicitWait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
		   wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForClickingElement(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void waitForTextToBePresentInEelement(WebDriver driver,WebElement element,String text) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	public static void waitForElementToBeSelected(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public static void waitForAttributeToBe(WebDriver driver,WebElement element,String attribute,String value) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.attributeToBe(element,attribute,value));
	}

}