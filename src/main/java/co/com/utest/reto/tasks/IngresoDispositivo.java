package co.com.utest.reto.tasks;

import co.com.utest.reto.userinterface.PaginaIngresoDispositivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresoDispositivo implements Task {

    private String textoMovil;

    public IngresoDispositivo(String textoMovil) {
        this.textoMovil = textoMovil;
    }

    public static IngresoDispositivo the (String textoMovil) {
        return Tasks.instrumented(IngresoDispositivo.class, textoMovil);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Click.on(PaginaIngresoDispositivo.DESPLEGABLE_MOVIL),
                Enter.theValue(textoMovil).into(PaginaIngresoDispositivo.TXT_MOVIL),

                Click.on(PaginaIngresoDispositivo.BOTON_ULTIMOPASO)

        );

    }
}
