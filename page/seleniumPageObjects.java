package page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class page {
    String SITE_URL = "http://localhost:8080";
    public WebDriver driver;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterEach
    public void finish(){
        driver.quit();
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    By username = By.cssSelector("input[name='username']");
    By password = By.name("password");
    By loginButton = By.tagName("button");

    public void logIn() {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys("admin");
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("init");
        driver.findElement(loginButton).click();
    }
    By keywords = By.cssSelector("[class='glyphicon glyphicon-record']");
    By parameters = By.cssSelector("[class='glyphicon glyphicon-list-alt']");
    By executions = By.cssSelector("[class='glyphicon glyphicon-tasks']");

    public void keywordsPage() {
        driver.findElement(keywords).click();
    }

    public void parametersPage() {
        driver.findElement(parameters).click();
    }
    public void executionsPage() {
        driver.findElement(executions).click();
    }
    public By keywordsPageLocator = By.cssSelector("th[class='sorting_asc']");
    public By parametersPageLocator = By.cssSelector("th[class='sorting_asc']");
    public  By executionPageLocator = By.cssSelector("th[class='sorting_desc']");

    public void keywordsPageCheck(){
        driver.findElement(keywordsPageLocator).isDisplayed();
        System.out.println("Keywords page shown: " + driver.findElement(keywordsPageLocator).isDisplayed());
    }
    public void parametersPageCheck(){
        driver.findElement(parametersPageLocator).isDisplayed();
        System.out.println("Parameters page shown: " + driver.findElement(parametersPageLocator).isDisplayed());
    }
    public void executionsPageCheck(){
        driver.findElement(executionPageLocator).isDisplayed();
        System.out.println("Executions page shown: " + driver.findElement(executionPageLocator).isDisplayed());
    }
}


