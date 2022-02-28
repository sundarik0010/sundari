package weekend_assign;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeals {
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		option.addArguments("--disable-notification--");
		driver.get("https://www.snapdeal.com/");
		 Alert alert = driver.switchTo().alert();
	  	 alert.accept();
	  	 WebElement men =driver.findElement(By.xpath("//ul[@class='nav smallNav']//span[2]"));
	  	 Actions act=new Actions(driver);
	  	 act.moveToElement(men).perform();
	  	driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
	  	String count =driver.findElement(By.xpath("//span[@class='category-name category-count']")).getTagName();
	  	System.out.println(count);
	  	File source=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/SnapDeals.png");
		FileUtils.copyFile(source, des);
}
}
