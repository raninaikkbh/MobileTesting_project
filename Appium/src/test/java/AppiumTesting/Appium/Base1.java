package AppiumTesting.Appium;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base1 {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
@SuppressWarnings("deprecation")
@Test	
	public void configureAppium() throws MalformedURLException
	{
		
		//create capabilities
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Pixel 3 XL API 29");
		option.setPlatformName("Android");
		option.setCapability("platformVersion","10");
		option.setApp(System.getProperty("/home/ranin/eclipse-workspace/Appium/resources/ApiDemos-debug.apk"));
		
		
		//create object for AndroidDriver
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.quit();
		
	}
}
