package Handling_Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_flipkart_rating_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi Note 9 Pro");
        
        Thread.sleep(3000);
		
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        Thread.sleep(3000);
        
    
        Thread.sleep(3000);
        
	    WebElement Rating=driver.findElement(By.xpath("(((//div[@class='_2kHMtA'])[1])//span)[6]"));

      String S1=Rating.getText();
      
      System.out.println(S1);
	    
	}

}
