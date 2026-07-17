package com.DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Drop {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/?gad_source=1&gad_campaignid=22513880550&gclid=Cj0KCQjwj8jDBhD1ARIsACRV2TvQ8IrK5aHorPgyp6TU6r0_CIrjvuKiVm_qBIMHS0MA0TgwDnfs7IgaAr6QEALw_wcB");
		
		WebElement S = driver.findElement(By.xpath("//div[@class='labelCityWrapper___ff8ef7']//div[text()='From']"));
		
		S.click();
		
		Robot S1 = new Robot();
		S1.keyPress(KeyEvent.VK_S);
		S1.keyRelease(KeyEvent.VK_S);
		S1.keyPress(KeyEvent.VK_A);
		S1.keyRelease(KeyEvent.VK_A);
		S1.keyPress(KeyEvent.VK_L);
		S1.keyRelease(KeyEvent.VK_L);

		
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		List<WebElement> list = driver.findElements(By.xpath("div[@class='searchCategory___e86c08']//div[@class='listText___1a3137']"));
//wait.until(ExpectedConditions.visibilityOfAllElements(list));
		
		for(WebElement op : list) {
			String text = op.getText();
			System.out.println(text);
		}
		
		
		
		
		
		//div[@class='searchCategory___e86c08']//div[@class='listText___1a3137']
//
//driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'css-1hwfws3')]")).click();
//
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//div[contains(@class,'menu')]//div[contains(@class,'option')]")));
//
//List<WebElement> option = driver.findElements(By.cssSelector("//div[contains(@class,'menu')]//div[contains(@class,'option')]"));
//
//for (WebElement webElement : option) {
//	
//	System.out.println(webElement.getText());
//}
	}
}