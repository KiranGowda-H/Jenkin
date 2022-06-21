package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingLinkPage extends BasePage{

	public ShoppingLinkPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath  ="//select[@id='CountryId']")
	WebElement country;
	
	public void countryDropdown() {
		Select countryDropdown= new Select(country);
		countryDropdown.selectByVisibleText("India");
	}
	
	@FindBy(xpath  ="//input[@value='Estimate shipping']")
	WebElement estimateShippingButton;
	
	public void estimateShippingButton() {
		estimateShippingButton.click();
	}
	
	@FindBy(xpath  ="//input[@name='termsofservice']")
	WebElement termsofserviceCheckbox;
	
	public void termsofserviceCheckbox() {
		termsofserviceCheckbox.click();
	}
	
	@FindBy(xpath  ="//button[@name='checkout']")
	WebElement checkoutButton;
	
	public void checkoutButton() {
		checkoutButton.click();
	}
	
	@FindBy(xpath  ="//input[@class='discount-coupon-code']")
	WebElement discountCodeTf;
	
	public void discountCodeTf(String value) {
		discountCodeTf.sendKeys(value);
	}
	
	@FindBy(xpath  ="//input[@name='applydiscountcouponcode']")
	WebElement discountCodeButton;
	
	public void discountCodeButton() {
		discountCodeButton.click();
	}
	
	@FindBy(xpath  ="//input[@name='giftcardcouponcode']")
	WebElement giftCardTf;
	
	public void giftCardTf(String value) {
		giftCardTf.sendKeys(value);
	}
	
	@FindBy(xpath  ="//button[@name='checkout']")
	WebElement giftCardButton;
	
	public void giftCardButton() {
		giftCardButton.click();
	}
}