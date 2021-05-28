package org.sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay4two {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btntrainer = driver.findElement(By.id("home-tab"));
		btntrainer.click();
		Thread.sleep(2000);
		WebElement textfrompage = driver.findElement(By.xpath("//p[text()[contains(.,'400+')]]"));
		String text = textfrompage.getText();
		System.out.println(text);
 }
}