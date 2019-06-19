package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollSample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\ScreenPrint\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement srcTamil=driver.findElement(By.xpath("//a[@title=\"Tamil\"]"));
	WebElement srcEmail=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].scrollIntoView(true)", srcTamil);
	Thread.sleep(2000);
	jk.executeScript("arguments[0].scrollIntoView(false)", srcEmail);
	
}
}
