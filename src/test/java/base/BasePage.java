package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;

    protected static WebDriverWait wait;

    public BasePage(WebDriver d){
        driver=d;

        //Tiempo de espera explicito: El driver esperará hasta que se cumpla determinada condición
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }
}
