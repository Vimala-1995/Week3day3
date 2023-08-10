package week3day3assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mergenew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				WebElement username=driver.findElement(By.id("username"));
				username.sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
				Set<String> WH = driver.getWindowHandles();
				List<String> window = new ArrayList<String>(WH);
				driver.switchTo().window(window.get(1));
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
				driver.findElement(By.xpath("//img[@id='ext-gen594']")).click();
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[2]")).click();
			    driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		          driver.getTitle();
		          System.out.println(driver.getTitle());
		      

	}

}
