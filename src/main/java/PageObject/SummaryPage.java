package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SummaryPage {

    public SelenideElement ProcToCheckout = $x("//a[@class='button btn btn-default" +
            " standard-checkout button-medium']");
}
