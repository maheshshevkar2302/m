package Action_Class;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/Veera-Paridhaan-Banarsi-Solid-Jacket/dp/B07HCDL479//");
	
		Thread.sleep(3000);
		
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}

}
