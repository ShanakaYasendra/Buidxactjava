package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.elementhelper;

public class CreateUserPage {

    WebDriver driver;
    private elementhelper helper;

    public CreateUserPage(WebDriver driver)
    {
        this.driver= driver;
        helper= new elementhelper(driver);
    }
    public void  EnterFirstName(String firstName)
    {
       WebElement firstNameInt = helper.getElementByXpath("//input[contains(@ng-model,'vm.user.firstName')]");
       firstNameInt.clear();
       firstNameInt.sendKeys(firstName);
    }
    public void EnterLastName(String lastName)
    {
        WebElement lastNameInt = helper.getElementByXpath("//input[@ng-model='vm.user.lastName']");
        lastNameInt.clear();
        lastNameInt.sendKeys(lastName);


    }
    public void EnterEmail(String email)
    {
        WebElement emailInt = helper.getElementByXpath("//input[contains(@type,'email')]");
        emailInt.clear();
        emailInt.sendKeys(email);
    }
    public void EnterMaobile(String mobile)
    {
        WebElement mobileInt = helper.getElementByID("phone");
        mobileInt.clear();
        mobileInt.sendKeys(mobile);
    }
    public void ClickCreate()
    {
       helper.getElementByXpath("//button[@type='button'][contains(.,'OK')]").click();

    }

    public WebElement GetFirstName()
    {
        return helper.getElementByXpath("//input[contains(@ng-model,'vm.user.firstName')]");
    }
    public void ClickAdd()
    {
        helper.getElementByXpath("//button[contains(@ng-click,'vm.addUser()')]").click();
    }

}
