package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		//create object of chromedriver browser with reference to webdriver
		
		WebDriver driver=new ChromeDriver();
		
		//to enter url
		driver.get("https://www.flipkart.com/");
		
		//to navigate to Facebook page 
	
		
		
		//to maximize browser
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//to minimize browser
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		//to closed current window on browser
		
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		
	    Point Position=driver.manage().window().getPosition();
	    System.out.println(Position);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
