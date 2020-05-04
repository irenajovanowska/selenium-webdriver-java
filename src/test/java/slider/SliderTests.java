package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider() {
        String value = "4";
        var sliderPage = homePage.clickSliderPage();
        sliderPage.moveSlider(value);
        assertEquals(sliderPage.getRange(), value, "Slider range is incorrect.");
    }
}
