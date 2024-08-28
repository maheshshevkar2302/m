package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_report 
{
	@Test
	public void m1() 
	{
		Reporter.log("This is test Case");
	}
	public void m2() {Reporter.log("This is test Case",false);}
	public void m3() {Reporter.log("This is test Case");}
	public void m4() {Reporter.log("This is test Case");}

}
