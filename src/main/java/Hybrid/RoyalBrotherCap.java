package Hybrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RoyalBrotherCap {
	
	public static AndroidDriver<AndroidElement> cap() throws MalformedURLException {
		
		
		DesiredCapabilities  dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "goutam8a");
		
		// I specified here that i am using android 
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.NO_RESET,true);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.royalbrothers");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.royalbrothers.MainActivity");
		
		//for android we have android driver // we have androidelement // i an givng the information of the 
		//appium by giving the host.portnumber and remotepath
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0:4723/wd/hub"),dc);
		return driver;
	}
}
