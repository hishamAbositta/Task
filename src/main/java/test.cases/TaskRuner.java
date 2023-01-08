package test.cases;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.opject.AddProduct;
import page.opject.LoginPage;
import utils.Base;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;


public class TaskRuner extends Base {
    private LoginPage loginPage;
    private AddProduct addProduct;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        addProduct = new AddProduct(driver);
        String baseUrl = "https://staging.mazaady.com/login";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }


    @Test
    public void TestCase1() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://staging.mazaady.com/login");
        loginPage.email().sendKeys("test22@gmail.com");
        loginPage.password().sendKeys("123456789");
        loginPage.loginBtn().click();
        addProduct.userAction().click();
        addProduct.addProduct().click();
        addProduct.nextStep().click();
        addProduct.auctionName().sendKeys("test");
        addProduct.mainCategory().click();
        addProduct.subCategory().click();
        addProduct.quantity().sendKeys("1");
        addProduct.auctionDetails().sendKeys("test121");

    }
}