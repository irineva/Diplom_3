package pageobjects;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import requests.User;
import requests.UserRequest;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

public class SignUpPage extends MainPage {

    // Локатор страницы регистрации
    @FindBy(how = How.CLASS_NAME, using = "App_componentContainer__2JC2W")
    private static SelenideElement SignUpPageContent;

    //Поле ввода для имени
    @FindBy(how = How.XPATH, using = ".//fieldset[1]//input[@name='name']")
    private static SelenideElement nameField;

    //Поле ввода для почты
    @FindBy(how = How.XPATH, using = ".//fieldset[2]//input[@name='name']")
    private static SelenideElement emailField;

    //Поле ввода для пароля
    @FindBy(how = How.XPATH, using = ".//input[@type='password']")
    private static SelenideElement passwordField;

    // Локатор кнопки "Зарегистрироваться"
    @FindBy(how = How.CLASS_NAME, using = "button_button__33qZ0")
    private static SelenideElement signUpButton;

    //Локатор ошибки для некорректного пароля
    @FindBy(how = How.XPATH, using = ".//p[text()='Некорректный пароль']")
    private static SelenideElement invalidPassHeader;

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private static SelenideElement enterButton;

    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private static SelenideElement enterAccountButton;

    //поле ввода почты при авторизации
    @FindBy(how = How.XPATH, using = ".//fieldset[1]//input[@name='name']")
    private static SelenideElement authEmailField;

    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private static SelenideElement exitPersonalAccountButton;

    public static final String REGISTER_URL = "https://stellarburgers.nomoreparties.site/register";
    public static final String FORGOT_PASS_URL = "https://stellarburgers.nomoreparties.site/forgot-password";

    public void setNameFieldValue(String nameValue) {
        nameField.setValue(nameValue);
    }

    public void setEmailFieldValue(String emailValue) {
        this.emailField.setValue(emailValue);
    }

    public void setAuthEmailFieldValue(String emailValue) {
        this.authEmailField.setValue(emailValue);
    }

    public void setPasswordFieldValue(String passwordValue) {
        this.passwordField.setValue(passwordValue);
    }

    public void signUpButtonClick() {
        signUpButton.click();
    }

    public SelenideElement getInvalidPassHeader() {
        return invalidPassHeader;
    }

    public void enterAccountButtonClick() {
        enterAccountButton.click();
    }

    public void authEnterButtonClick() {
        enterButton.click();
    }

    public void checkConstructorPageIsOpened() {

    }

    @Step("Задаем уникальные данные нового пользователя")
    public User setUserDataStep() {
        int random = new Random().nextInt(100);
        User user;
        user = new User("test_name_" + random,
                "test_email_" + random + "@ya.ru",
                "test_pass");
        return user;
    }


    @Step("Удаляем тестового пользователя")
    public void deleteUserStep(User user) {
        UserRequest userRequest = new UserRequest();
        if (user != null) {
            String accessToken = userRequest.loginUser(user).then().extract().body().path("accessToken");
            userRequest.deleteUser(accessToken);
        }
    }

    @Step("Регистрация пользователя")
    public void singUpUserStep(User user) {
        setNameFieldValue(user.getName());
        setEmailFieldValue(user.getEmail());
        setPasswordFieldValue(user.getPassword());
        signUpButtonClick();
    }

    @Step("Авторизация пользователя")
    public void singInUserStep(User user) {
        setAuthEmailFieldValue(user.getEmail());
        setPasswordFieldValue(user.getPassword());
        authEnterButtonClick();
        checkConstructorPageIsOpened();
    }

    @Step("Проверяем видимость ошибки для некорректного пароля")
    public void checkInvalidPassHeaderStep() {
        getInvalidPassHeader().isDisplayed();
    }

    public void openSingUpPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/irineva/yandex_praktikum/Diplom/Diplom_3/src/test/java/resources/yandexdriver");
        open(REGISTER_URL, SignUpPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    public void openForgotPassPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/irineva/yandex_praktikum/Diplom/Diplom_3/src/test/java/resources/yandexdriver");
        open(FORGOT_PASS_URL, SignUpPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }


    public void enterButtonIsDisplayed() {
        enterButton.isDisplayed();
    }

    public void exitButtonIsDisplayed() {
        exitPersonalAccountButton.isDisplayed();
    }

    public void goToPersonalAccountByHeaderPage() {
        personalAccountButtonOnMainPageClick();

    }

    public void goToPersonalAccountByButton() {
        enterIntoPersonalAccountButtonClick();
        exitButtonIsDisplayed();
    }


    public void enterAccountButtonOnForgotPass() {
        enterAccountButtonClick();
    }

    public void exitPersonalAccount() {
        goToPersonalAccountByHeaderPage();
        exitPersonalAccountButton.click();
        enterButtonIsDisplayed();
    }

    public void goToMAinPageByConstuctorButton() {
        constructorButtonClick();
        constructorPageIsDisplayed();
    }

    public void goToMAinPageBystellaBurgersButton() {
        stellaBurgersButtonClick();
        constructorPageIsDisplayed();
    }

    public void openSaucesMenu() {
        saucesButtonClick();
        sauceLocatorIsDisplayed();
    }

    public void openFillingMenu() {
        fillingsButtonClick();
        fillingLocatorIsDisplayed();
    }

    public void openBunMenu() {
        bunButtonClick();
        bunLocatorIsDisplayed();
    }
}
