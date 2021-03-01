package Config;

import static com.codeborne.selenide.Configuration.*;
public class ConfigClass {
    public void main() {
        timeout = 10000;
        baseUrl = "http://automationpractice.com";
        startMaximized = true;
        browser = "chrome";
    }
}
