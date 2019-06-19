package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\ScreenPrint\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> tRows=driver.findElements(By.tagName("tr"));
	for(int i=0;i<tRows.size();i++) {
		List<WebElement> tData=tRows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<tData.size();j++) {
			String text=tData.get(j).getText();
			//print all
			System.out.println(text);
			//Check row num and column
			if(text.equals("UAE")) {
				System.out.println("row number of UAE"+i);
				System.out.println("column number of UAE"+j);
			}
		}
	}
}
}
