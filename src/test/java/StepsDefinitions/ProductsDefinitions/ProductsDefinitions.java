package StepsDefinitions.ProductsDefinitions;

import Steps.ProductsSteps.ProductsSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import utils.TestDataReader;

public class ProductsDefinitions {

    @Steps
    ProductsSteps productsSteps;


    @Then("the products screen should be displayed")
    public void theHomeScreenShouldBeDisplayed() {
        productsSteps.isDisplayedTitleProducts();
    }

    @When("he enters a {string} product")
    public void heSelectProductInTheList(String Product) {
        productsSteps.heSelectProduct(TestDataReader.getProperty(Product));
    }

    @Then("he validates that the detail has information")
    public void validateTheProductDetail() {
        productsSteps.isDisplayedProductDetail();
    }

    @And("click on the option to add to cart")
    public void addProductToCart() {
        productsSteps.clickOnAddToCart();
    }

    @Then("the product is added to the shopping cart")
    public void validateAddProductToCart() {
        productsSteps.isDisplayedBtnRemove();
    }
}
