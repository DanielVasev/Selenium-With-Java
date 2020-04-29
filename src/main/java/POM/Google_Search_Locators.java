package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Search_Locators {

    private static WebElement element;

    public static WebElement Text_box_search(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
        return element;
    }

    public static WebElement search_btn(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b"));
        return element;
    }

    public static WebElement images(WebDriver driver){
        element = driver.findElement(By.cssSelector("body.hp.vasq.big:nth-child(2) div.ctr-p:nth-child(15) div.gb_Zf:nth-child(3) div:nth-child(1) div.gb_Xa.gb_Ig.gb_i.gb_Hg.gb_Lg.gb_Zf div.gb_ie.gb_i.gb_Ig.gb_yg:nth-child(1) div.gb_h.gb_i:nth-child(2) > a.gb_g"));
        return element;
    }


}
