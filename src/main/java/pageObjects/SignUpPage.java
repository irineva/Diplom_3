package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage extends MainPage {

    // Локатор страницы регистрации
    @FindBy(how = How.CLASS_NAME, using = "App_componentContainer__2JC2W")
    private SelenideElement SignUpPageContent;

    //Поле ввода для имени
    @FindBy(how = How.XPATH,using = ".//fieldset[1]//input[@name='name']")
    private SelenideElement nameField;

    //Поле ввода для почты
    @FindBy(how = How.XPATH,using = ".//fieldset[2]//input[@name='name']")
    private SelenideElement emailField;

    //Поле ввода для пароля
    @FindBy(how = How.XPATH,using = ".//input[@type='password']")
    private SelenideElement passwordField;

    // Локатор кнопки "Зарегистрироваться"
    @FindBy(how = How.CLASS_NAME, using = "button_button__33qZ0")
    private SelenideElement signUpButton;

    //Локатор ошибки для некорректного пароля
    @FindBy(how = How.XPATH,using = ".//p[text()='Некорректный пароль']")
    private SelenideElement invalidPassHeader;

    @FindBy(how = How.XPATH,using = ".//button[text()='Войти']")
    private SelenideElement enterButton;

    @FindBy(how = How.XPATH,using = ".//a[text()='Войти']")
    private SelenideElement enterAccountButton;

    //поле ввода почты при авторизации
    @FindBy(how = How.XPATH,using = ".//fieldset[1]//input[@name='name']")
    private SelenideElement authEmailField;

    @FindBy(how = How.XPATH,using = ".//button[text()='Выход']")
    private SelenideElement exitPersonalAccountButton;


    public void setNameFieldValue(String nameValue) {
        this.nameField.setValue(nameValue);
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
    public void enterButtonIsDisplayed() {
        enterButton.isDisplayed();
    }
    public void enterAccountButton() {
        enterAccountButton.click();
    }
    public void authEnterButtonClick() {
        enterButton.click();
    }

    public void exitPersonalAccount() {
        exitPersonalAccountButton.click();
    }
}
