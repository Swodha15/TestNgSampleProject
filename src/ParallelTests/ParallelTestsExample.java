package ParallelTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTestsExample {

    WebDriver driver;
    @Test
     void setup() throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","/Users/swodha.jha/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        WebElement logo = driver.findElement(By.id("main"));

        Assert.assertEquals(logo.getText(),"Hello");
        Thread.sleep(500);


    }
    @Test
    void Getbutton() throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","/Users/swodha.jha/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        WebElement button = driver.findElement(By.name("btnLogin"));
        //Assert.assertEquals(button.toString(),"Submit");
        System.out.println(button.toString());
      Thread.sleep(500);

    }
    @AfterMethod
    void teardown()
    {
        driver.close();
    }
}
