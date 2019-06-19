package org.sample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\ScreenPrint\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		TakesScreenshot tk= (TakesScreenshot) driver;
		File src=tk.getScreenshotAs(OutputType.FILE);	
		File Desc=new File("C:\\Users\\Shiny\\eclipse-workspace\\ScreenPrint\\Screenshot\\two.png");
	    FileUtils.copyFile(src, Desc);
	    FileReader r=new FileReader(Desc);
	    r.read();
	}
}
