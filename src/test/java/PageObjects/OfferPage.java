package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
public WebDriver driver;
	
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	private By serach=By.xpath("//input[@type='search']");

	private By productname=By.cssSelector("tr td:nth-child(1)");
	
	public void search(String Name)
	{
		driver.findElement(serach).sendKeys(Name);
	}
	
	public String getproductname()
	{
		 return driver.findElement(productname).getText();
	}
	
}
