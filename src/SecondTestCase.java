import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 4)
    void setupsec(){
        System.out.println("Welcome to the site 2");

    }
    @Test (priority = 5)
    void loginsec(){
        System.out.println("Login to the site 2");

    }
    @Test(priority = 6)
    void closesec(){
        System.out.println("Bye to the site 2");
        Assert.assertEquals(1,1);

    }
}
