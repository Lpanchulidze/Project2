package StepObject;

import PageObject.AddressPage;
import io.qameta.allure.Step;

public class AddressPageSteps {

    AddressPage addressPage = new AddressPage();

    @Step
    public AddressPageSteps ClickButton() {
        addressPage.Button.click();
        return this;
    }

}
