import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;
//@BeforeClass
public class Bing_Check {
public static void main(String[] args)
{  	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vibhavsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bing.com/translator");
//	@FindBy(xpath="(//li//a[@class=\"t_navlink\"])[1]")
	WebElement home=driver.findElement(By.xpath("(//li//a[@class=\"t_navlink\"])[1]"));
	WebElement Text=driver.findElement(By.xpath("/html/body/ul/li[2]/a"));
	WebElement Convo=driver.findElement(By.cssSelector("body > ul > li:nth-child(3) > a"));
	WebElement Apps=driver.findElement(By.linkText("Apps"));
	WebElement help=driver.findElement(By.linkText("Help"));
	
}
}
