package Day28_DynamicTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.opencart.com/admin");
		/*driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("demo");*/
		Actions act = new Actions(driver);
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		act.doubleClick(submitButton).perform();
		
		//click on customers
		//click on sub menu customers
		
		//Capture the  last pagination 
		String text =driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int totalPage = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		//click on indiviual page
		for(int p=1;p<=totalPage;p++) {
			if(p>1)
			{
				WebElement activePage=driver.findElement(By.xpath("//ul[@class=\"pagination\"]//*[text()="+p+"]"));
				activePage.click();
			}
		}
			
			//reading page data
			
			int NoOfRows = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tr")).size();
			//specfic customer name : //table[@class="table table-bordered table-hover"]//tr[3]/td[2]
			
			for(int i =0 ;i<=NoOfRows;i++) 
			{
				//String allCustomerName = driver.findElement("//table[@class=\"table table-bordered table-hover\"]//tr["+i+"]/td[2]").get
			}

	}

}

