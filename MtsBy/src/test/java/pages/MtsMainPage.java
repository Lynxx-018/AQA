package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class MtsMainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By headerBlock = By.xpath("//*[@id='pay-section']//h2");
    private By paymentLogos = By.xpath("//*[@id='pay-section']//ul//img");
    private By moreDetailsLink = By.xpath("//*[@id='pay-section']//a[contains(text(), 'Подробнее')]");
    private By communicationService = By.xpath("//span[contains(text(), 'Услуги связи')]");
    private By phoneInput = By.xpath("//*[@id='connection-phone']");
    private By amountInput = By.xpath("//*[@id='connection-sum']");
    private By continueButton = By.xpath("//*[@id='pay-connection']/button");
    private By errorMessage = By.xpath("//*[@id='pay-connection']/div[2]/p");
    private By paymentAgreementLink = By.xpath("//*[contains(text(), 'Имя и фамилия на карте')]");

    public MtsMainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void openSite() {
        driver.get("https://mts.by");
    }

    public String getHeaderText() {
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(headerBlock));
        return header.getText().trim().replaceAll("\\s+", " ");
    }

    public boolean areLogosVisible() {
        try {
            List<WebElement> logos = driver.findElements(paymentLogos);
            return !logos.isEmpty() && logos.get(0).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public int getLogosCount() {
        List<WebElement> logos = driver.findElements(paymentLogos);
        return logos.size();
    }

    public boolean isMoreDetailsLinkVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(moreDetailsLink));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clickMoreDetailsLink() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(moreDetailsLink));
        link.click();
    }

    public String getMoreDetailsLinkUrl() {
        WebElement link = driver.findElement(moreDetailsLink);
        return link.getAttribute("href");
    }

    public void selectCommunicationService() {
        try {
            WebElement service = wait.until(ExpectedConditions.elementToBeClickable(communicationService));
            service.click();
            System.out.println("Service selected: Услуги связи");
        } catch (Exception e) {
            System.out.println("Failed to select service: " + e.getMessage());
        }
    }

    public void enterPhoneNumber(String phone) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInput));
        input.clear();
        input.sendKeys(phone);
    }

    public void enterAmount(String amount) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(amountInput));
        input.clear();
        input.sendKeys(amount);
    }

    public void clickContinueButton() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        button.click();
    }

    public boolean isContinueButtonEnabled() {
        WebElement button = driver.findElement(continueButton);
        return button.isEnabled();
    }

    public boolean isErrorMessageVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPaymentPageOpened() {
        try {
            System.out.println("Waiting for payment page to load...");
            Thread.sleep(4000);

            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(paymentAgreementLink));
                System.out.println("Payment agreement link found on main page");
                return true;
            } catch (Exception ignored) {
                System.out.println("Link not found on main page, searching for iframe...");
            }

            List<WebElement> frames = driver.findElements(By.tagName("iframe"));
            System.out.println("Iframes found: " + frames.size());

            if (frames.isEmpty()) {
                System.out.println("No iframes found");
                return false;
            }

            for (int i = 0; i < frames.size(); i++) {
                try {
                    System.out.println("Switching to iframe #" + i);
                    driver.switchTo().frame(i);

                    WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(paymentAgreementLink));
                    System.out.println("Payment agreement link found in iframe #" + i);
                    driver.switchTo().defaultContent();
                    return true;

                } catch (Exception e) {
                    System.out.println("Link not found in iframe #" + i);
                    driver.switchTo().defaultContent();
                }
            }

            System.out.println("Payment agreement link not found in any iframe");
            return false;

        } catch (Exception e) {
            System.out.println("Payment page check failed: " + e.getMessage());
            return false;
        }
    }
}
