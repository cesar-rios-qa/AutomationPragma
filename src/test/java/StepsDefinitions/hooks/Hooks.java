package StepsDefinitions.hooks;

import Steps.LoginSteps.LoginSteps;
import io.cucumber.java.Before;
import net.thucydides.core.annotations.Steps;

public class Hooks {

    @Steps
    LoginSteps loginSteps;

    @Before(value= "@Login or @Products or @Purchase", order=1)
    public void openBaseUrl(){
        loginSteps.navigateToBaseUrl();
    }
}
