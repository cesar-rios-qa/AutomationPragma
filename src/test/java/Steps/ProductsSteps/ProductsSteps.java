package Steps.ProductsSteps;

import Pages.ProductsPage;
import net.bytebuddy.matcher.ElementMatcher;
import net.thucydides.core.annotations.Step;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

public class ProductsSteps {

    ProductsPage productsPage;

    @Step
    public void isDisplayedTitleProducts(){
        productsPage.isDisplayedTitleProducts();
    }

    @Step
    public void heSelectProduct(String product) {
        productsPage.selectProduct(product);
    }

    @Step
    public void isDisplayedProductDetail(){
        assertThat(productsPage.isDisplayedProductDescrption(), is(true));
    }

    @Step
    public void clickOnAddToCart(){
        productsPage.clickBtnAddToCart();
    }

    @Step
    public void isDisplayedBtnRemove(){
        assertThat(productsPage.isDisplayedBtnRemove(), is(true));
    }

}
