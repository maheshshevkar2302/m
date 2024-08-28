package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Name and path and Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of Chrome Driver with reference to webdriver
		WebDriver driver=new ChromeDriver();
		
		//To enter URL 
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("SingleFrame");
		
		//To enter values in iframe
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mahesh@9763");
		
		//Wait
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
