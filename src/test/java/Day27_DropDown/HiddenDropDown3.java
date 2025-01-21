package Day27_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		//select single option from dropdown
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
	

		driver.findElement(By.xpath("")).click();
		List<WebElement> allElement = driver.findElements(By.xpath("div[@role='listbox']//span"));
		System.out.println(allElement.size());
		for (WebElement op :allElement )
		{
			op.getText();
		}
		// using selector Hub take the element xpath 
		//or go to event listners & click on blur 
		
		

	}

}
