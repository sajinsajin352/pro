package promax;

import java.io.IOException;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver..chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("C:\\Users\\user\\Desktop\\sajin\\scrnt.jpeg"));

	}

}
