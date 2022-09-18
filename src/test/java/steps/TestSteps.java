package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import pageObjects.SignUpPage;
import requests.User;
import requests.UserRequest;


import static com.codeborne.selenide.Selenide.open;

public class TestSteps extends SignUpPage {

    SignUpPage signUpPage = new pageObjects.SignUpPage();
    User user;
    UserRequest userRequest = new UserRequest();

    @Step("Удаляем тестового пользователя")
    public void deleteUserStep() {
        if (user != null) {
            String accessToken = userRequest.loginUser(user).then().extract().body().path("accessToken");
            userRequest.deleteUser(accessToken);
        }
    }

    @Step("Регистрация пользователя")
    public void singUpUserStep(User user) {
        signUpPage.setNameFieldValue(user.getName());
        signUpPage.setEmailFieldValue(user.getEmail());
        signUpPage.setPasswordFieldValue(user.getPassword());
        signUpPage.signUpButtonClick();
    }

    @Step("Авторизация пользователя")
    public void singInUserStep(User user) {
        signUpPage.setAuthEmailFieldValue(user.getEmail());
        signUpPage.setPasswordFieldValue(user.getPassword());
        signUpPage.authEnterButtonClick();
        checkConstructorPageIsOpened();
    }



    @Step("Проверяем видимость ошибки для некорректного пароля")
    public void checkInvalidPassHeaderStep() {
        signUpPage.getInvalidPassHeader().isDisplayed();
    }

    public void openSingUpPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/irineva/yandex_praktikum/Diplom/Diplom_3/src/test/java/resources/yandexdriver"); //export PATH=/Users/irineva/IdeaProjects/praktikim/scooter/src/test/resources/:$PATH
        signUpPage = open("https://stellarburgers.nomoreparties.site/register",
                SignUpPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    public void openMainPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/irineva/yandex_praktikum/Diplom/Diplom_3/src/test/java/resources/yandexdriver"); //export PATH=/Users/irineva/IdeaProjects/praktikim/scooter/src/test/resources/:$PATH
        signUpPage = open("https://stellarburgers.nomoreparties.site",
                SignUpPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    public void openForgotPassPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/irineva/yandex_praktikum/Diplom/Diplom_3/src/test/java/resources/yandexdriver"); //export PATH=/Users/irineva/IdeaProjects/praktikim/scooter/src/test/resources/:$PATH
        signUpPage = open("https://stellarburgers.nomoreparties.site/forgot-password",
                SignUpPage.class);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }


    public void enterButtonIsDisplayed() {
        signUpPage.enterButtonIsDisplayed();
    }

    public void goToPersonalAccountByHeaderPage(){
        signUpPage.personalAccountButtonOnMainPageClick();
        enterButtonIsDisplayed();
    }
    public void goToPersonalAccountByButton(){
        signUpPage.enterIntoPersonalAccountButtonClick();
    }

    public void enterAccountButton(){
        signUpPage.enterAccountButton();
    }

    public void enterAccountButtonOnForgotPass(){
        signUpPage.enterAccountButton();
    }

    public void checkConstructorPageIsOpened() {

    }

    public void exitPersonalAccount() {
        goToPersonalAccountByHeaderPage();
        signUpPage.exitPersonalAccount();
        enterButtonIsDisplayed();
    }

    public void goToMAinPageByConstuctorButton() {
        signUpPage.constructorButtonClick();
        signUpPage.constructorPageIsDisplayed();
    }

    public void goToMAinPageBystellaBurgersButton() {
        signUpPage.stellaBurgersButtonClick();
        signUpPage.constructorPageIsDisplayed();
    }

    public void openSaucesMenu(){
        signUpPage.saucesButtonClick();
        signUpPage.sauceLocatorIsDisplayed();
    }

    public void openFillingMenu(){
        signUpPage.fillingsButtonClick();
        signUpPage.fillingLocatorIsDisplayed();
    }

    public void openBunMenu(){
        signUpPage.bunButtonClick();
        signUpPage.bunLocatorIsDisplayed();
    }
}
