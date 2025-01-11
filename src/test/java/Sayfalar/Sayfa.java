package Sayfalar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.testng.Assert;

public class Sayfa {

    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }


    public void elementGozukeneKadarBekle(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
    }

    public void elementGozukeneKadarBekleXpath(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementId)));
    }

    public void elementGozukeneKadarBekleCss(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementId)));
    }

    public void tusaBas(String tusId) {
        driver.findElement(By.xpath(tusId)).click();
    }

    public void tusaBasCss(String tusId) {
        driver.findElement(By.cssSelector(tusId)).click();
    }

    public void alanaEmailYaz(String elementId, String emailAdresi) {
        driver.findElement(By.xpath(elementId)).sendKeys(emailAdresi);
    }


    public void alanaSifreYaz(String elementId, String sifre) {
        driver.findElement(By.xpath(elementId)).sendKeys("123654dD");
    }

    public void alanaYaziYaz(String elementId, String yazi) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(yazi);
    }

    public void KlavyeTusunaBas(String elementId, Keys klavyeTusu) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }

    public void doubleClick(String element) {

        WebElement webElement = driver.findElement(By.cssSelector(element));
        Actions actions = new Actions(driver);
        actions.doubleClick(webElement).perform();
    }


    public void calculatorSubtractionCheck(int expectedResult) {
        // Sonucu ekrandan al
        String actualResult = driver.findElement(By.cssSelector(".r-zz5t5d")).getText();

        // Sonucu integer'a dönüştür
        int actualResultInt = Integer.parseInt(actualResult.trim());

        // Beklenen sonuçla karşılaştır
        Assert.assertEquals(actualResultInt, expectedResult, "Sonuçlar eşleşmiyor.");
        System.out.println("Beklenen sonuç: " + expectedResult + ", Hesaplanan sonuç: " + actualResultInt);
    }


}
