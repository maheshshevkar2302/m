package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_Verification_Is_Multiple 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	   driver.get("file:///C:/Users/Mahesh%20Shevkar/Desktop/HTML/Listbox_3.html");
	
	  
	    
	  WebElement Month=driver.findElement(By.xpath("//select[@multiple='true']"));
	  
	  Select S1=new Select(Month);
	  
	  Boolean Result =S1.isMultiple();
	  
	  System.out.println(Result);
		
	}

}
