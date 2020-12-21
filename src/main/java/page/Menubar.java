package page;

import org.openqa.selenium.WebDriver;
import util.elementhelper;

public class Menubar {

    public elementhelper helper;
    public WebDriver driver;
    public Menubar(WebDriver driver){
        this.driver= driver;
        helper= new elementhelper(driver);
    }
    public void LogOut()
    {

        helper.getElementByXpath("//header[@ng-click='vm.fnSignOut()'][contains(.,'Log Out')]").click();
        helper.getElementByCSS(".swal2-confirm").click();
        //return new LoginPage();

    }
    public void ClickProfile()
    {
        helper.getElementByXpath("//span[@class='title'][contains(.,'My Profile')]").click();
    }
    public void ResetPassword()
    {

        helper.getElementByXpath("//button[@type='button'][contains(.,'Reset Password')]").click();

    }
    public void ClickBusiness()
    {
        helper.getElementByXpath("//span[@class='title'][contains(.,'My Business')]").click();
    }

    public void clickUsers()
    {
        helper.getElementByXpath("//label[contains(.,'Users')]").click();
    }

    public void ClickConfirmation() {
        helper.getElementByCSS(".swal2-confirm").click();
    }
}
