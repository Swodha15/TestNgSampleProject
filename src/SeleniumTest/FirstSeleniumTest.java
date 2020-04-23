package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class FirstSeleniumTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/");
        driver.findElement(By.id("banner-conservancy"));
        System.out.println(driver.getTitle());
        driver.quit();
    }


}
