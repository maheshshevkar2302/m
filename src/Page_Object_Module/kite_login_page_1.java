package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_page_1 
{
	//Step_1:-declare global variable for webelement present in webpage having access within class by using findselements annotations.
		@FindBy(xpath="//input[@type='text']")  private WebElement username; 	
	    @FindBy(xpath="//input[@type='password']") private WebElement password;
	    @FindBy(xpath="//button[@type='submit']")   private WebElement loginbtn;
	    
	    
	    
//Step_2:-Initialize data member within constructor having access level public with the help of pagefactory class with method initelements
	    public kite_login_page_1 (WebDriver driver) 
	    {
	    	PageFactory.initElements(driver,this);
	    	
	    	
	    	//Step_3:-Use data member by using method with access level public 
	    	
	    	
	    	
	    }
	    public void enterusername() 
	    {
	    	username.sendKeys("VOX248");
	    }
		public void enterpassword() 
		{
			password.sendKeys("Mahesh@9763");
		}
		
		public void loginclick() 
		{
			loginbtn.click();		}
		
}
