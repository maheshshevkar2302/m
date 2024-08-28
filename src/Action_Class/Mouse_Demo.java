package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjwvNaYBhA3EiwACgndghLhim6LlRZWzTdx6MgJTdikh8tSAr2ZfUH1hgSvx1D8AT_FJq1SQxoC4EoQAvD_BwE");
		
	    WebElement Men=driver.findElement(By.xpath("//a[@href=\"/shop/men\"][1]"));
		
		Actions alt=new Actions(driver);
		
		Thread.sleep(3000);
		
		alt.contextClick(Men).perform();
		
		
		
		
		
		
	}

}
