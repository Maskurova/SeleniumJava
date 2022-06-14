package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By inputUsername = By.xpath("//input[@type='text']");
    private final By inputPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin = By.xpath("//input[@type='submit']");
    private final By buttonAdd = By.xpath("//button[@name ='add-to-cart-sauce-labs-backpack']");
    private final By buttonBasket = By.xpath("//a[@class ='shopping_cart_link']");
    private final By buttonCheckout = By.xpath("//button[@data-test = 'checkout']");
    private final By inputFirstname = By.xpath("//input[@placeholder = 'First Name']");
    private final By inputSecondname = By.xpath("//input[@data-test = 'lastName']");
    private final By inputPostalcode = By.xpath("//input[@data-test = 'postalCode']");
    private final By buttonContinue = By.xpath("//input[@data-test = 'continue']");
    private final By buttonFinish = By.xpath("//button[@data-test = 'finish']");
    private final By buttonBackhome = By.xpath("//button[@data-test = 'back-to-products']");



    public MobilePhoneReplenishmentPage enterUsername(String username){
        driver.findElement(inputUsername).sendKeys(username);
        return this;
    }

    public MobilePhoneReplenishmentPage enterPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }

    public MobilePhoneReplenishmentPage selectButtonLogin() {
        driver.findElement(buttonLogin).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterAdd() {
        driver.findElement(buttonAdd).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterBasket() {
        driver.findElement(buttonBasket).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterCheckout() {
        driver.findElement(buttonCheckout).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterFirstname() {
        driver.findElement(inputFirstname).sendKeys("Galya");
        return this;
    }

    public MobilePhoneReplenishmentPage enterSecondname() {
        driver.findElement(inputSecondname).sendKeys("Sidorova");
        return this;
    }

    public MobilePhoneReplenishmentPage enterPostalcode() {
        driver.findElement(inputPostalcode).sendKeys("115230");
        return this;
    }

    public MobilePhoneReplenishmentPage enterContinue() {
        driver.findElement(buttonContinue).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterFinish() {
        driver.findElement(buttonFinish).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterBackhome() {
        driver.findElement(buttonBackhome).click();
        return this;
    }

}
