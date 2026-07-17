package com.DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(0);
		WebElement Button1 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));

		Button1.click();

		String clickmsg = driver.findElement(By.xpath("//*[@id=\"Click\"]")).getText();
		System.out.println(clickmsg);

		driver.switchTo().defaultContent();

		List<WebElement> element = driver.findElements(By.tagName("iframe"));

		int size = element.size();
		System.out.println(size);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		WebElement Button2 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		Button2.click();
	}
}