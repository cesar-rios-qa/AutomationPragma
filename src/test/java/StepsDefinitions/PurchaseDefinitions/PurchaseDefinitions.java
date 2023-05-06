package StepsDefinitions.PurchaseDefinitions;

import Steps.PurchaseSteps.PurchaseSteps;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import utils.TestDataReader;

public class PurchaseDefinitions {

    @Steps
    PurchaseSteps purchaseSteps;

    @Then("completes the purchase process successfully")
    public void completePurchase(String firstName, String lastName, String zipCode) {
        purchaseSteps.completeThePurchaseInformation(TestDataReader.getProperty(firstName), TestDataReader.getProperty(lastName), TestDataReader.getProperty(zipCode));
        purchaseSteps.verifyMessageFinishOrder();
    }

}
