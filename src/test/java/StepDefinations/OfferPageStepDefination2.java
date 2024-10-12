package StepDefinations;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OfferPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OfferPageStepDefination2
{

public String Productname2;
TestContextSetup testContextSetup;
PageObjectManager pageobjectmanager;
 

 public OfferPageStepDefination2(TestContextSetup testContextSetup)
 {
	 this.testContextSetup=testContextSetup;
 }
 //Then user searched for same <Name> in Offer page 
	@Then("^user searched for same (.+) in Offer page$")
	public void user_searched_for_same_shortname_in_offer_page(String Name) throws InterruptedException
	{
		
	    switchtoOfferPage();
	    
	    OfferPage offerpage=testContextSetup.pageobjectmanager.getofferpage();
	    offerpage.search(Name);
	    //testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Name);
	    
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    Thread.sleep(2000);
	    
	    
	    Productname2=offerpage.getproductname();
	 }
	
public void switchtoOfferPage()
{
	//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase(""))
	
	//pageobjectmanager=new PageObjectManager(testContextSetup.driver);
	LandingPage landingpage=testContextSetup.pageobjectmanager.getLandingPage();
	
	//LandingPage landingpage=new LandingPage(testContextSetup.driver);
	landingpage.topdeals();
	testContextSetup.generic.switchwindowtochild();
    
}
	
	@Then("Validate product name in offers pages matched with landing page")
	public void validate_product_name_in_offers_pages_matched_with_landing_page()
	{
	    Assert.assertEquals(testContextSetup.Productname1, Productname2);
	}

}
