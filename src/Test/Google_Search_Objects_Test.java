package Test;

import POM.Google_Search_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_Objects_Test {

    private static WebDriver driver;
    public static void main(String[] args) {

    google_search_test();

    }

    public static void google_search_test(){

        System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        Google_Search_Objects search_objects = new Google_Search_Objects(driver);
        driver.get("https://google.com");

        search_objects.set_Text_Search("automation");
        search_objects.search_for_results();

    }


}
