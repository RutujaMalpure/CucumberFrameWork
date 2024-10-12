package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage 
{
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By cartbag=By.cssSelector("[alt='Cart']");
	By CheckoutButton =By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By prmobutton= By.cssSelector(".promoBtn");
	By Placeorder =By.xpath("//button[contains(text(),'Place Order')]");

	public void CheckoutItem()
	{
		driver.findElement(cartbag).click();
		driver.findElement(CheckoutButton).click();
	}
	
	public Boolean VeriyPrmoBtn()
	{
		return driver.findElement(prmobutton).isDisplayed();
		
	}
	public Boolean VeriyPlaceorder()
	{
		return driver.findElement(Placeorder).isDisplayed();
		
	}
	
}