package Day27_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropDown_GoogleSearch4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		//select single option from dropdown
		driver.get("https://www.google.com/");
        WebElement searchBox=driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
        searchBox.sendKeys("Selenium");
        Thread.sleep(50);
        
      WebDriverWait myWait  = new WebDriverWait(driver,Duration.ofSeconds(50));
      myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")));
        
        
      List<WebElement> allValue = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]"));
        
        for (WebElement elementCapture :allValue ) {
        	System.out.println(elementCapture.getText());

        	if(elementCapture.equals("selenium dev"))
        	{
        		elementCapture.click();
        	}
        	
        }
        
	}

}
