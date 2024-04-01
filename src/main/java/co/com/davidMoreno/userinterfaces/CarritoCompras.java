package co.com.davidMoreno.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoCompras {
    public static Target obtenerSelector(String nombreProducto) {
        return Target.the("Producto " + nombreProducto).locatedBy("//a[contains(text(), '" + nombreProducto + "')]");
    }
}

