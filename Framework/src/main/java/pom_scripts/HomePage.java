package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//a[.='222222222222@gmail.com']")
	private WebElement accountLink;
	
	public void accountLink(){
		accountLink.click();
	}
	
	@FindBy(className= "ico-logout")
	private WebElement logoutlink;
	
	public void logoutlink(){
		logoutlink.click();
	}
	
	@FindBy(xpath= "//a[.='Shopping cart']")
	private WebElement shoppingcartLink;
	
	public void shoppingcartLink(){
		shoppingcartLink.click();
	}
	
	@FindBy(xpath= "//a[.='Wishlist']")
	private WebElement wishlistLink;
	
	public void wishlistLink(){
		wishlistLink.click();
	}
	
	@FindBy(xpath= "//a[.='small-searchterms']")
	private WebElement searchTextField;
	
	public void searchTextField(String search){
		searchTextField.sendKeys(search);
	}
	
	@FindBy(xpath= "//input[@value='Search']")
	private WebElement searchButton;
	
	public void searchButton(){
		searchButton.click();
	}
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(.,'Books')]")
	private WebElement booksButton;
	
	public void booksButton(){
		booksButton.click();
	}
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(.,'Computers')]")
	private WebElement computersButton;
	
	public void computersButton(){
		computersButton.click();
	}
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(.,'Electronics')]")
	private WebElement electronicsButton;
	
	public void electronicsButton(){
		electronicsButton.click();
	}
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(.,'Apparel')]")
	private WebElement apparelsandshoesButton;
	
	public void apparelsandshoesButton(){
		apparelsandshoesButton.click();
	}
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(.,'Digital')]")
	private WebElement digitaldownloadsButton;
	
	public void digitaldownloadsButton(){
		digitaldownloadsButton.click();
	}
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(.,'Jewelry')]")
	private WebElement jewelryButton;
	
	public void jewelryButton(){
		jewelryButton.click();
	}
	
	@FindBy(xpath= "//ul[@class='top-menu']//a[contains(.,'Gift')]")
	private WebElement giftcardsButton;
	
	public void giftcardsButton(){
		giftcardsButton.click();
	}

	public WebElement getAccountLink() {
		return accountLink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksButton() {
		return booksButton;
	}

	public WebElement getComputersButton() {
		return computersButton;
	}

	public WebElement getElectronicsButton() {
		return electronicsButton;
	}

	public WebElement getApparelsandshoesButton() {
		return apparelsandshoesButton;
	}

	public WebElement getDigitaldownloadsButton() {
		return digitaldownloadsButton;
	}

	public WebElement getJewelryButton() {
		return jewelryButton;
	}

	public WebElement getGiftcardsButton() {
		return giftcardsButton;
	}

	public void setAccountLink(WebElement accountLink) {
		this.accountLink = accountLink;
	}

	public void setLogoutlink(WebElement logoutlink) {
		this.logoutlink = logoutlink;
	}

	public void setShoppingcartLink(WebElement shoppingcartLink) {
		this.shoppingcartLink = shoppingcartLink;
	}

	public void setWishlistLink(WebElement wishlistLink) {
		this.wishlistLink = wishlistLink;
	}

	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public void setBooksButton(WebElement booksButton) {
		this.booksButton = booksButton;
	}

	public void setComputersButton(WebElement computersButton) {
		this.computersButton = computersButton;
	}

	public void setElectronicsButton(WebElement electronicsButton) {
		this.electronicsButton = electronicsButton;
	}

	public void setApparelsandshoesButton(WebElement apparelsandshoesButton) {
		this.apparelsandshoesButton = apparelsandshoesButton;
	}

	public void setDigitaldownloadsButton(WebElement digitaldownloadsButton) {
		this.digitaldownloadsButton = digitaldownloadsButton;
	}

	public void setJewelryButton(WebElement jewelryButton) {
		this.jewelryButton = jewelryButton;
	}

	public void setGiftcardsButton(WebElement giftcardsButton) {
		this.giftcardsButton = giftcardsButton;
	}
}
