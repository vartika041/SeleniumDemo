package Day27_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPractice5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//select single option from dropdown
		driver.get("https://www.bjs.com/");
        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Apple");
        
        
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(60));
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-cnstrc-item-name=\"apple juice\"]")));
        List<WebElement> allElement = driver.findElements(By.xpath("//div[@class=\"list list-group\"]"));
        
        for (WebElement elementCapture :allElement ) {
        	System.out.println(elementCapture.getText());
        
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-cnstrc-item-name=\"apples\"]")));
	
        	
        	if(elementCapture.equals("apples"))
        	{
        		elementCapture.click();
        	}
        }
        
        }
	}


