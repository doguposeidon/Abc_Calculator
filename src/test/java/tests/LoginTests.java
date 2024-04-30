package tests;

import Sayfalar.AnaSayfa;
import Sayfalar.GirisYapSayfasi;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class LoginTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;



//    WebDriver fdriver;
    @BeforeEach
    void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
//        fdriver=new FirefoxDriver();
//        fdriver.manage().window().maximize();

        driver = new ChromeDriver(options=options);
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        driver.get("https://www.hepsiburada.com/");

    }


    @Test
    void hepsiburadaLoginTesti() throws InterruptedException {


        WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(20L));

//      wait.until(ExpectedConditions.elementToBeClickable(By.id("myAccount")));
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.hesabim);
        anaSayfa.tusaBas(anaSayfa.hesabim);
//      driver.findElement(By.id("myAccount")).click();

        anaSayfa.elementGozukeneKadarBekle(anaSayfa.girisYap);
        anaSayfa.tusaBas(anaSayfa.girisYap);

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.alanaEmailYaz(girisYapSayfasi.emailAdresi, "dgkn.yildirim@gmail.com");
//      driver.findElement(By.id("txtUserName")).sendKeys("dgkn.yildirim@gmail.com");

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.sifre);
        girisYapSayfasi.alanaSifreYaz(girisYapSayfasi.sifre, "xxxxx12");
//        driver.findElement(By.id("txtPassword")).sendKeys("159753dDfF");

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);
//      driver.findElement(By.id("btnLogin")).click();

    }

    @Test
    void urunAramaTesti(){
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.urunArama);
        anaSayfa.alanaYaziYaz(anaSayfa.urunArama, "Araba");
        anaSayfa.KlavyeTusunaBas(anaSayfa.urunArama, Keys.ENTER);
    }


    @AfterEach
    void tearDown() {
        driver.close();
    }
}
