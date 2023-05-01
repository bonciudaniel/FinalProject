package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Product  extends ShareData {



    @Test
    public void MetodaTest(){


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
        WebElement Product = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
         Product.click();
         WebElement ShoppingCart = driver.findElement(By.id("shopping_cart_container"));
         ShoppingCart.click();
         WebElement Checkout = driver.findElement(By.id("checkout"));
         Checkout.click();

         WebElement FirstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
         String FirstNameValue = "Daniel";
         FirstName.sendKeys(FirstNameValue);
        WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        String LastNameValue = "Bonciu";
        LastName.sendKeys(LastNameValue);
        WebElement PostalCode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        String PostalCodeValue = "500001";
        PostalCode.sendKeys(PostalCodeValue);
        WebElement button = driver.findElement(By.id("continue"));
        button.click();
        WebElement finishbutton = driver.findElement(By.id("finish"));
        finishbutton.click();
    }
}
