import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/login";

        //set Edge driver path
        System.setProperty("webdriver.firefox.driver", "drivers/gehkodriver.exe");

        // Start firefox browser
        WebDriver driver = new FirefoxDriver();

        //open Url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web  element or web page
        System.out.println("Saurce page is:" + driver.getPageSource());

        //find and enter email in username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("ritzz");

        //find and enter password in password field
        WebElement passwordField = driver.findElement(By.name("password"));
        usernameField.sendKeys("itsy34");

        //Close browser
         driver.quit();

    }
}