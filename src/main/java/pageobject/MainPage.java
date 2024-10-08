package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final By personalAreaButton = By.xpath("//a[contains(@href,'/account')]");    // Кнопка "Личный кабинет"
    private final By enterAccountButton = By.xpath("//button[text()='Войти в аккаунт']");    //Кнопка "Войти в аккаунт"
    private final By bunsSwitch = By.xpath("//span[text()='Булки']");   //переключатель "Булки"
    private final By saucesSwitch = By.xpath("//span[text()='Соусы']");   //переключатель "Соусы"
    private final By fillingsSwitch = By.xpath("//span[text()='Начинки']");   //переключатель "Начинки"
    private final By bunsIsSelected = By.xpath(".//span[text()='Булки']/parent::div[contains(@class,'tab_tab_type_current__2BEPc')]");
    private final By saucesIsSelected = By.xpath(".//span[text()='Соусы']/parent::div[contains(@class,'tab_tab_type_current__2BEPc')]");
    private final By fillingsIsSelected = By.xpath(".//span[text()='Начинки']/parent::div[contains(@class,'tab_tab_type_current__2BEPc')]");

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getLink() {
        return driver.getCurrentUrl();
    }

    @Step("Клик по кнопке 'Личный кабинет'")
    public void clickPersonalAreaButton() {
        driver.findElement(personalAreaButton).click();
    }

    @Step("Клик по кнопке 'Войти в акаунт'")
    public void clickEnterAccountButton() {
        driver.findElement(enterAccountButton).click();
    }

    @Step("Клик по переключателю 'Булки'")
    public void clickBunsSwitch() {
        driver.findElement(bunsSwitch).click();
    }

    @Step("Клик по переключателю 'Соусы'")
    public void clickSaucesSwitch() {
        driver.findElement(saucesSwitch).click();
    }

    @Step("Клик по переключателю 'Начинки'")
    public void clickFillingsSwitch() {
        driver.findElement(fillingsSwitch).click();
    }

    @Step("Булки отобразились")
    public boolean bunsHeaderIsDisplayed() {
        return driver.findElement(bunsIsSelected).isDisplayed();
    }

    @Step("Соусы отобразились")
    public boolean saucesHeaderIsDisplayed() {
        return driver.findElement(saucesIsSelected).isDisplayed();
    }

    @Step("Начинки отобразились")
    public boolean fillingsHeaderIsDisplayed() {
        return driver.findElement(fillingsIsSelected).isDisplayed();
    }
}