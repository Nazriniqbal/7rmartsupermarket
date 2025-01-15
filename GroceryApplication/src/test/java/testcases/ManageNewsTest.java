package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageNewsPage mnp;

  @Test(groups="smoke")
  public void verifyNewManageNewsWithValidDetails() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  hp=new HomePage(driver);
	  mnp=hp.clickOnManageNewsButton().clickOnNewManageNewsButton().enterManageNewsField().clickOnSaveButton();
	  boolean actualResult = mnp.getAlertMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifyAddManageNews);
  }
  @Test
  public void verifyUserIsAbleToSearchTheManageNewsIsPresent() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  hp=new HomePage(driver);
	  mnp=hp.clickOnManageNewsButton().clickOnManageNewsSearchButton().enterSearchNewsTitleField().clickOnSearchButton();
	  boolean actualResult = mnp.checkOnTableTitleIsDisplayed();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifySearchManageNews);
	 
   }
  
  @Test
  public void verifyUserIsAbleToResetTheManageNews() throws IOException
  {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  hp=new HomePage(driver);
	  mnp=hp.clickOnManageNewsButton().clickOnResetButton();
	  boolean actualResult = mnp.checkOnTableTitleIsDisplayed();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifyResetManageNews);
  
  }
  
  @Test
  public void verifyUserIsAbleEditTheManageNewsWithValidDetails() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  hp=new HomePage(driver);
	  mnp=hp.clickOnManageNewsButton().clickOnEditButton().enterUpdateNewsfield().clickOnUpdateButton();
      boolean actualResult = mnp.getAlertMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifyEditManageNews);
  
  }

}
