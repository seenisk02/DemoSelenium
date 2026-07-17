package com.DemoSelenium;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String windowHandle = driver.getWindowHandle();
		driver.get("https://www.amazon.in");
		driver.switchTo().newWindow(WindowType.TAB);
		//String windowHandle1 = driver.getWindowHandle();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		//String windowHandle2 = driver.getWindowHandle();
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		//String windowHandle3 = driver.getWindowHandle();
		driver.get("https://www.redbus.com");

		Set<String> windowHandles = driver.getWindowHandles();
		int size = driver.getWindowHandles().size();
		System.out.println(size);
for (String string : windowHandles) {
	driver.switchTo().window(string);  // Switch to each window
    System.out.println("Title of window/tab: " + driver.getTitle());  
}
		
	}
}
