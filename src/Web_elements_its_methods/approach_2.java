package Web_elements_its_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class approach_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Username=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		Username.sendKeys("Mahesh@9763");
		Thread.sleep(2000);
		Username.clear();
		Username.sendKeys("Sagar@9763");
		Thread.sleep(2000);
		Username.clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
