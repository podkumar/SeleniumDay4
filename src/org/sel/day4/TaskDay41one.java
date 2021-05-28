package org.sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay41one {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement txtlogin = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtlogin.sendKeys("Dinesh");
		String username = txtlogin.getAttribute("value");
		System.out.println(username);
		WebElement txtpass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxUp']"));
		txtpass.sendKeys("password123");
		String password = txtpass.getAttribute("value");
		System.out.println(password);
	
 }
}