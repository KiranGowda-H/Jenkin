package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Books;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.ProductPage;
import pom_scripts.WelcomePage;

public class TestScript23 extends Base_Test{
	@Test(dataProvider = "testdata")
	public void testScript20(String email, String pwd) throws IOException, InterruptedException {
		  WelcomePage welcomePage=new WelcomePage(driver);
		  welcomePage.clickLogin();
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.enterValueInEmail(email);
		  loginPage.enterValueInPwd(pwd); 
		  loginPage.clickLoginButton();
		  /*welcomePage.clickRegister();
		  RegisterPage registerPage=new RegisterPage(driver);
		  if(male.equalsIgnoreCase("M")){
			  registerPage.clickGenderMaleRadioButton();
		  }else{
			  registerPage.clickGenderFemaleRadioButton();
		  }
		  registerPage.firstnameTextfield(firstname);
		  registerPage.lastnameTextField(lastname);
		  registerPage.email_value(email);
		  registerPage.password_value(password);
		  registerPage.confirmpassword_value(confirmpassword);
		  registerPage.registerButton();
		  registerPage.continueButton();*/
		  test.log(LogStatus.INFO, "User is logged in");
		  HomePage homePage=new HomePage(driver);
		  homePage.booksButton();
		  Books booksPage=new Books(driver);
		  booksPage.sortByDropdown();
		  booksPage.displayPerPageDropdown();
		  booksPage.viewAsDropdown();
		  booksPage.filter25to50();
		  booksPage.removeFilter();
		  booksPage.fictionBook();
		  booksPage.fictionBookPage();
		  ProductPage productPage=new ProductPage(driver);
		  productPage.facebookIcon();
		  homePage.shoppingcartLink();
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
}
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}
}
