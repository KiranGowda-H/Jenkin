package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	private WebElement addToCartbutton;
	
	public void addToCartbutton(){
		addToCartbutton.click();
	}
	
	@FindBy(xpath="//input[@value='Add to wishlist']")
	private WebElement addToWishlistbutton;
	
	public void addToWishlistbutton(){
		addToWishlistbutton.click();
	}
	
	@FindBy(xpath="//input[@name='addtocart']")
	private WebElement addToCartCheckbox;
	
	public void addToCartCheckbox(){
		addToCartCheckbox.click();
	}
	
	@FindBy(xpath="//input[@name='addtocartbutton']")
	private WebElement addToCartFromButton;
	
	public void addToCartFromButton(){
		addToCartFromButton.click();
	}
	
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement updateWishlistButton;
	
	public void updateWishlistButton(){
		updateWishlistButton.click();
	}
	
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailAFriendbutton;
	
	public void emailAFriendbutton(){
		emailAFriendbutton.click();
	}
	
	@FindBy(xpath="//input[@id='FriendEmail']")
	private WebElement friendEmailTf;
	
	public void friendEmailTf(String value){
		friendEmailTf.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@value='Send email']")
	private WebElement sendEmailButton;
	
	public void sendEmailButton(){
		sendEmailButton.click();
	}
	
	@FindBy(xpath="//h2/a[@class='product']")
	private WebElement productLinkPage;
	
	public void productLinkPage(){
		productLinkPage.click();
	}

	@FindBy(xpath="//input[@value='Add to compare list']")
	private WebElement addToComparelistbutton;
	
	public void addToComparelistbutton(){
		addToComparelistbutton.click();
	}
	
	@FindBy(xpath="//title[.='Facebook']/..")
	private WebElement facebookIcon;
	
	public void facebookIcon(){
		facebookIcon.click();
	}
}