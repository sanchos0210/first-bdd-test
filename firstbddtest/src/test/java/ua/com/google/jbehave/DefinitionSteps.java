package ua.com.google.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import ua.com.google.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Google home page")
    public void givenTheUserIsOnTheGoogleHomePage() {
        endUser.is_the_google_home_page();
    }

    @When("the user has opened mail login page")
    public void whenTheUserHasOpenedMailPage() {
        endUser.click_on_mail_button();
    }

    @When("the user has typed email '$email'")
    public void whenTheUserHasTypedEmail(String email) {
        endUser.type_email(email);
    }

    @When("the user has confirmed email")
    public void whenTheUserClickOnConfirmEmailButton() {
        endUser.click_on_confirm_email_button();
    }

    @When("the user has typed password '$password'")
    public void whenTheUserHasTypedPassword(String password) {
        endUser.type_password(password);
    }

    @When("the user click sign in button")
    public void whenTheUserClickOnConfirmPasswordButton() {
        endUser.click_on_sign_in_button();
    }

    @Then("the user should see own  email in mailbox '$email'")
    public void thenTheyShouldSeeALoadingPage(String email) {
        endUser.should_see_own_email_in_mailbox(email);
    }

}
