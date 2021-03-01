package StepObject;

import DataObjects.ProductData;
import PageObject.ProductPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.attribute;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();
    ProductData productData = new ProductData();

    @Step
    public ProductPageSteps CheckTitle() {
        productPage.PageTitle.shouldHave(attribute("text",
                "Printed Chiffon Dress - My Store"));
        return this;
    }
    @Step
    public ProductPageSteps SendToFriend() {
        productPage.Friend.click();
        return this;
    }
    @Step
    public ProductPageSteps CheckPopup() {
        productPage.popup.shouldBe(Condition.visible);
        return this;
    }
    @Step
    public ProductPageSteps SelectQuantity(){
        Selenide.executeJavaScript(productData.Quantity);
        return this;
    }
    @Step
    public ProductPageSteps SelectSize() {
        productPage.Size.sendKeys(productData.size);
        return this;
    }
    @Step
    public ProductPageSteps ClickAddToCart() {
        productPage.AddToCart.click();
        return this;
    }
    @Step
    public ProductPageSteps ClickProcToCheckout() {
        productPage.ProcToCheckout.click();
        return this;
    }
    @Step
    public ProductPageSteps AddProduct() {
        productPage.ProductContainer.hover();
        productPage.AddToCart2.click();
        productPage.ProcToCheckout.click();
        return this;

    }
}
