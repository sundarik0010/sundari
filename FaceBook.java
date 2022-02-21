package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sundari");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("9894762960");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345@abc");
		
		WebElement day = driver.findElement(By.id("day"));
		Select index = new Select(day);
		index.selectByIndex(10);
		
		WebElement month = driver.findElement(By.id("month"));
		Select kambu = new Select(month);
		kambu.selectByVisibleText("july");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sombu = new Select(year);
		sombu.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}
}
