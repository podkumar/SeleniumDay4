package org.sel.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay4four {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/ ");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		WebElement txtsrch = driver.findElement(By.xpath("//input[@type='text']"));
		txtsrch.sendKeys("Apple iphonexr");
		WebElement btnok = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnok.click();
		WebElement product = driver.findElement(By.xpath("//img[@alt='Apple iPhone XR (Black, 128 GB),(Includes EarPods, Power Adapter)'][@src='https://rukminim1.flixcart.com/image/312/312/jnj7iq80/mobile/u/b/g/apple-iphone-xr-mryj2hn-a-original-imafa6zkm7qhv2zd.jpeg?q=70']"));
		product.click();
//		WebElement click = driver.findElement(By.className("searchTextSpan"));
//		click.click();
//		WebElement product = driver.findElement(By.xpath("//img[@title='Apple iPhone XR Plain Cases Spectacular Ace - Transparent']"));
//		product.click();
 }
}