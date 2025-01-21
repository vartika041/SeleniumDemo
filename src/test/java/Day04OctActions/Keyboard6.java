package Day04OctActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("WELCOME");
		
		Actions act = new Actions(driver);
		
		//control A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //control C		
        act.keyDown(Keys.CONTROL).sendKeys("C").keyDown(Keys.CONTROL).perform();
        //tab : for switching the box
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //control V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyDown(Keys.CONTROL).perform();
        //control+shift+a
        act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).perform();
        //enter
        act.keyDown(Keys.ENTER).keyUp(Keys.UP).perform(); 
        
        }
	//switch between alerts , frames

}
