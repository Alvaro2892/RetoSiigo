package co.com.certificacionRetoSiigo.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certificacionRetoSiigo.userinterface.UICrearClientes.VERIFICARMENSAJE;

public class Verificar implements Question<Boolean>
{
    private final String mensajeVerificar;

    public Verificar(String mensajeVerificar)
    {
        this.mensajeVerificar = mensajeVerificar;
    }

    public static Verificar mensajeSitioWeb(String questionv)
    {
        return new Verificar(questionv);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade webElementFacade = VERIFICARMENSAJE.resolveFor(actor);
        String textoVerificar = webElementFacade.getText();
        System.out.println(textoVerificar);
        System.out.println(mensajeVerificar);
        return mensajeVerificar.equals(textoVerificar);
    }
}
