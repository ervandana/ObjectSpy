package Locators;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://objectspy.space/");

	}

	@Test
	public void testLocators() {
		driver.findElement(By.id("photo")).sendKeys("E:\\Techfios_Selenium\\ObjectSpy--Session2\\pictures\\img1.PNG");
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[id=exp-1]")).click();
		

	}

//	@After
//	public void teardown() {
//		driver.close();
//		driver.quit();

//	}

}
