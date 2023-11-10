package com.david.sanchez.technicalchallenge.tasks;

import com.david.sanchez.technicalchallenge.userinterface.SignUpButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignUp implements Task {

    private SignUpButton signUpButton;

    public static SignUp enterData() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpButton.BUTTON_SIGNUP)
        );
    }
}
