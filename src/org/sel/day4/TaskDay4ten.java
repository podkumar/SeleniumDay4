package org.sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay4ten {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		WebElement txtsrch = driver.findElement(By.xpath("//input[@type='text']"));
		txtsrch.sendKeys("Apple iphone xr mobile case");
		WebElement btnsrch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnsrch.click();
		Thread.sleep(2000);
		WebElement firstprd = driver.findElement(By.xpath("//div[@class='_4ddWXP']"));
		firstprd.click();
 }
}