package Day05OctScreenshot_ChromeOptions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreenshot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//1.capture full page
		
		TakesScreenshot ts  = (TakesScreenshot)driver;
		//if you do ChromeDriver driver = new ChromeDriver();
		//then TakesScreenshot ts = driver ; works
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		//File targetfile = new File("C:\\Users\\Vartika Masulkar\\eclipse-workspace\\SeleniumDemo\\screenshot\\fullpage.png");
		//to make above line dynamic 
		
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshot\\fullpage1.png");
		sourcefile.renameTo(targetfile); // copy your Screenshot to targetfile location
		
		
		//2.capture specfic element
		WebElement specficElement = driver.findElement(By.xpath("//div[@id=\"main\"]"));
		
		File sourcefile1=specficElement.getScreenshotAs(OutputType.FILE);
		
		File targetfile1 = new File(System.getProperty("user.dir")+"\\screenshot\\Table.png");
		
		sourcefile1.renameTo(targetfile1);
		
		//3.capture weblelement
		
		WebElement singleElement = driver.findElement(By.xpath("//h3[@class=\"post-title entry-title\"]"));
		
		File sourceFile3 = singleElement.getScreenshotAs(OutputType.FILE);
		File targetFile3 = new File(System.getProperty("user.dir")+"\\screenshot\\GUI.png");
		sourceFile3.renameTo(targetFile3);
		
		
		
	}

}
