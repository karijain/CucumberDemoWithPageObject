package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class AuthSteps {

    public WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    public AuthSteps()
    {
        driver=Hooks.driver;
    }

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
       // System.setProperty("webdriver.chrome.driver","F:\\Workspace\\SeleniumAutomation\\Resource\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        homePage=new HomePage(driver);
        loginPage=homePage.clickOnMyAccount();
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        loginPage.login();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }
}
