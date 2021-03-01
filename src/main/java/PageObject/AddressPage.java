package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddressPage {
    public SelenideElement Button = $(By.name("processAddress"));
}
