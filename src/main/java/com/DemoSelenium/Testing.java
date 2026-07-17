package com.DemoSelenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.statesavings.ie/");

		List<WebElement> S = driver.findElements(By.xpath("//ul[@class='primary-nav__list']//li"));
		
		for (WebElement web : S) {
			String text = web.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// (((//div[text()='Apple iPhone 13 (Midnight, 128
		// GB)']//parent::div//parent::div)[1]//following::div)[4]//child::div)[3]

//	     WebElement element = driver.findElement(By.xpath("(((//div[text()='Apple iPhone 13 mini (Green, 256 GB)']//parent::div//parent::div)[1]//following::div)[4]//child::div)[3]"));
//WebElement element = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)']//ancestor::div[@class='yKfJKb row']//descendant::div[@class='Nx9bqj _4b5DiR']"));
//	String S =element.getText();
//	System.out.println(S);
	}

}