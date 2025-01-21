package Day25_Locators_Waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//using tag#id (tagname is optional)
		
		//driver.findElement(By.cssSelector("input#small-searchterms"));
		driver.findElement(By.cssSelector("#small-searchterms"));
		
		//using tag.classname
		//if you see "search-box-text ui-autocomplete-input" class name remove 2nd part
		//& use as see below
		
		 driver.findElement(By.className("input.search-box-text"));
		 driver.findElement(By.className(".search-box-text"));
		 
		 //you can again use classname for multiple values 
		 List<WebElement> AllTitle = driver.findElements(By.cssSelector("div.title"));
		 System.out.println(AllTitle.size());
		 
		 //using tag[attribute="value"]
          driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")); 
          driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")); 
          
          //using tag.classname[attribute="value"]
          driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]"));
          driver.findElement(By.cssSelector(".search-box-text[placeholder=\"Search store\"]"));

		

	}

}
