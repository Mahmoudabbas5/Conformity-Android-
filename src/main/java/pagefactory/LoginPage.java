package pagefactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class LoginPage extends MethodHandles {

    WebDriverWait wait;
    AndroidDriver driver;









    public LoginPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    String getText(WebElement element) {
        return element.getAttribute("text");
    }
//----------------------------------------------------Elements----------------------------------------------------//

    // Si-ware Logo element
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/iv_logo")
    private WebElement Logo;

    // User Email Field
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/txt_email")
    private WebElement UserEmailField;

    // User Password Field
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/txt_password")
    private WebElement UserPasswordField;

    // Show and hide Password icon
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/img_password")
    private WebElement ShowAndHidePasswordButton;

    // Login Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_submit")
    private WebElement LoginButton;

    //Forget password Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/forget_password")
    private WebElement ForgetPassWordButton;



    @AndroidFindBy(xpath = "//android.widget.Toast[@text=\"Please enter a valid email\"]")
    private WebElement InvalidEmailMessage;

    @AndroidFindBy(xpath = "//android.widget.Toast[@text=\"Please Enter Valid Login Details\"]")
    private WebElement InvalidLoginDetailsMessage;




    //-----------------------------------Actions__________________
    public boolean isElementDisplayed(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    // logo is displayed
    public boolean LogoDisplayed()
    {
        return isElementDisplayed(Logo);
    }

    // User Email Field is displayed
    public boolean UserEmailFieldDisplayed ()
    {
        return isElementDisplayed(UserEmailField);
    }

    // Enter User Email
    public void EnterUserEmailField(String Email)
    {
        wait.until(ExpectedConditions.visibilityOf(UserEmailField));
        UserEmailField.sendKeys(Email);
    }

    // Click user email Button
    public void ClickUserEmailField()
    {
        wait.until(ExpectedConditions.elementToBeClickable(UserEmailField));
        UserEmailField.click();
    }

    // Clear User Email
    public void ClearUserEmailField()
    {
        wait.until(ExpectedConditions.visibilityOf(UserEmailField));
        UserEmailField.clear();
    }

    public boolean UserPasswordFieldIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(UserPasswordField));
        return UserPasswordField.isDisplayed();
    }

    // Enter User Password Field
    public void EnterUserPasswordField(String Password){
        wait.until(ExpectedConditions.visibilityOf(UserPasswordField));
        UserPasswordField.sendKeys(Password);
    }

    // Clear User Password Field
    public void ClearUserPasswordField()
    {
        wait.until(ExpectedConditions.visibilityOf(UserPasswordField));
        UserPasswordField.clear();
    }

    // Get user password field
    public String GetUserPasswordField()
    {
        wait.until(ExpectedConditions.visibilityOf(UserPasswordField));
        return UserPasswordField.getText();
    }

    // Get user email field
    public String GetUserEmailField()
    {
        wait.until(ExpectedConditions.visibilityOf(UserEmailField));
        return UserEmailField.getText();
    }


    // Show And Hide Password Button Is Displayed
    public boolean ShowAndHidePasswordButtonIsDisplayed()
    {
        return isElementDisplayed(ShowAndHidePasswordButton);
    }

    // Click Show And Hide Password Button
    public void ClickShowAndHidePasswordButton()
    {
        wait.until(ExpectedConditions.visibilityOf(ShowAndHidePasswordButton));
        ShowAndHidePasswordButton.click();
    }

    // Login Button Is Displayed
    public boolean LoginButtonIsDisplayed()
    {

        return isElementDisplayed(LoginButton);
    }

    // Click Login Button
    public void ClickLoginButton()
    {
        clickElement(LoginButton);

    }

    // Forgot Password Button Is Displayed
    public boolean ForgotPasswordButtonIsDisplayed()
    {
        return isElementDisplayed(ForgetPassWordButton);
    }

    // Click Forgot Password Button
    public void  ClickForgotPasswordButton() {
        wait.until(ExpectedConditions.visibilityOf(ForgetPassWordButton));
        ForgetPassWordButton.click();



    }
    public String getInsertedPass(){
        wait.until(ExpectedConditions.visibilityOf(UserPasswordField));
        return UserPasswordField.getAttribute("text");
    }


    public boolean invalidCredentialMessageIsDisplayed ()
    {
        return isElementDisplayed(InvalidLoginDetailsMessage);
    }

    public boolean invalidEmailMessageIsDisplayed ()
    {
        return isElementDisplayed(InvalidEmailMessage);
    }


}
