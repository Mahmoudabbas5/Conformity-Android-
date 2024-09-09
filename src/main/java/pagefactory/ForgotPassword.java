package pagefactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class ForgotPassword {
    WebDriverWait wait;
    AppiumDriver driver;

    public ForgotPassword(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //-------------Elements-----------------------------------------
    // Forgot Password Back Button
    @AndroidFindBy(id = "com.neospectracollect:id/back_btn")
    private WebElement ForgotPasswordBackButton;

    // Forgot Password Text
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/txt_email")
    public WebElement ForgotPasswordText;

    // Forgot Password Submit Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_submit")
    private WebElement ForgotPasswordSubmitButton;


    //-----------Functions------------------------------------
    /// Function is element displayed
    public boolean isElementDisplayed(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return element.isDisplayed();

    }

    //// function to click
    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }
    private String getText(WebElement element) {
        return element.getAttribute("text");
    }
    //--------------Actions--------------



    // Forgot Password Back Button Is Displayed
    public boolean ForgotPasswordBackButtonIsDisplayed()
    {
        return isElementDisplayed(ForgotPasswordBackButton);
    }


    public boolean ForgotPasswordTextIsDisplayed()
    {
        return isElementDisplayed(ForgotPasswordText);
    }
    // Click Forgot Password Back Button
    public void ClickForgotPasswordBackButton()
    {
        clickElement(ForgotPasswordBackButton);
    }

    // Forgot Password Submit Button Is Displayed
    public boolean ForgotPasswordSubmitButtonIsDisplayed()
    {
        return isElementDisplayed(ForgotPasswordSubmitButton);
    }

    // Click Forgot Password Submit Button
    public void ClickForgotPasswordSubmitButton()
    {
        clickElement(ForgotPasswordSubmitButton);

    }

    // public void sendKeys(By locator, String text){driver.findElement(locator).sendKeys(text);}
    //public void insertEmail(){driver.findElement((By) ForgotPasswordText).sendKeys("mahmoud.abbas@si-ware.com");}

    public void EnterEmailField(String Email){
        wait.until(ExpectedConditions.visibilityOf(ForgotPasswordText));
        ForgotPasswordText.sendKeys(Email);
    }
    public void clickOnEmailField(){
        wait.until(ExpectedConditions.visibilityOf(ForgotPasswordText));
        clickElement(ForgotPasswordText);
    }





}
