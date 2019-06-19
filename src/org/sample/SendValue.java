package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\ScreenPrint\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	WebElement pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	JavascriptExecutor jk=(JavascriptExecutor) driver;
	//send keys
	jk.executeScript("arguments[0].setAttribute('value','albert@gmail.com')", email);
	jk.executeScript("arguments[1].setAttribute('value','qwerty')", email, pass);
	//getAttributes
	Object obj=jk.executeScript("return arguments[0].getAttribute('value')", pass);
	String text=(String) obj;
	System.out.println(text);
	
}
}
