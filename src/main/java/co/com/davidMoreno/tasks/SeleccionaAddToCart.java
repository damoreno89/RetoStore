package co.com.davidMoreno.tasks;

import co.com.davidMoreno.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaAddToCart implements Task {
    public static SeleccionaAddToCart ingresaAdd() {
        return Tasks.instrumented(SeleccionaAddToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaPrincipal.ADD_TO_CARD)
        );
    }
}



