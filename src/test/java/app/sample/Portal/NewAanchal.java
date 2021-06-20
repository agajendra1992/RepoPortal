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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewAanchal {
	public static WebDriver driver;

	@Test
	public void applaunch() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\eclipse_Workspace\\WorkspaceTesting\\latestCucumberSeleniumFramework-master\\src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

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

		driver.findElement(By.xpath("//div[@class=\"uploadCont\"]")).click();
		Thread.sleep(2000);

		StringSelection stringsel = new StringSelection("C:\\Users\\user\\Desktop\\DESk\\Aanchal_Resume_Update.doc");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel, null);
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.setAutoDelay(5);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("taskkill /im chromedriver.exe /f");
	}

}