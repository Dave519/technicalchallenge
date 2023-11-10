package com.david.sanchez.technicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InsertYourData extends PageObject {

    public static final Target INPUT_NAME = Target.the("Click the name field")
            .located (By.id("firstName"));

    public static final Target VALUE_NAME = Target.the("Insert the name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Click on the lastname field")
            .located (By.id("lastName"));

    public static final Target VALUE_LASTNAME = Target.the("Insert the lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_MAIL = Target.the("Click the email field")
            .located (By.id("email"));

    public static final Target VALUE_MAIL = Target.the("Insert the email")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("Click the month field")
            .located (By.id("birthMonth"));

    public static final Target VALUE_MONTH = Target.the("Choose the month")
            .located(By.xpath("//option[@label='May']"));

    public static final Target INPUT_DAY = Target.the("Click on the day field")
            .located (By.id("birthDay"));

    public static final Target VALUE_DAY = Target.the("Choose the day")
            .located(By.xpath("//option[@label='19']"));

    public static final Target INPUT_YEAR = Target.the("Click on the year field")
            .located (By.id("birthYear"));

    public static final Target VALUE_YEAR = Target.the("Choose the year")
            .located(By.xpath("//option[@label='1994']"));

    public static final Target INPUT_LANGUAGE = Target.the("Click on select language")
            .located(By.className("ui-select-search"));

    public static final Target VALUE_LANGUAGE = Target.the("Select a language")
            .located(By.className("ui-select-search"));

    public static final Target BUTTON_NEXT = Target.the("Click the button Next Location")
            .located(By.className("btn-blue"));
}
