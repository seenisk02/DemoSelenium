package com.DemoSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		String Pwin = driver.getWindowHandle();
		WebElement element1 = driver.findElement(By.id("home"));
		element1.click();
		Set<String> allwind = driver.getWindowHandles();
		for (String string : allwind) {
			driver.switchTo().window(string);
		}
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

		String S = driver.getTitle();
		System.out.println(S);

		driver.switchTo().window(Pwin);

		WebElement element = driver.findElement(By.id("multi"));

		element.click();
		int i = 1;
		Set<String> Allhandle = driver.getWindowHandles();
		for(String S1 : Allhandle) {
			driver.switchTo().window(S1);
			TakesScreenshot S11 = (TakesScreenshot)driver;
			File src = S11.getScreenshotAs(OutputType.FILE);
			 
				
			File desc = new File("C:\\New folder\\Screen"+i+".png");
			FileUtils.copyFile(src, desc);
			i++;
		}
	}
}
