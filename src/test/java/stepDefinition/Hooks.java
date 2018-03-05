package stepDefinition;

import cucumber.api.java.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    @cucumber.api.java.Before
    void open()
    {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
    }
    @After
    void close()
    {
        driver.quit();
    }
}
