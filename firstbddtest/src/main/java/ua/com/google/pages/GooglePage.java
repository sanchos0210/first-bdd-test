package ua.com.google.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("https://www.google.com.ua/")
public class GooglePage extends PageObject {

    @FindBy(css = "#gbw a")
    private WebElementFacade mailButton;

    @FindBy(css = ".gmail-nav__logo.gmail-logo")
    private WebElementFacade gmailLogo;

    @FindBy(xpath = "//*[contains(text(), 'Идет загрузка tester.cashflow@gmail.com…')]")
    public WebElementFacade textOfLoadingPage;

    public void mail_button_click() {
        mailButton.click();
    }

}
