package app.sample.Portal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewSample {
	public static WebDriver driver;

	@Test
	public void applaunch() throws InterruptedException, IOException, AWTException {
		//System.setProperty("webdriver.chrome.driver", "E:\\eclipse_Workspace\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().driverVersion("103.0").setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//options.addArguments("window-size=1200x600");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
				.sendKeys("gajendrasaxena");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("9806480683");
		driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
		Thread.sleep(10000);
		WebElement mynaukari = driver.findElement(By.xpath("//div[text()='My Naukri']"));
		WebElement EditProfile = driver.findElement(By.xpath("//a[text()='Edit Profile']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mynaukari).moveToElement(EditProfile).click().build().perform();
		EditProfile.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class=\"uploadCont\"]")).click();
		Thread.sleep(5000);

		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\user\\Desktop\\Gajendra_Resume.docx");

		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.quit();
		Thread.sleep(5000);
		// Runtime runtime = Runtime.getRuntime();
		// runtime.exec("taskkill /im chromedriver.exe /f");
	}

}
