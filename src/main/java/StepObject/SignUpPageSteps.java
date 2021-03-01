package StepObject;

import DataObjects.SignUpPageData;
import PageObject.SignUpPage;
import io.qameta.allure.Step;

import java.sql.*;


public class SignUpPageSteps {
    SignUpPage signUpPage = new SignUpPage();
    SignUpPageData signUnPageData = new SignUpPageData();

    @Step
    public SignUpPageSteps fillFirstName() throws SQLException {
        signUnPageData.main();
        signUpPage.firstName.setValue(signUnPageData.firstName);
        return this;
    }
    @Step
    public SignUpPageSteps fillLastName() throws SQLException {
        signUnPageData.main();
        signUpPage.lastName.setValue(signUnPageData.lastName);
        return this;
    }
    @Step
    public SignUpPageSteps fillPassword() throws SQLException {
        signUnPageData.main();
        signUpPage.password.setValue(signUnPageData.password);
        return this;
    }
    @Step
    public SignUpPageSteps fillAddress() throws SQLException {
        signUnPageData.main();
        signUpPage.address.sendKeys(signUnPageData.address);
        signUpPage.city.sendKeys(signUnPageData.city);
        signUpPage.state.selectOptionContainingText(signUnPageData.state);
        signUpPage.postcode.setValue(String.valueOf(signUnPageData.zip));
        return this;
    }
    @Step
    public SignUpPageSteps fillMobile() throws SQLException {
        signUnPageData.main();
        signUpPage.phone.setValue(signUnPageData.phone);
        return this;
    }
    @Step
    public SignUpPageSteps ClickSubmit() {
        signUpPage.submitButton.click();
        return this;
    }
}


