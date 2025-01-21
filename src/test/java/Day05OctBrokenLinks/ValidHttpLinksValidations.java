package Day05OctBrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class ValidHttpLinksValidations {



	    public static void main(String[] args) {
	        // Setup WebDriver (make sure to set path to chromedriver or any other driver)
	        WebDriver driver = new ChromeDriver();
	        
	        // Navigate to the website
	        driver.get("https://example.com"); // Replace with your website URL
	        
	        // Find all the anchor tags (<a>) on the page
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        
	        // Iterate over the links and filter out working links
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");  // Get the href attribute
	            
	            // Skip empty or null URLs
	            if (url == null || url.isEmpty()) {
	                continue;
	            }
	            
	            // Skip JavaScript links or anchors
	            if (url.startsWith("javascript:") || url.startsWith("#")) {
	                continue;
	            }
	            
	            // Skip malformed URLs (i.e., missing protocol or domain)
	            if (!url.matches("^(https?|ftp)://.*")) {
	                continue;
	            }
	            
	            // If the link passes the filters, consider it as a working link
	            System.out.println("Working link: " + url);
	        }
	        
	        // Close the browser
	        driver.quit();
	    }
	}



