package All_Programs_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_window 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mahesh");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	
	Thread.sleep(3000);
	
	Alert Alt=driver.switchTo().alert();
	
	Alt.accept();
	
	
	
}
}
