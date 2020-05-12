package Test;

import POM.Google_Search_Locators;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExtendReportsWith_TestNG {
    WebDriver driver = null;
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @BeforeTest
    public void Test_SetUp(){
        //Path to Chrome driver
        System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();


        htmlReporter = new ExtentHtmlReporter("D:\\STUDING\\JAVA\\Automation\\Projects\\Selenium-With-Java\\Reports\\extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);





    }


    @Test
    public void test1() throws IOException {
        ExtentTest test1 = extent.createTest("GoogleSearch, Test 1", "This is test to validate google search functionality");
        test1.log(Status.INFO, "Starting Test Case");

        // Using methods from class Google_Search_Locators
        Google_Search_Locators.Text_box_search(driver).sendKeys("Extent Html Reports");
        //here we can validate that search field present
        test1.pass("Search field present and we add text");

        Google_Search_Locators.search_btn(driver).sendKeys(Keys.RETURN);
        //validate that we click search button
        test1.pass("We press search");

        driver.getTitle();
        //validating page Title
        test1.pass("Result Page is open and present!");

        test1.addScreenCaptureFromPath("screenshot.png");




    }

    @AfterTest
    public void tear_down(){
        extent.flush();
        driver.close();
        driver.quit();

        // validating browser is close and driver is close too


    }


}
