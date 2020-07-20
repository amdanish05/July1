package july1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\ELCOT\\Downloads\\eclipse\\amd\\July1\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("http://www.facebook.com/");
	
	WebElement user = d.findElement(By.id("email"));
	user.sendKeys("Sangeeth@gmail.com");
	
	WebElement pass = d.findElement(By.id("pass"));
	pass.sendKeys("sdfghjgfedwqdfgdsfh");
	
	System.out.println(d.getCurrentUrl());
	System.out.println(d.getTitle());
	d.quit();
	
	
	
	
	
	
	
	}

}
