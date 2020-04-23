package ListernerPackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerClass1 {

   @Test
    void Test1(){

        System.out.println("This is the Test1");
        Assert.assertEquals("a","a");
    }
    @Test
    void Test2(){

        System.out.println("This is the Test2");
        Assert.assertEquals("a","b");
    }
    @Test
    void Test3(){

        System.out.println("This is the Test3");
        throw new SkipException("This is the skipped test");
    }
}
