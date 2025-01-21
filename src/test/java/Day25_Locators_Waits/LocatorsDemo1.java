package Day25_Locators_Waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name locator
		driver.findElement(By.name("search")).sendKeys("macbook");
		WebElement searchbox = driver.findElement(By.name("search"));
		searchbox.sendKeys("macbook");
		
		//difference between above two with java example
		  String s = "welcome";
		   int s1= s.length();
		   //This is true
		
		int s2 ="welcome".length(); // This also true , By applying method directly to the object
		
		// Employee emp = new Employee();
		//emp.display();   This is one way
		
		//Employee().display(); This is also correct
		
		//driver.findElement(By.id("logo")).isDisplayed();
		
		//WebElement logo = driver.findElement(By.id("logo"));
		//boolean logovalue = logo.isDisplayed();
		//System.out.println("" + logovalue);
		
		//linked text (preferred)
		driver.findElement(By.linkText("iPhone")).click();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("iPho")).click();
		
		//classname
		List<WebElement> allClass = driver.findElements(By.className("container"));
		System.out.println(allClass.size()); //5
		
		//tagname
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		List<WebElement> allImages =driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());
		
	}

}
