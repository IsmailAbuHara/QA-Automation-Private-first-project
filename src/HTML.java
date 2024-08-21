import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HTML {
	public WebDriver driver;
	
	@BeforeTest()
	
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		
	}
	
	@Test()
	public void sort_items_low_to_high() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();		
		
		List<WebElement> thePricesList = driver.findElements(By.className("inventory_item_price"));
		List<Double> myNewEditedList = new ArrayList<> ();
		
		for( int i =0; i< thePricesList.size(); i++) {
			
			String price = thePricesList.get(i).getText();
			
			price.trim();
			
			String editedPrice = price.replace("$", " ");
			
			System.out.println(editedPrice.trim());
			
			double val = Double.parseDouble(editedPrice.trim());
			
			myNewEditedList.add(val);
			
		}
		for(int k = 0 ; k < myNewEditedList.size(); k++) {
			
			boolean checkProcess = myNewEditedList.get(0) < myNewEditedList.get(myNewEditedList.size()-1);
			
			Assert.assertEquals(checkProcess, false); 
		 
 		}

	}
}
