package com.DemoSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_Testing {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");
	        options.addArguments("--window-size=1920,1080");
		WebDriver driver  = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
        driver.get("https://www.google.com");
       
        
        
       
    driver.findElement(By.name("q")).sendKeys("seeni"+Keys.ENTER);
    Thread.sleep(3000);
    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcFile, new File("C:\\Users\\seeni\\eclipse-workspace\\Seeni_Sk\\DemoSelenium\\fita\\google_search_result.png"));
    System.out.println("Screenshot saved as google_search_result.png");
    
   List <WebElement> link = driver.findElements(By.tagName("a"));
    
   for(WebElement Opition : link) {
	   System.out.println(Opition.getText());
   }
		
	}
}
