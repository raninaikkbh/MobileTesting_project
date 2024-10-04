package AppiumTesting.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SwitchHandling {

	AndroidDriver driver;
	AppiumDriverLocalService service;

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

		option.setApp("/home/ranin/eclipse-workspace/Appium/resources/ApiDemos-debug.apk");

		// create object for AndroidDriver
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void switches() throws InterruptedException {

		// driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"));"));

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Switches\"]")).click();
		Thread.sleep(3000);

		WebElement monitoredSwitch = driver.findElement(By.id("io.appium.android.apis:id/monitored_switch"));

		if (monitoredSwitch.isSelected() == true) {
			System.out.println("Monitoried Switch is ON");
		} else {
			System.out.println("Monitoried Switch is OFF");
			monitoredSwitch.click();
		}

		Thread.sleep(3000);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}

}
