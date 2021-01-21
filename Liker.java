import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

System.setProperty("webdriver.chrome.driver", "/Users/ninapirkl/Downloads/chromedriver");
WebDriver driver = new ChromeDriver();
JavascriptExecutor js = (JavascriptExecutor)driver;

driver.get("http://instagram.com/");
driver.findElement(By.cssSelector("body > div.RnEpo.Yx5HN > div > div > div > div.mt3GC > button.aOOlW.bIiDR")).click();
driver.findElement(By.name("username")).sendKeys("landerbraw");
driver.findElement(By.name("password")).sendKeys("instagramsoset");
driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(3)")).click();
WebUI.delay(4);
driver.findElement(By.cssSelector('#react-root > section > main > div > div > div > div > button')).click();
driver.findElement(By.cssSelector("body > div.RnEpo.Yx5HN > div > div > div > div.mt3GC > button.aOOlW.HoLwm")).click();

driver.get('http://instagram.com/salon_praha');

driver.findElement(By.cssSelector("#react-root > section > main > div > header > section > ul > li:nth-child(3) > a")).click();

/*List<WebElement> users = driver.findElements(By.className("Igw0E   rBNOH eGOV_ ybXk5    _4EzTm XfCBB HVWg4"));
System.out.println(users.get(1));*/

driver.findElement(By.id("f25d494b42df4")).click();


/*WebUI.click(findTestObject('bttns/severalPage/post'));
WebUI.click(findTestObject('bttns/severalPage/like'));*/
