package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShippingPage {
    public SelenideElement ProceedButton= $(By.name("processCarrier"));
    public SelenideElement Overlay = $(By.cssSelector("[class^='fancybox-overlay']"));
    public SelenideElement Terms = $(By.id("uniform-cgv"));
}


