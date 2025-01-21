package TestNgExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBHomeMonitorPage {
	
	WebDriver driver;
	
	DBHomeMonitorPage(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	/*@FindBy(xpath ="//a[@onclick=\"byCat('monitor')\"]") WebElement monitor ;
	@FindBy(xpath="//h4[@class=\"card-title\"]") // for links
	List<WebElement> links;    */
	
	By monitor =By.xpath("//a[@onclick=\"byCat('monitor')\"]");
	By allMonitors = By.xpath("//h4[@class=\"card-title\"]");
	By asus =By.xpath("//a[@href=\"prod.html?idp_=14\" and text()='ASUS Full HD']");
	By price =By.xpath("//div[@class=\"card-block\"]//h5");

	
	void clickOnMonitor() {
		
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(monitor)).perform();
	}
    
    void validatePriceOfMacbook() {
    	
	   List<WebElement> allMoni = driver.findElements(allMonitors);
        
		for(WebElement listOfMonitors : allMoni) {
			//System.out.println(listOfMonitors.getText());
			if(listOfMonitors.getText().equals("ASUS Full HD"))
			{
				System.out.println(driver.findElement(price).getText());
				
			}
			
		}
    	 
    	//driver.findElement(asus).click();
    	
    	 	
    	
    }

	public void clickOnMonitor1() {
		// TODO Auto-generated method stub
		
	}
	
	

}
