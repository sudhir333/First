import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("sudhirgautam@gmail.com");
		driver.findElement(By.id("inputUsername")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.err.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		driver.close();
		
	
	}
	
}
