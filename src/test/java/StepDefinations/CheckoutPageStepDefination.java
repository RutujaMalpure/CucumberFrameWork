package StepDefinations;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.CheckoutPage;
import PageObjects.LandingPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CheckoutPageStepDefination
{

 public WebDriver driver;
 public String Productname1;
 public String Productname2;
 public CheckoutPage checkoutpage;
 
 TestContextSetup testContextSetup;
 
 public CheckoutPageStepDefination(TestContextSetup testContextSetup)
 {
	 this.testContextSetup=testContextSetup;
	 this.checkoutpage=testContextSetup.pageobjectmanager.getcheckoutpage();
 }
	
 @Then("^user proceeds to checkout  Validate the (.+) items in checkout Page$")
 public void user_proceeds_to_checkout_Validate_the_items_in_checkout_Page(String name) throws InterruptedException
 {
	 checkoutpage.CheckoutItem();
	 //Thread.sleep(2000);
 }
 
 @And("Verify user had ability to enter promo code and place the order")
 public void Verify_user_had_ability_to_enter_promo_code_and_place_the_order()
 {
	 
	 Assert.assertTrue(checkoutpage.VeriyPrmoBtn());
	 Assert.assertTrue(checkoutpage.VeriyPlaceorder());
	 
	 
 }

	
	

}
