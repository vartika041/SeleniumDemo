package TestNgExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DBLoginTest {
	
	WebDriver driver;

		
	@BeforeClass
		void launchBrowser(){
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		    driver.get("https://demoblaze.com/");
			}

	@Test
	void TestLogin() {
		
		DBLoginPage lp = new DBLoginPage(driver);
		lp.clickOnLogIn();
		lp.enterUsername("vartika");
		lp.enterPassword("vartika@04");
		lp.submit();
	}
		
		
	}


