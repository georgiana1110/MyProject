package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;
    private By logo = By.xpath("//img[@src='/images/logo.png']");
    private By adresaEmail = By.xpath("//input[@name='login_utilizator']");
    private By Parola = By.xpath("//input[@name='login_parola']");

    private HomePage() {

    }

    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    public boolean checkLogo() {
        LOG.info("Check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }


    public void clickadresaEmail() {
        LOG.info("Click adresaEmail");
        driver.findElement(adresaEmail).sendKeys("vanzari@gmail.com");

    }

    public void clickParola() {
        LOG.info("Click Parola");
        driver.findElement(Parola).sendKeys("password11");
    }
}