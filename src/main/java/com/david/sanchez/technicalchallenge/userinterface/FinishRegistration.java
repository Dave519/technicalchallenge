package com.david.sanchez.technicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishRegistration extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("Click to password field")
            .located (By.id("password"));

    public static final  Target VALUE_PASSWORD = Target.the("Write the password you want to")
            .located(By.id("password"));

    public static final Target INPUT_CHECK_PASSWORD = Target.the("Click the check password field")
            .located (By.id("confirmPassword"));

    public static final Target VALUE_CHECK_PASSWORD = Target.the("Check your password")
            .located (By.id("confirmPassword"));

    public static final Target CHECK_TERMS = Target.the("Click accept user terms")
            .located (By.id("termOfUse"));

    public static final Target CHECK_PRIVACY = Target.the("Click accept privacy and security policies")
            .located (By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE = Target.the("Click the button Complete Setup")
            .located(By.className("btn-blue"));

    public static final Target CONFIRM_REGISTER = Target.the("User has been successfully registered")
            .located(By.className("sub-title"));
}
