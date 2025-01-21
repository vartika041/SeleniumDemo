package Day04OctActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Actions act = new Actions(driver);
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		WebElement targetElement = driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		act.dragAndDrop(sourceElement, targetElement).build().perform();
		act.dragAndDrop(targetElement, sourceElement).build().perform();
		
		//other way
		//Action dragDrop = action.clickAndHold(getstarted).moveToElement(getstarted).release().build();
        //dragDrop.perform();
		
		//action.clickAndHold(from).moveToElement(to).release().build().perform();
		
		//Actions Vs Action
		
		Action myaction =act.contextClick(sourceElement).build(); //building
		myaction.perform();//performing & completing
		
		//action.contextClick(sourceElement).build().perform();
		

		
		

		
		

		
		
	}

}
