import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactory.HomePage;
import pagefactory.SideMenuPage;

public class SideMenuModule {
    HomePage homePage;
    SideMenuPage sideMenuPage;

    //    -----About --------
    @Test(priority = 0)
    public void About() throws InterruptedException {
        homePage = new HomePage(MainTestRunner.Driver);
        sideMenuPage = new SideMenuPage(MainTestRunner.Driver);
        homePage.ClickOnSideMenuBtn();
        sideMenuPage.ClickOnAboutBtn();
        Assert.assertTrue(sideMenuPage.CloseAboutBtnIsDisplayed());
        sideMenuPage.ClickOnCloseAboutBtn();

    }

    // ------------ Logout-------------

    @Test(priority = 0)
    public void LogOut() throws InterruptedException {
        homePage = new HomePage(MainTestRunner.Driver);
        sideMenuPage = new SideMenuPage(MainTestRunner.Driver);
//        homePage.ClickOnSideMenuBtn();
        sideMenuPage.ClickOnLogoutBtn();
        sideMenuPage.LogoutMessageIsDisplayed();
        sideMenuPage.ClickOnCancelLogoutBtn();
        sideMenuPage.ClickOnLogoutBtn();
        sideMenuPage.ClickOnLogoutLogoutBtn();

    }
}
