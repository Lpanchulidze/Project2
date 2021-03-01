package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ServicePage {

    public SelenideElement Heading = $("#id_contact");
    public SelenideElement Order = $("[name= 'id_order']");
    public SelenideElement FileUpload =$("#fileUpload");
    public SelenideElement Message = $("textarea#message[name= 'message']");
    public SelenideElement Button = $x("//button[contains(@id, 'Message')]");

}




