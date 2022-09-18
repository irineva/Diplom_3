import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import requests.User;
import steps.TestSteps;

public class PersonalAccountTest {

    TestSteps testSteps = new TestSteps();
    @Before
    public void clearCash() {

    }

    @After
    public void deleteTestData() {
        testSteps.deleteUserStep();
    }

    @Test
    public void enterPersonalAccountFromMainPageByHeaderTest() {
        User user = new User("mainpageheader", "mainpageheader@ya.ru", "mainpageheader");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);
        testSteps.goToPersonalAccountByHeaderPage();
        testSteps.singInUserStep(user);
        testSteps.exitPersonalAccount();
    }

    @Test
    public void enterPersonalAccountFromMainPageByButtonTest() {
        User user = new User("mainpage", "mainpage@ya.ru", "mainpage");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);

        testSteps.openMainPage();
        testSteps.goToPersonalAccountByButton();
        testSteps.enterButtonIsDisplayed();

        testSteps.singInUserStep(user);
        testSteps.exitPersonalAccount();
    }

    @Test
    public void enterPersonalAccountFromSignUpByButtonTest() {

        User user = new User("SignUp", "signUp@ya.ru", "SignUp");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);

        testSteps.enterAccountButton();
        testSteps.enterButtonIsDisplayed();

        testSteps.singInUserStep(user);
        testSteps.exitPersonalAccount();
    }

    @Test
    public void enterPersonalAccountFromForgotPassPageTest() {
        User user = new User("ForgotPass", "forgotpass@ya.ru", "ForgotPass");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);

        testSteps.openForgotPassPage();
        testSteps.enterAccountButtonOnForgotPass();
        testSteps.enterButtonIsDisplayed();

        testSteps.singInUserStep(user);
        testSteps.exitPersonalAccount();
    }

    @Test
    public void enterPersonalAccountByAuthorisedClientTest() {
        User user = new User("AuthorisedClient", "1AuthorisedClient@ya.ru", "AuthorisedClient");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);

        testSteps.openMainPage();
        testSteps.goToPersonalAccountByButton();
        testSteps.enterButtonIsDisplayed();

        testSteps.singInUserStep(user);
        testSteps.exitPersonalAccount();
    }

    @Test
    public void goToMAinPageByConstuctorButtonTest() {
        User user = new User("AuthorisedClient", "Auth2orisedClient@ya.ru", "AuthorisedClient");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);

        testSteps.openMainPage();
        testSteps.goToPersonalAccountByButton();
        testSteps.enterButtonIsDisplayed();

        testSteps.singInUserStep(user);
        testSteps.goToPersonalAccountByHeaderPage();
        testSteps.goToMAinPageByConstuctorButton();
        testSteps.exitPersonalAccount();
    }

    @Test
    public void goToMAinPageBystellaBurgersButtonTest() {
        User user = new User("AuthorisedClient", "Autho2risedClient@ya.ru", "AuthorisedClient");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);

        testSteps.openMainPage();
        testSteps.goToPersonalAccountByButton();
        testSteps.enterButtonIsDisplayed();

        testSteps.singInUserStep(user);
        testSteps.goToPersonalAccountByHeaderPage();
        testSteps.goToMAinPageBystellaBurgersButton();
        testSteps.exitPersonalAccount();
    }

    @Test
    public void exitPersonalAccountTest() {
        User user = new User("AuthorisedClient", "Aut4horisedClient@ya.ru", "AuthorisedClient");
        testSteps.openSingUpPage();
        testSteps.singUpUserStep(user);

        testSteps.openMainPage();
        testSteps.goToPersonalAccountByButton();
        testSteps.enterButtonIsDisplayed();

        testSteps.singInUserStep(user);
        testSteps.checkConstructorPageIsOpened();
        testSteps.exitPersonalAccount();
    }

}
