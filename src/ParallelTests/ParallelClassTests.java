package ParallelTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelClassTests {

    WebDriver driver;
    @Test
    void login() throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","/Users/swodha.jha/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
      driver.findElement(By.name("emailid")).sendKeys("12121");
      driver.findElement(By.name("btnLogin")).click();
      Thread.sleep(500);


    }
    @AfterMethod
    void teardown()
    {
        driver.close();
    }
}
