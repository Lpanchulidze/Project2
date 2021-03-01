package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    public SelenideElement PageTitle = $("title");
    public SelenideElement Friend =  $("#send_friend_button");
    public SelenideElement popup = $(".fancybox-skin");
    public SelenideElement Name = $("#friend_name");
    public SelenideElement EMail= $("#friend_email");
    public SelenideElement SendButton= $("#sendEmail");
    public SelenideElement Size = $(By.id("group_1"));
    public SelenideElement AddToCart = $("#add_to_cart");
    public SelenideElement ProcToCheckout = $x("//a[@title='Proceed to checkout']");
    public SelenideElement ProductContainer= $(".product-container");
    public SelenideElement AddToCart2= $x("//span[text()='Add to cart']");
}
