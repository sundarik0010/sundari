package Week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	private static final Actions Act = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions builder=new Actions(driver);
		WebElement brand=driver.findElement(By.xpath("//ul[@class='HeaderNav css-f7ogli'][2]"));
	     Act.moveToElement(brand).perform();
	     driver.findElement(By.xpath("//div[@id='brandCont_Popular']//ul//li[5]")).click();
		  String title=driver.getTitle();
		  System.out.println(title);
		
	}
}
