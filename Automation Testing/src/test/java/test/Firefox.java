package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Apnik034\\eclipse-workspace\\OrangeHRM-Website-Testing\\Automation Testing\\Drivers\\geckodriver.exe" );

        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
}