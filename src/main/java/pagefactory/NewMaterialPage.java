package pagefactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewMaterialPage extends MethodHandles {
    WebDriverWait wait;
    AndroidDriver driver;

    public NewMaterialPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    // --------------------Locators--------------
    // Material Name Box
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/material_name_edit_text")
    private WebElement MaterialNameBox;


    @AndroidFindBy(id = "com.neospectra.conformityapp:id/back_btn")
    private WebElement BackToHomePageBtn;

    //Material Image
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/material_image")
    private WebElement MaterialImageBox;
    //TakePhoto Btn
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Take photo\"]")
    private WebElement TakePhotoBtn;
    // Cancel Take Photo Btn
    @AndroidFindBy(id = "android:id/button2")
    private WebElement CancelTakePhoto;
    //Choose From Gallery Btn
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Choose from Gallery\"]")
    private WebElement ChooseFromGalleryBtn;
    // TakePhotoBtn
    @AndroidFindBy(id = "com.oplus.camera:id/shutter_button")
    private WebElement TakePhotoCamera;
    // Photo Save
    @AndroidFindBy(id = "com.oplus.camera:id/done_button")
    private WebElement SavePhotoCamera;

    @AndroidFindBy(id = "com.oplus.camera:id/done_button")
    private WebElement CancelSavePhotoCamera;

    //.   Next Button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/next_button")
    private WebElement NextButton;
    // Sample NAme
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/sample_name_edit_text")
    private WebElement SampleNameBox;

    // ScanTime Box
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/scan_time_edit_text")
    private WebElement ScanTimeBox;
    // IntervalTime Box
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/interval_edit_text")
    private WebElement IntervalTimeBox;
    // Number ofMeasurements Box
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/no_of_measurements_edit_text")
    private WebElement NumberOfMeasurementsBox;
    // Calibrate Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_calibrate")
    private WebElement CalibrateBtn;
    //Scan Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_start")
    private WebElement ScanBtn;

    //Add New Sample Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_add_new_scan")
    private WebElement AddNewSampleBtn;
    // Save Material Btn
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_save_material")
    private WebElement SaveMaterialBtn;
    // Warning Message
    @AndroidFindBy(id = "android:id/message")
    private WebElement WarningMessageSampleLessThan2;
    //OK Btn Warning Message
    @AndroidFindBy(id = "android:id/button2")
    private WebElement WarningMessageOkBtn;
   // Delete Btn
   @AndroidFindBy(id = "com.neospectra.conformityapp:id/img_delete")
   private WebElement DeleteBtn;
   // Cancel Delete Btn
   @AndroidFindBy(id = "android:id/button2")
   private WebElement CancelDeleteBtn;
// Delete Delete Btn
@AndroidFindBy(id = "android:id/button1")
private WebElement DeleteDeleteBtn;
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
    // Cancel create Material
    @AndroidFindBy(id = "android:id/button2")
    private WebElement CancelCreateModelButton;
// Finish Create Material
    @AndroidFindBy(id = "android:id/button2")
    private WebElement FinishCreateModelButton;
    //--------------------Actions----------------
    //EnterMaterial Name
    public void EnterMaterialName(String MaterialName)
    {
        wait.until(ExpectedConditions.visibilityOf(MaterialNameBox));
        MaterialNameBox.sendKeys(MaterialName);
    }

    //Click On Material Image

    public void ClickOnMaterialImageBox(){clickElement(MaterialImageBox);}

    // ClickOn Take Photo Btn
    public void ClickOnTakePhotoBtn(){clickElement(TakePhotoBtn);}
    // ClickOn Take Photo Camera
    public void ClickOnTakePhotoCameraBtn(){clickElement(TakePhotoCamera);}

    // ClickOn Save Photo Camera
    public void ClickOnSavePhotoCameraBtn(){clickElement(SavePhotoCamera);}

    // ClickOn Cancel Take Photo
    public void ClickOnCancelPhotoBtn(){clickElement(CancelTakePhoto);}
    // Click On Next Btn
    public void ClickOnNextBtn(){clickElement(NextButton);}

    // Send Sample Name to Sample Name Box
    public void EnterSampleName(String SampleName)
    {
        wait.until(ExpectedConditions.visibilityOf(SampleNameBox));
        SampleNameBox.sendKeys(SampleName);
    }

    // Send Scan Time
    public void EnterScanTime(String ScanTime)
    {
        wait.until(ExpectedConditions.visibilityOf(ScanTimeBox));
        ScanTimeBox.sendKeys(ScanTime);
    }
    // Clear Scan Time
    public void ClearScanTimeBox()
    {
        wait.until(ExpectedConditions.visibilityOf(ScanTimeBox));
        ScanTimeBox.clear();
    }

    // Send Interval Time
    public void EnterIntervalTime(String ScanTime)
    {
        wait.until(ExpectedConditions.visibilityOf(IntervalTimeBox));
        IntervalTimeBox.sendKeys(ScanTime);
    }
    // Clear Interval Time
    public void ClearIntervalTimeBox()
    {
        wait.until(ExpectedConditions.visibilityOf(IntervalTimeBox));
        IntervalTimeBox.clear();
    }
    // Send Num of Measurements
    public void EnterNumOfMeasurements(String ScanTime)
    {
        wait.until(ExpectedConditions.visibilityOf(NumberOfMeasurementsBox));
        NumberOfMeasurementsBox.sendKeys(ScanTime);
    }
    // Clear Num of Measurements
    public void ClearNumberOfMeasurements()
    {
        wait.until(ExpectedConditions.visibilityOf(NumberOfMeasurementsBox));
        NumberOfMeasurementsBox.clear();
    }

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






}

