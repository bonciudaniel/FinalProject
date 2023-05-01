package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ShareData {
    public WebDriver driver;

    @BeforeMethod
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }
    @AfterMethod
    public void Clear(){
        driver.quit();
    }
}
