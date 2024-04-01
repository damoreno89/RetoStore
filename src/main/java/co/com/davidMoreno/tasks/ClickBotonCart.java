package co.com.davidMoreno.tasks;

import co.com.davidMoreno.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBotonCart implements Task {

    public static ClickBotonCart antesDeProductoVisible() {
        return instrumented(ClickBotonCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPrincipal.OPCION_CARD)
        );
    }
}


