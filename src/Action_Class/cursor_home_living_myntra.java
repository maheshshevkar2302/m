package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cursor_home_living_myntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjw77WVBhBuEiwAJ-YoJBtQP5_YWfLUSRvhnsXADlFBYo2BkG1eLP_aQh3WDoAJUwOrHKR-bRoCwQIQAvD_BwE");
		
	    Thread.sleep(3000);	
	    
	    WebElement Act=driver.findElement(By.xpath("(//a[@href='/personal-care'])[1]"));
	    
	    Thread.sleep(3000);	
	    
	
	    Actions Action=new Actions(driver);
	    
	    Thread.sleep(3000);	
	    
	    
	   Action.click().perform();
		
	}

}
