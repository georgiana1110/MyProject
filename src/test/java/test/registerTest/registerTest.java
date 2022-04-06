package test.registerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class registerTest extends BaseTest {
    private String newUrl = getBaseUrl() + "/autentificare-epiesa/";

    @Test
    public void testRegister() {

        driver.get(newUrl);

        register.clickadresaEmail();
        register.setParola("password11", "password11");
    }
}