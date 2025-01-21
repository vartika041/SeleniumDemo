package Day26_SeleniumMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod_getWindowHandlesApproach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		//This windowId will contains both parent & child Id
		//Approach 1 : convert this set into list for iterating Ids from SET
		//what is the need of converting SET into LIST coz in SET there is no get method to iterate 
		//individually(SET not follow indexing)
		
		List<String> windowList = new ArrayList(windowId);
		
        String parentId = windowList.get(0);
		String childId = windowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle()); 
		
		//again switch to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle()); 
		
		//shortcut method
		//List<String> windowList1 = new ArrayList(driver.getWindowHandles());
		//driver.switchTo().window(windowList1.get(1));


	}

}
