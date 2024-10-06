package Hybrid;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class RoyalBrotherTest extends RoyalBrotherCap {
	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		
		driver = cap();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void Royal() throws InterruptedException {
		System.out.println("Royal Brother App is Open");
		
		Thread.sleep(5000);
		// Scroll and Select "Honda Activa 6G":-
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Honda Activa 6G\"))")).click();
		
		// Click on Search by Model :-
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Search by Model\"]")).click();
	    
	    // Click on Honda Activa 6G :-
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Honda Activa 6G\"]")).click();

	 // Click on Menu icon :-
	    driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"MENU\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")).click();
	    
	 // Click on Cancellation Policy :-
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Cancellation Policy\"]")).click();
	    
	 // Locate the element that contains the title text
        // You can use accessibilityId, resourceId, or XPath to find the element
         AndroidElement titleElement = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"CANCELLATION POLICY\"]"));

        // Get the actual title text from the element
        String actualTitle = titleElement.getText();

        // Expected title text (replace this with the actual expected title)
        String expectedTitle = "CANCELLATION POLICY";

        // Assert that the actual title matches the expected title
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match the expected value!");

	}


}
