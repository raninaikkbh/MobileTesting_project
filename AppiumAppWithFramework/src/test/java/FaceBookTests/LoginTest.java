package FaceBookTests;


import org.testng.annotations.Test;

import FaceBookPages.LoginPage;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest extends Base{
	
	 @Test
	    public void login() throws InterruptedException {
		 
	        //  initialized AndroidDriver 
	        AndroidDriver driver = getDriver();
	        
	        LoginPage login = new LoginPage(driver);
	        
	        login.clickallowPermisson();
	        login.EmailId();
	        login.password();
	        login.LoginBtn();
	        Thread.sleep(3000);
	               
	 }

}
