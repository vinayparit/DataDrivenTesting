package com.DataDrivenTesting.DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromCommonDataTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = null;

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);

		String Browser = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String UserName = pObj.getProperty("username");
		String Password = pObj.getProperty("password");

		if (Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(4000);

		driver.get(URL);
		driver.findElement(By.xpath("//a[@href=\"login.php\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@id=\"exampleInputPassword1\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

	}

}
