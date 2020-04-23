import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AssertionExample {



   //WebDriver driver;
    WebDriver driver;
    @Parameters({"browser","url"})
   @BeforeClass
    void setup(String browser, String url) {

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/swodha.jha/Downloads/chromedriver");

            driver = new ChromeDriver();}
        else{
            System.out.println("bbyebyye");
        }

            driver.get(url);

            System.out.println("hello there");
        }


    @Test
    void TestLogo(){
        WebElement logo = driver.findElement(By.id("main"));
       Assert.assertEquals(logo.getText(), "Hello");


//        WebElement logo = driver.findElement(By.id("main"));
//        Assert.assertEquals(logo.getText(),"Hello");

//        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img)"));
//        Assert.assertTrue(logo.isDisplayed(), "No logo is there");



    }

    @AfterClass
    void Teardown(){

       driver.quit();

       System.out.println("hello shello");
    }


}
