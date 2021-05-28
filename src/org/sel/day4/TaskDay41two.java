package org.sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay41two {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html ");
		WebElement txtsrch = driver.findElement(By.id("autocomplete"));
		txtsrch.sendKeys("iphone xr mobilecase");
		WebElement btnsrch = driver.findElement(By.xpath("//a[@onclick='searchTrigger()']"));
		btnsrch.click();
		WebElement boxfirstprd = driver.findElement(By.xpath("(//div[@class='column col3 search_blocks'])[1]"));
		boxfirstprd.click();
 }
}