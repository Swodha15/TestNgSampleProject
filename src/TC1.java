import org.testng.annotations.*;

public class TC1 {

   @BeforeClass
    void BeforeClass(){
        System.out.println("This should run before class starts.");

    }
    @AfterClass
    void AfterClass(){
        System.out.println("This should run after class.");

    }

    @BeforeMethod
    void BeforeTest(){
        System.out.println("This should run before every test.");

    }
    @Test
    void Test1(){
        System.out.println("This is Test1..");

    }
    @Test
    void Test2(){
        System.out.println("This is Test2..");

    }
    @AfterMethod
    void AfterMethod(){
        System.out.println("This should run after every test.");

    }
  @AfterTest
    void AfterTest(){
        System.out.println("This should run AFTER every final test.");

    }
    @AfterSuite
    void AfterSuite(){
        System.out.println("This should run AFTER the SUITE.");

    }

}
