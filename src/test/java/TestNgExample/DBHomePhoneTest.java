package TestNgExample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DBHomePhoneTest {
	
	
	WebDriver driver;
	
	@BeforeClass
	void launchBrowser(){
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("https://demoblaze.com/");
		}
	
	@Test
	void TestLogin() {
		DBHomePhonePage lp = new DBHomePhonePage(driver);
		lp.validateIphone();

	
			
		
	}

}
