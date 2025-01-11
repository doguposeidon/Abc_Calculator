package tests;
import Sayfalar.AnaSayfa;
import Sayfalar.GirisYapSayfasi;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class LoginTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;
    private Object SeverityLevel;


    //    WebDriver fdriver;
    @BeforeEach
    @Description("Bu Testte login islemleri yapilir")
    void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
//        fdriver=new FirefoxDriver();
//        fdriver.manage().window().maximize();

        Allure.step("Chrome driver acilir");
        driver = new ChromeDriver(options=options);
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        driver.get("https://catchylabs-webclient.testinium.com/");

        Allure.step("Hesap Makinesi Sayfasi Acilir ve Kullanici Bilgileri Girilir");
        girisYapSayfasi.elementGozukeneKadarBekleXpath(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.alanaEmailYaz(girisYapSayfasi.emailAdresi, "dogukan.yildirim");

        girisYapSayfasi.elementGozukeneKadarBekleXpath(girisYapSayfasi.sifre);
        girisYapSayfasi.alanaSifreYaz(girisYapSayfasi.sifre, "123654dD");

        Allure.step("Hesap Makinesi Login Butonuna Tiklanir");
        girisYapSayfasi.elementGozukeneKadarBekleXpath(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);

        Allure.step("Hesap Makinesi Baslatilir");
        girisYapSayfasi.elementGozukeneKadarBekleXpath(girisYapSayfasi.opencalculator);
        girisYapSayfasi.tusaBas(girisYapSayfasi.opencalculator);

    }


    @Test
    @Description("Bu Test Butce Hesaplama Islemi Yapilir")

    void butcehesaplama() throws InterruptedException {


        //butcehesaplama TestCase:TC6 Geresinim:G2 ici yazilmistir
        //kullanici once gelir degerini sonra gider degerini secer ve cikan sonuc butcesini gosterir

        Allure.step("bir rakamina tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.birrakami);
        anaSayfa.tusaBasCss(anaSayfa.birrakami);

        Allure.step("bes rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.besrakami);
        anaSayfa.tusaBasCss(anaSayfa.besrakami);

        Allure.step("sifir rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.sifirrakami);
        anaSayfa.doubleClick(anaSayfa.sifirrakami);

        Allure.step("eksiye tiklandi");
        anaSayfa.elementGozukeneKadarBekleXpath(anaSayfa.eksi);
        anaSayfa.tusaBas(anaSayfa.eksi);

        Allure.step("bes rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.besrakami);
        anaSayfa.tusaBasCss(anaSayfa.besrakami);

        Allure.step("sifir rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.sifirrakami);
        anaSayfa.doubleClick(anaSayfa.sifirrakami);

        Allure.step("esittire tiklandi");
        anaSayfa.elementGozukeneKadarBekleXpath(anaSayfa.esittir);
        anaSayfa.tusaBas(anaSayfa.esittir);

        Thread.sleep(2000);

    }

    @Test
    @Description("Bu Testte yatirimhesaplama Islemi Yapilir")
    void yatirimhesaplama () throws InterruptedException {

        //yatirimhesaplama TestCase:TC8 Geresinim:G3 ici yazilmistir
        //kullanici once yatirim degerini sonra aylik faiz orani degerini girer ve cikan sonuc 1 yillik kazancini gosterir

        Allure.step("iki rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.ikirakami);
        anaSayfa.tusaBasCss(anaSayfa.ikirakami);

        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.sifirrakami);
        anaSayfa.doubleClick(anaSayfa.sifirrakami);

        Allure.step("carpim tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.carpim);
        anaSayfa.tusaBasCss(anaSayfa.carpim);

        Allure.step("bir rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.birrakami);
        anaSayfa.tusaBasCss(anaSayfa.birrakami);

        Allure.step("virgule tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.virgul);
        anaSayfa.tusaBasCss(anaSayfa.virgul);

        Allure.step("sifir rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.sifirrakami);
        anaSayfa.tusaBasCss(anaSayfa.sifirrakami);

        Allure.step("dort rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.dortrakami);
        anaSayfa.tusaBasCss(anaSayfa.dortrakami);

        Allure.step("esittire tiklandi");
        anaSayfa.elementGozukeneKadarBekleXpath(anaSayfa.esittir);
        anaSayfa.tusaBas(anaSayfa.esittir);

        Thread.sleep(2000);

    }

    @Test
    @Description("Bu Testte giderhesaplama Islemi Yapilir")
     void giderhesaplama () throws InterruptedException {

        //kullanici once gider girislerini yapar ve esittir tusuna basip sonucu gorur

        Allure.step("bir rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.birrakami);
        anaSayfa.tusaBasCss(anaSayfa.birrakami);

        Allure.step("sifir rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.sifirrakami);
        anaSayfa.tusaBasCss(anaSayfa.sifirrakami);

        Allure.step("sekiz rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.sekizrakami);
        anaSayfa.tusaBasCss(anaSayfa.sekizrakami);

        Allure.step("arti tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.arti);
        anaSayfa.tusaBasCss(anaSayfa.arti);

        Allure.step("alti rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.altirakami);
        anaSayfa.tusaBasCss(anaSayfa.altirakami);

        Allure.step("yedi rakamine tiklandi");
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.yedirakami);
        anaSayfa.tusaBasCss(anaSayfa.yedirakami);

        Allure.step("esittire tiklandi");
        anaSayfa.elementGozukeneKadarBekleXpath(anaSayfa.esittir);
        anaSayfa.tusaBas(anaSayfa.esittir);

        Thread.sleep(2000);

    }

    @AfterEach
    void tearDown() {
        Allure.step("driver kapatildi");
        driver.close();
    }
}
