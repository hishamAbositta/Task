package page.opject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;


public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement email() {

        return Utils.waitForElementPresence(driver, By.id("email"), 30);
    }

    public WebElement password() {
        return Utils.waitToBeClickable(driver, By.id("password"), 30);
    }

    public WebElement loginBtn() {
        return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"app\"]/section[1]/div/form/div[4]/div/button"), 30);
    }
}
