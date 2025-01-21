package Day28_DynamicTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTablePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/reserve.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		int totalRows = driver.findElements(By.xpath("//table[@class=\"table\"]//tr/th")).size();
		//System.out.println(totalRows);
		int totalColoumn = driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
		//System.out.println(totalColoumn);
		
		for(int airlineRow=1 ; airlineRow<=totalRows-1;airlineRow++) {
			String allAirlines=driver.findElement(By.xpath("//table[@class='table']//tr["+airlineRow+"]/td[3]")).getText();
			//System.out.println(allAirlines);
			if(allAirlines.equals("Virgin America"))
			{
				String fightNumber=driver.findElement(By.xpath("//table[@class='table']//tr["+airlineRow+"]/td[2]")).getText();
				System.out.println(fightNumber +allAirlines);
			}		
		}			
	}

}
