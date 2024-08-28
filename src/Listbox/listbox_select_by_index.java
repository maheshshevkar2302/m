package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_select_by_index 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		   //Step-I:Identify listbox and store into an object  
	    WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
	    
	    //Step-II: create object of Select class
	    	Select S=new Select(Month);
	    	
	    	Thread.sleep(4000);
	    	S.selectByIndex(9);
		
	}

}
