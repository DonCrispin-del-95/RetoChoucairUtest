package co.com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCompletarRegistro {
    public static final Target TXT_CONTRASENA = Target.the("Donde escribimos la contrasena").located(By.name("password"));
    public static final Target TXT_CONFIRMARCONTRASENA = Target.the("Donde confirmamos la contrasena").located(By.name("confirmPassword"));
    public static final Target CHECKBOX_TERMINOS = Target.the("Donde aceptamos los terminos ").located(By.xpath("//span[@class=\"checkmark signup-consent__checkbox error\"]"));
    public static final Target CHECKBOX_POLITICAS = Target.the("Donde aceptamos las politicas").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETAR = Target.the("Boton para completar y crear nuestro usuario en Utest").located(By.id("laddaBtn"));
    public static final Target QUESTION_FINALDEREGISTRO = Target.the("Extrae el mensaje de Bienvenida").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
