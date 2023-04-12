package com.assignment1.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;




public class Maas360 {



	public static void main(String[] args) 

	{
		System.setProperty(
	            "webdriver.chrome.driver",
	            "D:\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://www.geeksforgeeks.org/");
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://iq1portal.fiberlink.com/emc/?#");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/section/div/div[1]/a")).click();
//		driver.findElement(By.name("email")).sendKeys("das2311neha@gmail.com");
//		driver.findElement(By.name("firstName")).sendKeys("Neha");
//		driver.findElement(By.name("lastName")).sendKeys("Das");
//		driver.findElement(By.name("password")).sendKeys("Neha@123456789");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/div/form/div[2]/div[1]/div[2]/div[3]/button")).click();

	}




} 