package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectable_facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	WebElement Month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Select S1=new Select(Month);
	
	Thread.sleep(3000);
	
	S1.selectByVisibleText("Jan");
	
	
	}

}
