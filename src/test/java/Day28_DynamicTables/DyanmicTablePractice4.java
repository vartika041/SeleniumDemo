package Day28_DynamicTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicTablePractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	    List<WebElement> allRows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr"));
	    List<WebElement> allColoumn = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr/td"));
	    
	    for(int nameRow=2;nameRow<=allColoumn.size();nameRow++) {
	    	String namevalue = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+nameRow+"]/td[2]")).getText();
	    	System.out.println(namevalue);
	    	if(namevalue.equals("Television"));
	    	{
		    	String priceValue = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+nameRow+"]/td[3]")).getText();
                System.out.println(namevalue +priceValue);
                break;

	    	}
	    }	
	}}
		
		
		

	
	



