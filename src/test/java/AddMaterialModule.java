import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pagefactory.DevicesPage;
import pagefactory.HomePage;
import pagefactory.NewMaterialPage;

public class AddMaterialModule {
    HomePage homePage;
    DevicesPage devicesPage;
    NewMaterialPage newMaterialPage;


    //    // connect to Scanner not connected before
    @Test(priority = 1)
    public void connectToScanner() throws InterruptedException {
        homePage = new HomePage((AndroidDriver) MainTestRunner.Driver);
        devicesPage = new DevicesPage((AndroidDriver) MainTestRunner.Driver);
        newMaterialPage = new NewMaterialPage((AndroidDriver) MainTestRunner.Driver);

        homePage.ClickOnAddMaterialBtn();
        newMaterialPage.EnterMaterialName("Automation");
        newMaterialPage.ClickOnMaterialImageBox();
        newMaterialPage.ClickOnCancelPhotoBtn();
        newMaterialPage.ClickOnMaterialImageBox();
        newMaterialPage.ClickOnTakePhotoBtn();
        newMaterialPage.ClickOnTakePhotoCameraBtn();
        newMaterialPage.ClickOnSavePhotoCameraBtn();
        newMaterialPage.ClickOnNextBtn();
        newMaterialPage.EnterSampleName("Automation Sample");
        newMaterialPage.EnterScanTime("2");
        newMaterialPage.EnterIntervalTime("2");
        newMaterialPage.EnterNumOfMeasurements("2");
        newMaterialPage.ClickOnCalibrateBtn();
        newMaterialPage.ClickOnScanBtn();


    }
}
