package co.com.davidMoreno.questions;

import co.com.davidMoreno.userinterfaces.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Visibility;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarCarritoCompras implements Task {
    private final String producto;

    public VerificarCarritoCompras(String producto) {
        this.producto = producto;
    }

    public static VerificarCarritoCompras contieneProductoSeleccionado(String producto) {
        return instrumented(VerificarCarritoCompras.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat("El producto seleccionado debe ser visible en el carrito",
                        Visibility.of(Producto.obtenerSelector(producto)).asBoolean()
                )
        );
    }
}
