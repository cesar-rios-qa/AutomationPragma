package StepsDefinitions.LoginDefinitions;

import Steps.LoginSteps.LoginSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import utils.TestDataReader;


public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @When("he logs into with the {string} username and {string} password")
    public void heLogsIntoSaucedemo(String username, String password){
        loginSteps.logIntoSaucedemo(TestDataReader.getProperty(username), TestDataReader.getProperty(password));
    }

    @Then("you should see a message indicating that it is error")
    public void heShouldSeeAnError(){
        loginSteps.verifyMessageIncorrectLogin();
    }


}
