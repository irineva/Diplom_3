package pageobjects;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    // Локатор кнопки "Личный кабинет"
    @FindBy(how = How.XPATH,using = ".//p[text()='Личный Кабинет']")
    private static SelenideElement personalAccountButton;

    // Локатор кнопки "Войти в аккаунт"
    @FindBy(how = How.XPATH,using = ".//button[text()='Войти в аккаунт']")
    private static SelenideElement enterIntoPersonalAccountButton;

    @FindBy(how = How.CLASS_NAME, using = "App_componentContainer__2JC2W")
    private static SelenideElement constructorPageLocator;

    //локатор кнопки Контсруктора
    @FindBy(how = How.XPATH,using = ".//p[text()='Конструктор']")
    private static SelenideElement constructorButtonLocator;

    //локатор кнопки Stella Burgers
    @FindBy(how = How.CLASS_NAME, using =  "AppHeader_header__logo__2D0X2")
    private static SelenideElement stellaBurgersLogoLocator;

    //Локатор кнопки Булки
    @FindBy(how = How.XPATH,using = ".//span[text()='Булки']")
    private static SelenideElement bunButton;

    //Локатор кнопки Соусы
    @FindBy(how = How.XPATH,using = ".//span[text()='Соусы']")
    private static SelenideElement saucesButton;

    //Локатор кнопки Начинки
    @FindBy(how = How.XPATH,using = ".//span[text()='Начинки']")
    private static SelenideElement fillingsButton;

    // Локатор соусов
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Соусы']")
    private static SelenideElement sauceLocator;

    //Локатор Начинок
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Начинки']")
    private static SelenideElement fillingLocator;

    //Локатор булок
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Булки']")
    private static SelenideElement bunLocator;

    public static final String MAIN_URL = "https://stellarburgers.nomoreparties.site";

    public void personalAccountButtonOnMainPageClick() {
        personalAccountButton.click();
    }

    public void enterIntoPersonalAccountButtonClick() {
        enterIntoPersonalAccountButton.click();
    }

    public void constructorPageIsDisplayed() {
        enterIntoPersonalAccountButton.isDisplayed();
    }

    public void constructorButtonClick() {
        constructorButtonLocator.click();
    }

    public void stellaBurgersButtonClick() {
        stellaBurgersLogoLocator.click();
    }

    public void bunButtonClick() {
        bunButton.click();
    }

    public void saucesButtonClick() {
        saucesButton.click();
    }

    public void fillingsButtonClick() {
        fillingsButton.click();
    }

    public void sauceLocatorIsDisplayed() {
        sauceLocator.isDisplayed();
    }

    public void fillingLocatorIsDisplayed() {
        fillingLocator.isDisplayed();
    }

    public void bunLocatorIsDisplayed() {
        bunLocator.isDisplayed();
    }

    public void openMainPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/irineva/yandex_praktikum/Diplom/Diplom_3/src/test/java/resources/yandexdriver"); //export PATH=/Users/irineva/IdeaProjects/praktikim/scooter/src/test/resources/:$PATH
        open(MAIN_URL, SignUpPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
