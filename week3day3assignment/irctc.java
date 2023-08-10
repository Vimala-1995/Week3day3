package week3day3assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Actions actions=new Actions(driver);
		//actions.moveToElement(driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu'][3])"))).click();
		driver.findElement(By.xpath("//a[@href='https://www.air.irctc.co.in/']")).click();
		 Set<String> windowHandles = driver.getWindowHandles();
		  List<String> windows = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(windows.get(1));
          driver.getTitle();
          System.out.println(driver.getTitle());
	}

}
