package POM_base_test_utility_testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_home_page_
{
	 //POM 3
		//1. Data members/Global Variable should be declared globally with access level private by using @Findby Annotation
	         @FindBy(xpath="//span[text()='GP8097']")  private  WebElement UserID; //private WebElement UserID=driver.findElement(By.xpath("/span[text()='GP8097']"));
	         @FindBy(xpath="//a[text()=' Logout']")  private  WebElement LogoutBtn; 
		
	         
	       //2. Initialize within a constructor with access level public using pagefactory
	         
	        public POM_home_page_(WebDriver driver)
	         {
	        	 PageFactory.initElements(driver, this);
	         }
	         
	         
	        //3.Utilize within a method with access level public
	        
	       public String getKiteloginUserID() 
	       {
	    	      String UserIDText=UserID.getText();
	    	      
	    	     return UserIDText; //Actual UserID //GP8097
	       }
	        
	        
	        
	        
	        
	        
	        public void ClickUserID() 
	        {
	        	UserID.click();
	        }
	        
	       public void Clicklogoutbtn() 
	       {
	    	   LogoutBtn.click();
	       } 
	        
	        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
