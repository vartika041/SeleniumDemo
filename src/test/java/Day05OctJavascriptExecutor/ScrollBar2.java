package Day05OctJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		// scroll down by pixel number
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		// scroll down by element visible
		WebElement blockbuster = driver.findElement(By.xpath("//div[@class=\"d-showcase-header\"]/h3/span"));
		js.executeScript("arguments[0].scrollIntoView();",blockbuster);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// scroll down till end of page
		js.executeScript("window.ScrollBy(0,document.body.scrollHeight)");
		//(0,document.body.scrollHeight) scrolling from 0 to end of body height
		
		
		
		
		
		
		
		
	}

}
