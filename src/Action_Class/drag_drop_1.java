package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Static.html");
		
		Thread.sleep(3000);
		
		WebElement Source=driver.findElement(By.xpath("//img[@src='logo.png']"));	
		
		Thread.sleep(3000);
		
		WebElement destination=driver.findElement(By.xpath("//div[@id='droparea']"));
		
		Thread.sleep(3000);
				
		Actions Act=new Actions(driver);
		
		Thread.sleep(3000);
		
		Act.dragAndDrop(Source,destination).perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
