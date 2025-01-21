package Day04OctActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
	WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	
	
	//mouse hover
	
	Actions act = new Actions(driver);
	//Driver is being passed as an Argument so that 
	//Selenium is able to locate the element on the browser (driver).
	
	//act.moveToElement(desktop).moveToElement(mac).click().build().perform();
	  act.moveToElement(desktop).moveToElement(mac).click().perform();
	

	

}
}
