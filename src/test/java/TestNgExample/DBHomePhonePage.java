package TestNgExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DBHomePhonePage {
	
	WebDriver driver;
	
	DBHomePhonePage(WebDriver driver){
		this.driver=driver;
	}
	
	By allProductOnHomePage = By.xpath("//h4[@class=\"card-title\"]");
	
	
	@Test
	void validateIphone()
	{
		 
		List<WebElement> allProducts = driver.findElements(allProductOnHomePage);
		for(WebElement aP :allProducts) {
			String iPhone=aP.getText();
			if(iPhone.equals("Iphone 6 32gb"))
			{
				Assert.assertTrue(true);
				System.out.println();
			}
			
		}
	
}
}