package AppiumTesting.Appium;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class scrollDemoTest extends Base {
	
	@Test
	public void scrollTest()
	{
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		
		//scroll until view an element
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		//scrollToElement("WebView");
		
		
		//scroll as long as the App has elements
		
		scrollToEnd();			

	}
}
