package promax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver..chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("fdcghhd");
		driver.findElement(By.id("pass")).sendKeys("tyygh");
		driver.findElement(By.id("loginbutton")).click();

	}

}
