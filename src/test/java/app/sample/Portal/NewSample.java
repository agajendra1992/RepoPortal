package app.sample.Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewSample {
	public static WebDriver driver;
	@Test
	public void applaunch() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\eclipse_Workspace\\WorkspaceTesting\\latestCucumberSeleniumFramework-master\\src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println("Test");
	}

}
