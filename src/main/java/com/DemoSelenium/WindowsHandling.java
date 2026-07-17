package com.DemoSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");

		String ParentWindow = driver.getWindowHandle();
		WebElement OpenWindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		OpenWindow.click();
		Set<String> ChildWindow = driver.getWindowHandles();
		for (String all : ChildWindow) {
			driver.switchTo().window(all);

		}

		WebElement Emailtext = driver.findElement(By.xpath("//*[@id=\"email\"]"));

		Emailtext.sendKeys("seenivasan");
		driver.close();

		driver.switchTo().window(ParentWindow);

		WebElement Muliple = driver.findElement(By.xpath(" //*[@id=\"j_idt88:j_idt91\"]/span"));
		Muliple.click();

		int Numofwindws = driver.getWindowHandles().size();
		System.out.println("numberofwindows" + Numofwindws);

		WebElement Closewindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		Closewindow.click();

		Set<String> al = driver.getWindowHandles();

		for (String New : al) {
			if (!New.equals(ParentWindow)) {
				driver.switchTo().window(New);
				driver.close();

			}
			driver.quit();

		}

	}
}
