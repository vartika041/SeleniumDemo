package Day05OctBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		int noOfBrokenLink =0;
		
		for(WebElement links :alllinks ) {
			String hrefvalue = links.getAttribute("href");
			
			if(hrefvalue==null ||hrefvalue.isEmpty())
				// null means no value , isEmpty has some data but string type has 0 char in it
			{
				System.out.println("not possible to check");
				continue;
			}
			//hit all urls having some value to serve
			
			URL linkURL = new URL(hrefvalue);
			//to convert href string values to URL
			
			HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();
			//openconnection to the server
			connection.connect();//connect to server & sent request
			
			try {
			if(connection.getResponseCode()>=400)
			{
				System.out.println("broken link");
				noOfBrokenLink++;
			}
			else
			{
				System.out.println("Not a broken link");
			}
			}
			catch(Exception e)
			{
				
			}
			System.out.println(noOfBrokenLink);
			
		}
		
		//*** Use of CONTINUE ; if url value is not present in href then it should not start doing try catch
		// so to continue your execution of finding href value : continue keyword is important
		 
		
		
	}

}
