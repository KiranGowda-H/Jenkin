package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.JewelryPage;
import pom_scripts.LoginPage;
import pom_scripts.ProductPage;
import pom_scripts.WelcomePage;

public class TestScript16 extends Base_Test{
	@Test(dataProvider = "testdata")
	public void testScript3(String email, String pwd) throws IOException, InterruptedException {
		  WelcomePage welcomePage=new WelcomePage(driver);
		  welcomePage.clickLogin();
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.enterValueInEmail(email);
		  loginPage.enterValueInPwd(pwd); 
		  loginPage.clickLoginButton();
		  test.log(LogStatus.INFO, "User is logged in");
		  HomePage homePage=new HomePage(driver);
		  homePage.jewelryButton();
		  Thread.sleep(2000);
		  JewelryPage jewelryPage=new JewelryPage(driver);
		  jewelryPage.createYourOwnJewelryPage();
		  jewelryPage.lengthInCmTf("10");
		  ProductPage productPage=new ProductPage(driver);
		  productPage.emailAFriendbutton();
		  productPage.friendEmailTf("222222222222@gmail.com");
		  productPage.sendEmailButton();
		  productPage.productLinkPage();
		  productPage.addToComparelistbutton();
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}
}
