package All_Programs_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class Selenium_Practice 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Options);
		
		Thread.sleep(10000);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.navigate().to("https://www.google.co.in/");
		 
		driver.manage().window().minimize();
		
		try
		
		{driver.findElement(By.xpath("//textaea[@class='gLFyf']")).sendKeys("Redmi Note9Pro");}
		
		catch(Exception e) {System.out.println("element is not found ");}
		
		
		
		
		
	}

}
