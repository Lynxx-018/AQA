package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MtsMainPage;

public class MtsRechargeTest extends BaseTest {

    @Test
    public void testBlockHeader() {
        MtsMainPage page = new MtsMainPage(driver);
        page.openSite();

        String actualHeader = page.getHeaderText();
        String expectedHeader = "ОНЛАЙН ПОПОЛНЕНИЕ БЕЗ КОМИССИИ";

        Assert.assertEquals(actualHeader, expectedHeader,
                "Header mismatch. Expected: '" + expectedHeader + "', but got: '" + actualHeader + "'");
    }

    @Test
    public void testPaymentLogosExist() {
        MtsMainPage page = new MtsMainPage(driver);
        page.openSite();

        Assert.assertTrue(page.areLogosVisible(), "Payment logos are not visible");

        int logosCount = page.getLogosCount();
        Assert.assertTrue(logosCount >= 2,
                "Expected at least 2 logos, but found: " + logosCount);
    }

    @Test
    public void testMoreDetailsLink() {
        MtsMainPage page = new MtsMainPage(driver);
        page.openSite();

        Assert.assertTrue(page.isMoreDetailsLinkVisible(),
                "'Подробнее о сервисе' link is not visible");

        String linkUrl = page.getMoreDetailsLinkUrl();
        Assert.assertNotNull(linkUrl, "Link URL is null");
        Assert.assertFalse(linkUrl.isEmpty(), "Link URL is empty");

        page.clickMoreDetailsLink();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(currentUrl, "https://mts.by",
                "Page did not change after clicking the link");
    }

    @Test
    public void testRechargeWithValidData() {
        MtsMainPage page = new MtsMainPage(driver);
        page.openSite();

        page.selectCommunicationService();
        page.enterPhoneNumber("297777777");
        page.enterAmount("10.00");

        Assert.assertTrue(page.isContinueButtonEnabled(),
                "'Продолжить' button is not enabled");

        page.clickContinueButton();

        Assert.assertTrue(page.isPaymentPageOpened(),
                "Payment page did not open");
    }

    @Test
    public void testEmptyPhoneNumberError() {
        MtsMainPage page = new MtsMainPage(driver);
        page.openSite();

        page.selectCommunicationService();
        page.enterAmount("10.00");

        if (page.isContinueButtonEnabled()) {
            page.clickContinueButton();
            Assert.assertTrue(page.isErrorMessageVisible(),
                    "Error message not shown for empty phone number");
        } else {
            System.out.println("Button is disabled without phone number");
        }
    }

    @Test
    public void testEmptyAmountError() {
        MtsMainPage page = new MtsMainPage(driver);
        page.openSite();

        page.selectCommunicationService();
        page.enterPhoneNumber("297777777");

        if (page.isContinueButtonEnabled()) {
            page.clickContinueButton();
            Assert.assertTrue(page.isErrorMessageVisible(),
                    "Error message not shown for empty amount");
        } else {
            System.out.println("Button is disabled without amount");
        }
    }
}