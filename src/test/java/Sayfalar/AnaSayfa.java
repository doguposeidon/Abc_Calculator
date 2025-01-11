package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AnaSayfa extends Sayfa {

    public final String hesabim = "myAccount";
    public final String girisYap = "login";
    public final String urunArama ="input[placeholder='Ürün, kategori veya marka ara']";
    public final String sifirrakami="div:nth-of-type(17)";
    public final String birrakami="div:nth-of-type(13)";
    public final String ikirakami="div:nth-of-type(14) .css-146c3p1";
    public final String dortrakami="div:nth-of-type(9) .css-146c3p1";
    public final String besrakami="div:nth-of-type(10)";
    public final String altirakami="div:nth-of-type(11) .css-146c3p1";
    public final String yedirakami=".r-6wfxan > div:nth-of-type(5) .css-146c3p1";
    public final String sekizrakami="div:nth-of-type(6) .css-146c3p1";
    public final String virgul="div:nth-of-type(19) .css-146c3p1";
    public final String eksi="//div[@class='css-146c3p1 r-jwli3a r-adyw6z r-vw2c0b'][normalize-space()='-']";
    public final String carpim="div:nth-of-type(8)";
    public final String bolum=".r-6wfxan > div:nth-of-type(4) .css-146c3p1";
    public final String esittir="//div[contains(text(),'=')]";
    public final String arti="div:nth-of-type(16) .css-146c3p1";
    public final String acbutonu=".r-6wfxan > div:nth-of-type(1) .css-146c3p1";
    public final String sonuc=".r-zz5t5d";
    public AnaSayfa(WebDriver driver) {
        super(driver);
    }

}
