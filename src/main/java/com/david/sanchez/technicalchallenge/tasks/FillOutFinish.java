package com.david.sanchez.technicalchallenge.tasks;

import com.david.sanchez.technicalchallenge.model.UserData;
import com.david.sanchez.technicalchallenge.userinterface.FinishRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FillOutFinish implements Task {

    private List<UserData> userData;

    public FillOutFinish(List<UserData> userData) {
        this.userData = userData;
    }

    public static FillOutFinish toFinish(List<UserData> UserData) {
        return Tasks.instrumented(FillOutFinish.class, UserData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FinishRegistration.INPUT_PASSWORD),
                Enter.theValue(userData.get(0).getStrPassword()).into(FinishRegistration.VALUE_PASSWORD),

                Click.on(FinishRegistration.INPUT_CHECK_PASSWORD),
                Enter.theValue(userData.get(0).getStrCheckPassword()).into(FinishRegistration.VALUE_CHECK_PASSWORD),

                Click.on(FinishRegistration.CHECK_TERMS),
                Click.on(FinishRegistration.CHECK_PRIVACY),

                Click.on(FinishRegistration.BUTTON_COMPLETE)

        );
    }
}
