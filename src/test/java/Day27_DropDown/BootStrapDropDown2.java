package Day27_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootStrapDropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		//select single option from dropdown
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//div[@class=\"btn-group\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();
		
		//All options extract
		WebElement drpDownElement = driver.findElement(By.xpath("//select[@id=\"option-droup-demo\"]"));
		
		Select drpDown = new Select(drpDownElement);
		List<WebElement> allOptions = drpDown.getOptions();
		
		//select multiple value
		for(WebElement op : allOptions)  
		{
			String Option = op.getText();
			System.out.println(Option);
			if(Option.equals("Java") || Option.equals("Python"));
			{
				op.click();
			}
			
			}
		}

}
