package co.com.davidMoreno.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptarPopup implements Task {

    public static AceptarPopup enElPopup() {
        return instrumented(AceptarPopup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        // Obtener el identificador de la ventana principal
        String parentWindowHandler = driver.getWindowHandle();
        // Obtener los identificadores de todas las ventanas abiertas
        Set<String> handles = driver.getWindowHandles();
        // Iterar sobre las ventanas
        for (String handle : handles) {
            if (!handle.equals(parentWindowHandler)) {
                // Cambiar a la ventana del pop-up
                driver.switchTo().window(handle);
                // Manejar la alerta
                try {
                    // Aquí puedes realizar acciones en el pop-up
                    // Por ejemplo, puedes esperar a que un elemento esté presente antes de hacer clic en él
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.confirm"))).click();
                    // Cerrar la ventana del pop-up
                    driver.close();
                } catch (NoAlertPresentException e) {
                    // Manejar el caso en el que no se encuentra ninguna alerta
                }

                // Cambiar de vuelta a la ventana principal
                driver.switchTo().window(parentWindowHandler);
                // Salir del bucle después de manejar el pop-up
                break;
            }
        }
    }
}



