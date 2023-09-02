package page;

import base.BasePage;
import base.ConfigFileReader;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;

public class FormularioPage extends BasePage {
    public FormularioPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    ConfigFileReader configFileReader = new ConfigFileReader();

    @FindBy(id = "banner-accept")
    private WebElement btnBanner;

    @FindBy(name = "firstname")
    private WebElement txtFirstName;

    @FindBy(name = "lastname")
    private WebElement txtLastName;


    public void ingresarUrl() {
        driver.get(configFileReader.getProp("url"));
    }


    public void ingresarDatosFormulario(DataTable dataTable) {
        wait.until(ExpectedConditions.elementToBeClickable(btnBanner));
        btnBanner.click();

        List<Map<String, String>> lista = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < lista.size(); i++) {
            txtFirstName.sendKeys(lista.get(i).get("firstName"));
            txtLastName.sendKeys(lista.get(i).get("lastName"));

        }


    }
}
