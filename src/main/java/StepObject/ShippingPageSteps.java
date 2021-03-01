package StepObject;

import PageObject.ShippingPage;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class ShippingPageSteps {

    ShippingPage shippingPage = new ShippingPage();

    @Step
    public ShippingPageSteps ClickButton(){
        shippingPage.ProceedButton.click();
    return this;
    }
    @Step
    public ShippingPageSteps ClickTerms() {
        shippingPage.Terms.click();
        return this;
    }
    @Step
    public ShippingPageSteps HandlePopup() {
        Selenide.executeJavaScript("arguments[0].click();", shippingPage.Overlay);
        return this;
    }
}
