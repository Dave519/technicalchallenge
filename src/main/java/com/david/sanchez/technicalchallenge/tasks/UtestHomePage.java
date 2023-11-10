package com.david.sanchez.technicalchallenge.tasks;

import com.david.sanchez.technicalchallenge.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class UtestHomePage implements Task {

    private HomePage homePage;

    public static UtestHomePage webSite() {
        return Tasks.instrumented(UtestHomePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));
    }
}
