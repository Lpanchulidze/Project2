package StepObject;

import DataObjects.ServicePageData;
import PageObject.ServicePage;
import io.qameta.allure.Step;

public class ServicePageSteps {

    ServicePage servicePage = new ServicePage();
    ServicePageData servicePageData = new ServicePageData();

    @Step
    public ServicePageSteps ChooseHeading() {
        servicePage.Heading.selectOptionByValue(servicePageData.Value);
        return this;
    }
    @Step
    public ServicePageSteps ChooseOrder() {

        servicePage.Order.selectOption(1);
        return this;
    }
    @Step
    public ServicePageSteps UploadFile() {
        servicePage.FileUpload.sendKeys(servicePageData.file);
        return this;
    }
    @Step
    public ServicePageSteps SendText() {
        servicePage.Message.sendKeys(servicePageData.Text);
        return this;
    }
    @Step public ServicePageSteps ClickSendButton() {
        servicePage.Button.click();
        return this;
    }
}
