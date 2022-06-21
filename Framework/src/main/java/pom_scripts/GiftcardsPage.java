package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftcardsPage extends BasePage{

	public GiftcardsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath  ="//h2/a[.='$5 Virtual Gift Card']")
	WebElement $5vgCardPage;
	public void $5vgCardPage() {
		$5vgCardPage.click();
	}
}
