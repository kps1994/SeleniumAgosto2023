package step;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page.FormularioPage;

public class FormularioStep {

    FormularioPage formularioPage;


    public FormularioStep(){
        formularioPage= new FormularioPage(Hooks.driver);
    }


    @Given("ingreso a la pagina de TutorialsPoint")
    public void ingresoALaPaginaDeTutorialsPoint() {
        formularioPage.ingresarUrl();
    }

    @And("ingreso los datos del formulario")
    public void ingresoLosDatosDelFormulario(DataTable dataTable) {
    formularioPage.ingresarDatosFormulario(dataTable);

    }
}
