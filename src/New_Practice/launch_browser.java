package New_Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launch_browser 

{
	public static void main(String[] args)
	{
		
		ChromeOptions CO=new ChromeOptions();
		
		CO.addArguments("--remote-allow-origins");

		
		WebDriver driver=new ChromeDriver(CO);
		
	
		
		driver.get("https://www.youtube.com/watch?v=7ZdlSW4S7h4");
		
		
		
	
		
		
		
		
		
		
		
	}

}
