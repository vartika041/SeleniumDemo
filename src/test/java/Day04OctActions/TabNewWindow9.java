package Day04OctActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabNewWindow9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		driver.switchTo().newWindow(WindowType.TAB); // new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // new window
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

}
