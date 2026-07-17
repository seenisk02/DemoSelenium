package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T6 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
        Thread.sleep(800);
        driver.switchTo().activeElement().sendKeys("Mumbai");
        Thread.sleep(800);
        driver.findElement(By.xpath("//div[@class='listHeader___40b031']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'To')]")).click();
        Thread.sleep(800);
        driver.switchTo().activeElement().sendKeys("Pune");
        Thread.sleep(800);
        driver.findElement(By.className("listHeader___40b031")).click();
//	driver.findElement(By.xpath("//div[text()='From']")).click();;
//		
//		
//		driver.switchTo().activeElement().sendKeys("Mumbai");
//		
//		driver.findElement(By.xpath("//div[@class='listHeader___40b031']")).click();
	}
}
