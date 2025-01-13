package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivers {
	public static void main(String[] args) {
		//Concept of Browser Drivers Class and Web Drivers Interface
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apnik034\\eclipse-workspace\\OrangeHRM-Website-Testing\\Automation Testing\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
	}
	
}

