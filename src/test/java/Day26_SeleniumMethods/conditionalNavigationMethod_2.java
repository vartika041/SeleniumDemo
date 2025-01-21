package Day26_SeleniumMethods;

import org.openqa.selenium.By;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalNavigationMethod_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Conditional method
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoblaze.com/");
		//driver.manage().window().maximize();
		
		
		//WebElement Result = driver.findElement(By.xpath("//a[@class=\"navbar-brand\"]"));
		//Result.isDisplayed();
		
        //Boolean Result1 = driver.findElement(By.xpath("//a[@class=\"navbar-brand\"]")).isDisplayed();
		//System.out.println(Result1);
		
		// Both are correct above two
		
		//Boolean Result2 = driver.findElement(By.xpath("//a[@class=\"navbar-brand\"]")).isEnabled();
		//System.out.println(Result2);
		
        //Boolean Result3=driver.findElement(By.xpath("//a[@class=\"navbar-brand\"]")).isSelected();
		//System.out.println(Result3);
		
		//navigation methods
				
		URL myurl = new URL("https://demoblaze.com/prod.html?idp_=1");
		driver.navigate().to(myurl);//sending as an object of string
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		//same as 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		



		
		
		
		
	}

}
