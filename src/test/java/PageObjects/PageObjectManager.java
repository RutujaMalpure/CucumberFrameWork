package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage landingpage;
	public OfferPage offerspage;
	public CheckoutPage checkoutpage;
	
	public LandingPage getLandingPage()
	{
		landingpage=new LandingPage(driver);
		return landingpage;
	}
	
	public OfferPage getofferpage()
	{
		offerspage=new OfferPage(driver);
		return offerspage;
	}
	public CheckoutPage getcheckoutpage()
	{
		checkoutpage=new CheckoutPage(driver);
		return checkoutpage;
	}
	

}
