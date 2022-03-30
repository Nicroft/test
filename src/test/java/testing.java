import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testing {



    private WebDriver driver;


    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.edge.driver","src/test/resources/EdgeDriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void shouldPromptErrorWhenUserAndPasswordAreIncorrect() {

        WebElement user = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        WebElement loginButton = driver.findElement(By.tagName("button"));

        user.clear();
        password.clear();

        user.sendKeys("admin");
        password.sendKeys("admin");

        loginButton.click();

        WebElement flash = driver.findElement(By.id("flash"));

        String flashClass = flash.getAttribute ("class");

        assertEquals("flash error", flashClass);

    }

    @AfterEach
    void tearDown() {
        //driver.quit();
    }
}