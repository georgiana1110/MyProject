package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.driver;



public class homepageTest extends BaseTest {
    private String newUrl = "https://www.epiesa.ro/autentificare-epiesa/";

    @Test
    public void testLogoIsDisplayed() {
        driver.get(newUrl);
      //  Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
        homePage.clickadresaEmail();
        homePage.clickParola();
    }
}