package Day26_SeleniumMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandlesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        //switching between different tabs

		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		
		Set<String> windowID = driver.getWindowHandles();
		List<String> windowIdExtract = new ArrayList(windowID);
		
		String ParentId = windowIdExtract.get(0);
		String ChildId = windowIdExtract.get(1);
		
	    driver.switchTo().window(ChildId);
	    //driver.switchTo().window(ParentId);

		System.out.println(driver.getTitle());	*/

		//-----------------------------
		
		// switching between different windows
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		List<String> windId = new ArrayList(windowId);
		
		String parentId = windId.get(0);
		String childId = windId.get(1);

		driver.switchTo().window(childId);
		System.out.println(driver.getCurrentUrl());
		
	}

}
