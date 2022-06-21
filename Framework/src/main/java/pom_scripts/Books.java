package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Books extends BasePage{

	public Books(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath  ="//select[@id='products-orderby']")
	WebElement sortBy;
	
	public void sortByDropdown() {
		Select sortByDropdown= new Select(sortBy);
		sortByDropdown.selectByVisibleText("Created on");
	}
	
	@FindBy(xpath  ="//select[@id='products-pagesize']")
	WebElement displayPerPage;
	
	public void displayPerPageDropdown() {
		Select displayPerPageDropdown= new Select(displayPerPage);
		displayPerPageDropdown.selectByVisibleText("12");
	}
	
	@FindBy(xpath  ="//select[@id='products-viewmode']")
	WebElement viewAs;
	
	public void viewAsDropdown() {
		Select viewAsDropdown= new Select(viewAs);
		viewAsDropdown.selectByVisibleText("Grid");
	}
	
	@FindBy(xpath  ="//ul[@class='price-range-selector']/li[2]/a")
	WebElement filter25to50;
	
	public void filter25to50() {
		filter25to50.click();
	}
	
	@FindBy(xpath  ="//a[.='Remove Filter']")
	WebElement removeFilter;
	
	public void removeFilter() {
		removeFilter.click();
	}
	
	@FindBy(xpath  ="//a[.='Fiction']/../..//input")
	WebElement fictionBook;
	
	public void fictionBook() {
		fictionBook.click();
	}
	
	@FindBy(xpath  ="//h2//a[.='Fiction']")
	WebElement fictionBookPage;
	
	public void fictionBookPage() {
		fictionBookPage.click();
	}
	
	@FindBy(xpath  ="//h2//a[.='Fiction EX']")
	WebElement fictionExBookPage;
	
	public void fictionExBookPage() {
		fictionExBookPage.click();
	}
	
	@FindBy(xpath  ="//title[.='Twitter']/..")
	WebElement twitterIcon;
	
	public void twitterIcon() {
		twitterIcon.click();
	}
}