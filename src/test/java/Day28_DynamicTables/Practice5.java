package Day28_DynamicTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> allColoumn = driver.findElements(By.xpath("//tr[@id=\"headers\"]/th"));
		//System.out.println(allColoumn.size());
		List<WebElement> allRows = driver.findElements(By.xpath("//tbody[@id=\"rows\"]/tr"));
		//System.out.println(allRows.size());
		
		//UseCase : dynamicTable where need to find value & its value
		for(int intName=1;intName<=allColoumn.size();intName++)
		{
			WebElement Value = driver.findElement(By.xpath("//tbody[@id=\"rows\"]/tr["+intName+"]/td[1]"));
			
			if(Value.getText().equalsIgnoreCase("Chrome"))
			{
				WebElement memory = driver.findElement(By.xpath("//tbody[@id=\"rows\"]/tr["+intName+"]/td[2]"));
				
				WebElement disk = driver.findElement(By.xpath("//tbody[@id=\"rows\"]/tr["+intName+"]/td[4]"));

				System.out.println(Value.getText() + memory.getText() + disk.getText());


			}
		}

		
	}

}
