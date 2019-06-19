package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragIt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shiny\\\\eclipse-workspace\\\\ScreenPrint\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement webSrc=driver.findElement(By.id("credit2"));
		WebElement webDesc=driver.findElement(By.id("bank"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(webSrc, webDesc).perform();
		
	}
}
