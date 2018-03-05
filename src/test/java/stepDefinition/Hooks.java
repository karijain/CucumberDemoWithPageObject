package stepDefinition;

import cucumber.api.java.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    @cucumber.api.java.Before
    public void open()
    {
        System.out.println("Inside Hooks.open");
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
    }
    @After
    public void close()
    {
        driver.quit();
    }
}
