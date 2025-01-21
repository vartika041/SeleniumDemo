package TestNgExample;
import java.io.File;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/Let-Snow-Beth-Moran/dp/1802806407/ref=sr_1_3?crid=3JJQT3G7CQF2D&dib=eyJ2IjoiMSJ9.JHqd8Fy2w0WP0zKb-taWiByiVbIf11adaFp3Fw7wdNrE-lRJFdnMtDeCqd5QFIdvMD241ZXws32VWcg_tBkKL_YJmO8lWCgWG6uZCoUPH1T1dP-s674eX-ZlDIfTqM0Q9l3EWY6uij6Ai9RixwX6CIpnxC9Tcxoff42G7_UFZzg8mUQBYLpzptCT6MVR6HBJ.5UaQEv4RLzo06rVKe2zhR4Znll3nLP2W6UL3qcmg5fE&dib_tag=se&keywords=let+it+snow&qid=1729598033&refinements=p_n_binding_browse-bin%3A1318377031&rnid=1318374031&s=books&sprefix=let+it+snow%2Cstripbooks%2C186&sr=1-3");
		
		//driver.findElement(By.xpath("//input[@id=\"captchacharacters\"]")).sendKeys("hello");
        //WebElement element = driver.findElement(By.xpath("//input[@id=\"captchacharacters\"]"));
        //element.sendKeys("hello");
        //String value = element.getAttribute("value");
        //System.out.println(value);
		
		//WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//search.sendKeys("mobile");
		//System.out.println(search.getText());
		
		//String valueOfPlaceholder = search.getAttribute("placeholder");
		//System.out.println(valueOfPlaceholder);
		//driver.close();
		
		//div[@class="a-section a-padding-base"]
		
		//WebElement value =driver.findElement(By.xpath("//a[@class=\"a-link-normal a-text-normal\"]//span[@class=\"a-letter-space\"]"));
		WebElement value =driver.findElement(By.xpath("//span[@id=\"secureTransactionIconWrapper\"]"));
		value.click();
		WebElement value2 =driver.findElement(By.xpath("//div[@cel_widget_id=\"secureTransaction-celwidget-popover-inner\"]"));
		System.out.println(value2.getText());
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,800)", "");
		
		TakesScreenshot ts  = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		File targetFile = new File (System.getProperty("user+dir")+"\\screenshot\\amazon.png");
		
		sourceFile.renameTo(targetFile);
		
		//value.click();
		//System.out.println(value.getText());
		
		
       
		

	}

}
