package Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver sales1=new ChromeDriver();
		sales1.get("https://www.opencart.com/index.php?route=account/register");
		sales1.manage().window().maximize();
		sales1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		sales1.findElement(By.xpath("//input[@name='username']")).sendKeys("SUNDARI");
		sales1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SUNDARI");
		sales1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KUMAR");
	sales1.findElement(By.name("email")).sendKeys("sundarik0010@gmail.com");
	sales1.findElement(By.name("password")).sendKeys("sundu@123");
WebElement inputcountry = sales1.findElement(By.id("input-country"));
	
	Select text=new Select(inputcountry);
	text.selectByVisibleText("Guam");
	
	}
	

}


