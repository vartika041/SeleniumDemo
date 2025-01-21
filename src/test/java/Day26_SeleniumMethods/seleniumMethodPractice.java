package Day26_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Boolean result = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/input[@id='male']")).isSelected();
		System.out.println(result);
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/input[@id='male']")).click();
		Boolean result2 = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/input[@id='male']")).isSelected();
		System.out.println(result2);
		

	}

}
