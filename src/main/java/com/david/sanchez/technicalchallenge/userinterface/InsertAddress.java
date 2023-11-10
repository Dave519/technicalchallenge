package com.david.sanchez.technicalchallenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InsertAddress extends PageObject {

    public static final Target INPUT_CITY = Target.the("Click the city field on the page")
            .located (By.id("city"));

    public static final Target VALUE_CITY = Target.the("Write the name of the city")
            .located (By.id("city"));

    public static final Target INPUT_ZIPCODE = Target.the("Click on the zip-code field")
            .located (By.id("zip"));

    public static final Target VALUE_ZIPCODE = Target.the("Write the zip code number of the city")
            .located (By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("Click the country field")
            .located(By.xpath("//span[@aria-label='Select a country']"));

    public static final Target VALUE_COUNTRY = Target.the("Choose the country")
            .located(By.xpath("//div[text()='Colombia']"));

    public static final Target BUTTON_NEXT = Target.the("Click the button Next Devices")
            .located(By.className("btn-blue"));

}
