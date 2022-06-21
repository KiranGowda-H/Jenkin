package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

	public ElectronicsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//h2[@class='title']//a[@title='Show products in category Camera, photo']")
	private WebElement cameraAndPhotosPage;
	
	public void cameraAndPhotosPage(){
		cameraAndPhotosPage.click();
	}
	
	@FindBy(xpath  ="//a[.='1MP 60GB Hard Drive Handycam Camcorder']")
	WebElement handyCamPage;
	
	public void handyCamPage() {
		handyCamPage.click();
	}
	
	@FindBy(xpath  ="//h2[@class='title']//a[@title='Show products in category Cell phones']")
	WebElement cellPhonesPage;
	
	public void cellPhonesPage() {
		cellPhonesPage.click();
	}
	
	@FindBy(xpath  ="//h2//a[.='Smartphone']")
	WebElement smartphonePage;
	
	public void smartphonePage() {
		smartphonePage.click();
	}
}
