package StepObject;

import DataObjects.SignInPageData;
import PageObject.SignInPage;
import io.qameta.allure.Step;
import java.sql.*;
import java.util.UUID;

public class SignInPageSteps  {


    SignInPage signInPage = new SignInPage();
    SignInPageData signInPageData = new SignInPageData();
    String uuid = UUID.randomUUID().toString();
    @Step
    public SignInPageSteps EmailInput() throws SQLException {
        signInPageData.main();
        signInPage.EmailInput.setValue(uuid + signInPageData.email);
        return this;
    }
    @Step
    public SignInPageSteps ClickCreateAnAccount() {
        signInPage.CreateAnAccount.click();
        return this;
    }
    @Step
    public SignInPageSteps SignInInputs() throws SQLException {
        signInPageData.main();
        signInPage.EmailAddress.setValue(uuid + signInPageData.email);
        signInPage.PasswordInput.setValue(signInPageData.password);
        return this;
    }
    @Step
    public SignInPageSteps ClickSignInButton(){
        signInPage.SignInButton.click();
        return this;
    }

}

