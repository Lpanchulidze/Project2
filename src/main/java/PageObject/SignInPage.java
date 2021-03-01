package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    public SelenideElement CreateAnAccount = $("#SubmitCreate");
    public SelenideElement EmailInput = $("#email_create");
    public SelenideElement EmailAddress= $("#email");
    public SelenideElement PasswordInput= $("#passwd");
    public SelenideElement SignInButton= $("#SubmitLogin");
}
