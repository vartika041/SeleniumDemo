package Day05OctJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		WebElement fileupload = driver.findElement(By.id("filesToUpload"));
		fileupload.sendKeys("C:\\Users\\Vartika Masulkar\\Downloads\\opsgenie_2024_07_16_28336500121953.txt");
		WebElement fileuploadtext = driver.findElement(By.xpath("//ul[@id='fileList']// li"));

		if(fileuploadtext.getText().equals("opsgenie_2024_07_16_28336500121953.txt")) {
			System.out.println("Test Passed");
			 
		}
		else
		{System.out.println("Test Failed");}
		
	}
	//multiple upload
	//file1 & file2
	//fileupload.sendKeys(file1 +\n+ file2);


}
