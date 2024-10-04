package AppiumTesting.Appium;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class HybridTest extends Base {

	@Test

	public void hybrid() throws InterruptedException {

		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bangladesh\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();

		// Type name in a field
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ranu");
		driver.hideKeyboard(); // hide keyboard

		// select radio button
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		// scroll until Air Jordan 9 Retro
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));"));

		// Select Air Jordan 9 Retro
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for (int i = 0; i < count; i++) {
			String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i)
					.getText();

			if (productName.equalsIgnoreCase("Air Jordan 9 Retro")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(3000);

//Type appiumtutorial in google search

//		Set<String> contextHandles = driver.getContextHandles(); // Both context names
//
//		for (String contextName : contextHandles) {
//			System.out.println(contextName); // Prints out something like Native App \n Webview_1
//		}
//
//		driver.context("WEBVIEW_com.androidsample.generalstore");
//		Thread.sleep(3000);
//
//		 driver.findElement(By.name("q")).sendKeys("appiumtutorial");
//		 driver.findElement(By.name("q")).sendKeys("Keys.ENTER");
//		 Thread.sleep(3000);
//
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(3000);
//
//		driver.findElement(By.name("NATIVE_APP")); // Pass the Native context name

	}
}
