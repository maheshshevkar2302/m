package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class left_click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Thread.sleep(3000);
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    
	    Thread.sleep(3000);
	    
	    WebElement Home=driver.findElement(By.xpath("//a[@href='Index.html']"));
	    
	    Thread.sleep(3000);
	    
	    Actions Act=new Actions(driver);
	    
	    Thread.sleep(3000);
	    
	    Act.click(Home).perform();
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
