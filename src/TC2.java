import org.testng.annotations.*;

public class TC2 {
    @BeforeClass
    void BeforeClass2(){
        System.out.println("This should run before class starts-2.");

    }
    @AfterClass
    void AfterClass2(){
        System.out.println("This should run after class-2.");

    }

    @BeforeMethod
    void BeforeTest2(){
        System.out.println("This should run before every test-2.");

    }
    @Test
    void Test3(){
        System.out.println("This is Test3..");

    }
    @Test
    void Test4(){
        System.out.println("This is Test4..");

    }
    @AfterMethod
    void AfterMethod2(){
        System.out.println("This should run after every test-2.");

    }
    @BeforeTest
    void BeforeTest(){
        System.out.println("This should run BEFORE every final test.");

    }
    @BeforeSuite
    void BeforeSuite(){
        System.out.println("This should run BEFORE the SUITE.");

    }
}
