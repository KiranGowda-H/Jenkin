package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.ElectronicsPage;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.ProductPage;
import pom_scripts.WelcomePage;

public class TestScript9 extends Base_Test{
	@Test(dataProvider = "testdata")
	public void testScript9(String email, String pwd) throws IOException, InterruptedException {
		  WelcomePage welcomePage=new WelcomePage(driver);
		  welcomePage.clickLogin();
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.enterValueInEmail(email);
		  loginPage.enterValueInPwd(pwd); 
		  loginPage.clickLoginButton();
		  test.log(LogStatus.INFO, "User is logged in");
		  HomePage homePage=new HomePage(driver);
		  homePage.electronicsButton();
		  ElectronicsPage electronicsPage=new ElectronicsPage(driver);
		  electronicsPage.cellPhonesPage();
		  electronicsPage.smartphonePage();
		  ProductPage productPage=new ProductPage(driver);
		  productPage.addToWishlistbutton();
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
}
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}
}
