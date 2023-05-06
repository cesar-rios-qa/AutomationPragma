package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestDataReader;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[contains(@type,'submit')]")
    private WebElement btnLogin;

    @FindBy(xpath = "//input[contains(@id,'user-name')]")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    private WebElement inputPassword;

    @FindBy(xpath = "//h3[@data-test='error'][contains(.,'Epic sadface: Username and password do not match any user in this service')]")
    private WebElement messageIncorrectLogin;

    public void navigateToBaseUrl(){
        navigateToUrl(TestDataReader.getProperty("webdriver_base_url"));
    }

    public void isDisplayedUsernameInput() {
        isDisplayed(inputUsername);
    }

    public void typeInputUsername(String username) {
        type(inputUsername, username);
    }

    public void typeInputPassword(String password) {
        type(inputPassword, password);
    }

    public void clickBtnLogin() {
        click(btnLogin);
    }

    public String getMessageIncorrectLogin(){
        return getText(messageIncorrectLogin);
    }
}
