package test;
import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Apnik034\\eclipse-workspace\\OrangeHRM-Website-Testing\\Automation Testing\\Drivers\\msedgedriver.exe");


		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
