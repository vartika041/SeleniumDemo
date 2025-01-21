package FirstTC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.time.Duration.ofSeconds;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromeDriver driver = new ChromeDriver(); // This is also correct
		WebDriver driver = new ChromeDriver();
		//Here we are initializating chromeDriver class using parent Interface (WebDriver)
		//so it is UPCASTING
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equalsIgnoreCase("Your Store"))
		{System.out.println("Test Passed");}
		
		else
		{System.out.println("Test Failed");}
		
		System.out.println(actualTitle);
		
		driver.close();
		//this code has been pushed to git

	}

}
