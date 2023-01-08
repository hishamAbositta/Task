package page.opject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class AddProduct {
    private final WebDriver driver;

    public AddProduct(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement userAction() {

        return Utils.waitForElementPresence(driver, By.xpath("//header[@id='top-header-main']/div/div/div[2]/div/div/div[2]"), 30);
    }
    public WebElement addProduct() {

        return Utils.waitForElementPresence(driver, By.linkText("Add Product"), 30);
    }
    //Step1
    public WebElement nextStep() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"step-1\"]/div/div[3]/div/button"), 30);
    }
    //Step2

    public WebElement auctionName() {
        return Utils.waitForElementPresence(driver, By.xpath("//input[@name='title']"), 30);
    }
    public WebElement mainCategory() {
        return Utils.waitForElementPresence(driver, By.xpath("//input[@name='title']"), 30);
    }
    public WebElement subCategory() {
        return Utils.waitForElementPresence(driver, By.xpath("//input[@name='title']"), 30);
    }
    public WebElement quantity() {
        return Utils.waitForElementPresence(driver, By.xpath("//input[@name='title']"), 30);
    }
    public WebElement mainImage() {
        return Utils.waitForElementPresence(driver, By.xpath("//input[@name='title']"), 30);
    }
    public WebElement auctionDetails() {
        return Utils.waitForElementPresence(driver, By.xpath("//input[@name='title']"), 30);
    }

}
