import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class FirstTestcase {

    @Test (priority = 1)
    void setup(){
        System.out.println("Welcome to the site");

    }
    @Test (priority = 2)
    void login(){
        System.out.println("Login to the site");

    }
    @Test(priority = 3, enabled = true)
    void close(){
        System.out.println("Bye to the site");

    }
}
