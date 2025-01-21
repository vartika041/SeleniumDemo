package Day25_Locators_Waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Non Synchronization : means your application & automation script is not in sync
		// script is faster so it will thrown NO SUCH ELEMENT EXCEPTION (when element is not present)
		//(network is slow , no of people is using same app. hence performance is reduced)
		
		//Thread.sleep (time in millisec) : comes from java & have no relation with app , it will just halt your program
		//disadvantage : 
		//1.if element is present in 2 sec , then also it will wait for whole time & cause performance issue.
		//2.have to put multiple times
		
		// selenium supports implicit & explicit wait(fluent is also type)
		
		//Implicit Wait : 
		//Advantage : 1.it will not wait for whole time till it gets the element
		//2.Single statement & applicable to all elements
		
		//disadvantage : if the time is not sufficient then it will throw No Such Element exception
		
		//*** Default time of implicit wait is zero seconds.
		//*** There is no default duration for an explicit wait. 
		//You need to specify the timeout explicitly when using it.
			
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
		
		
		// Major Difference between implicit & explicit
		//Implicit will focus on only time & will be applicable to all elements
		//& explicit will focus on time as well as condition for specific element
		
		
		//Explicit Wait : declaration of this can be one time & can use at multiple times
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20)); // declaration
		
		WebElement myelement = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))); //usage of wait
		myelement.sendKeys("");
		
		Boolean myelement1 =mywait.until(ExpectedConditions.invisibilityOf(myelement));
		
		Boolean myelement2 =mywait.until(ExpectedConditions.invisibilityOf((WebElement) By.xpath("")));
		
		Boolean myelement3=mywait.until(ExpectedConditions.stalenessOf(myelement));
		
		// here we specify time 20 sec till then it will wait for the condition to be true
		
		// efficiency , execution point of view , performance point of view : explicit wait is more reliable
		
		// for page load only
        
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		
		//Fluent Waits
		
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class);*/
		
	}
}
// declaration
		
		//WebElement txtelement = wait.until(new Function<WebDriver,WebElement>(){

			/*@Override
			public WebElement apply(WebDriver input) {
				// TODO Auto-generated method stub
				return null;}*/
			
			// always use try catch block with waits to handle exceptions
			
			// if both are used at a statement , both will be executed in parallel & in case of difference it will run for maximum time defined
			
			
		
