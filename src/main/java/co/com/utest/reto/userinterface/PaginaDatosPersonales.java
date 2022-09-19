package co.com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDatosPersonales {


    public static final Target BOTON_UNIRSE = Target.the("Boton que nos mostrara formulario de registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target TXT_NOMBRE = Target.the("Donde escribimos el nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("Donde escribimos el apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO = Target.the("Donde escribimos el correo").located(By.id("email"));
    public static final Target TXT_MES = Target.the("Donde seleccionamos el mes").located(By.id("birthMonth"));
    public static final Target TXT_DIA = Target.the("Donde seleccionamos el dia").located(By.id("birthDay"));
    public static final Target TXT_ANO = Target.the("Donde seleccionamos el año").located(By.id("birthYear"));
    public static final Target BOTON_SIGUIENTE = Target.the("Boton que nos dirige al formulario de registro de ubicacion").located(By.xpath("//a[@class=\"btn btn-blue\"]"));



}
