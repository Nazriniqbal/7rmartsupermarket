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
  public void verifyAddSubCategory() throws IOException {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  hp=new HomePage(driver);
	  scp= hp.clickOnSubCategoryButton().clickOnNewSubCategoryButton().clickOnSelectCategoryOption().enterSubCategoryField()
			 .clickOnChoosefile().clickOnSaveButton();
	 boolean actualResult = scp.getAlertMessage();
	 boolean expectedResult = true;
	 Assert.assertEquals(actualResult,expectedResult,Constants.SCP_verifyAddSubCategory);  
  }
  @Test(priority=2)
  public void verifySearchSubCategory() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  hp=new HomePage(driver);
	  scp= hp.clickOnSubCategoryButton().clickOnSearchButton().clickOnSelectSearchCategoryOption().enterSearchSubCategoryField()
			  .clickOnSearchOptionButton();
	  boolean expectedResult = true;
	  boolean actualResult = scp.checkOnResult();
	  Assert.assertEquals(expectedResult, actualResult,Constants.SCP_verifySearchSubCategory);
	  
	  
	  
	  
  }
  @Test(priority=3)
  public void verifyResetSubCategory() throws IOException
  {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  hp=new HomePage(driver);
	  scp= hp.clickOnSubCategoryButton().clickOnResetButton();
	  boolean expectedResult = true;
	  boolean actualResult = scp.checkOnTableTitleIsDisplayed();
	  Assert.assertEquals(expectedResult, actualResult,Constants.SCP_verifyResetSubCategory);
	  
}
}
