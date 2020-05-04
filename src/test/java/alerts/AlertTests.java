package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        alertsPage.getAlertResult();
        assertEquals(alertsPage.getAlertResult(), "You successfuly clicked an alert", "Alert result incorrect.");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText(); //
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect.");

    }

    @Test
    public void testSetInputToAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Entering a text.";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        alertsPage.getAlertResult();
        assertEquals(alertsPage.getAlertResult(), "You entered: " + text, "Result incorrect.");
    }
}
