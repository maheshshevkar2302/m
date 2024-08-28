package Launch_Browser;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_window_handles 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		    WebDriver driver=new ChromeDriver();
		   
		  
		    driver.get("https://skpatro.github.io/demo/links/");
		       driver.manage().window().maximize();
		  
		            
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
		    		//Click new tab
		    driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		    
		    		//To get windowID
		     Set<String>  AllIDs=driver.getWindowHandles();
		    
		    ArrayList<String> ar=new ArrayList<String>(AllIDs);
		     
		                  String MainPageID=ar.get(0);
		                 System.out.println(MainPageID);
		                 
		                  String ChildwindowID=ar.get(1);
		                 System.out.println(ChildwindowID);
		    
		    
		    //Switch to window pop-up
		    driver.switchTo().window(ChildwindowID);
		    
		  
		    Thread.sleep(3000);
		    
		    //Click Training link
		    driver.findElement(By.xpath("//span[text()='Training']")).click();
		    
		    Thread.sleep(3000);
		    
		    //switch to Main Page
		    driver.switchTo().window(MainPageID);
		    
		    Thread.sleep(3000);
		    
		    //Click new Window Button
		    driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
