package Practice_Demo_Important;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindow_handle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[@href=\"../articles_popup.php\"]")).click();
		
	     Set<String>	windows=driver.getWindowHandles();
	     
	     ArrayList<String> ar=new ArrayList<String>(windows);
	     
	    String  Main=ar.get(0);
	    String Child=ar.get(1);
	     
	     
	     driver.switchTo().window(Child);
	     
	     
	     
	     Thread.sleep(7000);
	     
	     driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("maheshshevkar9411@gmail.com");
	     
	     Thread.sleep(7000);
	     
	     
	     driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	     
	     Thread.sleep(7000);
	     
	     driver.switchTo().window(Main);
	     
			
	     
	     
		
	}

}
