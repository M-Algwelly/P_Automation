package Parent.P_Task;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();*/
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.get("https://portal-staging.parent.cloud/login");
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("txtEmail")).sendKeys("demo@parent.cloud");
		
		driver.findElement(By.id("txtPassword")).sendKeys("12345678");
		
		driver.findElement(By.id("submitBtn")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/main/app-institution/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div[2]\r")).click();
		
		driver.findElement(By.id("pushActionRefuse")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("calendarTab")).click();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//driver.findElement(By.xpath("/html/body/app-root/app-header/header/app-header-topbar/nav/div/app-header-navbar/div/nav/ul/li[2]/a/i")).click();
		//driver.findElement(By.xpath("//*[@id=\"calendarTab\"]")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"createEventBtn\"]/span[2]")).click();
		
		driver.findElement(By.id("eventTitle")).sendKeys("Test");
		
		driver.findElement(By.id("eventDescription")).sendKeys("Test");
		
		//driver.findElement(By.xpath("//*[@id=\"Recipients\"]/div/div/div[2]/input")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Recipients = driver.findElement(By.cssSelector("#Recipients > div:nth-child(1) > span:nth-child(2)"));
		Select selectoptions = new Select(Recipients);
		Assert.assertFalse(selectoptions.isMultiple());
		selectoptions.selectByVisibleText("kid palace (Children and staff)");
		
		
		
	
		//driver.findElement(By.cssSelector("#Recipients > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).click();
		

		//driver.findElement(By.xpath("//*[@id=\"option_0\"]")).click();

	}
}