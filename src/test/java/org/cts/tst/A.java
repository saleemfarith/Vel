package org.cts.tst;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	static WebDriver driver;

	@BeforeClass
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\TestNg\\A\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test(dataProvider = "res")

	private void tc1(String s1, String s2) {
		driver.get("https://www.facebook.com");

		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys(s1);

		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys(s2);

	}

	@DataProvider(name = "res")
	private Object[][] data() {
		return new Object[][] { { "Farith", "Karthik" }, { "Naveen", "Nishanthi" }, { "Vel", "Saranya" } };

	}

}
