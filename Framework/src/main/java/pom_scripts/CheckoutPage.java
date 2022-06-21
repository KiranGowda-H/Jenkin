package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//input[@onclick='Billing.save()']")
	WebElement billingAddress;
	
	public void billingAddress(){
		billingAddress.click();
	}
	
	@FindBy(xpath= "//input[@onclick='Shipping.save()']")
	WebElement shippingAddress;
	
	public void shippingAddress(){
		shippingAddress.click();
	}
	
	@FindBy(xpath= "//input[@onclick='ShippingMethod.save()']")
	WebElement shippingMethod;
	
	public void shippingMethod(){
		shippingMethod.click();
	}
	
	@FindBy(xpath= "//input[@onclick='PaymentMethod.save()']")
	WebElement paymentMethod;
	
	public void paymentMethod(){
		paymentMethod.click();
	}
	
	@FindBy(xpath= "//input[@onclick='PaymentInfo.save()']")
	WebElement paymentInfo;
	
	public void paymentInfo(){
		paymentInfo.click();
	}
	
	@FindBy(xpath= "//input[@onclick='ConfirmOrder.save()']")
	WebElement confirmOrder;
	
	public void confirmOrder(){
		confirmOrder.click();
	}
}