package test;
import org.openqa.selenium.By;
//Default for all
import org.openqa.selenium.WebDriver;

//For Chrome Browser
import org.openqa.selenium.chrome.ChromeDriver;

//For Firefox Browser
//import org.openqa.selenium.firefox.FirefoxDriver;

//For Edge Browser
//import org.openqa.selenium.edge.EdgeDriver;
public class AllBrowser {
    public static void main(String args[]) throws InterruptedException
    {
        // For Chrome Browser
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apnik034\\eclipse-workspace\\OrangeHRM-Website-Testing\\Automation Testing\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 

        //For Firefox Browser
        /**
          System.setProperty("webdriver.gecko.driver", "C:\\Users\\Apnik034\\eclipse-workspace\\OrangeHRM-Website-Testing\\Automation Testing\\Drivers\\geckodriver.exe" );

        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         */

        //For Edge Driver
        /**
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Apnik034\\eclipse-workspace\\OrangeHRM-Website-Testing\\Automation Testing\\Drivers\\msedgedriver.exe");


		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
        */ 


        //How to use [User.dir] path on the getProperty method)

        //System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe");


		//WebDriver driver = new EdgeDriver();

		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //full screen the window size
       // driver.manage().window().maximize();

        //Close the Browser
       
        //How to use the name locator and send the value
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
                
       

    }
}
