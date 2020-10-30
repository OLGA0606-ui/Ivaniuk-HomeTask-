/* @Author: Dmytro.Tyrtyshnyi@gmail.com */
import org.testng.annotations.Test;

import static util.Constants.*;

public class RDTest extends Scenario {

    @Test(priority = 1)
    public void openMainPage() {
        MAIN_PAGE.openMainPage();
    }

    @Test(priority = 2)
    public void openComputersSection() {
        COMPUTERS_PAGE.openComputersPage();
    }

    @Test(priority = 3)
    public void openDesktopsPage() {
        DESKTOPS_PAGE.openDesktopsPage();
    }

    @Test(priority = 4)
    public void openFirstDesktopInThePage() {
        DESKTOPS_PAGE.openFirstDesktopInThePage();

    }
}
