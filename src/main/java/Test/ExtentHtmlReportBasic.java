package Test;

import POM.Google_Search_Locators;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentHtmlReportBasic {


    public static void main(String[] args) {

        WebDriver driver = null;

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("D:\\STUDING\\JAVA\\Automation\\Projects\\Selenium-With-Java\\Reports\\extentReport.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test1 = extent.createTest("GoogleSearch, Test 1", "This is test to validate google search functionality");

        System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");

        driver = new ChromeDriver();
        // This will add info that test is start
        test1.log(Status.INFO, "Starting Test Case");

        driver.get("https://google.com");

        //add info pass that google page is open
        test1.pass("Navigated to google.com");
        driver.manage().window().maximize();

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

        driver.close();
        driver.quit();

        // validating browser is close and driver is close too
        test1.pass("Browser is closed!");

        test1.info("Test Finished!");

        //write all report to the html report IMPORTANT
        extent.flush();

        System.out.println("Test Finished!");
    }
}
