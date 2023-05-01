package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends ShareData {




    @Test
    public void metodaTest(){


        WebElement Username = driver.findElement(By.id("user-name"));
        Username.click();

        WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        String usernameValue = "standard_user";
        username.sendKeys(usernameValue);

        WebElement parola = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String parolaValue = "secret_sauce";
        parola.sendKeys(parolaValue);

        WebElement Enter = driver.findElement(By.id("login-button"));
        Enter.click();






    }

}
