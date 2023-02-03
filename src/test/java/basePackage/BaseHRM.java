package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseHRM {
	
	public static Properties prop=new Properties ();
	public static WebDriver  driver;
	//step 1
	public BaseHRM () {
		try {
			
		FileInputStream file=new FileInputStream("C:\\Users\\manis\\HRmanagement\\src\\test\\java\\enviornmentvariables\\Config.properties");
		prop.load(file);	
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
		catch (IOException a) {
			a.printStackTrace();
		}}
	public static void initiate() {
		String browsername= prop.getProperty("browser");
		
	if (browsername.equals("Firefox")) {
		System.setProperty("Webdriver.geko.driver", "geckodriver.exe");
		driver= new FirefoxDriver();}
	
	else if (browsername.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "chrome.exe");
			driver= new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
		
	}
/*	public static void screenshots(String Filename) {
		File file=((TakeScreenShot)driver).getScreenShotAs(OutputType.FILE);
		try {
		
		FileUtils.copyFile(file, new File("C:\\Users\\manis\\HRmanagement\\src\\test\\java\\screenshot\\screenshot"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}*/
	}
		
			
		
		
	

		
	
	


