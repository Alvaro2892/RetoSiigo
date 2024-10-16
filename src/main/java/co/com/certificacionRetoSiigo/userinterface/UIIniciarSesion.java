package co.com.certificacionRetoSiigo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class UIIniciarSesion
{
    public static final Target ENTERUSERNAME = Target.the("Clic en el input y luego ingreso el username").located(ByShadow.cssSelector("#username-input", "#username"));
    public static final Target ENTERPASSWORD = Target.the("Clic en el input y luego ingreso la password").located(ByShadow.cssSelector("#password-input", "#current-password"));
    public static final Target CLICKBOTONINGRESAR = Target.the("Click en el boton ingresar").located(By.id("login-submit"));

}
