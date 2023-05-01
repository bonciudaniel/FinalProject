package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFailed  extends ShareData {



    @Test
    public void MetodaTest(){


        WebElement Username = driver.findElement(By.id("user-name"));
        Username.click();

        WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        String usernameValue = "DanielBonciu";
        username.sendKeys(usernameValue);

        WebElement parola = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue = "apartament";
        parola.sendKeys(parolaValue);

        WebElement Enter = driver.findElement(By.id("login-button"));
        Enter.click();




    }
}
