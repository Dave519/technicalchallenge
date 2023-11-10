package com.david.sanchez.technicalchallenge.tasks;

import com.david.sanchez.technicalchallenge.userinterface.ChooseDevice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FillOutDevice implements Task {

    private ChooseDevice chooseDevice;

    public static FillOutDevice finalStep() {
        return Tasks.instrumented(FillOutDevice.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChooseDevice.INPUT_YOUR_COMPUTER),
                Click.on(ChooseDevice.SELECT_YOUR_COMPUTER),

                Click.on(ChooseDevice.INPUT_VERSION),
                Click.on(ChooseDevice.SELECT_VERSION),

                Click.on(ChooseDevice.INPUT_LANGUAGE),
                Click.on(ChooseDevice.SELECT_LANGUAGE),

                Click.on(ChooseDevice.INPUT_MOBILE_DEVICE),
                Click.on(ChooseDevice.SELECT_MOBILE_DEVICE),

                Click.on(ChooseDevice.INPUT_MODEL),
                Click.on(ChooseDevice.SELECT_MODEL),

                Click.on(ChooseDevice.INPUT_OPERATING_SYSTEM),
                Click.on(ChooseDevice.SELECT_OPERATING_SYSTEM),

                Click.on(ChooseDevice.BUTTON_NEXT_LAST_STEP)
        );
    }
}
