package TestNgExample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DBHomeMonitorTest {
	
	
	WebDriver driver;
	
	@BeforeClass
	void launchBrowser(){
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://demoblaze.com/");
		}
	
	@Test(priority=1)
	
	void clickOnMonitormethod() {
		DBHomeMonitorPage hm = new DBHomeMonitorPage(driver);

		//hm.clickOnMonitor();
		
	}
	@Test(priority=2)
	
	void OnMonitors() {
		DBHomeMonitorPage hm1 = new DBHomeMonitorPage(driver);

		hm1.validatePriceOfMacbook();
		
	}

}
