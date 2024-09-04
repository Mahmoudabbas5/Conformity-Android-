package pagefactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SideMenuPage extends MethodHandles {
    AppiumDriver driver;
    WebDriverWait wait;

    public SideMenuPage(io.appium.java_client.android.AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AndroidFindBy(id = "com.neospectra.conformityapp:id/tv_menu_about")
    private WebElement AboutButton;

    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_okay")
    private WebElement CloseAboutButton;

    @AndroidFindBy(id = "com.neospectra.conformityapp:id/tv_menu_logout")
    private WebElement LogOutButton;

    @AndroidFindBy(id = "android:id/message")
    private WebElement LogOutMessage;

    @AndroidFindBy(id = "android:id/button2")
    private WebElement CancelLogOut;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement LogoutLogOut;

    //_______Actions ________

    // About Btn
    public void ClickOnAboutBtn(){clickElement(AboutButton);}
    public boolean AboutBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(AboutButton));
        return AboutButton.isDisplayed();}

    public void ClickOnCloseAboutBtn(){clickElement(CloseAboutButton);}
    public boolean CloseAboutBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(CloseAboutButton));
        return CloseAboutButton.isDisplayed();}

    // Logout
    public void ClickOnLogoutBtn(){clickElement(LogOutButton);}
    public boolean LogoutBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(LogOutButton));
        return LogOutButton.isDisplayed();}
// Logout Message
    public boolean LogoutMessageIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(LogOutMessage));
        return LogOutMessage.isDisplayed();}
// Cancel Logout
   public void ClickOnCancelLogoutBtn(){clickElement(CancelLogOut);}

// Logout Logout
public void ClickOnLogoutLogoutBtn(){clickElement(LogoutLogOut);}

}
