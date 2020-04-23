package Config;

import java.io.*;
import java.util.Properties;

public class PropertyClass {
    static Properties Prop = new Properties();
    public static void main(String[] args) throws IOException {
        CallProperty();
        SetProperty();
       CallProperty();
    }
    public static void CallProperty() throws IOException {

        InputStream Input = new FileInputStream("/Users/swodha.jha/TestNgSampleProject/src/Config/Config.properties");
        Prop.load(Input);
       // System.out.println(Prop.getProperty("browser"));


//        chromedriverexample.browser = Prop.getProperty("browser");
//        System.out.println( chromedriverexample.broswer);
    }
    public static void SetProperty() throws IOException {
        OutputStream Output = new FileOutputStream("/Users/swodha.jha/TestNgSampleProject/src/Config/Config.properties");
        Prop.setProperty("browser","New Chrome");
        Prop.store(Output,"Saving new values");

    }
}
