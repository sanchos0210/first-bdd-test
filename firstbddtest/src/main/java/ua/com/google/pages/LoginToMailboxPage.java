package ua.com.google.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginToMailboxPage extends PageObject {

    @FindBy(css = "h1")
    private WebElementFacade headerOfLoginPage;

    @FindBy(css = "#Email")
    private WebElementFacade emailField;

    @FindBy(css = "#Passwd")
    private WebElementFacade passwordField;

    @FindBy(css = "#next")
    private WebElementFacade confirmButton;

    @FindBy(css = "#signIn")
    private WebElementFacade signInButton;

    public void type_email(String email) {
        emailField.sendKeys(email);
    }

    public void type_password(String password) {
        passwordField.sendKeys(password);
    }

    public void click_on_confirm_email_button() {
        confirmButton.click();
        waitFor(ExpectedConditions.elementToBeClickable(headerOfLoginPage));
    }

    public void click_on_sign_in_button() {
        signInButton.click();
    }
}
