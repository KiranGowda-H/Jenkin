package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelsAndShoes extends BasePage{

	public ApparelsAndShoes(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath  ="//h2[@class='product-title']//a[contains(.,'Rockabilly')]")
	WebElement RockabillyPage;
	
	public void RockabillyPage() {
		RockabillyPage.click();
	}
	
	@FindBy(xpath  ="//a[.='Blue and green Sneaker']/../..//input")
	WebElement Sneakershoe;
	
	public void Sneakershoe() {
		Sneakershoe.click();
	}
}