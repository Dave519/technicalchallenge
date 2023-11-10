package com.david.sanchez.technicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpButton extends PageObject {

    public static final Target BUTTON_SIGNUP = Target.the("Click on JoinToday button")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
