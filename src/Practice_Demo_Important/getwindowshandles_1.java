package Practice_Demo_Important;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getwindowshandles_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions Options=new ChromeOptions();
		
		Options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(Options);
		
		
		driver.get("http://exam.unipune.ac.in/");
		
		Thread.sleep(5000);
		
	   Set<String>	Handles=driver.getWindowHandles();
		
		ArrayList<String > ar=new ArrayList<String>(Handles);
		
		String Main=ar.get(0);
		
		String Child=ar.get(1);
		
		Thread.sleep(5000);
		
		
		driver.switchTo().window(Child);
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[@href=\"Pages/SchedulesTimetables.html\"][1]")).click();
		
		
        
		
        
		
	}

}

