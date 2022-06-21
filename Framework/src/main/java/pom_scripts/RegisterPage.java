package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@value='M']")
	private WebElement genderMaleRadioButton;
	
	public void clickGenderMaleRadioButton(){
		genderMaleRadioButton.click();
	}

	@FindBy(xpath="//input[@value='F']")
	private WebElement genderFemaleRadioButton;
	
	public void clickGenderFemaleRadioButton(){
		genderFemaleRadioButton.click();;
	}
	
	@FindBy(id= "FirstName")
	private WebElement firstnameTextfield;
	
	public void firstnameTextfield(String firstname){
		firstnameTextfield.sendKeys(firstname);
	}
	
	@FindBy(id= "LastName")
	private WebElement lastnameTextField;
	
	public void lastnameTextField(String lastname){
		lastnameTextField.sendKeys(lastname);
	}
	
	@FindBy(id= "Email")
	private WebElement emailTextField;
	
	public void email_value(String email){
		emailTextField.sendKeys(email);
	}
	
	@FindBy(id= "Password")
	private WebElement passwordTextField;
	
	public void password_value(String password){
		passwordTextField.sendKeys(password);
	}
	
	@FindBy(id= "ConfirmPassword")
	private WebElement confirmpasswordTextField;
	
	public void confirmpassword_value(String confirmpassword){
		confirmpasswordTextField.sendKeys(confirmpassword);
	}
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	public void registerButton(){
		registerButton.click();
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	public void continueButton(){
		continueButton.click();
	}
	
	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}

	public WebElement getGenderMaleRadioButton() {
		return genderMaleRadioButton;
	}

	public WebElement getGenderFemaleRadioButton() {
		return genderFemaleRadioButton;
	}

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmpasswordTextField() {
		return confirmpasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setGenderMaleRadioButton(WebElement genderMaleRadioButton) {
		this.genderMaleRadioButton = genderMaleRadioButton;
	}

	public void setGenderFemaleRadioButton(WebElement genderFemaleRadioButton) {
		this.genderFemaleRadioButton = genderFemaleRadioButton;
	}

	public void setFirstnameTextfield(WebElement firstnameTextfield) {
		this.firstnameTextfield = firstnameTextfield;
	}

	public void setLastnameTextField(WebElement lastnameTextField) {
		this.lastnameTextField = lastnameTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public void setConfirmpasswordTextField(WebElement confirmpasswordTextField) {
		this.confirmpasswordTextField = confirmpasswordTextField;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
}
