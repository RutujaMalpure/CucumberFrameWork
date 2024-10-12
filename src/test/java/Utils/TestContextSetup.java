package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;
import StepDefinations.Hooks;

public class TestContextSetup 
{

	 public WebDriver driver;
	 public String Productname1;
	 public PageObjectManager pageobjectmanager;
	 public TestBase testBase;
	 public Genericutils generic;
	 
	 
	 public TestContextSetup() throws IOException
	 {
		 testBase= new TestBase();
		 pageobjectmanager=new PageObjectManager(testBase.WebDriverManager());
		 generic=new Genericutils(testBase.WebDriverManager());
		
	 }
}
