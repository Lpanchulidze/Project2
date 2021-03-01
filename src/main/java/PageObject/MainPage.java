package PageObject;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement SignIn = $(By.className("header_user_info"));
    public SelenideElement BestSellers= $(".blockbestsellers");
    public SelenideElement product= $x("//ul[@id='blockbestsellers']/li[contains(@class, 'product')][1]");
    public SelenideElement More= $x("//ul[@id='blockbestsellers']/li[contains(@class, 'product')][1]" +
            "//a[@class='button lnk_view btn btn-default']");
    public SelenideElement Dresses = $x("//*[@id='block_top_menu']/ul/li[2]/a");
    public SelenideElement EveningDress= $x("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]");

}
