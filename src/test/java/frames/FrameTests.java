package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testWritingInEditor() {
        var editorPage = homePage.clickWysiwigEditor();
        editorPage.clearTextArea();

        String word1 = "hello";
        String word2 = " world";

        editorPage.setTextArea(word1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(word2);
        String text = editorPage.getTextFromEditor();
        assertEquals(text, word1 + word2, "Text incorrect.");
    }
}
