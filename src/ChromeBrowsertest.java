import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowsertest {

    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/login";

        //Set chrome driver path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //start chrome browser
        WebDriver driver = new ChromeDriver();

        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is:" +driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page source is:" + driver.getPageSource());

        //find and enter email in username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("ritzz");

        //find and enter password in password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("itsy34");

        //close browser
        driver.quit();


    }
}
