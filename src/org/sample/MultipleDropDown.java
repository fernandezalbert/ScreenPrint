package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\ScreenPrint\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	WebElement selenium_commands=driver.findElement(By.id("selenium_commands"));
	Select s= new Select(selenium_commands);
	s.selectByIndex(3);
	s.selectByIndex(2);
	//to select all options
	List<WebElement> op =s.getOptions();
	for (int i = 0; i < op.size(); i++) {
		String text=op.get(i).getText();
		s.selectByVisibleText(text);
	}
	//deselect
	s.deselectByIndex(2);
	s.deselectByVisibleText("Wait Commands");
	//to print only the selected options
	List<WebElement> op2=s.getAllSelectedOptions();
	
	for (int i = 0; i < op2.size(); i++) {
		String txt=op.get(i).getText();
		System.out.println(txt);
		
	}
	//to print the first selected option
	WebElement fi=s.getFirstSelectedOption();
	System.out.println(fi.getText());
}

}
