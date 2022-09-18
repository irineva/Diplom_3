import org.junit.After;
import org.junit.Test;
import steps.TestSteps;

public class ConstructorTest {
    TestSteps testSteps = new TestSteps();

    @After
    public void deleteTestData() {
        testSteps.deleteUserStep();
    }

    @Test
    public void openSaucesMenuTest() {
        testSteps.openMainPage();
        testSteps.openSaucesMenu();
    }

    @Test
    public void openFillingMenuTest() {
        testSteps.openMainPage();
        testSteps.openFillingMenu();
    }

    @Test
    public void openBunMenu() {
        testSteps.openMainPage();
        testSteps.openFillingMenu();
        testSteps.openBunMenu();
    }
}
