package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage{

	public ComputersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath= "//h2//a[@title='Show products in category Desktops']")
	private WebElement desktopsPage;
	
	public void desktopsPage(){
		desktopsPage.click();
	}
	
	@FindBy(xpath  ="//h2//a[.='Build your own computer']")
	WebElement buildYourOwnComputerPage;
	
	public void buildYourOwnComputerPage() {
		buildYourOwnComputerPage.click();
	}
	
	@FindBy(xpath  ="//label[.='320 GB ']/../input")
	WebElement hddRadio;
	
	public void hddRadio() {
		hddRadio.click();
	}
	
	@FindBy(xpath  ="//h2/a[.='Build your own expensive computer']")
	WebElement buildYourOwnExpensiveComputerPage;
	
	public void buildYourOwnExpensiveComputerPage() {
		buildYourOwnExpensiveComputerPage.click();
	}
	
	@FindBy(xpath  ="//h2/a[.='Simple Computer']")
	WebElement simpleComputerPage;
	
	public void simpleComputerPage() {
		simpleComputerPage.click();
	}
	
	
	@FindBy(xpath  ="//label[.='Slow ']/../input")
	WebElement slowRadio;
	
	public void slowRadio() {
		slowRadio.click();
	}
	
	@FindBy(xpath  ="//h2//a[.='Elite Desktop PC']")
	WebElement elitePcPage;
	
	public void elitePcPage() {
		elitePcPage.click();
	}
}