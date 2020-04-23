import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupMethods {

    @Test
    void StartCar(){
        System.out.println("The Car Started");
    }

    @Test
    void Runcar(){
        System.out.println("The Car Ran");

    }

    @Test (groups = {"Sanity"})
    void CarBreakdown(){
        System.out.println("The Car Broke down");
    }

    @Test (groups = {"Sanity"})
    void CameHome(){
        System.out.println("Homecame");
    }

}
