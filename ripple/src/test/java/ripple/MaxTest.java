package ripple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MaxTest {
 @Test
 public void doTest() {
	 System.setProperty("webdriver.chrome.driver", "\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com");
	 WebElement searchbox = driver.findElement(By.name("q"));
	 searchbox.sendKeys("ripple science");
	 searchbox.sendKeys("\n");
	 WebElement findElement = driver.findElement(By.id("search"));
	 WebElement findElementTwo = findElement.findElement(By.className("yuRUbf"));
	 WebElement foundTheWebsiteLink = findElementTwo.findElement(By.tagName("a"));
	 foundTheWebsiteLink.click();
	 driver.findElement(By.className("fusion-mobile-menu-icons")).findElement(By.tagName("a")).click();

	 driver.findElement(By.xpath("//button[@data-hu-action='cookies-tools-close']")).click();
	 WebElement dropDownMenu = driver.findElement(By.id("mobile-menu-item-8303"));
	 WebElement clickButtonAbout = dropDownMenu.findElement(By.tagName("button"));
	 clickButtonAbout.click();

	 WebElement findTeamPageLI = driver.findElement(By.id("mobile-menu-item-1149"));
	 WebElement foundTeamLink = findTeamPageLI.findElement(By.tagName("a"));
	 foundTeamLink.click();
	 // get the first item, follow that link to ripple science, goto the about, team tab and get the url of my picture with the team
	 driver.close();
	 
 }
}
