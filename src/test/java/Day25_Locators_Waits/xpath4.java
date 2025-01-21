package Day25_Locators_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Iphone");
		
		//xpath for multiple attribute
        driver.findElement(By.xpath("//input[@name=\"search\"][@placeholder=\"Search\"]"));
        
        //xpath with and , or attribute
        driver.findElement(By.xpath("//input[@name=\"search\" and @placeholder=\"Search\"]"));
        driver.findElement(By.xpath("//input[@name=\"search\" or @placeholder=\"Search\"]"));
        driver.findElement(By.xpath("//input[@name=\"search\" or @placeholder=\"null\"]"));//This will also works
        
        //xpath with inner text 
        
        //<a href="https://demo.opencart.com/en-gb/product/iphone">iPhone</a>
        driver.findElement(By.xpath("[text()='iPhone']")); // This xpath having link also 
        
        //<h3>featured</h3> has inner text & no link
        driver.findElement(By.xpath("//h3[text()='Featured']"));
        driver.findElement(By.xpath("//*[text()='Featured']"));//This will also works
        
        //xpath with contains method : used for partial value
        driver.findElement(By.xpath("//input[contains(@name,'sea')]"));
        
        //xpath with starts-with method
        driver.findElement(By.xpath("//input[starts-with(@name,'sea')]"));
        
        //difference between contains & starts-with
        //contains will have anywhere & starts-with should start with those letters.
        //How to handle dynamic values using xpath ? using contains & starts-with
        
        // id = start & id = stop these are changing continuously
        		//*[@id=”start” or @id= “stop”]
        
        		//*[contains(@id,’st’)]
        		//*contains[text(),'st'] // valid for inner text
        		//*[Starts-with(@id,’st’)]
               //*[Starts-with(text(),'st')]
        
        //chained xpath : combination of relative & absolute 
        // parent to child (TOP TO DOWN)
        
        //demo site : https://demo.opencart.com/en-gb?route=common/home
        driver.findElement(By.xpath("//div[@class='row']/div/h5[text()='Information']"));
        driver.findElement(By.xpath("//div[@class='image']/a/img[@title='MacBook']"));
        
        
        //For Empty value :<div></div>
        //div[contains(text(),'')]
        
        

        
        
	}

}
