import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactory.DevicesPage;
import pagefactory.HomePage;
import pagefactory.ScanPage;

public class ScanModule {
    HomePage homePage;
    DevicesPage devicesPage;
    ScanPage scanPage;

    //    // connect to Scanner not connected before
    @Test(priority = 1)
    public void Scan() throws InterruptedException {
        homePage = new HomePage((AndroidDriver) MainTestRunner.Driver);
        devicesPage = new DevicesPage((AndroidDriver) MainTestRunner.Driver);
        scanPage = new ScanPage((AndroidDriver) MainTestRunner.Driver);
        // Cancel Connection
        homePage.ClickOnMaterialOne();
        Assert.assertTrue(scanPage.CalibrationMessageIsDisplayed());
        scanPage.ClickOnCalibrateBtn();
        Thread.sleep(3000);
        scanPage.EnterSampleName("Automation");
        scanPage.ClickOnScanBtn();
        scanPage.ClickOnScanBtn();
        scanPage.ClickOnScanBtn();
        scanPage.ClickOnScanBtn();
        scanPage.ClickOnShareBtn();
        Assert.assertTrue(scanPage.FileNameIsDisplayed());
    }
}
