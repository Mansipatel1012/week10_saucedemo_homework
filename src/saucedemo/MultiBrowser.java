package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {

    static String browser = "firefox";
    static WebDriver driver;
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        // find the username  element
        WebElement Usernamefield = driver.findElement(By.id("user-name"));
        Usernamefield.sendKeys("standard_user");
        // find the passward field element
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        // closing browser
        driver.close();
    }
}
