package Week3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		Actions Act=new Actions(driver);
		ChromeOptions option=new ChromeOptions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		option.addArguments("--disable-notification--");
	    driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement Mens=driver.findElement(By.xpath("//li[@class='navlink']"));
		Act.moveToElement(Mens).perform();
	   driver.findElement(By.xpath("//div[@class='colDataInnerBlk']//span[@class='linkTest']")).click();
	String count=driver.findElement(By.xpath("//div[@class='category-name-wrapper clearfix ']//span")).getText();
	System.out.println(count);

	 String title=driver.getTitle();
	  System.out.println(title);
	
	}
}
