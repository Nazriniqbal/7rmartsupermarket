package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends BaseClass {

  @Test(groups="smoke")
  public void addManageNews() throws IOException {
	  LoginPage login = new LoginPage(driver);
	  login.loginByUsingExcelData();
	  
	  HomePage home=new HomePage(driver);
	  home.getHomePageText();
	  home.clickOnManageNewsButton();
	  
	  ManageNewsPage mnt=new ManageNewsPage(driver);
	  mnt.clickOnManageNewsButton();
	  mnt.clickOnNewManageNewsButton();
	  mnt.enterManageNewsField();
	  mnt.clickOnSaveButton();
	  boolean actualResult = login.getAlertMessage().contains("News Created Successfully");
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,"Alert message is as expected");
  }
  @Test
  public void searchManageNews() throws IOException
  {
	  LoginPage login = new LoginPage(driver);
	  login.loginByUsingExcelData();
	  
	  HomePage home=new HomePage(driver);
	  home.getHomePageText();
	  home.clickOnManageNewsButton();
	  ManageNewsPage mnt=new ManageNewsPage(driver);
	  mnt.clickOnManageNewsButton();
	  mnt.clickOnManageNewsSearchButton();
	  mnt.enterSearchNewsTitleField();
	  mnt.clickOnSearchButton();
	  
  }
  @Test
  public void resetManageNews() throws IOException
  {
	  LoginPage login = new LoginPage(driver);
	  login.loginByUsingExcelData();
	  
	  HomePage home=new HomePage(driver);
	  home.getHomePageText();
	  home.clickOnManageNewsButton();
	  ManageNewsPage mnt=new ManageNewsPage(driver);
	  mnt.clickOnManageNewsButton();
	  mnt.clickOnResetButton();
  
  }
  
  @Test
  public void editManageNews() throws IOException
  {
	  LoginPage login = new LoginPage(driver);
	  login.loginByUsingExcelData();
	  
	  HomePage home=new HomePage(driver);
	  home.getHomePageText();
	  home.clickOnManageNewsButton();
	  ManageNewsPage mnt=new ManageNewsPage(driver);
	  mnt.clickOnManageNewsButton();
	  mnt.clickOnEditButton();
	  mnt.enterUpdateNewsfield();
	  mnt.clickOnUpdateButton();
	  boolean actualResult = login.getAlertMessage().contains("News Updated Successfully ");
	  boolean expectedResult = true;
	  Assert.assertEquals(expectedResult,actualResult,"Alert message is as expected");
  
  }

}
