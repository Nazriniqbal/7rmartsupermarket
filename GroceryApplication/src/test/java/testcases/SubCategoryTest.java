package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends BaseClass{
  @Test
  public void addSubCategory() throws IOException {
	  LoginPage login = new LoginPage(driver);
	  login.loginByUsingExcelData();
	  
	  HomePage home=new HomePage(driver);
	  home.getHomePageText();
	  home.clickOnSubCategoryButton();
	  
	  SubCategoryPage sub=new SubCategoryPage(driver);
	 // sub.clickOnSubCategoryButton();
	  sub.clickOnNewSubCategoryButton();
	  sub.clickOnSelectCategoryOption();
	  sub.enterSubCategoryField();
	  sub.clickOnChoosefile();
	  sub.clickOnSaveButton();
	 boolean actualResult = sub.getAlertMessage().contains("Sub Category Created Successfully");
	 boolean expectedResult = true;
	 Assert.assertEquals(actualResult,expectedResult,"Alert message is not as expected");  
  }
  @Test(enabled = false)
  public void searchSubCategory() throws IOException
  {
	  LoginPage login = new LoginPage(driver);
	  login.loginByUsingExcelData();
	  
	  HomePage home=new HomePage(driver);
	  home.getHomePageText();
	  home.clickOnSubCategoryButton();
	  
	  SubCategoryPage sub=new SubCategoryPage(driver);
	  //sub.clickOnSubCategoryButton();
	  sub.clickOnSearchButton();
	  sub.clickOnSelectSearchCategoryOption();
	  sub.enterSearchSubCategoryField();
	  sub.clickOnSearchOptionButton();
	  
	  boolean expectedResult = true;
	  boolean actualResult = sub.getSubCategoryPageText().contains("");
	  
	  
	  
	  
  }
  @Test(enabled = false)
  public void resetSubCategory() throws IOException
  {
	  LoginPage login = new LoginPage(driver);
	  login.loginByUsingExcelData();
	  
	  HomePage home=new HomePage(driver);
	  home.getHomePageText();
	  home.clickOnSubCategoryButton();
	  
	  SubCategoryPage sub=new SubCategoryPage(driver);
	 // sub.clickOnSubCategoryButton();
      sub.clickOnResetButton();
}
}
