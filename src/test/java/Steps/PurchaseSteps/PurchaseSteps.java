package Steps.PurchaseSteps;

import Pages.PurchasePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static utils.CapturedMesaages.FINISH_ORDER;
import static utils.CapturedMesaages.INCORRECT_LOGIN;

public class PurchaseSteps {

    PurchasePage purchasePage;

    @Step
    public void completeThePurchaseInformation(String firstName, String lastName, String zipcode){
        purchasePage.clickBtnShoppingCart();
        purchasePage.clickBtnCheckout();
        purchasePage.typeFirstName(firstName);
        purchasePage.typeLastName(lastName);
        purchasePage.typeZipCode(zipcode);
        purchasePage.clickBtnContinue();
        purchasePage.clickBtnFinish();
    }

    @Step
    public void verifyMessageFinishOrder(){
        assertThat(purchasePage.getMessageFinishOrder(), is(FINISH_ORDER.getMessage()));
    }
}
