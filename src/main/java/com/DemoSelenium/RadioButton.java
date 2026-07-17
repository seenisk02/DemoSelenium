package com.DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
	    
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();	      
	      driver.manage().window().maximize();
	      driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node075khsqfjhcn92xfkntpr9eq97357391.node0");

	      
	      WebElement Below20 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/label"));
	      
	      Boolean status = Below20.isSelected();
	      System.out.println(status);
	      
	      
}
}