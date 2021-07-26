package app.sample.Portal;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UpdateNameAsthanaAanchal {
	public static WebDriver driver;

	@Test
	public void applaunch() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_Workspace\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
				.sendKeys("aanchal.asthana23sep@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("coolasthana");
		driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
		Thread.sleep(5000);
		WebElement mynaukari = driver.findElement(By.xpath("//div[text()='My Naukri']"));
		WebElement EditProfile = driver.findElement(By.xpath("//a[text()='Edit Profile']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mynaukari).moveToElement(EditProfile).click().build().perform();
		EditProfile.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Edit'])[2]")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Aanchal Asthana");
		driver.findElement(By.id("saveBasicDetailsBtn")).click();
		System.out.println("Name Update SuccessFully");
		driver.close();

	}
}
