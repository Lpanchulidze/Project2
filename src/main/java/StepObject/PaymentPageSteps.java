package StepObject;

import PageObject.PaymentPage;
import io.qameta.allure.Step;

public class PaymentPageSteps {

    PaymentPage paymentPage = new PaymentPage();

    @Step
    public PaymentPageSteps ChooseBank() {
        paymentPage.BankWire.click();
        return this;
    }
    @Step
    public PaymentPageSteps Confirm() {
        paymentPage.ConfirmButton.click();
        return this;
    }
    @Step
    public PaymentPageSteps ChooseCheck() {
        paymentPage.ByCheck.click();
        return this;
    }
    @Step
    public PaymentPageSteps ClickService() {
        paymentPage.CustomerService.click();
        return this;
    }

}
