import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {


    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/login";

        //set Edge drive path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //start edge browser
        WebDriver driver = new EdgeDriver();

        //Open Url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get Current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Source page is:" + driver.getPageSource());

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
