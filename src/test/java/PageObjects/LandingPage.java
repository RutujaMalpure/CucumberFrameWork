package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage 
{
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By Topdeals=By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");
	


	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public void getsearchtext()
	{
		
		driver.findElement(search).getText();
	}
	public void incrementquatity(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
		
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public String getproductname()
	{
		return driver.findElement(productName).getText();
	}
	
	public void topdeals()
	{
		driver.findElement(Topdeals).click();
	}

	public String getTitleoflandingPage()
	{
		return driver.getTitle();
	}
	
	
}