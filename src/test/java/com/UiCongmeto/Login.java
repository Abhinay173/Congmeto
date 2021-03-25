package com.UiCongmeto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	public static WebDriver driver = null;
	public static void main(String [] args) throws InterruptedException  
	   {
		//WebDriver driver = null;
		   System.setProperty("webdriver.chrome.driver", 
				   "C:\\Tools\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("https://ui.cogmento.com/");
		   driver.findElement(By.name("email")).sendKeys("oppot2529@gmail.com");
		   driver.findElement(By.name("password")).sendKeys("Pass@123");
     	 // A.findElement(By.lin("Login")).click();
		  // A.findElement(By.className("ui fluid large blue submit button")).click();
		   driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		   // A.findElement(By.linkText("Contacts")).click();
		   // A.findElement(By.xpath("//*[@id=\"ui\"]")).click();
           //Actions b = new Actions(A);
		  //  b.moveByOffset(-100, 100);
          // WebElement tar = A.findElement(By.xpath("//div[@id=\"main-nav\"]/div[3]/a"));
          // b.moveToElement(tar).build().perform();
     
		   Thread.sleep(3000);
			
			Actions act = new Actions(driver);
			WebElement navBar = driver.findElement(By.id("main-nav"));
			act.moveToElement(navBar).build().perform();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@id=\"main-nav\"]/div[3]/a")).click();
			
			
		/*	Thread.sleep(8000);
			driver.close();
           
*/           
           
           
           
           
}
	
	
	
}//*[@id="ui"]/div/div/form/div/div[3]
//div[@id="main-nav"]/div[3]/a