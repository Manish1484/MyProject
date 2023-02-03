package basePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.geko.driver", "geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("div.oxd-form-row:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("Admin");
		driver.findElement(By.cssSelector("div.oxd-form-row:nth-child(3) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		Thread.sleep(3000);
		driver.close();
	
	}

}
