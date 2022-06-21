package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Books;
import pom_scripts.CheckoutPage;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.ProductPage;
import pom_scripts.ShoppingLinkPage;
import pom_scripts.WelcomePage;

public class TestScript25 extends Base_Test{
	@Test(dataProvider = "testdata")
	public void testScript20(String email, String pwd) throws IOException, InterruptedException {
		  WelcomePage welcomePage=new WelcomePage(driver);
		  welcomePage.clickLogin();
		  LoginPage loginPage=new LoginPage(driver);
		  loginPage.enterValueInEmail(email);
		  loginPage.enterValueInPwd(pwd); 
		  loginPage.clickLoginButton();
		  test.log(LogStatus.INFO, "User is logged in");
		  HomePage homePage=new HomePage(driver);
		  homePage.booksButton();
		  Books booksPage=new Books(driver);
		  booksPage.fictionBookPage();
		  ProductPage productPage=new ProductPage(driver);
		  productPage.addToCartbutton();
		  homePage.shoppingcartLink();
		  ShoppingLinkPage shoppingLinkPage=new ShoppingLinkPage(driver);
		  shoppingLinkPage.discountCodeTf("hjgahs");
		  shoppingLinkPage.discountCodeButton();
		  shoppingLinkPage.giftCardTf("gyj32g23");
		  shoppingLinkPage.giftCardButton();
		  shoppingLinkPage.countryDropdown();
		  shoppingLinkPage.termsofserviceCheckbox();
		  shoppingLinkPage.checkoutButton();
		  CheckoutPage checkoutPage=new CheckoutPage(driver);
		  checkoutPage.billingAddress();
		  checkoutPage.shippingAddress();
		  checkoutPage.shippingMethod();
		  checkoutPage.paymentMethod();
		  checkoutPage.paymentInfo();
		  checkoutPage.confirmOrder();
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
	}
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}
}