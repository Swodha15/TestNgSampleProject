import Config.PropertyClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class chromedriverexample {

     public static String browser;
    static WebDriver driver;
    public static void main(String[] args) throws IOException {

        PropertyClass.CallProperty();
        getbrowser();
        teardown();
        PropertyClass.SetProperty();

//       setbrowser();
//       getbrowser();
//       teardown();
    }

    public static void setbrowser(){
        browser = "chrome";

    }
    public static void getbrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/swodha.jha/Downloads/chromedriver");

        driver = new ChromeDriver();

        driver.get("http://seleniumhq.org/");
    }
     public static void teardown()
     {
         driver.close();
     }

}


