package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    // Локатор кнопки "Личный кабинет"
    @FindBy(how = How.XPATH,using = ".//p[text()='Личный Кабинет']")
    private SelenideElement personalAccountButton;

    public void personalAccountButtonOnMainPageClick() {
        personalAccountButton.click();
    }

    // Локатор кнопки "Войти в аккаунт"
    @FindBy(how = How.XPATH,using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement enterIntoPersonalAccountButton;

    public void enterIntoPersonalAccountButtonClick() {
        enterIntoPersonalAccountButton.click();
    }

    @FindBy(how = How.CLASS_NAME, using = "App_componentContainer__2JC2W")
    private SelenideElement constructorPageLocator;

    public void constructorPageIsDisplayed() {
        enterIntoPersonalAccountButton.isDisplayed();
    }

    //локатор кнопки Контсруктора
    @FindBy(how = How.XPATH,using = ".//p[text()='Конструктор']")
    private SelenideElement constructorButtonLocator;

    public void constructorButtonClick() {
        constructorButtonLocator.click();
    }

    //локатор кнопки Stella Burgers
    @FindBy(how = How.CLASS_NAME, using =  "AppHeader_header__logo__2D0X2")
    private SelenideElement stellaBurgersLogoLocator;

    public void stellaBurgersButtonClick() {
        stellaBurgersLogoLocator.click();
    }

    //Локатор кнопки Булки
    @FindBy(how = How.XPATH,using = ".//span[text()='Булки']")
    private SelenideElement bunButton;

    public void bunButtonClick() {
        bunButton.click();
    }

    //Локатор кнопки Соусы
    @FindBy(how = How.XPATH,using = ".//span[text()='Соусы']")
    private SelenideElement saucesButton;

    public void saucesButtonClick() {
        saucesButton.click();
    }

    //Локатор кнопки Начинки
    @FindBy(how = How.XPATH,using = ".//span[text()='Начинки']")
    private SelenideElement fillingsButton;

    public void fillingsButtonClick() {
        fillingsButton.click();
    }

    // Локатор соусов
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Соусы']")
    private SelenideElement sauceLocator;

    public void sauceLocatorIsDisplayed() {
        sauceLocator.isDisplayed();
    }

    //Локатор Начинок
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Начинки']")
    private SelenideElement fillingLocator;

    public void fillingLocatorIsDisplayed() {
        fillingLocator.isDisplayed();
    }

    //Локатор булок
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Булки']")
    private SelenideElement bunLocator;

    public void bunLocatorIsDisplayed() {
        bunLocator.isDisplayed();
    }
}
