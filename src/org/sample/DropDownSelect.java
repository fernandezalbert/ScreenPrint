package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\ScreenPrint\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement day=driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByVisibleText("10");
	//Count of options
	List<WebElement> op=s.getOptions();
	System.out.println(op.size());
	//to print all option based on txt
	for (int i = 0; i < op.size(); i++) {
		WebElement x=op.get(i);
		String text=x.getText();
		System.out.println(text);
		
	}
	//to print all option based on value
	for (WebElement x : op) {
		String att=x.getAttribute("value");
		System.out.println(att);
	}
}
}
