package uthontication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_login {

	public static void main(String[] args) throws InterruptedException {
		String testmail="rubamomani100@gmail.com";
		String testpassword="P@ssword123";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\C-ROAD\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[6]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(testmail);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys(testpassword);
		driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys(testpassword);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();
	}

}
