package promax;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi {
   public void multi() {
	   		try{
		System.setProperty("webdriver..chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Forgotten account")).click();
		Set<String> a=driver.getWindowHandles();
		Iterator<String> it=a.iterator();
		while (it.hasNext())
		{
			String childwindow=it.next();
			driver.switchTo().window(childwindow);
		}
		
	}
		catch (Exception exception)
		{
			System.out.println(exception);
			
		}
			
	
	}

    public static void main(String[] args) {
    	multi obj=new multi();
    	obj.multi();


	}

}
