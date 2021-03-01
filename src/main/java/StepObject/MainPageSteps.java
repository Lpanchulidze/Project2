package StepObject;
import PageObject.MainPage;
import io.qameta.allure.Step;

public class MainPageSteps {

    MainPage mainPage =new MainPage();

    @Step
    public MainPageSteps ClickSignIn() {
        mainPage.SignIn.click();
        return this;
    }
    @Step
    public MainPageSteps ClickBestSellers() {
        mainPage.BestSellers.click();
        return this;
    }
    @Step
    public MainPageSteps HoverProduct() {
        mainPage.product.scrollTo().hover();
        return this;
    }
    @Step
    public MainPageSteps ClickMore() {
        mainPage.More.click();
        return this;
    }
    @Step
    public MainPageSteps ClickEveningDress(){
        mainPage.Dresses.hover();
        mainPage.EveningDress.click();
        return this;
    }
}
