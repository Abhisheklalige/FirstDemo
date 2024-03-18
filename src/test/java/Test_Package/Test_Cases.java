package Test_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Cases {
	WebDriver driver;


	@BeforeMethod
	public void lunchDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.manage().window().fullscreen();

	}

	@Test
	public void Test1() {
		driver.navigate().to("https://www.AutomationTalks.com/");
		System.out.println("Test 1 titles is "+ driver.getTitle());

	}
	@Test
	public void Test2() {
		driver.navigate().to("https://www.AutomationTalks.com/");
		System.out.println("Test 2 titles is "+ driver.getTitle());

	}
	@Test
	public void Test3() {
		driver.navigate().to("https://www.AutomationTalks.com/");
		System.out.println("Test 3 titles is "+ driver.getTitle());

	}
	@AfterMethod
	public void quit() {
		driver.close();
		driver.quit();
	}

}
