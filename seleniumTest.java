import org.junit.jupiter.api.Test;


public class First extends page.page {
    @Test
    public void Login() {
        goTo();
        logIn();
    }
    @Test
    public void KeywordsPage() {
        goTo();
        logIn();
        keywordsPage();
        keywordsPageCheck();
    }
    @Test
    public void ParametersPage() {
        goTo();
        logIn();
        parametersPage();
        parametersPageCheck();
    }
    @Test
    public void ExecutionsPage() {
        goTo();
        logIn();
        executionsPage();
        executionsPageCheck();
    }
}
