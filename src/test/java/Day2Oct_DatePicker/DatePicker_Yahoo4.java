package Day2Oct_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Yahoo4 {
	
	//public static void selectMonth()
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/account/create");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.findElement(By.xpath("//select[@name=\"mm\"]")).click();
	List<WebElement> allMonths = driver.findElements(By.xpath("//select[@name=\"mm\"]//option"));
	//System.out.println(allMonths.size());
	//driver.findElement(By.xpath("//select[@name=\"mm\"]//option[@value=\"1\"]")).click();
	
	
	for(WebElement almonth :allMonths ) {
		
		//System.out.println(almonth.getText());
		
		if(almonth.getText().equals("March"))
		{
			System.out.println(almonth.getText());
			almonth.click();
		}
	}
	
	driver.findElement(By.xpath("//input[@name=\"dd\"]")).sendKeys("22");
	driver.findElement(By.xpath("//input[@name=\"yyyy\"]")).sendKeys("2024");
	


}
}
