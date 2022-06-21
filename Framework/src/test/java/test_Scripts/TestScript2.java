package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.RegisterPage;
import pom_scripts.WelcomePage;

public class TestScript2 extends Base_Test{
	@Test(dataProvider = "testdata")
	public void testScript2(String male, String firstname, String lastname, String email, String password, String confirmpassword) throws IOException, InterruptedException {
		  WelcomePage welcomepage=new WelcomePage(driver);
		  welcomepage.clickRegister();
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
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		  test.log(LogStatus.INFO, "User is logged in");
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Register");
		return testdata;
	}
}
