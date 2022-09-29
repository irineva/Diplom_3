import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import requests.User;
import steps.TestSteps;


public class SignUpTest {
    TestSteps testSteps = new TestSteps();

    @Before
    public void startUp() {
        testSteps.openSingUpPage();
    }

    @After
    public void deleteTestData() {
        testSteps.deleteUserStep();
    }

    @Test
    public void successSignUpTest() {
        User user = new User("Kate", "uniq1@yandex.ru", "123459");
        testSteps.singUpUserStep(user);
        testSteps.enterButtonIsDisplayed();
    }

    @Test
    public void invalidPassOnSignUpTest() {
        User user = new User("Kat", "tt@yandex.ru", "159");
        testSteps.singUpUserStep(user);
        testSteps.checkInvalidPassHeaderStep();

    }
}
