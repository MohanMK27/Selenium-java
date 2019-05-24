package selenium1; //change according to your package name

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromemk { //change according to your class name

public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium g\\chromedriver.exe"); // It is chrome driver location path
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.gmail.com");
	driver.quit();	
}
}
