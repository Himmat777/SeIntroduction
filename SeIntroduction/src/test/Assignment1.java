package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");// hit url on the browser

		System.out.println(driver.getTitle());// validate if your page title is correct
		// Thread.sleep(1000L);
		driver.manage().window().maximize(); // some times we need to maximize the window for
												// it to work so that it

		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).getAttribute("name"));
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		// checking to see if selected then click on it
		if (!driver.findElement(By.xpath("//input[@value='option1']")).isSelected()) {
			// Thread.sleep(1000L);
			driver.findElement(By.xpath("//input[@value='option1']")).click();
			System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		} else {

			System.out.println("IT IS SELECT4D");
		}

		// Finding the check Boxes

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		for (int i = 0; i < count; i++) {
			System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("name"));
		}
		driver.close();
	}

}
