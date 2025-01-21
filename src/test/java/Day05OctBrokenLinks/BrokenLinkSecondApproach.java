package Day05OctBrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinkSecondApproach {
	
	
	public static void main(String[] args) {
        // Setup WebDriver (make sure to set path to chromedriver or any other driver)
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the website
        driver.get("https://www.google.com/"); // Replace with your website URL
        
        // Find all the anchor tags (<a>) on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        // Iterate over the links and check if they are working
        for (WebElement link : links) {
            String url = link.getAttribute("href");  // Get the href attribute
            
            // If the href is null, continue to the next link
            if (url == null || url.isEmpty()) {
                continue;
            }
            
            // Check if the link is working
            if (isLinkWorking(url)) {
                System.out.println("Working link: " + url);
            } else {
                System.out.println("Broken link: " + url);
            }
        }
        
        // Close the browser
        driver.quit();
    }

    // Method to check if a link is working (returns true if status code is 200)
    public static boolean isLinkWorking(String urlString) {
        try {
            // Create a URL object from the string
            URL url = new URL(urlString);
            
            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            
            // Get the response code
            int responseCode = connection.getResponseCode();
            
            // If the response code is 200 (OK), the link is working
            return responseCode == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            // In case of an exception, consider the link as broken
            return false;
        }
    }
}





