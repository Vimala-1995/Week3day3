package week3day3assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Amazon {

	private static CharSequence Ques;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText());
		driver.findElement(By.xpath("//img[@class='s-image'][1]")).click();
		
		 Set<String> windowHandles = driver.getWindowHandles();
		  List<String> windows = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(windows.get(1));

		  File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		  File dest = new File("./snap/shotAmazon.jpg");
		  FileUtils.copyFile(screenshotAs, dest);
		  Thread.sleep(2000);
		  driver.findElement(By.id("add-to-cart-button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")).click();

		  String price1 = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).getText();

		  System.out.println("CartSubTotal====> " + price1);
		  String replace = price1.replace(".00", "");

		  String price1Amount = replace.trim();

		  System.out.println("Amt is" + price1Amount+"");
		   

		 }

}
