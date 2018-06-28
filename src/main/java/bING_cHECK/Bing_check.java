package bING_cHECK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bing_check {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vibhavsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://translate.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.cssSelector("id=\"gt-appname\""));
		Actions actions = new Actions(driver);
		actions.moveToElement(sign);
		actions.click();
		actions.sendKeys("SOME DATA");
		actions.build().perform();
		boolean b = sign.isDisplayed();
		System.out.println(b);
		// sign.sendKeys("");
		// sign.click();
	}
}
