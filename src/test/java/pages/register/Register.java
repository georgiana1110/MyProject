package pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Register extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    private static Register instance;

    private By adresaEmail = By.xpath("//input[@name='email']");

    private By Nume = By.xpath("//input[@name='nume']");

    private By Prenume = By.xpath("//input[@name='nume']");

    private By Parola = By.xpath("//input[@name='parola']");

    private By ConfirmaParola = By.xpath("//input[@name='confirmare_parola']");

    private Register() {

    }

    public static Register getInstance() {
        if (instance == null) {
            instance = new Register();
        }
        return instance;
    }
    public void clickadresaEmail() {
        LOG.info("Click adresaEmail");
        driver.findElement(adresaEmail).sendKeys("vanzari@gmail.com");

    }

    public void setFullName(String fNume, String fPrenume) {
        LOG.info("Set full name into Form");
        driver.findElement(Nume).sendKeys(fNume);
        driver.findElement(Prenume).sendKeys(fPrenume);

    }
    public void setParola(String parola, String confirmParola) {
        LOG.info("Set Parola");
        driver.findElement(Parola).sendKeys("password11");
        driver.findElement(ConfirmaParola).sendKeys("password11");
    }
}
