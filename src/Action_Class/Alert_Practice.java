package Action_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_Practice 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions Options=new ChromeOptions();
	
	Options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(Options);
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mahesh");
	
	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	
	Alert Alt=driver.switchTo().alert();
	
	Thread.sleep(7000);
	String Text=Alt.getText();
	
	System.out.println(Text);
}
}
