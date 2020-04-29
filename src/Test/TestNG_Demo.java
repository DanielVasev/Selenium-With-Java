package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.Key;

public class TestNG_Demo {
    //add WebDriver for the current class
    private WebDriver driver;


    // class where we prepear our browser driver
    @BeforeTest
    public void setUpTest(){

        String projectPath = System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();


    }
    // here is our actual test
    @Test
    public void googleSearch(){

        //navigate to google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Automate the world! TestNG");
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);


    }
    // with this method we close the driver and usualy add a steps to bring the enviromnet to the initial state
    @AfterTest
    public void tearDown(){

        driver.close();
        driver.quit();
        // validation message visible in the console
        System.out.println("Test Completet Successfully!");
    }
}
