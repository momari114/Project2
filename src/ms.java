
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class ms {
	WebDriver driver =new ChromeDriver();
	
	
	
	@BeforeTest 
	
	public void myBeforTest () {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		

		
	} 
	
	
	@Test ()
	public void myTestOne () {
		
		List<WebElement> addtoCartButtons = driver.findElements(By.className("btn_primary"));

		
		for(int i = 0 ;i<addtoCartButtons.size();i=i+2) {
			addtoCartButtons.get(i).click();
	}
	}
	@AfterTest
	
	public void myAfterTest () {}
	

}


































//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//
//public class ms {
//	WebDriver drive = new ChromeDriver();
//
//	@BeforeTest 
//		
//		public void myBeforTest () {
//				drive.get("https://www.saucedemo.com/");
//				drive.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//				drive.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//				drive.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				
//				drive.findElement(By.name("login-button")).click();
//			
//			
//			
//			
//		}
//
//	@Test()
//	public void myTestOne() {
//		List<WebElement> addtoCartButtons = drive.findElements(By.className("btn_primary"));
//		for(int i = 0 ;i<addtoCartButtons.size();i=i+2) {
//			addtoCartButtons.get(i).click();
//			
//		}
//		
//	}
//
//	@AfterTest
//
//	public void myAfterTest() {
//	}
//
//}
