package Config;

import Test.Google_Search;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    //Make this on global level so will be visible for all of the functions
    static Properties prop = new Properties();

    public static void main(String[] args) {

        // just for test purose to show us what we choose from the propertie file
        readPropertiesFile();
        writePropertiesFile();
    }

    // new method which can read from the file
    public static void readPropertiesFile() {
        // Initialise properties object on the global level so will be visible in all of the functions line 8
        try {
            // We give info where is store the file
            InputStream input = new FileInputStream("D:\\STUDING\\JAVA\\Automation\\Projects\\Selenium-With-Java\\src\\Config\\config.properties");
            prop.load(input);

            System.out.println(prop.getProperty("browser"));
//            Google_Search.browser = prop.getProperty("browser");
//            System.out.println(Google_Search.browser);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // new method which can writhe to the config file.
    public static void writePropertiesFile() {
        // Initialise properties object on the global level so will be visible in all of the functions line 8

        try {
            OutputStream output = new FileOutputStream("D:\\STUDING\\JAVA\\Automation\\Projects\\Selenium-With-Java\\src\\Config\\config.properties");

            // What will type in the config file
            prop.setProperty("browser", "Chrome");
            prop.setProperty("result","pass");
            // this will be the comment which can be add in the config file
            prop.store(output, "abc, comment");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
