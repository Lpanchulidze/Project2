package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {

    public SelenideElement firstName = $(By.id("customer_firstname"));
    public SelenideElement lastName = $(By.id("customer_lastname"));
    public SelenideElement phone = $(By.id("phone_mobile"));
    public SelenideElement password = $(By.id("passwd"));
    public SelenideElement address = $(By.id("address1"));
    public SelenideElement city = $(By.id("city"));
    public SelenideElement state = $(By.id("id_state"));
    public SelenideElement postcode = $(By.id("postcode"));
    public SelenideElement submitButton = $(By.id("submitAccount"));
}