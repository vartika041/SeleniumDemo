package Day27_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drpCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
		// every option is web element
		
		Select drpCountry = new Select(drpCountryElement);
		
	 //select option from dropdown 
		
     //selectByVisibleText
     //selectByValue()-->attribute of option value
     //ex: <option value="france">France</option> here france is value & France is visible text
		
     //selectByIndex()
		  drpCountry.selectByVisibleText("France");
		  drpCountry.selectByValue("france");
		  drpCountry.selectByIndex(2);//manually count the value ,start from 0
		  
		  //size of dropdown
            List<WebElement> options = drpCountry.getOptions();
		  //getOption : This will return all dropdown value as WebElement
            
		    System.out.println(options.size());
		  
		  //printing the options
		  for(int i=0;i<options.size();i++)
		  {
				System.out.println(options.get(i).getText()); 
				//options.get(i).getText(); is used for retrieving as an webElement
		  }
		  
		  //enhanced for loop
		  for(WebElement op : options)
		  {
			  op.getText();
		  }
		  
	}

}
