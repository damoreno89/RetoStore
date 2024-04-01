package co.com.davidMoreno.tasks;


import co.com.davidMoreno.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class RegistroFormContrasena implements Task {

    private String nombre;
    private String contrasena;

    public RegistroFormContrasena(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public static RegistroFormContrasena llenarFormContrasena(String nombre, String contrasena) {
        return Tasks.instrumented(RegistroFormContrasena.class, nombre, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(RegistroUsuarioPage.INPUT_USUARIO),
                Enter.theValue(contrasena).into(RegistroUsuarioPage.INPUT_CONTRASENA),
                Scroll.to(RegistroUsuarioPage.BTN_REGISTAR_SIGNUP),
                Click.on(RegistroUsuarioPage.BTN_REGISTAR_SIGNUP)
        );
    }
}

