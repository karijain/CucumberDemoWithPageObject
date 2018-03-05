package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="log")
    WebElement usrNameElement;

    @FindBy(id="pwd")
    WebElement passwordElement;

    @FindBy(id="login")
    WebElement loginElement;

    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login()
    {
        usrNameElement.sendKeys("5454");
        passwordElement.sendKeys("4545");
        loginElement.click();

    }
}
