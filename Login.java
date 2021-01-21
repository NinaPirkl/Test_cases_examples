import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.SeleneseTestCase;

public class TestCase1 extends SeleneseTestCase {

    @BeforeMethod
    public void setup() throws InterruptedException {    
        WebDriver driver = new FirefoxDriver();
        driver.get("https://servis.tommystachi.cz/auth/login?utm_source=tommystachi.cz&utm_medium=menu&utm_campaign=171117");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test       
    public void test() throws InterruptedException {     //Login with valid username and valid password should pass
        WebElement login = driver.findElement(By.name("username"));
        WebElement pass = driver.findElement(By.name("password"));
        WebElement button = driver.findElement(By.xpath("//*[@id="frm-signInForm"]/div/div[3]/div/div[1]/button"));  

        login.sendKeys("tuser111@yahoo.co");
        pass.sendKeys("Praha123");
        button.click();
    }
    
    @AfterMethod
    public void teardown() {     //close the browser
        driver.quit();
    }
}
