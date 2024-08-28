package POM_base_test_utility_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_login_page_1 
{
	//POM 1
	
		//1. Data members/Global Variable should be declared globally with access level private by using @Findby Annotation
		    @FindBy(xpath="//input[@id='userid']")  private  WebElement  UN;  //private WebElement UN=driver.findElement(By.xpath("//input[@id='userid']"));     
		    @FindBy(xpath="//input[@id='password']")   private    WebElement  PSW; // private WebElement  PSW=driver.findeElement(By.xpath("//input[@id='password']");
		    @FindBy(xpath="//button[text()='Login ']")  private  WebElement  Loginbtn;//private WebElement  Loginbtn=driver.findeElement(By.xpath("//button[text()='Login ']");
		
		//2. Initialize within a constructor with access level public using pagefactory
		    
		  public POM_login_page_1 (WebDriver driver)
		    {
		    	PageFactory.initElements(driver, this);
		    	
		    }
		        
		    
		//3. Utilize within a method with access level public
		
		public void enterUsername(String UserID) //GP8097
		{
			UN.sendKeys(UserID);//GP8097
		}
		
		public void enterPassword(String Password) //gms@0110
		{
			PSW.sendKeys(Password); //gms@0110
		}
		
		
		public void ClickLoginBtn() 
		{
			Loginbtn.click();
		}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
