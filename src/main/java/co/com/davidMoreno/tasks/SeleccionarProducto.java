package co.com.davidMoreno.tasks;


import co.com.davidMoreno.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {
    private final String producto;

    public SeleccionarProducto(String producto) {
        this.producto = producto;
    }

    public static SeleccionarProducto deLaCategoria(String producto) {
        return instrumented(SeleccionarProducto.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPrincipal.obtenerSelectorProducto(producto))
        );
    }
}
