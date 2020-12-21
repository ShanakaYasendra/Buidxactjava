package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.elementhelper;

public class LoginPage {

    public elementhelper helper;
    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
       helper= new elementhelper(driver);

    }
    public void  enterLoginDetails(String username, String password)
    {
        WebElement usernameinput = helper.getElementByID("username");

        usernameinput.clear();

        usernameinput.sendKeys(username);
        helper.getElementByID("bx-continue").click();
        WebElement passwordinput = helper.getElementByID("password");
        passwordinput.clear();
        passwordinput.sendKeys(password);

    }
    public void clickLogin()
    {
        helper.getElementByXpath("//button[@type='submit']").click();
    }
    public String getPageTitle()
    {
      return driver.getTitle();
    }
    public WebElement getErrorMsg(){
       return helper.getElementByXpath("//span[contains(.,'The user name or password is incorrect.')]");
    }


}

