package Day28_DynamicTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //total no of rows
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	    List<WebElement> allRows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr"));
	    // xpath : By.tagname("tr") can be used when single table present in webpage
	    int sizeOfRows = allRows.size();
	    System.out.println(sizeOfRows);
	  
		//total no of colouns
	    List<WebElement> allColoumn = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr/th"));
	    int sizeOfColoumn = allColoumn.size();
	    System.out.println(sizeOfColoumn);
	    
	    for(int bookNameRow =0;bookNameRow<=sizeOfColoumn;bookNameRow++)
	    {
	    	String bookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr/td[1]")).getText();
	    	if(bookName.equals("Learn JS"))
	    	{
		    	String authorName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr/td[2]")).getText();
		    	System.out.println(authorName);

	    	}
	    	
	    }
	    
	    //capture specific data
	    /*String StoreValue=driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[5]/td[text()=\"Master In Selenium\"]")).getText();
	    //xpath : //table[@name="BookTable"]//tr[5]/td[4]
	    System.out.println(StoreValue);
	    
	    //read all values
	    List<WebElement> allValue = driver.findElements(By.xpath("//table[@name=\"BookTable\"]"));
	    for(int r= 2 ; r<=sizeOfRows ; r++)
	    {
	    	for(int c= 1;c<=sizeOfColoumn;c++)
	    	{
	    	   String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]/td["+c+"]")).getText();
	    	   System.out.println(value);
	    	}
	    	
	   // get value from 1st row based on some condition applies to 2nd row
	   //take bookname written by mukesh
	    	
	    	for(int authorRow=2;authorRow<=sizeOfRows;authorRow++)
	    	{
		    	String AuthorName= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+authorRow+"]/td[2]")).getText();
		    	//System.out.println(AuthorName);
		    	if(AuthorName.equals("Mukesh"))
		    	{
		    		String bookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+authorRow+"]/td[1]")).getText();
		    		System.out.println(bookName+"\t"+AuthorName);
		    		
		    	}

	    	}

	    }*/

    	//total of prices
    	/*int total = 0;
    	for(int priceRow = 0;priceRow<=sizeOfRows;priceRow++)
    	{
	    	String prices = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+priceRow+"]/td[4]")).getText();
	    	total=total + Integer.parseInt(prices);
    	}
    	System.out.println("total " +total);
	}*/
}
	
}



