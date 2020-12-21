package page;

import org.openqa.selenium.WebDriver;
import util.elementhelper;

public class HomePage {

    public elementhelper helper;
    public WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver= driver;
        helper= new elementhelper(driver);
    }

    //public IWebElement profileClass => elementHelper.GetElementByClassName("sidebar-v2-link my-business");
    public String getpagetitle()
    {
        if (helper.getElementByID("my-business-button").isDisplayed())
        {
            return driver.getTitle();
        }
        else
        {
            return null;
        }
    }

    public  void ClickConfirmation()
    {
        helper.getElementByCSS(".swal2-confirm").click();
    }
}
