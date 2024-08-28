package Web_elements_its_methods;



import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handles 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Options);
		
		driver.get("https://www.facebook.com/");
		
		Set<String> Han=driver.getWindowHandles();
		
		ArrayList<String> qr1=new ArrayList<String>(Han);
		
	String 	Main=qr1.get(0);
	
	String 	Child=qr1.get(1);
	
	driver.switchTo().window(Child);
	}

}
