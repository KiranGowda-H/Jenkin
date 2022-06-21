package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends BasePage{

	public JewelryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id  ="products-orderby")
	WebElement sortByDropdown;
	public void sortByDropdown() {
		sortByDropdown.click();
	}
	
	@FindBy(id  ="products-pagesize")
	WebElement pageSizeDropdown;
	public void pageSizeDropdown() {
		pageSizeDropdown.click();
	}
	
	@FindBy(id  ="products-viewmode")
	WebElement viewAsDropdown;
	public void viewAsDropdown() {
		viewAsDropdown.click();
	}
	
	@FindBy(xpath  ="//a[.='Create Your Own Jewelry']/../..//input")
	WebElement createYourOwnJewelry;
	public void createYourOwnJewelry() {
		createYourOwnJewelry.click();
	}
	
	@FindBy(xpath  ="//a[.='Create Your Own Jewelry']")
	WebElement createYourOwnJewelryPage;
	public void createYourOwnJewelryPage() {
		createYourOwnJewelryPage.click();
	}
	
	@FindBy(className  ="textbox")
	WebElement lengthInCmTf;
	public void lengthInCmTf(String value) {
		lengthInCmTf.sendKeys(value);
	}
	
	@FindBy(xpath ="//h2//a[.='Black & White Diamond Heart']")
	WebElement BlackAndWhiteDiamondHeartPage;
	public void BlackAndWhiteDiamondHeartPage() {
		BlackAndWhiteDiamondHeartPage.click();
	}
	
	@FindBy(xpath ="//div[@class='add-to-cart']//input[@class='qty-input']")
	WebElement qtyTfClick;
	public void qtyTfClick() {
		qtyTfClick.click();
	}
	
	@FindBy(xpath ="//div[@class='add-to-cart']//input[@class='qty-input']")
	WebElement qtyTf;
	public void qtyTf() {
		qtyTf.clear();
	}
	
	@FindBy(xpath="//div[@class='add-to-cart']//input[@class='qty-input']")
	WebElement qtyTfvalue;
	public void qtyTfvalue(CharSequence value) {
		qtyTfvalue.sendKeys(value);
	}
	
	@FindBy(xpath ="//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	WebElement addToCartHeart;
	public void addToCartHeart() {
		addToCartHeart.click();
	}
	
}
