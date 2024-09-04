package pagefactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DevicesPage extends MethodHandles {
    WebDriverWait wait;
    AndroidDriver driver;


    public DevicesPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    //------------Locators--------------------------------------------
    //first device in list of devics
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/device_image")
    private WebElement deviceOneBtn;

    // Cancel Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/cancel_btn")
    private WebElement CancelBtn;


    @AndroidFindBy(id = "com.neospectra.conformityapp:id/warning_text")
    private WebElement NoDeviceMessage;
    // __________Actions__________

    // Cancel Btn
    public void ClickOnCancelBtn(){clickElement(CancelBtn);}
    public boolean CancelBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(CancelBtn));
        return CancelBtn.isDisplayed();}

    // Device
    public void ClickOnDevice(){clickElement(deviceOneBtn);}
    public boolean DeviceIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(deviceOneBtn));
        return deviceOneBtn.isDisplayed();}

//No Device Message

    public boolean NoDeviceMessageIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(NoDeviceMessage));
        return NoDeviceMessage.isDisplayed();}
}

