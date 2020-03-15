package test;

//LECTURE 71,72 REPRESENTS MOUSE ACTION
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
// MOUSE ACTION
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");// hit url on the browser
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		// a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		// THIS WAS ORIGINAL AND WORKED
		// MOVE TO A SPECIFIC ELEMENT
		WebElement hover = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(hover).build().perform();
		Thread.sleep(2000);
		// AFTER MOVEING TO THE ELEMENT IN THE ABOVE EXAPLE RIGHT CLICK ON IT
		a.moveToElement(hover).contextClick().build().perform();

		Thread.sleep(5000);

		WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
		// kEYS DOWN MAKES THE LETTERS CAPITAL,hello will be HELLO, DOUBLE CLICK
		// HIGHLIGHTS HELLO,
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(2000);
		// DRAG AND DROP ACTION LATER LECTURE

		driver.quit();
		// driver.findElement(By.cssSelector("a[id=nav-link-yourAccount]")).click();
		// driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
	}
}