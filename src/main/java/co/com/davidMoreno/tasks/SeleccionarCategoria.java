package co.com.davidMoreno.tasks;


import co.com.davidMoreno.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCategoria implements Task {
    private String categoria;


    public SeleccionarCategoria(String categoria) {

        this.categoria = categoria;
    }

    public static SeleccionarCategoria deLaCategoria(String categoria) {
        return instrumented(SeleccionarCategoria.class, categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPrincipal.obtenerSelectorCategoria(categoria))
        );
    }
}
