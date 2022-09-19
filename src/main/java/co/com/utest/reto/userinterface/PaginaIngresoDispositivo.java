package co.com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaIngresoDispositivo {
    public static final Target DESPLEGABLE_MOVIL = Target.the("Campo que despliega las opciones de dispositivos").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target TXT_MOVIL = Target.the("Donde seleccionamos la marca de nuestro telefono movil").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target BOTON_ULTIMOPASO = Target.the("Boton que nos muestra el ultimo formulario para completar el registro").located(By.xpath("//span[contains(text(), 'Next: Last Step')]"));
}
