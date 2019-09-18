package org.cts.tst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\TestNg\\A\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.id("inputValEnter")).sendKeys("iphonex");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> items = driver.findElements(By.xpath("//p[@class='product-title ']"));
		
		int size = items.size();
		System.out.println(size);
		
		
		for(WebElement x:items) {
			x.click();
			System.out.println(x.getText());
			
		}
	}
	}
