package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genericutils 
{
	public WebDriver driver;
	
	public Genericutils(WebDriver driver)
	{
		this.driver=driver;
	}

	public void switchwindowtochild()
	{
		Set<String> webpages=driver.getWindowHandles();
	    Iterator<String>  web =webpages.iterator();
	    String parentwin=web.next();
	    String childwin=web.next();
	    
	    driver.switchTo().window(childwin);
	}
}
