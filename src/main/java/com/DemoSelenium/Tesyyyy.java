package com.DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tesyyyy {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.w3schools.com/");
driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

driver.findElement(By.xpath("//button[text()='Start']")).click();

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));


System.out.println(until.getText());





//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//driver.findElement(By.xpath("(//a[@class='w3-right w3-btn'])[1]")).click();



//visibilityOfElementLocated
//elementtobeclickable
//alertspresent
//presence
	}
}
	












	
