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
  public void verifyUserIsAbleTOAddNewNewsWithValidDetails() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickOnManageNewsButton().clickOnNewManageNewsButton().enterManageNewsField().clickOnSaveButton();
	  boolean actualResult = mnp.getAlertMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifyUserIsAbleTOAddNewNewsWithValidDetails);
  }
  @Test
  public void verifyUserIsAbleToSearchTheNewsThatIsNotPresent() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickOnManageNewsButton().clickOnManageNewsSearchButton().enterSearchNewsTitleField().clickOnSearchButton();
	  boolean actualResult = mnp.checkOnResultMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifyUserIsAbleToSearchTheNewsThatIsNotPresent);
	 
   }
  
  @Test
  public void verifyUserIsAbleToResetTheNews() throws IOException
  {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickOnManageNewsButton().clickOnResetButton();
	  boolean actualResult = mnp.checkOnTableTitleIsDisplayed();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifyUserIsAbleToResetTheNews);
  
  }
  
  @Test
  public void verifyUserIsAbleToEditTheNewsWithValidDetails() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickOnManageNewsButton().clickOnEditButton().enterUpdateNewsfield().clickOnUpdateButton();
      boolean actualResult = mnp.getAlertMessage();
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,Constants.MNP_verifyUserIsAbleToEditTheNewsWithValidDetails);
  
  }

}
