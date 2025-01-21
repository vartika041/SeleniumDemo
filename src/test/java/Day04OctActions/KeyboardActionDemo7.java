package Day04OctActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Actions act = new Actions(driver);
		
		//WebElement registerLink = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		WebElement registerLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        act.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
        
        //switch between window

	}

}
