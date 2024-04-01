package co.com.davidMoreno.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuarioPage {
    public static final Target BTN_SIGN_UP = Target.the("boton para ingresar al formulario de registro usuario").located(By.xpath("//A[@id='signin2']"));
    public static final Target INPUT_CONTRASENA = Target.the("input de contrasena").located(By.xpath("//INPUT[@id='sign-password']"));
    public static final Target INPUT_USUARIO = Target.the("input de usuario").located(By.xpath("//INPUT[@id='sign-username']"));
    public static final Target BTN_REGISTAR_SIGNUP = Target.the("Escribe Passwork").located(By.xpath("//BUTTON[@type='button'][text()='Sign up']"));

}



