package co.com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaIngresoUbicacion {

    public static final Target TXT_CIUDAD = Target.the("Donde seleccionamos nuestra Ciudad").located(By.name("city"));
    public static final Target TXT_ZIP = Target.the("Donde seleccionamos nuestro codigo postal").located(By.name("zip"));

    public static final Target TXT_CONT_PAIS = Target.the("Donde seleccionamos la ciudad").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target TXT_PAIS = Target.the("Donde seleccionamos la ciudad").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_DISPOSITIVOS = Target.the("Boton que se dirige al formulario de registro de dispositivos").located(By.xpath("//a[@class=\"btn btn-blue pull-right\"]"));

}
