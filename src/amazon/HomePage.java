package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    public static void main(String [] args){
        System.setProperty("webdriver.gecko.driver","/Users/peoplentech/IdeaProjects/SeleniumProject1/browser-driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone", Keys.ENTER);
        driver.findElement(By.cssSelector(".nav-input")).click();
        driver.close();
    }
}
