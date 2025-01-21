package Day05OctJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement enterName=driver.findElement(By.xpath("//input[@id=\"name\"]"));
		//enterName.sendKeys("hello"); 
		
		//you are doing like this : WebDriver driver = new ChromeDriver(); //upcasting , then use below

		JavascriptExecutor js = (JavascriptExecutor)driver;
		//assigning driver into javascript variable
		
		//if you are doing this : ChromeDriver driver = new ChromeDriver(); then use below
		//JavascriptExecutor js = driver;
		
		//alernative to sendkeys
		js.executeScript("arguments[0].setAttribute('value','hello')", enterName);
		//explanation: enterName variable value is stored in arguments[0] & attribute "value" is set to "hello"
		
		//alternative to click 
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()", maleRadioButton);
		

	}

}
