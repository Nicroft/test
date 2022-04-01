import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTest {

    private WebDriver driver;



    @BeforeEach
    void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
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
    public void tearDown(){
        //driver.quit();

    }

}
