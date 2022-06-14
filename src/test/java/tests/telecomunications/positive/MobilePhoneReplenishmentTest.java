package tests.telecomunications.positive;

import com.thoughtworks.qdox.model.expression.Add;
import org.junit.jupiter.api.Test;
import pages.telecomunications.MobilePhoneReplenishmentPage;
import tests.base.BaseTest;

import static constants.Constant.AuthTestData.PASSWORD;
import static constants.Constant.AuthTestData.USERNAME;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterUsername(USERNAME)
                .enterPassword(PASSWORD)
                .selectButtonLogin()
                .enterAdd()
                .enterBasket()
                .enterCheckout()
                .enterFirstname()
                .enterSecondname()
                .enterPostalcode()
                .enterContinue()
                .enterFinish()
                .enterBackhome();


    }

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterUsername(USERNAME)
                .enterPassword(PASSWORD)
                .selectButtonLogin()
                .enterAdd()
                .enterBasket()
                .enterCheckout()
                .enterFirstname()
                .enterSecondname()
                .enterPostalcode()
                .enterContinue()
                .enterFinish()
                .enterBackhome();


    }

}
