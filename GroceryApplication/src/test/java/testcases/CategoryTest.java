package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;

public class CategoryTest extends BaseClass{

	@Test
	  public void addCategory() throws IOException {
		  LoginPage login = new LoginPage(driver);
		  login.loginByUsingExcelData();
		  
		  HomePage home=new HomePage(driver);
		  home.getHomePageText();
		  home.clickOnCategoryButton();
		  
		  CategoryPage cp=new CategoryPage(driver);
		  //cp.clickOnCategoryButton();
		  cp.clickOnNewCategoryButton();
		  cp.enterOnCategoryField();
		  cp.selectGroupsOnCategoryList();
		  cp.clickOnRadioButton1();
		  cp.clickOnRadioButton2();
		  cp.clickOnChoosefile();
		  cp.clickOnSaveButton();
		  boolean actualResult = cp.getAlertMessage().contains("Category Created Successfully");
		  boolean expectedResult = true;
		  Assert.assertEquals(expectedResult,actualResult,"Alert message is not as expected");  
		  
	}
	@Test
	  public void searchCategory() throws IOException {
		  LoginPage login = new LoginPage(driver);
		  login.loginByUsingExcelData();
		  
		  HomePage home=new HomePage(driver);
		  home.getHomePageText();
		  home.clickOnCategoryButton();
		  
		  CategoryPage cp=new CategoryPage(driver);
		  //cp.clickOnCategoryButton();
		  cp.clickOnSearchButton();
		  cp.enterOnSearchCategoryField();
		  cp.clickOnSearchsubmitButton();
		  
     }
	
	@Test
	  public void resetCategory() throws IOException {
		  LoginPage login = new LoginPage(driver);
		  login.loginByUsingExcelData();
		  
		  HomePage home=new HomePage(driver);
		  home.getHomePageText();
		  home.clickOnCategoryButton();
		  
		  CategoryPage cp=new CategoryPage(driver);
		  //cp.clickOnCategoryButton();
		  cp.clickOnResetButton();
	}
	
}
