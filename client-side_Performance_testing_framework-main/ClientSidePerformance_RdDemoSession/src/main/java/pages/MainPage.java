/* @Author: Dmytro.Tyrtyshnyi@gmail.com */
package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class MainPage extends AbstractPage{
    public MainPage() { super(); }

    public MainPage openMainPage() {
        wait.until(ExpectedConditions.elementToBeClickable(computersTitle));
        perfNavigationTiming.writeToInflux("MainPage");
        return this;
    }

}
