package testcases;
import utilities.ScreenshotUtility;
import utilities.WaitUtilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public WebDriver driver;
	Properties prop;
	FileInputStream fis;
	WaitUtilities waitutilities=new WaitUtilities();
	
	
	  @BeforeMethod(alwaysRun=true)
	  @Parameters("browser")
	  public void initializeBrowser(String browser) throws Exception 
	  {
		  prop=new Properties();
		  fis=new FileInputStream(Constants.CONFIGFILE);
		  prop.load(fis);
		  
		  if(browser.equalsIgnoreCase("Chrome")) 
		  {
		  driver=new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("Edge"))
		  {
			  driver=new EdgeDriver();  
		  }
		  else if(browser.equalsIgnoreCase("Firefox"))
		  {
			  driver=new FirefoxDriver();  
		  }
		  else
		  {
			  throw new Exception("Invalid Browser");
		  } 
		  
		  driver.get(prop.getProperty("url"));
		  driver.manage().window().maximize();
		  waitutilities.setImplicitWait(driver);
		  
	  }

	  @AfterMethod(alwaysRun=true)
	  public void driverQuit(ITestResult itestresult) throws IOException {
	 // driver.quit();
		  if(itestresult.getStatus()==ITestResult.FAILURE)
			{
				ScreenshotUtility screenshot=new ScreenshotUtility();
				screenshot.getScreenshot(driver,itestresult.getName());
			}

	  }

}
