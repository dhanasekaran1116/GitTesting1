package org.test.projectiphone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneProject {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement closewindow = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closewindow.click();
		WebElement txtSearchBox = driver.findElement(By.name("q"));
		txtSearchBox.sendKeys("iphone");
		WebElement clkSearchBox = driver.findElement(By.xpath("//button[@type='submit']"));
		clkSearchBox.click(); 
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		int size = product.size();
		System.out.println(size);
		for (int i = 0; i < product.size(); i++) {
			WebElement webElement = product.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
			
		}
		
		
	
		
	}
	
	
	

}
