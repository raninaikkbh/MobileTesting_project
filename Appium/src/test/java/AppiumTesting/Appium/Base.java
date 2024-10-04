package AppiumTesting.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void configureAppium() throws MalformedURLException {

		Map<String, String> env = new HashMap<String, String>(System.getenv());
		env.put("ANDROID_HOME", "/home/ranin/Android/Sdk");
		env.put("JAVA_HOME", "/usr/lib/jvm/java-1.21.0-openjdk-amd64");

		// run Appium server automatically
		service = new AppiumServiceBuilder()
				.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).withEnvironment(env).withTimeout(Duration.ofSeconds(30))
				.build();

		// start the Appium server
		service.start();

		// create capabilities
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Pixel 3 XL API 29");
		option.setPlatformName("Android");
		option.setCapability("platformVersion", "10");

		
		//option.setApp("/home/ranin/eclipse-workspace/Appium/resources/ApiDemos-debug.apk");
		
		//shoping
		option.setApp("/home/ranin/eclipse-workspace/Appium/resources/General-Store.apk");

		//chrome
		
		option.setChromedriverExecutable("/home/ranin/Downloads/chromedriver");
		
		// create object for AndroidDriver
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	//scroll as long as the App has elements

	public void scrollToEnd() {
				
				boolean canScrollMore;
				do
				{
					canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "down",
				    "percent", 3.0
				));
			     
				}
				while(canScrollMore);				
	}
	
	public void scrollToElement(String ele)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ele\"));"));	
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}
