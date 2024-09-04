package pagefactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckMailPage {
    WebDriverWait wait;
    WebDriver driver;

    public CheckMailPage(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    //-----------------Elements-------------------------------------------------
    // Mail not received send it again button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/send_it_again_btn")
    private WebElement SendMailAgainButton;

    // Done Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_done")
    private WebElement DoneButton;

    // Check Mail Logo
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/forget_password_text")
    public WebElement CheckMailLogo;
    //_______________________Functions__________________

    /// Function is element displayed
    private boolean isElementDisplayed(WebElement element)
    {
        wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        return element.isDisplayed();

    }
    //// function to click
    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }
    String getText(WebElement element) {
        return element.getAttribute("text");
    }
    // ______________________________________Actions____________________

    public boolean SendMailAgainButtonIsDisplayed()
    {
        return isElementDisplayed(SendMailAgainButton);
    }
    public boolean CheckMailIsDisplayed()
    {
        return isElementDisplayed(CheckMailLogo);
    }


    // Click Send Mail Again Button
    public void ClickSendMailAgainButton()
    {
        clickElement(SendMailAgainButton);
    }

    // Done Button Is Displayed
    public boolean DoneButtonIsDisplayed()
    {
        return isElementDisplayed(DoneButton);
    }

    // Click Done Button
    public void ClickDoneButton()
    {
        clickElement(DoneButton);

    }
}

