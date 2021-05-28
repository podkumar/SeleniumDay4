package org.sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay4seven {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement srchbox = driver.findElement(By.xpath("//input[@name='q']"));
	srchbox.sendKeys(" greens velmurugan");
	WebElement btnsrc = driver.findElement(By.className("gNO89b"));
	btnsrc.click();
	Thread.sleep(2000);
	WebElement linkfirst = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
	linkfirst.click();
	
 }
}