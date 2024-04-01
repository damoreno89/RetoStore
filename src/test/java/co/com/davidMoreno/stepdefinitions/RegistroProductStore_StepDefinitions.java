package co.com.davidMoreno.stepdefinitions;

import co.com.davidMoreno.tasks.*;
import co.com.davidMoreno.utils.GeneradorAleatorio;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegistroProductStore_StepDefinitions {

    @Before
    public void iniciarTest() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que david ingresa al aplicativo de ProductStore")
    public void queDavidIngresaAlAplicativoDeProductStore() {
        OnStage.theActor("david").wasAbleTo(AbrirPagina.productStore());
    }

    @Cuando("hace clic en el enlace Registrarse")
    public void  inicioEnElApartadoDeJoinToda() {
        OnStage.theActor("david").attemptsTo(IngresarAlRegistro.registroToday());

    }

    @Y("llena el formulario de registro con los siguientes datos")
    public void llenaElFormularioDeRegistroConLosSiguientesDatos(DataTable datos) {
        String nombreAleatorio = GeneradorAleatorio.generarNombreAleatorio();
        String contrasenaAleatoria = GeneradorAleatorio.generarContrasenaAleatoria(5);

        theActorInTheSpotlight().attemptsTo(
                RegistroFormContrasena.llenarFormContrasena(nombreAleatorio, contrasenaAleatoria)
        );
    }

    @Entonces("el usuario debería ver un mensaje de confirmación de registro")
    public void verificamosQueSeHayaRealizadoElRegistroDelUsuario() {
        WebDriver driver = BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver();

        // Esperar hasta 20 segundos para que aparezca la alerta
        int tiempoMaximoEsperaEnSegundos = 20;
        int intervaloVerificacionEnMilisegundos = 600;
        int tiempoTranscurrido = 0;

        while (tiempoTranscurrido < tiempoMaximoEsperaEnSegundos * 2500) {
            try {
                Alert alert = driver.switchTo().alert();
                // Si no se lanza una excepción, la alerta está presente
                alert.accept(); // Aceptar la alerta
                break; // Salir del bucle una vez que se ha manejado la alerta
            } catch (Exception e) {
                // Si se lanza una excepción, la alerta no está presente
                try {
                    // Pausa antes de verificar nuevamente
                    Thread.sleep(intervaloVerificacionEnMilisegundos);
                    tiempoTranscurrido += intervaloVerificacionEnMilisegundos;
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();

                }
            }
        }
    }
}





