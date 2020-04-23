import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {

    @Test(dataProvider = "TestDataProvider", dataProviderClass = CustomDataProvider.class)
    public void login(String email, String Pwd)
    {
        System.out.println( email + "     " + Pwd);
    }




}
