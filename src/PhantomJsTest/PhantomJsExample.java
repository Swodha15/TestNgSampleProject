package PhantomJsTest;

import org.openqa.selenium.WebDriver;

public class PhantomJsExample {
    public static void main(String[] args) {
        System.setProperty("phantomjs.binary.path","/Users/swodha.jha/Downloads/phantomjs");
        WebDriver driver = new PhantomJSDriver();
    }
}
