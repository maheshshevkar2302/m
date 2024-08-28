package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cursor 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium Broswer\\chromedriver.exe");
		
		Thread.sleep(3000);
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);
		
		WebElement S1=driver.findElement(By.xpath("(//a[@href='SwitchTo.html'])[1]"));
		
		Thread.sleep(3000);
		
		Actions Act=new Actions(driver);
		
		Thread.sleep(3000);
		
		Act.moveToElement(S1).perform();
		
	}

}
