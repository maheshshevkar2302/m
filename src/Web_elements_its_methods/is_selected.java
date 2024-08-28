package Web_elements_its_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver		driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        
        Thread.sleep(3000);
        
        Boolean Result=driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).isSelected();
        
        System.out.println(Result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
