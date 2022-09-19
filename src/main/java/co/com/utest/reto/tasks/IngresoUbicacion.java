package co.com.utest.reto.tasks;

import co.com.utest.reto.userinterface.PaginaIngresoUbicacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresoUbicacion implements Task {
    private String textoZip;

    public IngresoUbicacion(String textoZip) {
        this.textoZip = textoZip;
    }

    public static IngresoUbicacion the (String textoZip) {
        return Tasks.instrumented(IngresoUbicacion.class , textoZip);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(textoZip).into(PaginaIngresoUbicacion.TXT_ZIP),
                    Click.on(PaginaIngresoUbicacion.BOTON_DISPOSITIVOS)

        );

    }
}
