package co.com.davidMoreno.tasks;

import co.com.davidMoreno.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class IngresarAlRegistro implements Task {

    public static IngresarAlRegistro registroToday() {
        return instrumented(IngresarAlRegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElementoClickable(),
                HacerClicEnBotonRegistro()
        );
    }

    private Performable EsperarElementoClickable() {
        return WaitUntil.the(RegistroUsuarioPage.BTN_SIGN_UP, isClickable());
    }

    private Performable HacerClicEnBotonRegistro() {
        return Click.on(RegistroUsuarioPage.BTN_SIGN_UP);
    }
}