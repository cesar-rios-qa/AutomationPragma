package Steps.LoginSteps;

import Pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static utils.CapturedMesaages.INCORRECT_LOGIN;

public class LoginSteps {

    LoginPage loginPage;

    @Step
    public void navigateToBaseUrl(){
        loginPage.navigateToBaseUrl();
    }

    @Step
    public void logIntoSaucedemo(String username, String password){
        loginPage.isDisplayedUsernameInput();
        loginPage.typeInputUsername(username);
        loginPage.typeInputPassword(password);
        loginPage.clickBtnLogin();
    }

    @Step
    public void verifyMessageIncorrectLogin(){
        assertThat(loginPage.getMessageIncorrectLogin(), is(INCORRECT_LOGIN.getMessage()));
    }
}
