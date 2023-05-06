package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
    private WebElement titleProducts;

    @FindBy(xpath = "//div[contains(@class,'inventory_details_desc large_size')]")
    private WebElement productDescription;

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory'][contains(.,'Add to cart')]")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//button[contains(.,'Remove')]")
    private WebElement btnRemove;

    public boolean isDisplayedTitleProducts(){
        return isDisplayed(titleProducts);
    }

    public void selectProduct(String product){
        WebElement selectProduct = getDriver().findElement(By.xpath("//div[@class='inventory_item_name'][contains(.,'"+product+"')]"));
        selectProduct.click();
        waitFor(5000);
    }

    public boolean isDisplayedProductDescrption(){
        return isDisplayed(productDescription);
    }

    public void clickBtnAddToCart() {
        click(btnAddToCart);
    }

    public boolean isDisplayedBtnRemove(){
        return isDisplayed(btnRemove);
    }
}
