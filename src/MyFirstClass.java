import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyFirstClass {

	public static void main(String[] args){
//		throws InterruptedException, IOException 
//		String testEmail="esmeelabuharra@yahoo.com";
//		String testPassword="123456789";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Esmaeel SSD\\Desktop\\QA job double\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		/*
		driver.get("https://linkedin.com");
		driver.navigate().back();
		*/
//		driver.manage().window().fullscreen();
//		driver.findElement(By.className("sign-up-button"));
//		driver.findElement((By) By.id("email")).sendKeys(testEmail);
//		driver.findElement((By) By.id("pass")).sendKeys(testPassword);
//		driver.findElement(By.name("login")).click(); 
//		Thread.sleep(3000);
//		driver.findElement(By.tagName("a")).click();
//		-------------------------------
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		
//		js.executeScript("window.scrollBy(0,250)");
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[1]/div/header/nav[1]/div[2]/a[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jana@yahoo.com");
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement((By) By.id("password")).sendKeys(testPassword);	
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[1]/div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\":Ra9:\"]")).sendKeys("Amman"+ Keys.ARROW_DOWN+ Keys.ENTER);
//		---------------------------------
		
//		driver.manage().window().maximize();
//		String user_name = "standard_user";
//		String password = "secret_sauce";
//		
//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "Swag Labs";
//		
//		Assert.assertEquals(actualTitle, expectedTitle); 
//		
//		TakesScreenshot src = ((TakesScreenshot) driver); 
//		
//		File SrcFile = src.getScreenshotAs((OutputType.FILE));
//		
//		File Dest = new File ("C://mypictures/image1.png");
//		
//		FileUtils.copyFile(SrcFile,Dest);
	} 
	  

}
