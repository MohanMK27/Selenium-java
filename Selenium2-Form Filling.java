package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumForm {

public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium g\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.codetantra.com/j/selenium/dynamic-form.jsp");
	WebElement firstName=driver.findElement(By.id("firstName"));
	WebElement lastName=driver.findElement(By.id("lastName"));
	WebElement comments= driver.findElement(By.id("comments"));
	WebElement submitBtn=driver.findElement(By.id("submitBtn"));
	firstName.sendKeys("Mohan");
	lastName.sendKeys("Kumar");
	comments.sendKeys("I am b.tech IT student.");
	submitBtn.click();
	driver.quit();
}
}
