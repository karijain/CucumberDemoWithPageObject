package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath=".//*[@id='account']/a")
    WebElement myAccountElement;

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage clickOnMyAccount()
    {
        myAccountElement.click();
        return new LoginPage(driver);
    }

}
