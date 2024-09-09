package pagefactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HistoryPage extends MethodHandles{
    WebDriverWait wait;
    AndroidDriver driver;

    public HistoryPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    // First Material
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/material_name_text")
    private WebElement FirstMaterial;

    // First sample
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/sample_name_text")
    private WebElement FirstSample;
    // Result Title
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/title")
    private WebElement ResultTitle;

    @AndroidFindBy(id = "com.neospectra.conformityapp:id/back_btn")
    private WebElement BackToHomePageBtn;

    //------------ Actions----------------------------
    // Click on First Material in History Page
    public void ClickOnFirstMaterial(){clickElement(FirstMaterial);}

    // Click on First Sample in First Material in History Page

    public void ClickOnFirstSample(){clickElement(FirstSample);}


    public boolean ResultTitleIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(ResultTitle));
        return ResultTitle.isDisplayed();
    }

    public void ClickOnBackBtn(){clickElement(BackToHomePageBtn);}
}
