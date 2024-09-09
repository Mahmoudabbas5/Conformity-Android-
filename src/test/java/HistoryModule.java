import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactory.DevicesPage;
import pagefactory.HistoryPage;
import pagefactory.HomePage;

public class HistoryModule {
    HistoryPage historyPage;
    HomePage homePage;

    @Test(priority = 1)
    public void historyTest() throws InterruptedException {
        homePage = new HomePage((AndroidDriver) MainTestRunner.Driver);
        historyPage = new HistoryPage((AndroidDriver) MainTestRunner.Driver);

        homePage.ClickOnHistoryButton();
        historyPage.ClickOnFirstMaterial();
        historyPage.ClickOnFirstSample();
        Assert.assertTrue(historyPage.ResultTitleIsDisplayed());
        historyPage.ClickOnBackBtn();
        historyPage.ClickOnBackBtn();
        homePage.ClickOnHomeButton();
    }
}
