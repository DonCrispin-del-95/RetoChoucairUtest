package co.com.utest.reto.tasks;

import co.com.utest.reto.userinterface.PaginaCompletarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompletarRegistro implements Task {

    private String textoContrasena;
    private String textoConfirmarContrasena;

    public CompletarRegistro(String textoContrasena, String textoConfirmarContrasena) {
        this.textoContrasena = textoContrasena;
        this.textoConfirmarContrasena = textoConfirmarContrasena;
    }

    public static CompletarRegistro the (String textoContrasena, String textoConfirmarContrasena) {
        return Tasks.instrumented(CompletarRegistro.class , textoContrasena,textoConfirmarContrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Enter.theValue(textoContrasena).into(PaginaCompletarRegistro.TXT_CONTRASENA),
                Enter.theValue(textoConfirmarContrasena).into(PaginaCompletarRegistro.TXT_CONFIRMARCONTRASENA),
                Click.on(PaginaCompletarRegistro.CHECKBOX_TERMINOS),
                Click.on(PaginaCompletarRegistro.CHECKBOX_POLITICAS),
                Click.on(PaginaCompletarRegistro.BOTON_COMPLETAR)


        );

    }
}
