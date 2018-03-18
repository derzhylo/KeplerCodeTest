import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyTest {

    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(By.id("gb_70"));
        element.click();
        driver.findElement(By.id("identifierId")).sendKeys("okten.web.project@gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys(Keys.RETURN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.className("zHQkBf")).sendKeys("okten2017");
        driver.findElement(By.className("zHQkBf")).sendKeys(Keys.RETURN);

    }}