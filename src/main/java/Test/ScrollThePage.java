package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScrollThePage {

    WebDriver driver = null;

    @BeforeTest
    public void setUpTest() {
        String projectPath = System.setProperty("webdriver.chrome.driver", "D:\\STUDING\\JAVA\\Automation\\Driver_Jars\\ChromeDriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void scroll_to_the_bottom() {

        driver.get("https://www.bbc.co.uk");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Test
    public void scroll_to_element_inThePage() {
        driver.get("https://www.bbc.co.uk");
        WebElement footer_Scotland = driver.findElement(By.xpath("//span[@class='hp-permanent-links__link-name gel-brevier-bold'][contains(text(),'Scotland')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", footer_Scotland);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();

            footer_Scotland.isDisplayed();
            footer_Scotland.isEnabled();
            footer_Scotland.click();



        }

    }
}


