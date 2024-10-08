package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAreaPage {
    private final By logo = By.xpath(".//div[@class='AppHeader_header__logo__2D0X2']/a[@href='/']");   //логотип
    private final By exitButton = By.xpath("//button[text()='Выход']");    //Кнопка "Выход"
    private final By constructorButton = By.xpath("//p[text()='Конструктор']");    //Кнопка "Конструктор"

    private WebDriver driver;

    public PersonalAreaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getLink() {
        return driver.getCurrentUrl();
    }

    @Step("Клик по кнопке 'Выход'")
    public void clickExitButton() {
        driver.findElement(exitButton).click();
    }

    @Step("Клик по кнопке 'Конструктор'")
    public void clickConstructorButton() {
        driver.findElement(constructorButton).click();
    }

    @Step("Клик по логотипу")
    public void clickLogo() {
        driver.findElement(logo).click();
    }
}
