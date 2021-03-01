import Config.ConfigClass;
import PageObject.ProductPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;
import StepObject.*;
import org.testng.annotations.Test;
import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.*;

public class MainTest {

    ConfigClass configClass;
    MainPageSteps mainPageSteps;
    SignInPageSteps signInPageSteps;
    SignUpPageSteps signUpPageSteps;
    ProductPageSteps productPageSteps;
    SummaryPageSteps summaryPageSteps;
    AddressPageSteps addressPageSteps;
    ShippingPageSteps shippingPageSteps;
    PaymentPageSteps paymentPageSteps;
    ServicePageSteps servicePageSteps;
    ProductPage productPage;

    public MainTest() {
        configClass = new ConfigClass();
        productPage = new ProductPage();
        mainPageSteps = new MainPageSteps();
        signInPageSteps = new SignInPageSteps();
        signUpPageSteps = new SignUpPageSteps();
        productPageSteps = new ProductPageSteps();
        summaryPageSteps = new SummaryPageSteps();
        addressPageSteps = new AddressPageSteps();
        shippingPageSteps = new ShippingPageSteps();
        paymentPageSteps = new PaymentPageSteps();
        servicePageSteps = new ServicePageSteps();
    }

    @DataProvider(name = "input")
    public Object[][] data() {
        return new Object[][]{{"Luka", "Luka_123@gmail.com"},
                {"Giorgi", "Giorgi_123@gmail.com"}};
    }

    @BeforeMethod(alwaysRun = true, groups = {"Regression1", "Regression2"})
    public void before() {
        configClass.main();
        open("/index.php");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true));
    }

    @AfterMethod(alwaysRun = true, groups = {"Regression1", "Regression2"})
    public void after() {
        Selenide.closeWindow();
    }

    @Epic("Whole Test")
    @Feature("Regression2")
    @Story("TestMethod1")
    @Test(testName = "SignUpTest", description = "Pirveli testi, Registracia")
    @Description("Test description: Pirveli testi, Registracia")
    public void FirstMethod() throws SQLException {
        mainPageSteps.ClickSignIn();
        signInPageSteps.EmailInput()
                .ClickCreateAnAccount();
        signUpPageSteps.fillFirstName()
                .fillLastName()
                .fillPassword()
                .fillAddress()
                .fillMobile()
                .ClickSubmit();
    }

    @Epic("Whole Test")
    @Feature("Regression1")
    @Story("TestMethod2")
    @Test(testName = "TestWithTwoParameters", description = "Meore testi, 2 megobris mowveva",
            dataProvider = "input", groups = "Regression1")
    @Description("Test description: Meore testi, 2 megobris mowveva")
    public void SecondMethod(String name, String email) {
        mainPageSteps.ClickBestSellers()
                .HoverProduct()
                .ClickMore();
        productPageSteps.CheckTitle()
                .SendToFriend()
                .CheckPopup();
        productPage.Name.setValue(name);
        productPage.EMail.setValue(email);
        productPage.SendButton.click();
        back();
    }

    @Epic("Whole Test")
    @Feature("Regression2")
    @Story("TestMethod3")
    @Test(testName = "PayingWithBankCard", description = "mesame testi, baratit gadaxda",
            dependsOnMethods = "FirstMethod", groups = "Regression2" )
    @Description("Test description: mesame testi, baratit gadaxda")
    public void ThirdMethod() throws SQLException {
        mainPageSteps.ClickBestSellers()
                .HoverProduct()
                .ClickMore();
        productPageSteps.CheckTitle()
                .SelectQuantity()
                .SelectSize()
                .ClickAddToCart()
                .ClickProcToCheckout();
        summaryPageSteps.ClickProceedToCheckout();
        signInPageSteps.SignInInputs()
                .ClickSignInButton();
        addressPageSteps.ClickButton();
        shippingPageSteps.ClickButton()
                .HandlePopup()
                .ClickTerms()
                .ClickButton();
        paymentPageSteps.ChooseBank()
                .Confirm();
    }

    @Epic("Whole Test")
    @Feature("Regression2")
    @Story("TestMethod4")
    @Test(testName = "PayingWithCheck", description = "meotxe testi, chekit gadaxda",
            dependsOnMethods = "FirstMethod", retryAnalyzer = MyRetry.class, groups = "Regression2")
    @Description("Test description: meotxe testi, chekit gadaxda")
    public void fourthMethod() throws SQLException{
        mainPageSteps.ClickEveningDress();
        productPageSteps.AddProduct();
        summaryPageSteps.ClickProceedToCheckout();
        signInPageSteps.SignInInputs()
                .ClickSignInButton();
        addressPageSteps.ClickButton();
        shippingPageSteps.ClickTerms()
                .ClickButton();
        paymentPageSteps.ChooseCheck()
                .Confirm()
                .ClickService();
        servicePageSteps.ChooseHeading()
                .ChooseOrder()
                .UploadFile()
                .SendText()
                .ClickSendButton();
    }

}



