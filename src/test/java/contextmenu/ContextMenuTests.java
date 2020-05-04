package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenuAlertText() {
        var contextMenuPage =  homePage.clickContextMenu();
        contextMenuPage.rightClickContextBox();
        String text = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(text, "You selected a context menu", "Pop Up text incorrect.");
    }
}
