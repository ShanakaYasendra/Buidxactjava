package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.elementhelper;

public class ResetPasswordPage {

    WebDriver driver;
    elementhelper helper;

    public ResetPasswordPage(WebDriver driver)
    {
        this.driver=driver;
        helper= new elementhelper(driver);
    }

    public void EnterNewPassword(String newPassword)
    {

        helper.getElementByID("pswd").sendKeys(newPassword);





    }
    public void  ConfirmPassword(String password)
    {
        helper.getElementByID("pswd-rpt").sendKeys(password);
    }
    public void  ClickConfirm(){
        helper.getElementByXpath("//button[@type='submit']").click();
    }
}
