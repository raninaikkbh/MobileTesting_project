package FaceBookPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	 AndroidDriver driver;

	    public LoginPage(AndroidDriver d) {
	        driver = d;
	        PageFactory.initElements(driver, this);
	    }
	    
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	WebElement allowPermisson;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.MultiAutoCompleteTextView[1]")
	WebElement txtEmailLogin;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.MultiAutoCompleteTextView[2]")
	WebElement txtPassword;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
	WebElement logIn;
	
	public void clickallowPermisson()
	{
		allowPermisson.click();
	}
	
	public void EmailId()
	{
		txtEmailLogin.sendKeys("ranunaikkbh@gmail.com");
	}
	
	public void password()
	{
		txtPassword.sendKeys("Ranunaik@123");
	}
	
	public void LoginBtn()
	{
		logIn.click();
	}
}
