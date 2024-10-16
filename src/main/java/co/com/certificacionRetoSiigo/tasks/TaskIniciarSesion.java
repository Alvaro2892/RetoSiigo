package co.com.certificacionRetoSiigo.tasks;

import co.com.certificacionRetoSiigo.model.ConstructorVar;
import co.com.certificacionRetoSiigo.userinterface.UIIniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.certificacionRetoSiigo.userinterface.UIIniciarSesion.ENTERUSERNAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class TaskIniciarSesion implements Task
{
    private List<ConstructorVar> constructorVars;


    public TaskIniciarSesion(List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static TaskIniciarSesion webSiigo(List<ConstructorVar> constructorVars)
    {
        return Tasks.instrumented(TaskIniciarSesion.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        for (ConstructorVar constructorVar : constructorVars)
        {
            actor.attemptsTo
                    (
                            WaitUntil.the(ENTERUSERNAME, isVisible()).forNoMoreThan(10).seconds(),
                            Click.on(ENTERUSERNAME),
                            Enter.theValue(constructorVar.getUserName()).into(ENTERUSERNAME),
                            Click.on(UIIniciarSesion.ENTERPASSWORD),
                            Enter.theValue(constructorVar.getPassword()).into(UIIniciarSesion.ENTERPASSWORD),
                            Click.on(UIIniciarSesion.CLICKBOTONINGRESAR)


                    );
        }


    }
}
