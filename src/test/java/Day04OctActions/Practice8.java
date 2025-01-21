package Day04OctActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//getAttribute
		
        /*WebElement first = driver.findElement(By.xpath("//input[@value=\"Hello World!\"]"));
        String text = first.getAttribute("value");
        System.out.println(text);
        
        WebElement second = driver.findElement(By.xpath("//input[@value=\"Hello World!\"]"));
        WebElement copy = driver.findElement(By.xpath("//input[@id=\"field2\"]"));
        String text2 = second.getAttribute("value");
        System.out.println(text2);

        Actions act = new Actions(driver);
        act.doubleClick(copy);
        
        if(text.equals(text2)) {
        	System.out.println("Test Passed");
        }
        else {
        	System.out.println("Fail");
        }*/
        
		//dragnDrop
		
	   /* driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement source = driver.findElement(By.xpath("//section[@id='g-container-main']//li[1]//a[1]"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));*/
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(source, target);
		
		// minSlider
		
		WebElement minSlider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]/span[1]"));
		System.out.println(minSlider.getLocation());
		act.dragAndDropBy(minSlider, 1200, 1800).build().perform();
		
		
		
        
	}

}
