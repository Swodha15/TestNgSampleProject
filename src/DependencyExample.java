import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void StartCar(){
        System.out.println("The Car Started");
    }

    @Test
    void Runcar(){
        System.out.println("The Car Ran");
        Assert.fail();
    }

    @Test (dependsOnMethods = {"Runcar"}, alwaysRun = true)
    void CarBreakdown(){
        System.out.println("The Car Broke down");
    }




}
