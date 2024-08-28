package Handling_Dynamic_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_Handling 
{
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions Options=new ChromeOptions();
	
	Options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(Options);
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[2]")).click();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys("Redmi 5g Mobile");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[@class='MJG8Up']")).click();
	Thread.sleep(5000);
	
	WebElement S1=driver.findElement(By.xpath("(//div[@class='yKfJKb row']//span)[4]"));
	
	Thread.sleep(5000);
	
	String Rating=S1.getText();
	
	
	
	Thread.sleep(5000);
	System.out.println(Rating);
	
	}

}
