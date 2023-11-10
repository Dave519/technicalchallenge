package com.david.sanchez.technicalchallenge.tasks;

import com.david.sanchez.technicalchallenge.userinterface.InsertYourData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.david.sanchez.technicalchallenge.model.UserData;

import java.util.List;

public class FillOutAboutYou implements Task {

    private List<UserData> userData;

    public FillOutAboutYou(List<UserData> userData) {
        this.userData = userData;
    }

    public static FillOutAboutYou goOn(List<UserData> userData) {
        return Tasks.instrumented(FillOutAboutYou.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(InsertYourData.INPUT_NAME),
                Enter.keyValues(userData.get(0).getStrFirstName()).into(InsertYourData.VALUE_NAME),

                Click.on(InsertYourData.INPUT_LASTNAME),
                Enter.keyValues(userData.get(0).getStrLastName()).into(InsertYourData.VALUE_LASTNAME),

                Click.on(InsertYourData.INPUT_MAIL),
                Enter.keyValues(userData.get(0).getStrMail()).into(InsertYourData.VALUE_MAIL),

                Click.on(InsertYourData.INPUT_MONTH),
                Click.on(InsertYourData.VALUE_MONTH),
                Click.on(InsertYourData.INPUT_DAY),
                Click.on(InsertYourData.VALUE_DAY),
                Click.on(InsertYourData.INPUT_YEAR),
                Click.on(InsertYourData.VALUE_YEAR),

                Click.on(InsertYourData.INPUT_LANGUAGE),
                Enter.keyValues(userData.get(0).getStrLanguage()).into(InsertYourData.VALUE_LANGUAGE),

                Click.on(InsertYourData.BUTTON_NEXT)
        );
    }
}
