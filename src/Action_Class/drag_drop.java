package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(3000);
		
		WebElement Source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		Thread.sleep(3000);
		
		WebElement Destination=driver.findElement(By.xpath("(//h3[@align='center'])[6]"));
		
		Thread.sleep(3000);
		
		Actions Act=new Actions(driver);
		
		Thread.sleep(3000);
		
		Act.dragAndDrop(Source,Destination).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
