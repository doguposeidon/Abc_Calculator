package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AnaSayfa extends Sayfa {

    public final String hesabim = "myAccount";
    public final String girisYap = "login";
    public final String urunArama ="input[placeholder='Ürün, kategori veya marka ara']";


    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
