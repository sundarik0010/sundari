package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
	        String title=driver.getTitle();
	        System.out.println(title);
	        driver.findElement(By.linkText("Contacts")).click();
	        driver.findElement(By.linkText("Create Contact")).click();
	        driver.findElement(By.id("firstNameField")).sendKeys("sundari");
	    	driver.findElement(By.id("lastNameField")).sendKeys("k");
	    	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("hr");
	    	driver.findElement(By.id("createContactForm_description")).sendKeys("hello");
	    	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sundarik0010@gmail.com");
	    	driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("New york");
	    	driver.findElement(By.className("smallSubmit")).click();
	    	driver.findElement(By.className("subMenuButton")).click();
	    	driver.findElement(By.id("updateContactForm_description")).clear();
	    	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("assignment");
	    	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    	String title1 = driver.getTitle();
	    	String title2="View Contact | opentaps CRM";
	    	if(title1.equals(title2)) {
	    		System.out.println("testcase pass");
	    	}else {
	    		System.err.println("testcase fail");
	    	}
	    	
	    	String text2 = driver.findElement(By.id("viewContact_fullName_sp")).getText();
	    	System.out.println("Name"+ text2);
	    	driver.close();
	    	
	    	
	    	
	    	
	        
}
}
