package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage {
    private final By emailField = By.xpath("//input[@name='name']");     //поле ввода "Email"
    private final By passwordField = By.xpath("//input[@name='Пароль']");    //поле ввода "Пароль"
    private final By enterButton = By.xpath("//button[text()='Войти']");     //кнопка "Войти"
    private final By registrationHref = By.xpath("//a[@href='/register']");     //гиперссылка "Зарегистрироваться"
    private final By recoverPasswordHref = By.xpath("//a[@href='/forgot-password']");    //гиперссылка "Восстановить пароль"
    private final By logo = By.xpath(".//div[@class='AppHeader_header__logo__2D0X2']/a[@href='/']");   //логотип
    private final By enterHref = By.xpath("//a[contains(@href,'/login')]");    //гиперссылка "Войти" (переход "Вспомнили пароль?")

    private WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getLink() {
        return driver.getCurrentUrl();
    }

    @Step("Ввод E-mail")
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    @Step("Ввод пароля")
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step("Клик по кнопке 'Войти'")
    public void clickToTheEnterButton() {
        driver.findElement(enterButton).click();
    }

    @Step("Авторизация")
    public void userLogin(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickToTheEnterButton();
    }

    @Step("Клик по гиперрсылке 'Зарегистрироваться'")
    public void clickRegistrationHref() {
        driver.findElement(registrationHref).click();
    }

    @Step("Клик по гиперссылке 'Восстановить пароль'")
    public void clickRecoverPasswordHref() {
        driver.findElement(recoverPasswordHref).click();
    }

    @Step("Клик логотипу")
    public void clickLogo() {
        driver.findElement(logo).click();
    }

    @Step("Кнопка войти отобразилась")
    public By getEnterButton() {
        return enterButton;
    }

    @Step("гиперссылка Войти переход Вспомнили пароль?")
    public void clickEnterHref() {
        driver.findElement(enterHref).click();
    }
}