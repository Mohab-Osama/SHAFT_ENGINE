package com.shaft.dsl.gui;

import com.shaft.validation.Validations;
import org.openqa.selenium.By;


@SuppressWarnings("unused")
public class Label extends Element {

    public Label(By locator) {
        super(locator);
    }

    public String getText() {
        return elementActions.getText(locator);
    }

    public void waitForTextToChange(String initialValve) {
        elementActions.waitForTextToChange(locator, initialValve);
    }

    public void shouldHaveText(String expectedValue) {
        Validations.assertThat().object(getText()).isEqualTo(expectedValue).perform();
    }

    public void shouldHaveText(String expectedValue, String reportMsg) {
        Validations.assertThat().object(getText()).isEqualTo(expectedValue).withCustomReportMessage(reportMsg).perform();
    }
}
