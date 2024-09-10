package pagefactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditPage extends MethodHandles {
    WebDriverWait wait;
    AndroidDriver driver;

    public EditPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    // Back To Home Page
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/back_btn")
    private WebElement BackToHomePageBtn;
    //Add New Sample Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_add_new_scan")
    private WebElement AddNewSampleBtn;
    // Save Material Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_save_material")
    private WebElement SaveMaterialBtn;

    // Delete Sample  Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/img_delete")
    private WebElement DeleteSampleBtn;
    // Cancel Delete Btn
    @AndroidFindBy(id = "android:id/button2")
    private WebElement CancelDeleteBtn;
    // Delete Delete Btn
    @AndroidFindBy(id = "android:id/button1")
    private WebElement DeleteDeleteBtn;

    // Update Ci Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/tv_update_ci")
    private WebElement UpdateCiBtn;

    // Save Update Ci
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_save")
    private WebElement SaveUpdateCiBtn;
    // Cancel Update Ci
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_cancel")
    private WebElement CancelUpdateCiBtn;
    //Ci Field
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/et_ci")
    private WebElement CiField;

    // Cancel Create Material
    @AndroidFindBy(id = "android:id/button2")
    private WebElement CancelCreateModelButton;
    // Finish Create Material
    @AndroidFindBy(id = "android:id/button2")
    private WebElement FinishCreateModelButton;
    // Delete Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/img_delete")
    private WebElement DeleteBtn;
    // Calibrate Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_calibrate")
    private WebElement CalibrateBtn;
    //Scan Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_start")
    private WebElement ScanBtn;


    // SampleCheck Box
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/chk_measurement")
    private WebElement SampleCheckBox;
    // Sample Arrow
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/img_arrow")
    private WebElement SampleArrow;
    // X axis Cm Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/cm")
    private WebElement XaxisCmButton;
    // X axis nm
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/nm")
    private WebElement XaxisnmButton;
    // Yaxis Abs Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/abs")
    private WebElement YaxisAbsButton;
    //Yaxis-%
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/percentage")
    private WebElement YaxisPercentageButton;

    @AndroidFindBy(id = "com.neospectra.conformityapp:id/textView_title")
    private WebElement UpdateCiTitle;
// Error Message for CI value
    @AndroidFindBy(xpath = "//android.widget.Toast[@text=\"minimum CI is 4 and maximum is 10\"]")
    private WebElement InvalidErrorMessageCiValue;
// Error message click on Delete
    @AndroidFindBy(xpath = "//android.widget.Toast[@text=\"Select measurement to be deleted\"]")
    private WebElement ErrorMessageDelete;
// Error Message Samples Less than two
    @AndroidFindBy(id = "android:id/message")
    private WebElement ErrorMessageSaveMaterialWithSampleLessThanTwo;
//Ok Btn
    @AndroidFindBy(id = "android:id/button2")
    private WebElement OkBtn;
    // Discard Model Message
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/alertTitle")
    private WebElement DiscardModelTitle;
    // Cancel Discard Model
    @AndroidFindBy(id = "android:id/button2")
    private WebElement CancelDiscardModelBtn;
    // Yes Discard Model Btn
    @AndroidFindBy(id = "android:id/button1")
    private WebElement YesDiscardModelBtn;


//--------------------Actions----------------

// Click On Calibrate Btn

    public void ClickOnCalibrateBtn(){clickElement(CalibrateBtn);}

    // Click On Scan Btn
    public void ClickOnScanBtn(){clickElement(ScanBtn);}
    // Click on cm X ais
    public void ClickOnXaxiscm(){clickElement(XaxisCmButton);}
    // Click on nm X ais
    public void ClickOnXaxisnm(){clickElement(XaxisnmButton);}
    // Click on Abs Y axis
    public void ClickOnYaxispAbs(){clickElement(YaxisAbsButton);}
    // Click on Percentage Y axis

    public void ClickOnYaxisPercentage(){clickElement(YaxisPercentageButton);}

    // Click on Add new Sample
    public void ClickOnAddNewSampleBtn(){clickElement(AddNewSampleBtn);}
    // Click on Sample Check Box
    public void ClickOnSampleCheckBox(){clickElement(SampleCheckBox);}
    // Click on Delete Btn
    public void ClickOnSampleDeleteBtn(){clickElement(DeleteBtn);}
    // Click on Cancel Delete
    public void ClickOnSampleCancelDeleteBtn(){clickElement(CancelDeleteBtn);}
    //Click on Confirm Delete
    public void ClickOnSampleConfirmDeleteBtn(){clickElement(DeleteDeleteBtn);}
    // Click on Save Material Btn
    public void ClickOnSaveMaterialBtn(){clickElement(SaveMaterialBtn);}
    // Click on Cancel create Btn
    public void ClickOnCancelCreateModelBtn(){clickElement(CancelCreateModelButton);}

    // Click on Finish create Btn
    public void ClickOnFinishCreateModelBtn(){clickElement(FinishCreateModelButton);}
    //Click on Back Btn
    public void ClickOnBackBtn(){clickElement(BackToHomePageBtn);}
    //Click on Discard btn
    public void ClickOnYesDiscardBtn(){clickElement(YesDiscardModelBtn);}
    //Click on Cancel Discard btn
    public void ClickOnCancelDiscardBtn(){clickElement(CancelDiscardModelBtn);}



    // Click on Update Ci
    public void ClickOnUpdateCiBtn(){clickElement(UpdateCiBtn);}
    // Click on Save Update Ci
    public void ClickOnSaveUpdateCiBtn(){clickElement(SaveUpdateCiBtn);}
    // Click on Cancel Update Ci
    public void ClickOnCancelUpdateCiBtn(){clickElement(CancelUpdateCiBtn);}


}
