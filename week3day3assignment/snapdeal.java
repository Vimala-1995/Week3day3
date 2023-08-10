package week3day3assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class snapdeal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).perform();
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		String itemscount=driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(itemscount);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.className("sort-selected")).click();
		//driver.findElement(By.xpath("//li[@class='search-li sort-active']")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		WebElement fromrate=driver.findElement(By.xpath("//input[@class='input-filter'][1]"));
		fromrate.clear();
		fromrate.sendKeys("500");
		WebElement torate=driver.findElement(By.xpath("//input[@name='toVal']"));
		torate.clear();
		torate.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		WebElement first=driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		actions.moveToElement(first).perform();
		driver.findElement(By.xpath("//div[@pogid='680551486989']")).click();
		String rates=driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println(rates);
		String percent=driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(percent);
		
		File ScreenshotAs=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ASIAN-Black-Training-Shoes-SDL659385865-1-4ad00.jpeg");
		//Object Fileutils;
		FileUtils.copyFile(ScreenshotAs, dest);
		driver.close();
		
	}

}

