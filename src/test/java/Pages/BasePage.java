package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends PageObject {

    public void navigateToUrl(String url) {
        getDriver().navigate().to(url);
    }

    public boolean isDisplayed(WebElement element) {
        waitFor(element);
        return element.isDisplayed();
    }

    public void type(WebElement element, String text){
        if (isDisplayed(element)) {
            element.sendKeys(text);
        }
    }

    public void click(WebElement element) {
        if (isDisplayed(element)) {
            element.click();
        }
    }

    public void waitForElementVisibility(WebElement element) {
        waitFor(ExpectedConditions.visibilityOf(element));
    }

    public String getText(WebElement element) {
        isDisplayed(element);
        return element.getText();
    }
}
