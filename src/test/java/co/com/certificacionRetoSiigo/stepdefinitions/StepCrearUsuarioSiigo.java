package co.com.certificacionRetoSiigo.stepdefinitions;


        import co.com.certificacionRetoSiigo.model.ConstructorVar;
        import co.com.certificacionRetoSiigo.questions.Verificar;
        import co.com.certificacionRetoSiigo.tasks.TaskAbrirPagina;
        import co.com.certificacionRetoSiigo.tasks.TaskCrearClientes;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

        import java.util.List;

        import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
        import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
        import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepCrearUsuarioSiigo
{

    @Given("que el usuario ingresa a la aplicacion web de Siigo")
    public void queElUsuarioIngresaALaAplicacionWebDeSiigo()
    {
        theActorCalled("Alvaro").wasAbleTo(TaskAbrirPagina.siigo());
    }
    @When("se dirige a la opcion de crear y crea un usuario")
    public void seDirigeALaOpcionDeCrearYCreaUnUsuario(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(TaskCrearClientes.usuarioSiigo(constructorVars));
    }
    @Then("el sistema muestra un mensaje de confirmacion {string}")
    public void elSistemaMuestraUnMensajeDeConfirmacion(String VerificarMensajePagina)
    {
        theActorInTheSpotlight().should(seeThat(Verificar.mensajeSitioWeb(VerificarMensajePagina)));
    }

}
