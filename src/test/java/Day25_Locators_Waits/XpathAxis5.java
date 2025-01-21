package Day25_Locators_Waits;

public class XpathAxis5 {
	//self --> parent --> ancestor
	// preceding --> self <-- following (different parent)
	// preceding sibling --> self <--- following sibling (same parent)
	// self --> child
	// self --> child --> descendant (grand child)
	// used when xpath is complex
	
	
	//site name : https://www.amazon.in/s?k=iphone&ref=nb_sb_noss
	
	// go to parent 
	//span[@class="a-price-whole" and text()='45,499']/parent::span
	//span[@class="a-price-whole" and text()='45,499']/parent::*
	
	//go to ancestor
	//span[@class="a-price-whole" and text()='45,499']/ancestor::span
	//span[@class="a-price-whole" and text()='45,499']/ancestor::*
	
	// go to child & grandchild
	//span[@class="a-price"]/child::span[text()="₹45,499"]
	
	// go to descendent (going to directly grandchild)
	//span[@class="a-price"]/descendant::span[text()="69,900"]
	//span[@class="a-price"]//span[text()="69,900"]
	
	//following & preceding
	//span[@class="a-price"]/following::input
	//span[@class="a-price"]/preceding::a
	
	//following sibling preceding sibling
	//span[@class="a-price-symbol"]/following-sibling::span
	//span[@class="a-price-whole"]/preceding-sibling::span
	
	

}
