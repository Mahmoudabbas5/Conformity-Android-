package pagefactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.MethodHandles;



import java.time.Duration;

public class HomePage extends MethodHandles {
    WebDriverWait wait;
    AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    //----------------Locators------------------
    //connect to device button
    @AndroidFindBy(id = "com.neospectra.conformityapp:id/btn_connect")
    private WebElement connectButton;

   // Side Menu Btn
   @AndroidFindBy(id = "com.neospectra.conformityapp:id/img_menu")
   private WebElement SideMenuButton;

   // Add Material Btn
   @AndroidFindBy(id = "com.neospectra.conformityapp:id/fab_addMaterial")
   private WebElement AddMaterialButton;

   // Edit Material Btn
   @AndroidFindBy(xpath = "(//android.widget.Button[@resource-id=\"com.neospectra.conformityapp:id/options_btn\"])[1]")
   private WebElement EditMaterialButton;

    @AndroidFindBy(id = "android:id/title")
    private WebElement EditEditMaterialButton;

// History Btn
@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.neospectra.conformityapp:id/navigation_bar_item_icon_view\"])[2]")
private WebElement HistoryButton;

     // Home Btn
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.neospectra.conformityapp:id/navigation_bar_item_icon_view\"])[1]")
    private WebElement HomeButton;


    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Image\"])[1]")
    private WebElement MaterialOne;

    // Cancel Disconnect Btn
    @AndroidFindBy(id = "android:id/button2")
    private WebElement CancelDisconnectButton;

     // Disconnect Btn
    @AndroidFindBy(id = "android:id/button1")
    private WebElement DisconnectDisconnectButton;
   // Disconnect Message
    @AndroidFindBy(id = "android:id/message")
    private WebElement DisconnectMessage;
  // Connected device
  @AndroidFindBy(id = "com.neospectra.conformityapp:id/device_image")
  private WebElement ConnectedDevice;

  // Home Bar Btn
  @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.neospectra.conformityapp:id/navigation_bar_item_icon_view\"])[1]")
  private WebElement HomeBtn;

// History Btn
@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.neospectra.conformityapp:id/navigation_bar_item_icon_view\"])[2]")
private WebElement HistoryBtn;
    //_______________Actions______________________

    // Click on Side Menu Btn

    public void ClickOnSideMenuBtn(){clickElement(SideMenuButton);}
    public boolean SideMenuBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(SideMenuButton));
        return SideMenuButton.isDisplayed();}

// Add Material Btn
   public void ClickOnAddMaterialBtn(){clickElement(AddMaterialButton);}
    public boolean AddMaterialBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(AddMaterialButton));
        return AddMaterialButton.isDisplayed();}


    // Connect Btn

    public void ClickOnConnectBtn(){clickElement(connectButton);}
    public boolean ConnectBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(connectButton));
        return connectButton.isDisplayed();}

// Click On Edit Material

    public void ClickOnEditBtn(){clickElement(EditMaterialButton);}
    public boolean EditMaterialBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(EditMaterialButton));
        return EditMaterialButton.isDisplayed();}

    // Click On Edit Edit Material
    public void ClickOnEditEditBtn(){clickElement(EditEditMaterialButton);}
    public boolean EditEditMaterialBtnIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(EditEditMaterialButton));
        return EditEditMaterialButton.isDisplayed();}

    // Disconnect Actions

    public void ClickOnCancelDisconnectBtn(){clickElement(CancelDisconnectButton);}
    public void ClickOnDisconnectBtn(){clickElement(DisconnectDisconnectButton);}
    public void ClickOnConnectedDevice(){clickElement(ConnectedDevice);}

    public boolean DisconnectMessageIsDisplayed(){ wait.until(ExpectedConditions.visibilityOf(DisconnectMessage));
        return DisconnectMessage.isDisplayed();}

}