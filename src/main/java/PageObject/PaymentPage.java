package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PaymentPage {

    public SelenideElement BankWire = $x("//div[@id='HOOK_PAYMENT']/div[1]/div");
    public SelenideElement ByCheck = $("[title='Pay by check.']");
    public SelenideElement ConfirmButton = $x("//span[text()='I confirm my order']");
    public SelenideElement CustomerService= $x("//*[text()='customer service department.']");
}
