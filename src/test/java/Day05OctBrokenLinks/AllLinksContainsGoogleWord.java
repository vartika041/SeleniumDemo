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

public class AllLinksContainsGoogleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.amazon.in/");
         List<WebElement> allinks = driver.findElements(By.cssSelector("a"));
         System.out.println(allinks.size());
         for(int i=0;allinks.size()<0;i++)
         {
          System.out.println(allinks.get(i).getAttribute("href").contains("google"));
          //System.out.println(allinks.get(i).getText());      
         }
         
        /*for (WebElement link : allinks) {
           System.out.println(link.getText());
         }*/

	}

}
