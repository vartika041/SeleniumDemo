package Day04OctActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropelementxaxisyaxis5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement minSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		/*System.out.println(minSlider.getLocation());
		System.out.println(minSlider.getLocation().getX());
		System.out.println(minSlider.getLocation().getY());*/
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(minSlider, 100, 249).build().perform();
		System.out.println(minSlider.getLocation());
		
		//max
		//WebElement maxSlider =driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
	    //System.out.println(maxSlider.getLocation());
		//act.dragAndDropBy(maxSlider, -76, 249).build().perform();

	}

}
