package TestNgExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DBLoginPage {
	
	WebDriver driver;
	
	DBLoginPage(WebDriver driver){
		this.driver = driver;
		}
	
	By LogIn = By.id("login2");
	
	By userName = By.id("loginusername");
	By passWord = By.id("loginpassword");
	By submit =By.xpath("//button[@onclick=\"logIn()\"]");
	
	public void clickOnLogIn() {
		driver.findElement(LogIn).click();
		
	}
	public void enterUsername(String usrname) {
		driver.findElement(userName).sendKeys(usrname);
		
	}
	public void enterPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
		
	}
	public void submit() {
		driver.findElement(submit).click();
		
	}
	

}
