package org.cts.tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {

	@Parameters({"browser"})
	@Test
	public void tc1(String s) {
		 WebDriver driver=null;

		if(s.equals("ff")) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\TestNg\\A\\drivers\\geckodriver.exe");

		 driver = new FirefoxDriver();		

		 
	}
		 else if(s.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\TestNg\\A\\drivers\\chromedriver.exe");

				 driver = new ChromeDriver();		

		 }
	
		 else if(s.equals("ie")) {
				System.setProperty("webdriver.ie.driver",
						"F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\TestNg\\A\\drivers\\IEDriverServer.exe");

				 driver = new InternetExplorerDriver();		

		 }
	
	driver.get("https://www.facebook.com/");
	


	
	}

	
	
}
