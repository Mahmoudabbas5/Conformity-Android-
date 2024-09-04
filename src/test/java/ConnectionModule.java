import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactory.DevicesPage;
import pagefactory.HomePage;
import pagefactory.LoginPage;

public class ConnectionModule extends Credentials {
    HomePage homePage;
    DevicesPage devicesPage;

//    // connect to Scanner not connected before
    @Test(priority = 1)
    public void connectToScanner() throws InterruptedException {
        homePage = new HomePage((AndroidDriver) MainTestRunner.Driver);
        devicesPage = new DevicesPage((AndroidDriver) MainTestRunner.Driver);
        // Cancel Connection
        homePage.ClickOnConnectBtn();
        devicesPage.ClickOnCancelBtn();
        homePage.ClickOnConnectBtn();

        try {

            devicesPage.ClickOnDevice();
        }catch (Exception e) {


            Assert.assertTrue(devicesPage.NoDeviceMessageIsDisplayed());
            devicesPage.ClickOnCancelBtn();
        }
    }

//    @Test
//    public void disconnectScanner(){
//        homePage = new HomePage((AndroidDriver) MainTestRunner.Driver);
//        devicesPage = new DevicesPage((AndroidDriver) MainTestRunner.Driver);
//        // Cancel Disconnect
//        homePage.ClickOnConnectedDevice();
//        Assert.assertTrue(homePage.DisconnectMessageIsDisplayed());
//        homePage.ClickOnCancelDisconnectBtn();
//        // Disconnect Device
//        homePage.ClickOnConnectedDevice();
//        Assert.assertTrue(homePage.DisconnectMessageIsDisplayed());
//        homePage.ClickOnDisconnectBtn();
//        Assert.assertTrue(homePage.ConnectBtnIsDisplayed());
//    }
}
