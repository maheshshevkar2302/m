package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_amazon_login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjwp7eUBhBeEiwAZbHwkeLrhF1QA8HYI4mQJZKPDsT4CuuTaqV6AshpScoVRN3lLiMRL8zHixoCg_kQAvD_BwE%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D9301240%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D9315023339783681090%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("maheshshevkar@9411");
	}

}
