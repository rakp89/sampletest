package PAGES;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BASE {

public static WebDriver driver;
public static Properties prop;
public BASE() {
		
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(
					"/Users/rakesh/eclipse-workspace/NEWMANULIFE/config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void initialization()  {
		
		
		String Browser = prop.getProperty("browser");
			if (Browser.contentEquals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"/Users/rakesh/eclipse-workspace/NEWMANULIFE/chromedriver");
				driver = new ChromeDriver();
			} else if (Browser.contentEquals("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						"/Users/rakesh/eclipse-workspace/manulife/src/com/utilities/geckodriver");
				driver = new FirefoxDriver();
			} else

			{
				System.setProperty("webdriver.gecko.driver",
						"/Users/rakesh/eclipse-workspace/NEWMANULIFE/src/main/java/utilies/geckodriver");
				driver = new FirefoxDriver();
				
			
			}
			
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   driver.get(prop.getProperty("Url"));
			   
			   
		}
}

