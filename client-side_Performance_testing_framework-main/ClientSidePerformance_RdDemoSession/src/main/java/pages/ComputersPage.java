/* @Author: Dmytro.Tyrtyshnyi@gmail.com */
package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static util.Constants.*;

@Log4j2
public class ComputersPage extends AbstractPage {
    public ComputersPage() { super(); }

    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']//a[@href='/computers']")
    private WebElement pressComputerButton;

    public ComputersPage openComputersPage() {
        computersTitle.click();
        wait.until(ExpectedConditions.elementToBeClickable(pressComputerButton));
        waitUntilPageIsFullyLoaded(wait);
        perfNavigationTiming.writeToInflux("ComputersPage");
        return this;
    }
}
