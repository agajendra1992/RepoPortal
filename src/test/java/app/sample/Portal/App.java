package app.sample.Portal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	public static WebDriver driver;

	@Test
	public void loadbrowser() throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver",
	//			"E:\\eclipse_Workspace\\WorkspaceTesting\\latestCucumberSeleniumFramework-master\\src\\test\\resources\\drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().version("103.0").setup();
		WebDriverManager.chromedriver().driverVersion("103.0").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
				.sendKeys("gajendrasaxena");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("9806480683");
		driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
		Thread.sleep(5000);
		driver.quit();
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("taskkill /im chromedriver.exe /f");
	}
}
