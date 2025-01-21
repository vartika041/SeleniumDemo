package Day05OctScreenshot_ChromeOptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRuntime5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		File file = new File("path of downloaded CRX file");
		options.addExtensions(file);
		
		WebDriver driver  = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");

	}

}
