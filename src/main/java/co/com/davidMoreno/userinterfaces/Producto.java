package co.com.davidMoreno.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Producto {
    public static Target obtenerSelector(String nombreProducto) {
        return Target.the("Producto " + nombreProducto).locatedBy("//td[contains(.,'" + nombreProducto + "')]");
    }
}
