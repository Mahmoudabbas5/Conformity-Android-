package pagefactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScanPage extends MethodHandles {
    WebDriverWait wait;
    AndroidDriver driver;


    public ScanPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }
    // Calibrate Message
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/scan_instruction_text")
    private WebElement CalibrateMessage;
    // Calibrate Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_calibrate")
    private WebElement CalibrateBtn;

    // Back To Home
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/back_btn")
    private WebElement BackBtn;

    // Sample name Field
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/sample_id_edit_text")
    private WebElement SampleNameField;

    // Scan Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/scan_button")
    private WebElement ScanButton;

    // Share Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/share_button")
    private WebElement ShareButton;

    // Shared File
    @AndroidFindBy(id = "android:id/content_preview_filename")
    private WebElement FileName;
    // Done Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/scan_button")
    private WebElement DoneButton;

//-----------------------Actions--------------------
// Enter Sample Name
    public void EnterSampleName(String SampleName)
    {
        wait.until(ExpectedConditions.visibilityOf(SampleNameField));
        SampleNameField.sendKeys(SampleName);
    }

    // Click on Calibrate
    public void ClickOnCalibrateBtn(){clickElement(CalibrateBtn);}

    // Calibration Message Is Displayed
    public boolean CalibrationMessageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(CalibrateMessage));
        return CalibrateMessage.isDisplayed();
    }
    // Click on Scan Btn
    public void ClickOnScanBtn(){clickElement(ScanButton);}

    //Click on Done Btn
    public void ClickOnDoneBtn(){clickElement(DoneButton);}

    // Click On Back Button
    public void ClickOnBackBtn(){clickElement(BackBtn);}

    // Click On Share Btn
    public void ClickOnShareBtn(){clickElement(ShareButton);}

    // File NAme
    public boolean FileNameIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(FileName));
        return FileName.isDisplayed();
    }



}
