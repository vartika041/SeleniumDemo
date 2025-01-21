package Day26_SeleniumMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecficBrowserWindow4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set<String> windowId = driver.getWindowHandles();
		for (String winId : windowId)
		{
			String title = driver.switchTo().window(winId).getTitle();
			//System.out.println(title);
			if(title.equals("OrangeHRM"))
			{
				driver.close();
				break; // if not have multiple window to close
			}
		}
			
	

	}

}
