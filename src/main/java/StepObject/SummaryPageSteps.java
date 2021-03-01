package StepObject;

import PageObject.SummaryPage;
import io.qameta.allure.Step;

public class SummaryPageSteps {

    SummaryPage summaryPage = new SummaryPage();

    @Step
    public SummaryPageSteps ClickProceedToCheckout() {
        summaryPage.ProcToCheckout.click();
        return this;
    }
}
