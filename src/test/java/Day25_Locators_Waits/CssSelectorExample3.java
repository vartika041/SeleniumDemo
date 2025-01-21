package Day25_Locators_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[onclick=\"byCat('notebook')\"]")).click();
		driver.findElement(By.cssSelector("[onclick=\"byCat('monitor')\"]")).click();
		

	}

}
