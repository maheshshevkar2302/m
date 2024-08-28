package Iframe;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_window_handle 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		driver.manage().window().maximize();
		
		Set<String> Handle=driver.getWindowHandles();
		
		ArrayList<String> AR=new ArrayList<String>(Handle);
		
		String Main=AR.get(0);
		System.out.println(Main);
		String Child=AR.get(1);
		System.out.println(Child);
		
		driver.switchTo().window(Child);
		
		driver.findElement(By.xpath("(//a[@data-level='1'])[15]")).click();
		
		
		
		
			
		
	}

}
