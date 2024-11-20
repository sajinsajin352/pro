package promax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bank {

	public static void main(String[] args) {
		System.setProperty("webdriver..chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, to).build().perform();
		
		WebElement from1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(from1, to1).build().perform();
		
		WebElement from2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement to2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Actions act2=new Actions(driver);
		act2.dragAndDrop(from2, to2).build().perform();
		
		WebElement from3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to3=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act3=new Actions(driver);
		act3.dragAndDrop(from3, to3).build().perform();
		
		


	}

}
