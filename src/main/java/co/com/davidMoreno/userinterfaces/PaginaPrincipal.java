package co.com.davidMoreno.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {
    public static Target obtenerSelectorCategoria(String categoria) {
        return Target.the("Categoría" + categoria).locatedBy("//a[contains(.,'" + categoria + "')]");
    }

    public static Target obtenerSelectorProducto(String producto) {
        return Target.the("Producto" + producto).locatedBy("//a[contains(.,'" + producto + "')]");
    }

    public static final Target OPCION_CARD = Target.the("Selecciona Opcion card").locatedBy("//a[contains(text(),'Cart')]");
    public static final Target ADD_TO_CARD = Target.the("click en Add To Card").locatedBy("//a[contains(text(),'Add to cart')]");

}
