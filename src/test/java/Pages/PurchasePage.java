package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePage extends BasePage{

    @FindBy(xpath = "//a[@class='shopping_cart_link'][contains(.,'1')]")
    private WebElement btnShoppingCart;

    @FindBy(xpath = "//button[contains(@id,'checkout')]")
    private WebElement btnCheckout;

    @FindBy(xpath = "//input[contains(@id,'first-name')]")
    private WebElement imputFirstName;

    @FindBy(xpath = "//input[contains(@id,'last-name')]")
    private WebElement imputLastName;

    @FindBy(xpath = "//input[contains(@id,'postal-code')]")
    private WebElement imputZipCode;

    @FindBy(xpath = "//input[contains(@id,'continue')]")
    private WebElement btnContinue;

    @FindBy(xpath = "//button[contains(@id,'finish')]")
    private WebElement btnFinish;

    @FindBy(xpath = "//h2[@class='complete-header'][contains(.,'Thank you for your order!')]")
    private WebElement messageFinishOrder;


    public void clickBtnShoppingCart() {
        click(btnShoppingCart);
    }

    public void clickBtnCheckout() {
        click(btnCheckout);
    }

    public void typeFirstName(String FirstName){
        type(imputFirstName, FirstName);
    }

    public void typeLastName(String LastName){
        type(imputLastName, LastName);
    }

    public void typeZipCode(String ZipCode){
        type(imputZipCode, ZipCode);
    }

    public void clickBtnContinue() {
        click(btnContinue);
    }

    public void clickBtnFinish() {
        click(btnFinish);
    }

    public String getMessageFinishOrder(){
        return getText(messageFinishOrder);
    }
}
