package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class Google_Search_Objects {
    WebDriver driver = null;

    By text_box_search = By.name("q");
    By search_button = By.name("btnK");

    public Google_Search_Objects(WebDriver driver){
        this.driver = driver;

    }

public void set_Text_Search(String text)    {

    driver.findElement(text_box_search).sendKeys(text);

}

public void search_for_results(){

    driver.findElement(search_button).sendKeys(Keys.RETURN);
}


}
