package july1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\amd\\July1\\Driver\\chromedriver.exe");
		
		
		WebDriver d=new ChromeDriver();
	
	d.get("https://www.google.com/");
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	
	
	}
}
