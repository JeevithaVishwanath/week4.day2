package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String windowHandle = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2.size());
		List<String>list1=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String>list2=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(list2.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(list2.get(0));
		
		
		

	}

}
