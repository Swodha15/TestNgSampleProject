import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "TestDataProvider")
    public Object[][] getData(){

        Object[][] data = {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz","prq@gmail.com","prq"}};
        return data;
    }
}
