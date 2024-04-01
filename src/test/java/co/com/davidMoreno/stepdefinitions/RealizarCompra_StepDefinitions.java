package co.com.davidMoreno.stepdefinitions;

import co.com.davidMoreno.questions.VerificarCarritoCompras;
import co.com.davidMoreno.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class RealizarCompra_StepDefinitions {

    @Before
    public void iniciarTest() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("selecciona la categoría {string}")
    public void seleccionaLaCategoria(String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCategoria.deLaCategoria(categoria));
    }

    @Cuando("selecciona un producto de la categoría {string}")
    public void seleccionaUnProductoDeLaCategoria(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.deLaCategoria(producto));
    }

    @Y("da click en Add To Cart")
    public void daClickEnAddToCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionaAddToCart.ingresaAdd());
    }
    @Entonces("aparece un pop-up")
    public void apareceUnPopup() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AceptarPopup.enElPopup());
    }

    @Entonces("da click en el carrito de compras para verificar que el producto seleccionado esté en el carrito")
    public void daClickEnElCarritoDeComprasParaVerificarQueElProductoSeleccionadoEsteEnElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickBotonCart.antesDeProductoVisible(),
                VerificarCarritoCompras.contieneProductoSeleccionado("nombreProducto")
        );
    }
}
