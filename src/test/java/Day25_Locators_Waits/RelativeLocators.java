package Day25_Locators_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Iphone");
        
       // driver.findElement(RelativeLocator.with(By.tagName("a")).above("app"));


	}

}
