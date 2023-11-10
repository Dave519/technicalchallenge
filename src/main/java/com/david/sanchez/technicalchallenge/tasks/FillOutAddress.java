package com.david.sanchez.technicalchallenge.tasks;

import com.david.sanchez.technicalchallenge.userinterface.InsertAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import com.david.sanchez.technicalchallenge.model.UserData;

import java.util.List;

public class FillOutAddress implements Task {

    private List<UserData> userData;

    public FillOutAddress(List<UserData> UserData) {
        this.userData = UserData;
    }

    public static FillOutAddress goOn(List<UserData> userData) {
        return Tasks.instrumented(FillOutAddress.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InsertAddress.INPUT_CITY),
                Enter.theValue(userData.get(0).getStrCity()).into(InsertAddress.VALUE_CITY),
                Hit.the(Keys.ARROW_DOWN).into(InsertAddress.VALUE_CITY),
                Hit.the(Keys.ENTER).into(InsertAddress.VALUE_CITY),

                Click.on(InsertAddress.INPUT_ZIPCODE),
                Enter.theValue(userData.get(0).getStrZipCode()).into(InsertAddress.VALUE_ZIPCODE),

                Click.on(InsertAddress.INPUT_COUNTRY),
                Click.on(InsertAddress.VALUE_COUNTRY),

                Click.on(InsertAddress.BUTTON_NEXT)
        );
    }
}
