package co.com.certificacionRetoSiigo.tasks;


import co.com.certificacionRetoSiigo.userinterface.UIAbrirPaginaSiigo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class TaskAbrirPagina implements Task
{
    private UIAbrirPaginaSiigo uiAbrirPaginaSiigo;

    public static TaskAbrirPagina siigo()
    {
        return Tasks.instrumented(TaskAbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Open.browserOn(uiAbrirPaginaSiigo)

                );

    }
}
