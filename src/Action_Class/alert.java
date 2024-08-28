package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver.exe");
      
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.amazon.in/");
      
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi note 9 Pro");
     
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     
     WebElement Rating =driver.findElement(By.xpath("((//div[@class='_bXVsd_gridColumn_2Jfab'])[2]//span)[5]"));
		
     String S1=Rating.getText();
	 System.out.println(S1);
	}

	
	
	
	
	
}
