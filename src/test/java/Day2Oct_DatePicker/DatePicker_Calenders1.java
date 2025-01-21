package Day2Oct_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Calenders1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//switch to iframe : lengthy way
		/*WebElement element = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(element);*/
		
		//switch to iframe :direct way
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		
		//switch to iframe using index 0
		//driver.switchTo().frame(0);
	
		//Method 1 : using sendkeys
		//driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("10/10/2020");
		
		//Method2 : using date picker
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		
		//expected future date
		String year = "2025";
		String month = "October";
		String date = "4";
		
		//expected past date
				String year1 = "2023";
				String month1 = "October";
				String date1 = "4";
		
		
		//span[@class="ui-datepicker-year"]
		while(true)
		{
			
		String currentMonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		String currentYear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		if(currentMonth.equals(month) && currentYear.equals(year)) {
			break;
		}
        
		driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
		//previous button
		//driver.findElement(By.xpath("//a[@title=\"Prev\"]")).click();
		}
		
		//select date
		
		List<WebElement> totalDates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr/td/a"));
		totalDates.size();
		//System.out.println(totalDates);
		
		for(WebElement alldate : totalDates) {
			if(alldate.getText().equals(date));
			alldate.click();
		}
	}

}
