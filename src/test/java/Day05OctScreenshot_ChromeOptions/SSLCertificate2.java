	package Day05OctScreenshot_ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // accept SSL certificate
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
