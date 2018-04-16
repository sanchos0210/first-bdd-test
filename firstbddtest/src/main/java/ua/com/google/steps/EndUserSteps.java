package ua.com.google.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ua.com.google.pages.GooglePage;
import ua.com.google.pages.LoginToMailboxPage;

import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    GooglePage googlePage;
    LoginToMailboxPage loginToMailboxPage;

    @Step
    public void should_see_own_email_in_mailbox(String email) {
        new WebDriverWait(getDriver(), 4).until(ExpectedConditions.
                textToBePresentInElementLocated(By.cssSelector("nobr .gb4"), email));
    }

    @Step
    public void is_the_google_home_page() {
        googlePage.open();
    }

    @Step
    public void click_on_mail_button() {
        googlePage.mail_button_click();
    }

    @Step
    public void type_email(String email) {
        loginToMailboxPage.type_email(email);
    }

    @Step
    public void click_on_confirm_email_button() {
        loginToMailboxPage.click_on_confirm_email_button();
    }

    @Step
    public void type_password(String password) {
        loginToMailboxPage.type_password(password);
    }

    @Step
    public void click_on_sign_in_button() {
        loginToMailboxPage.click_on_sign_in_button();
    }
}