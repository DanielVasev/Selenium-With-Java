package Test;

import POM.Google_Search_Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Search {
    public static WebDriver driver;
    static String browser;


    public static void main(String[] args) {

        setBrowser("Chrome");
        setBrowserConfig();
        runTest();


        String expTitle = "Google";
//        System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://google.com");
//        driver.manage().window().maximize();

        Google_Search_Locators.Search_box(driver).sendKeys("Automate the world");
        Google_Search_Locators.search_btn(driver).sendKeys(Keys.RETURN);

        String acctTitle = driver.getTitle();

        if (expTitle.equals(acctTitle)) {
            System.out.println("Test passed");

        } else {
            System.out.println(acctTitle);
            System.out.println("Test failed");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

       public static void setBrowser(String browserChoise) {
            browser = browserChoise;
        }

        public static void setBrowserConfig() {
            if (browser.contains("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            if (browser.contains("FireFox")) {
                System.setProperty("webdriver.gecko.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\GeckoDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }

        public static void runTest() {
            driver.manage().window().maximize();
            driver.get("https://google.com");
        }

    }


