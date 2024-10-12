package StepDefinations;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LandingPageStepDefination
{

 public WebDriver driver;
 public String Productname1;
 public String Productname2;
 public LandingPage landingpage;
 
 TestContextSetup testContextSetup;
 
 public LandingPageStepDefination(TestContextSetup testContextSetup)
 {
	 this.testContextSetup=testContextSetup;
	 this.landingpage=testContextSetup.pageobjectmanager.getLandingPage();
 }
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page()
	{
		
		Assert.assertTrue(landingpage.getTitleoflandingPage().contains("GreenKart"));
	}
	
	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException
	{
		
		
		landingpage.searchItem(shortname);
		Thread.sleep(2000);
		testContextSetup.Productname1=landingpage.getproductname().split("-")[0].trim();
	    System.out.println(testContextSetup.Productname1+"is out");
	    
	   
	    
	}
	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product_to_cart(String quantity)
	{
		landingpage.incrementquatity(Integer.parseInt(quantity));
		landingpage.addToCart();
		
	}
	

	
	

}
