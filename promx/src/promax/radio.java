package promax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) {
		System.setProperty("webdriver..chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio1= driver.findElement(By.id("vfb-7-1"));
		WebElement radio2= driver.findElement(By.id("vfb-7-2"));
		WebElement radio3= driver.findElement(By.id("vfb-7-3"));
		radio1.click();
		System.out.println("radio button 1 selected");
		radio2.click();
		System.out.println("radio button 2 selected");
		radio3.click();
		System.out.println("radio button 3 selected");
		WebElement option1=driver.findElement(By.id("vfb-6-0"));
		option1.click();
		if(option1.isSelected()) {
			System.out.println("checkbox is toggled on");
		}else {
			System.out.println("checkbox is toggled off");
		}
	}

}
