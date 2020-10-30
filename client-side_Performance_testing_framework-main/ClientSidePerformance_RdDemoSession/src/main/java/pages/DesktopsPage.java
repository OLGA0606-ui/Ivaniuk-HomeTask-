package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DesktopsPage extends AbstractPage{
    public DesktopsPage() { super(); }

    @FindBy(xpath = "//ul[@class = 'sublist']//a[@href='/desktops']")
    private WebElement pressDesktopsButton;

    @FindBy(xpath = "//h2[@class = 'product-title']//a[@href='/lenovo-ideacentre-600-all-in-one-pc']")
    private WebElement pressFirstDesktopOnThePage;
    public DesktopsPage openDesktopsPage() {
        pressDesktopsButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(pressDesktopsButton));
        waitUntilPageIsFullyLoaded(wait);
        perfNavigationTiming.writeToInflux("DesktopsPage");
        return this;
    }
    public DesktopsPage openFirstDesktopInThePage(){
        computersTitle.click();
        wait.until(ExpectedConditions.elementToBeClickable(pressFirstDesktopOnThePage));
        waitUntilPageIsFullyLoaded(wait);
        perfNavigationTiming.writeToInflux("DesktopsPage");
        return this;
    }

}
