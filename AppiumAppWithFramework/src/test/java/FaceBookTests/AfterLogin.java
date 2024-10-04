package FaceBookTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class AfterLogin {

	AndroidDriver driver;

	public AfterLogin(AndroidDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
	WebElement clickOnOk;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.View")
	WebElement skip;

	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[6]/android.view.View")
	WebElement Contact;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[5]/android.view.View")
	WebElement HomePage;
	
	@FindBy(xpath="//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[10]/android.view.View")
	WebElement marketplace;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.View")
	WebElement sell;
	
	public void clickOnOkBtn()
	{
		clickOnOk.click();
	}
	
	public void SkipBtn()
	{
		skip.click();
		skip.click();
	}
	
	public void contactIcon() {
		Contact.click();
	}
	
	public void HomePageIcon()
	{
		HomePage.click();
	}
	
	public void MarketplaceBtn()
	{
		marketplace.click();
	}
	
	public void sellBtn()
	{
		sell.click();
	}

}
