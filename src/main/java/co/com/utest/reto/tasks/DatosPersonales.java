package co.com.utest.reto.tasks;

import co.com.utest.reto.userinterface.PaginaDatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class DatosPersonales implements Task {

    private String textoNombre;
    private String textoApellido;
    private String textoCorreo;
    private String textoMes;
    private String textoDia;
    private String textoAno;


    public DatosPersonales(String textoNombre, String textoApellido, String textoCorreo, String textoMes, String textoDia, String textoAno) {
        this.textoNombre = textoNombre;
        this.textoApellido = textoApellido;
        this.textoCorreo = textoCorreo;
        this.textoMes = textoMes;
        this.textoDia = textoDia;
        this.textoAno = textoAno;

    }

    public static DatosPersonales onThePage(String textoNombre, String textoApellido, String textoCorreo, String textoMes, String textoDia, String textoAno) {
        return Tasks.instrumented(DatosPersonales.class,textoNombre,textoApellido,textoCorreo,textoMes,textoDia,textoAno);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Click.on(PaginaDatosPersonales.BOTON_UNIRSE),
                Enter.theValue(textoNombre).into(PaginaDatosPersonales.TXT_NOMBRE),
                Enter.theValue(textoApellido).into(PaginaDatosPersonales.TXT_APELLIDO),
                Enter.theValue(textoCorreo).into(PaginaDatosPersonales.TXT_CORREO),
                SelectFromOptions.byVisibleText(textoMes).from(PaginaDatosPersonales.TXT_MES),
                SelectFromOptions.byVisibleText(textoDia).from(PaginaDatosPersonales.TXT_DIA),
                SelectFromOptions.byVisibleText(textoAno).from(PaginaDatosPersonales.TXT_ANO),
                Click.on(PaginaDatosPersonales.BOTON_SIGUIENTE));



    }
}

