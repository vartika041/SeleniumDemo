package Day2Oct_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_CalendersUserDefined2 {
	
	
	static void selectMonthAndYear(WebDriver driver,String month,String year)
	{
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
		
	}
	
	static void selectDate(WebDriver driver,String date)
	{
		List<WebElement> totalDates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr/td/a"));
		totalDates.size();
		//System.out.println(totalDates);
		
		for(WebElement alldate : totalDates) {
			if(alldate.getText().equals(date));
			alldate.click();
		}
	}
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
				
		selectMonthAndYear(driver,"April","2025");
		selectDate(driver,"2");
	}

}
