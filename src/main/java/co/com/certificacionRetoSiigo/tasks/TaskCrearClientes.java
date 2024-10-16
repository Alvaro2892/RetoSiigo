package co.com.certificacionRetoSiigo.tasks;

import co.com.certificacionRetoSiigo.interactions.SeleccionarItemsLista;
import co.com.certificacionRetoSiigo.interactions.Wait;
import co.com.certificacionRetoSiigo.model.ConstructorVar;
import co.com.certificacionRetoSiigo.userinterface.UICrearClientes;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static co.com.certificacionRetoSiigo.userinterface.UICrearClientes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TaskCrearClientes implements Task
{

    Faker faker = new Faker();

    // Lista de ciudades válidas
    List<String> ciudadesValidas = Arrays.asList(
            "Cali", "Barranquilla", "Cartagena",
            "Pereira", "Manizales", "Bucaramanga", "Santa Marta");

    // Seleccionar una ciudad aleatoria de la lista
    String ciudad = ciudadesValidas.get(new Random().nextInt(ciudadesValidas.size()));



    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    String identification = faker.idNumber().valid();
    String zipCode = faker.address().zipCode();
    String direccion = faker.address().fullAddress();
    String email = faker.internet().emailAddress();
    String telefono = faker.phoneNumber().cellPhone();

    private List<ConstructorVar> constructorVars;

    public TaskCrearClientes(List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static TaskCrearClientes usuarioSiigo(List<ConstructorVar> constructorVars)
    {
        return Tasks.instrumented(TaskCrearClientes.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        for (ConstructorVar constructorVar : constructorVars) {

            actor.attemptsTo
                    (
                            TaskIniciarSesion.webSiigo(constructorVars),
                            Click.on(UICrearClientes.CLICBOTONCREAR),
                            Click.on(UICrearClientes.CLICKBOTONCLIENTES),
                            //SelectFromOptions.byVisibleText(constructorVar.getTipoPersona()).from(UICrearClientes.SELECCIONARTIPOPERSONA)
                            WaitUntil.the(SELECCIONARTIPOPERSONA, isVisible()).forNoMoreThan(10).seconds(),
                            JavaScriptClick.on(SELECCIONARTIPOPERSONA),
                            SeleccionarItemsLista.on(UICrearClientes.SELECCIONARTIPOPERSONAUL, constructorVar.getTipoPersona(), "span"),

                            JavaScriptClick.on(UICrearClientes.SELECCIONARTIPOIDENTIFICACION),
                            SeleccionarItemsLista.on(UICrearClientes.SELECCIONARTIPOIDENTIFICACIONUL,  constructorVar.getTipoIdentificacion(), "span"),
                            Wait.por(5000),
                            Enter.theValue(constructorVar.getIdentificacion()).into(INGRESARIDENTIFICACION),
                            Enter.theValue(zipCode).into(INGRESARCODIGO),
                            Enter.theValue(firstname).into(INGRESARNOMBRE),
                            Enter.theValue(lastname).into(INGRESARAPELLIDO),
                            Enter.theValue(firstname + lastname).into(INGRESARNOMBRECOMERCIAL),
                            Click.on(LABELCIUDAD),
                            Enter.theValue(ciudad).into(INGRESARCIUDAD),
                            SeleccionarItemsLista.on(CONTAINER_CITIES, ciudad, "div"),
                            Enter.theValue(direccion).into(INGRESARDIRECCION),



                            Enter.theValue(email).into(INGRESAREMAIL),
                            Enter.theValue(telefono).into(INGRESARTELEFONO),
                            JavaScriptClick.on(SELECCIONARTIPOIVA),
                            SeleccionarItemsLista.on(SELECCIONARTIPOIVAUL, constructorVar.getTipoIva(), "span"),
                            Enter.theValue(constructorVar.getIndicativo()).into(INGRESARIDICATIVOFACTURACION),
                            Enter.theValue(telefono).into(INGRESATELEFONOFACTURACION),
                            Enter.theValue(zipCode).into(INGRESARCODIGOPOSTALFACTURACION),
                            Click.on(SELECCIONARRESPONSABILIDADFISCAL.of(constructorVar.getCheckResponsabilidadFiscal())),
                            Click.on(CLICKCONTACTOS),
                            Enter.theValue(firstname).into(INGRESARNOMBRECONTACTO),
                            Enter.theValue(lastname).into(INGRESARAPELLIDOCONTACTO),
                            Enter.theValue(email).into(INGRESAREMAILCONTACTO),
                            Enter.theValue(constructorVar.getCargoContacto()).into(INGRESARCARGOCONTACTO),
                            Enter.theValue(constructorVar.getIndicativo()).into(INGRESARINDICATIVOCONTACTO),
                            Enter.theValue(telefono).into(INGRESARNUMEROTELEFONOCONTACTO),
                            Click.on(CLICKBOTONGUARDAR),
                            Wait.por(10000)

                    );



        }
    }
}