package Sayfalar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Sayfa {

    WebDriver driver;
    public Sayfa(WebDriver driver){
        this.driver=driver;
    }


    public void elementGozukeneKadarBekle(String elementId){
        WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
    }
    public void elementGozukeneKadarBekleCss(String elementId){
        WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementId)));
    }

    public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
    }

    public void alanaEmailYaz(String elementId,String emailAdresi){
        driver.findElement(By.id(elementId)).sendKeys(emailAdresi);
            }

    public void alanaSifreYaz(String elementId,String sifre){
        driver.findElement(By.id(elementId)).sendKeys("159753dDfF");
    }

    public void alanaYaziYaz(String elementId,String yazi){
                driver.findElement(By.cssSelector(elementId)).sendKeys(yazi);
           }

    public void KlavyeTusunaBas(String elementId, Keys klavyeTusu){
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }

}
