package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	SubCategoryPage scp;
  @Test(priority=1)
  public void verifyUserIsAbleToAddNewSubCategoryWithValidDetails() throws IOException {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  scp= hp.clickOnSubCategoryButton().clickOnNewSubCategoryButton().clickOnSelectCategoryOption().enterSubCategoryField()
			 .clickOnChoosefile().clickOnSaveButton();
	 boolean actualResult = scp.getAlertMessage();
	 boolean expectedResult = true;
	 Assert.assertEquals(actualResult,expectedResult,Constants.SCP_verifyUserIsAbleToAddNewSubCategoryWithValidDetails);  
  }
  @Test(priority=2)
  public void verifyUserIsAbleToSearchTheSubCategoryIsNotPresent() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  scp= hp.clickOnSubCategoryButton().clickOnSearchButton().clickOnSelectSearchCategoryOption().enterSearchSubCategoryField()
			  .clickOnSearchOptionButton();
	  boolean expectedResult = true;
	  boolean actualResult = scp.checkOnResult();
	  Assert.assertEquals(expectedResult, actualResult,Constants.SCP_verifyUserIsAbleToSearchTheSubCategoryIsNotPresent);
	  
	  
	  
	  
  }
  @Test(priority=3)
  public void verifyUserIsAbleToResetTheSubCategory() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  scp= hp.clickOnSubCategoryButton().clickOnResetButton();
	  boolean expectedResult = true;
	  boolean actualResult = scp.checkOnTableTitleIsDisplayed();
	  Assert.assertEquals(expectedResult, actualResult,Constants.SCP_verifyUserIsAbleToResetTheSubCategory);
	  
}
}
