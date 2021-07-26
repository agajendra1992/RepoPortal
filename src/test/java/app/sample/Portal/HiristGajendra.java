/*
 * package app.sample.Portal;
 * 
 * import java.util.Set;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions; import org.testng.annotations.Test;
 * 
 * public class HiristGajendra { public static WebDriver driver;
 * 
 * @Test public void login() throws InterruptedException {
 * System.setProperty("webdriver.chrome.driver",
 * "E:\\eclipse_Workspace\\chromedriver\\chromedriver.exe"); ChromeOptions
 * options = new ChromeOptions(); // options.addArguments("headless"); //
 * options.addArguments("window-size=1200x600"); driver = new ChromeDriver();
 * driver.manage().window().maximize(); driver.get("https://www.hirist.com/");
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//i[@class='icon-login']")).click();
 * driver.findElement(By.xpath("//span[text()='Sign In']")).click();
 * driver.findElement(By.name("email")).sendKeys("gajendra.akash02@gmail.com");
 * driver.findElement(By.name("password")).sendKeys("G@jju1234");
 * driver.findElement(By.xpath("//span[text()='Login']")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//img[@class='profile-image']")).click();
 * 
 * String Window = driver.getWindowHandle();
 * driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
 * Set<String> all = driver.getWindowHandles(); for (String windows : all) {
 * driver.switchTo().window(windows); }
 * 
 * driver.findElement(By.
 * xpath("//button[@type = 'button' and text()='Edit Profile']")).click();
 * 
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.xpath("(//input[@name='name'])[1]")).
 * sendKeys("Gajendra Saxena");
 * 
 * driver.findElement(By.xpath(
 * "(//div[@class='profile-component']//button[text()='Save'])[6]")).click();
 * 
 * } }
 */